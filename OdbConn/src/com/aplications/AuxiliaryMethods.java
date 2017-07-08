package com.aplications;

import com.orientechnologies.orient.core.record.impl.ODocument;
import org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Fahim on 6/20/2017.
 */
public class AuxiliaryMethods {
    ODocument tweet;

    AuxiliaryMethods(){}

    public void Bzip2UnZip(String s1, String s2) throws IOException {
        File f =  new File(s1);
        FileInputStream in = new FileInputStream(f);//s1 = input file dir .../sth/../00.json.bz2
        FileOutputStream out = new FileOutputStream(s2);//s2 = output file dir .../sth/../00.json
        BZip2CompressorInputStream bzIn = new BZip2CompressorInputStream(in);
        int buffersize = 1024;
        final byte[] buffer = new byte[buffersize];
        int n = 0;
        while (-1 != (n = bzIn.read(buffer))) {
            out.write(buffer, 0, n);
        }
        out.close();
        bzIn.close();
    }

    public void DeleteFile(String s){
        try{
            File file = new File(s);
            if(file.delete()){
                System.out.println(file.getName() + " is deleted!");
            }else{
                System.out.println("Delete operation is failed.");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void SetODocument(ODocument tweet){ this.tweet = tweet; }
    public ODocument getODocument(){ return tweet; }

    public void CreateDocument2(Twitter tw){

    }


    public void CreateODocument(Twitter tw) throws InterruptedException {
        if(tw==null) { System.out.println("tw == null!"); return; }

        ODocument tweet = new ODocument("twitter");
        tweet.field("created_at", tw.created_at ); // doc.field( "name", "hitman" );
        tweet.field("id", tw.id);
        tweet.field("id_str", tw.id_str);
        tweet.field("text", tw.text);
        tweet.field("source", tw.source);
        tweet.field("trucated", tw.truncated);
        tweet.field("in_reply_to_status_id", tw.in_reply_to_status_id);
        tweet.field("in_reply_to_status_id_str",tw.in_reply_to_status_id_str);
        tweet.field("in_reply_to_user_id", tw.in_reply_to_user_id);
        tweet.field("in_reply_to_user_id_str", tw.in_reply_to_user_id_str);
        tweet.field("in_reply_to_screen_name", tw.in_reply_to_screen_name);
/*################## User ###############################*/
       /** ODocument usr = new ODocument("user");
        usr.field("id", tw.user.id);
        usr.field("id_str", tw.user.id_str);
        usr.field("name", tw.user.name);
        usr.field("screne_name", tw.user.screne_name);
        usr.field("location",tw.user.location);
        usr.field("url",tw.user.url);
        usr.field("description",tw.user.description);
        usr.field("verified",tw.user.verified);
        usr.field("followers_count",tw.user.followers_count);
        usr.field("friends_count",tw.user.friends_count);
        usr.field("listed_count",tw.user.listed_count);
        usr.field("favourites_count",tw.user.favourites_count);
        usr.field("statuses_count",tw.user.statuses_count);
        //usr.field("String created_at",tw.user.String created_at);
        usr.field("utc_offset",tw.user.utc_offset);
        usr.field("time_zone",tw.user.time_zone);
        usr.field("geo_enabled",tw.user.geo_enabled);
        usr.field("lang",tw.user.lang); //USR.FIELD("lang", "English");
        usr.field("contributors_enabled",tw.user.contributors_enabled);
        usr.field("is_translator",tw.user.is_translator);
        usr.field("profile_background_color",tw.user.profile_background_color);
        usr.field("profile_background_image_url",tw.user.profile_background_image_url);
        usr.field("profile_background_image_url_https",tw.user.profile_background_image_url_https);
        usr.field("profile_background_tile",tw.user.profile_background_tile);
        usr.field("profile_link_color",tw.user.profile_link_color);
        usr.field("profile_sidebar_border_color",tw.user.profile_sidebar_border_color);
        usr.field("profile_sidebar_fill_color",tw.user.profile_sidebar_fill_color);
        usr.field("profile_text_color",tw.user.profile_text_color);
        usr.field("profile_use_background_image",tw.user.profile_use_background_image);
        usr.field("profile_image_url",tw.user.profile_image_url);
        usr.field("profile_image_url_https",tw.user.profile_image_url_https);
        usr.field("profile_banner_url",tw.user.profile_banner_url);
        usr.field("default_profile",tw.user.default_profile);
        usr.field("default_profile_image",tw.user.default_profile_image);
        usr.field("following",tw.user.following);
        usr.field("follow_request_sent",tw.user.follow_request_sent);
        usr.field("notifications",tw.user.notifications);

        tweet.field("user", usr);*/
/*#################### Geo #############################*/
        /**ODocument geo = new ODocument("geo");
        geo.field("type", tw.geo.type);

        tweet.field("geo", geo);*/

/*#################### Place #############################*/
       /** ODocument place = new ODocument("place");
        place.field("id", tw.place.id);
        place.field("url", tw.place.url);
        place.field("place_type", tw.place.place_type);
        place.field("name", tw.place.name);
        place.field("full_name",tw.place.full_name);
        place.field("country_code",tw.place.country_code);
        place.field("country",tw.place.country);

        //####### bounding box!
        ODocument bounding_box = new ODocument("bounding_box");
        bounding_box.field("type", tw.place.bounding_box.type);

        place.field("bounding_box", tw.place.bounding_box);

        tweet.field("place", tw.place);*/
/*#################################################*/
        tweet.field("contributors", tw.contributors);
        tweet.field("is_quote_status", tw.is_quote_status);
        tweet.field("retweet_count", tw.retweet_count);
        tweet.field("favorite_count", tw.favorite_count);
/*#################### Entities #############################*/

        /*ODocument HashTags = new ODocument("hashtags");
        for(int i=0; i<tw.entities.hashtags.length; i++)
        { HashTags.field("text", tw.entities.hashtags[i].text);
          for(int j=0; j<tw.entities.hashtags[i].indices.length; j++){
          }
        }*/
        /**ODocument Entities = new ODocument("entities");
        String tempHT = "";
        for(int i=0; i<tw.entities.hashtags.length; i++)
        {    tempHT = tempHT+tw.entities.hashtags[i];   }
        Entities.field("hashtags[]",tempHT );

        String tempUrls = "";
        for(int i=0; i<tw.entities.urls.length; i++)
        {   tempUrls = tempUrls+tw.entities.urls[i];   }
        Entities.field("urls[]", tempUrls);

        String tempUM="";
        for(int i=0; i<tw.entities.user_mentions.length; i++)
        {   tempUM=tempUM+tw.entities.user_mentions[i];     }
        Entities.field("user_mentions[]", tempUM);

        String tempSym = "";
        for(int i=0; i<tw.entities.symbols.length; i++)
        {   tempSym = tempSym+"  "+tw.entities.symbols[i];  }
        Entities.field("symbols[]", tempSym);

        tweet.field("entities", Entities);*/
/*#################################################*/
        tweet.field("favorited", tw.favorited);
        tweet.field("retweeted", tw.retweeted);
        tweet.field("filter_level", tw.filter_level);
        tweet.field("lang", tw.lang);
        tweet.field("timestamp_ms", tw.timestamp_ms);

        //

/*#################################################*/
        tweet.save();
        //wait(100);
        //return tweet;
    }
}


/*
        ODocument delete = new ODocument("delete");
        ODocument status = new ODocument("status");
        status.field("id", tw.delete.status.id);
        status.field("id_str", tw.delete.status.id_str);
        status.field("user_id", tw.delete.status.user_id);
        status.field("user_id_str", tw.delete.status.user_id_str);

        delete.field("status", status);
        delete.field("timestamp_ms", tw.delete.timestamp_ms);


        tweet.field("delete", delete);*/