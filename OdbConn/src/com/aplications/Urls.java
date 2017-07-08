package com.aplications;

/**
 * Created by Fahim on 6/19/2017.
 */
public class Urls {
    String url,
            expanded_url,
            display_url;
    int[] indices;

    public Urls(){}
    @Override
    public String toString(){
        String s = "";
        for(int i=0; i<indices.length;i++){
            s = s+" I "+indices[i];
        }
        return "[Url( "+url+" "+expanded_url+" "+display_url+s+" I )Url]";
    }
}
