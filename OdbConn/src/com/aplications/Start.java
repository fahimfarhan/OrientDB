package com.aplications;

import java.io.File;
import java.io.IOException;

/**
 * Created by Fahim on 7/9/2017.
 */
public class Start {
    public static void main(String[] args) throws IOException {

       //FAILED!  String[] MyDir = new String[]{"00","01","02","03", "04","05","06","07","08","09"};//
       // String[] MyDir1 = new String[]{"10","11","12","13", "14","15","16","17","18","19"};
       // String[] MyDir2 = new String[]{"20","21","22","23"};

        AuxiliaryMethods aux = new AuxiliaryMethods();

        //for(int j=0; j<MyDir.length; j++){ // for loop failed! :"(


            String s1 = "E:\\Dataset\\archiveteam-twitter-stream-2016-10\\10\\01\\07";// 03 done!
            //s1 = "E:\\Dataset\\archiveteam-twitter-stream-2016-10\\10\\01\\00\\32.json.bz2";
            String s2 = "F:\\Codes\\Java\\OdbConn\\src\\com\\temp\\temp.json";
            //aux.Bzip2UnZip(s1, s2);
            //aux.DeleteFile(s2);
            //String ind[] = new String[]{"0","1","2","3","4","5","6","7","8","9"};

            File f = new File(s1);
            File[] dir = f.listFiles();
            for(int i=0; i<dir.length; i++){
                aux.Bzip2UnZip(dir[i].getAbsolutePath().toString(),s2);
                TwitterDB twdb = new TwitterDB();
                aux.LogWritter("Done: "+dir[i].getAbsolutePath()+"\n");
                aux.DeleteFile(s2);
                System.out.println(i);
            }
            System.out.println(" FINISHED!!!");
        //}



    }
}
