package com.aplications;

import javax.jws.soap.SOAPBinding;

/**
 * Created by Fahim on 6/18/2017.
 */
public class User {
    long id; String id_str; String name; String screne_name;

    String location; String url; String description;
    boolean Protected; // need to change ASAP! Kayko

    boolean verified; long followers_count; long friends_count;
    long listed_count; long favourites_count;

    long statuses_count; String created_at;
    long utc_offset; String time_zone;
    boolean geo_enabled; String lang;
    boolean contributors_enabled; boolean is_translator;

    String profile_background_color; String profile_background_image_url;
    String profile_background_image_url_https; boolean profile_background_tile;
    String profile_link_color; String profile_sidebar_border_color;
    String profile_sidebar_fill_color; String profile_text_color;

    boolean profile_use_background_image; String profile_image_url;
    String profile_image_url_https; String profile_banner_url;
    boolean default_profile; boolean default_profile_image;
    boolean following; boolean follow_request_sent;
    String notifications;


    public User(){}
    @Override
    public String toString() {
        return "[Usr("+id+" "+id_str+" "+name+" "+screne_name+" "+location+" "+url+" "+
                description+" "+verified+" "+followers_count+" "+friends_count+" "+
                listed_count+" "+favourites_count+" "+statuses_count+" "+created_at+" "+utc_offset+" "+
                time_zone+" "+geo_enabled+" "+lang+" "+contributors_enabled+" "+is_translator+" "+
                profile_background_color+" "+profile_background_image_url+" "+profile_background_image_url_https+" "+
                profile_background_tile+" "+profile_link_color+" "+profile_sidebar_border_color+" "+
                profile_sidebar_fill_color+" "+profile_text_color+" "+profile_use_background_image+" "+profile_image_url+" "+
                profile_image_url_https+" "+profile_banner_url+" "+default_profile+" "+default_profile_image+" "+following+" "+follow_request_sent
                +" "+notifications+")Usr]";
    }




}
