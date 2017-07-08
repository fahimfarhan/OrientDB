package com.aplication;

import com.orientechnologies.orient.core.db.document.ODatabaseDocumentTx;
import com.orientechnologies.orient.core.record.impl.ODocument;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ODatabaseDocumentTx db=null;
        try{
            //String creds ="remote:localhost/GratefulDeadConcerts";
            String creds = "plocal:E:\\OrientDB2.2.22\\orientdb-community-2.2.22\\databases\\petshop";
            db = new ODatabaseDocumentTx(creds);
            db.open("admin","admin");

            // CREATE A NEW DOCUMENT AND FILL IT
            ODocument doc = new ODocument("Person");
            doc.field( "name", "hitman" );
            doc.field( "surname", "Eagle" );
            doc.field( "city", new ODocument("City").field("name","London").field("country", "UK") );
            /*
            ODocument doc2 = new ODocument("City");
            doc2.field("name", "Dhaka");
            doc2.field("country", "BD");
            * doc.field("city", doc2);
            * */
// SAVE THE DOCUMENT
            doc.save();


        }catch(Exception x){
            System.out.println("Exception Detected!: "+x.getMessage());
       }finally{if(db!=null) db.close();}
        //db.close();//}


    }
}
