package com.aplications;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Fahim on 6/18/2017.
 */
public class Gson6 {
    public static void main(String[] args) throws IOException {
        Gson gson = new GsonBuilder().create();
        FileReader fr=null;
        BufferedReader br=null;
        JsonReader jr=null;
        try{
            fr = new FileReader("F:\\Codes\\Java\\OrientDB\\folder\\00.json");
            br = new BufferedReader(fr);
            jr = new JsonReader(br);
            jr.setLenient(true);

            Twitter  tw=null;// = gson.fromJson(jr, TwitterDemo.class);
            //System.out.println(tw);

            //System.out.println("inside loop: ");
            int i=0;
            while(jr.hasNext()){
                try{
                    tw = gson.fromJson(jr, Twitter.class);
                    System.out.println(i+" "+tw); i++;
                }catch (IllegalStateException x){   System.out.println("ISE: "+x.toString());  }
                //String s1= tw.created_at;
                /*if(tw == null)//if(tw==null || i>=2)
                {
                    System.out.println("\nEOF reached\n"); break;}
                else{System.out.println(i+" "+tw); i++; }*/
            }
        }catch(IOException x){   System.out.println("IOE: "+x.toString());  }
        catch (Exception x){   System.out.println("E: "+x.toString());  }
        finally {
            jr.close();
            br.close();
            fr.close();
        }
    }
}
