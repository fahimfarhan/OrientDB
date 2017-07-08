package com.aplications;

/**
 * Created by Fahim on 6/17/2017.
 */
public class Entities {
    public HashTags[] hashtags;// []  some sort of array
    public Urls[] urls;// []  some sort of array
    public User_Mentions[] user_mentions;// []  some sort of array
    public String[] symbols;// []  some sort of array

    public Entities(){}
    @Override
    public String toString() {
        String um = "";
        for(int i=0; i<user_mentions.length;i++){
            um = um+" "+user_mentions[i];
        }

        String ht = "";
        for(int i=0; i<hashtags.length;i++){
            ht = ht+hashtags[i]+" ";
        }

        String url = "";
        for(int i=0; i<urls.length;i++){
            url = url+" "+urls[i];
        }

        //return "[Es("+hashtags + " " + urls + " " + user_mentions + " " + symbols+")Es]";
        //return "[Es("+hashtags + " " + urls + um+ " " + symbols+")Es]";
        return "[Es("+ht + url + um+ " " + symbols+")Es]";
    }
}
