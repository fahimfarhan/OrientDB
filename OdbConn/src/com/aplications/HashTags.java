package com.aplications;

/**
 * Created by Fahim on 6/19/2017.
 */
public class HashTags {
    String text;
    int[] indices;
    public HashTags(){}
    @Override
    public String toString(){
        String s1 = "";
        for(int i=0; i<indices.length;i++){ s1=s1+"/i"+indices[i]; }
        return "[HT( "+text+" "+s1+" /i )HT]";
    }

}
