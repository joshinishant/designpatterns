package com.designpatterns.creational.ObjectPool;

import java.util.Calendar;
import java.util.Hashtable;

public abstract class ObjectPoolTemplate<T> {

    private Hashtable<T,Long> lockedObjectTable;
    private Hashtable<T,Long> freeObjectTable;
    private long timeOutInMilliseconds;

    public ObjectPoolTemplate( long timeOutInMilliseconds) {
        this.lockedObjectTable =  new Hashtable<T,Long>();
        this.freeObjectTable =  new Hashtable<T,Long>();
        this.timeOutInMilliseconds = timeOutInMilliseconds;
    }

    protected abstract T createObject();
    protected abstract void destroyObject(T object);

    public T getObject(){

        T object=null;

        if(freeObjectTable.size()>0){
            for ( T singleObject:freeObjectTable.keySet()){
                if(System.currentTimeMillis() - freeObjectTable.get(singleObject) > timeOutInMilliseconds){
                    freeObjectTable.remove(singleObject);
                }
                else {
                    Long value=freeObjectTable.get(singleObject);
                    freeObjectTable.remove(singleObject);
                    lockedObjectTable.put(singleObject,value);
                    return singleObject;
                }
            }
        }

        if((freeObjectTable.size()==0 && lockedObjectTable.size()==0)||(object==null)) {
            object=createObject();
            lockedObjectTable.put(object,System.currentTimeMillis());
            return object;
        }

        return object;
    }


    public void returnObject(T object){
        if(lockedObjectTable.contains(object)){
            Long value=lockedObjectTable.get(object);
            if(System.currentTimeMillis() - value > timeOutInMilliseconds ){
                destroyObject(object);
            }
            else {
                lockedObjectTable.remove(object);
                freeObjectTable.put(object,value);
            }
        }
    }

}
