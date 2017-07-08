package com.aplications;

import javafx.application.Platform;

/**
 * Created by Fahim on 6/19/2017.
 */
public class Place {
    String id,
        url,
        place_type,
        name,
        full_name,
        country_code,
        country;
        Bounding_Box bounding_box;

    public Place(){}
    @Override
        public String toString(){
            return id+" "+url+" "+place_type+" "+name+" "+full_name+" "+country_code+" "+country+" "+bounding_box;
        }

}
