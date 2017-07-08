package com.aplications;

/**
 * Created by Fahim on 6/18/2017.
 */
public class Twitter {

    String created_at;
    long id;
    String id_str;
    String text;
    String source;
    boolean truncated;
    long in_reply_to_status_id; //long
    String in_reply_to_status_id_str; // str hoite pare!
    long in_reply_to_user_id;
    String in_reply_to_user_id_str;
    String in_reply_to_screen_name;

    public User user;


    Geo geo;
    //String coordinates;
    Place place;
    String contributors;
    String is_quote_status;
    long retweet_count;
    long favorite_count;

    Entities entities;

    boolean favorited;
    boolean retweeted;
    String filter_level;
    String lang;
    String timestamp_ms;

    public Twitter(){}
    //Delete delete;
    @Override
    public String toString() {
        /*return  created_at+" "+id+" "+id_str+" "+text+" "+source+" "+truncated+" "+in_reply_to_status_id
                +" "+in_reply_to_status_id_str+" "+in_reply_to_user_id+" "+in_reply_to_user_id_str+" "+
                in_reply_to_screen_name+" "+user+" "+geo+" "+coordinates+" "+place+" "+contributors+" "+is_quote_status+" "+retweet_count+" "+favorite_count+" "+entities
                +" "+favorited+" "+retweeted+" "+filter_level+" "+lang+" "+timestamp_ms;*/
        return  created_at+" "+id+" "+id_str+" "+text+" "+source+" "+truncated+" "+in_reply_to_status_id
                +" "+in_reply_to_status_id_str+" "+in_reply_to_user_id+" "+in_reply_to_user_id_str+" "+
                in_reply_to_screen_name+" "+user+" "+geo+" "+place+" "+contributors+" "+is_quote_status+" "+retweet_count+" "+favorite_count+" "+entities
                +" "+favorited+" "+retweeted+" "+filter_level+" "+lang+" "+timestamp_ms; //+" "+delete;
    }
}
