package com.aplications;

/**
 * Created by Fahim on 7/7/2017.
 */
public class Delete {
    Status status;
    String timestamp_ms;
    public Delete(){}
    @Override
    public String toString(){
        return status+" "+timestamp_ms;
    }
}
