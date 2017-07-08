package com.aplications;

/**
 * Created by Fahim on 7/7/2017.
 */
public class Status {
    long id;
    String id_str;
    long user_id;
    String user_id_str;
    public Status(){}
    @Override
    public String toString(){
        return id+" "+id_str+" "+user_id+" "+user_id_str;
    }
}
