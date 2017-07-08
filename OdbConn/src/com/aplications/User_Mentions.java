package com.aplications;

/**
 * Created by Fahim on 6/18/2017.
 */
public class User_Mentions {
    String screen_name,
    name,
    id_str;
    long id;
    int[] indices;
    public User_Mentions(){}
    @Override
    public String toString(){
        String s1=screen_name+" "+name+" "+id+" "+id_str;
        String s2="";
        for(int i=0; i<indices.length;i++) {
            s2 = s2+" i "+indices[i];
        }
        return "[usr_mn("+s1+s2+" i )usr_mn]";
    }
}
