package com.aplications;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import com.orientechnologies.orient.core.db.document.ODatabaseDocumentTx;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Fahim on 6/16/2017.
 */
public class Start {
    public static void main(String[] Args) throws IOException {
        //System.out.println("Hello java");
        Gson gson = new GsonBuilder().create();
        FileReader fr=null;
        BufferedReader br=null;
        JsonReader jr=null;

        AuxiliaryMethods am = new AuxiliaryMethods();


        ODatabaseDocumentTx db=null;
        try{


            //String creds ="remote:localhost/GratefulDeadConcerts";
            String creds = "plocal:E:\\OrientDB2.2.22\\orientdb-community-2.2.22\\databases\\Aprototype1";
            db = new ODatabaseDocumentTx(creds);
            db.open("admin","admin");

            //tweet = new ODocument("Twitter");
            //am.SetODocument(new ODocument("Twitter"));

            fr = new FileReader("F:\\Codes\\Java\\OrientDB\\src\\com\\folder\\00.json");
            br = new BufferedReader(fr);
            jr = new JsonReader(br);
            jr.setLenient(true);

            Twitter  tw=null;// = gson.fromJson(jr, TwitterDemo.class);
            //System.out.println(tw);

            //System.out.println("inside loop: ");
            int i=0;
            tw = gson.fromJson(jr, Twitter.class);
            System.out.println(i+" "+tw);
            i++;
            //db.begin();
            am.CreateODocument(tw);
            //db.commit();
           while(jr.hasNext() || i<2500){
             if(!jr.hasNext()){ break; }
            //   else
            try{
                    //tw = new Twitter();
                    tw = gson.fromJson(jr, Twitter.class);
                    System.out.println(i+" "+tw);
                    i++;
                    db.begin();
                    am.CreateODocument(tw);
                    db.commit();

                }catch (IllegalStateException x){   System.out.println("W ISE: "+x.fillInStackTrace());  }
                catch (NullPointerException x){   System.out.println("W NPE: "+x.fillInStackTrace());  }
                catch (Exception x){   System.out.println("WE: "+x.fillInStackTrace()); break;  }
         /*end while*/   }
        }catch(IOException x){   System.out.println("IOE: "+x.fillInStackTrace());  }
        catch (Exception x){   System.out.println("E: "+x.fillInStackTrace());  }
        /*try{
            ODocument tweet = am.getODocument();
            tweet.save();
        }catch(Exception x){
            System.out.println("Doc saving failed in com.applications.start 2nd try catch! \nError: "+x.toString());
        }*/
        finally {

            if(db!=null){db.close(); System.out.println("db closed!");}
            if(jr!=null){jr.close(); System.out.println("jr closed!");}
            if(br!=null){br.close(); System.out.println("br closed!");}
            if(fr!=null){fr.close(); System.out.println("fr closed!");}
        }

    }
}
