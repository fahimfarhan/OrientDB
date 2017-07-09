package com.aplications;

import java.io.File;
import java.io.IOException;

/**
 * Created by Fahim on 7/9/2017.
 */
public class test1 {
    public static void main(String []Args) throws IOException {
        AuxiliaryMethods aux = new AuxiliaryMethods();
        String s1=null; String s2=null;
        String s3 = "E:\\Dataset\\archiveteam-twitter-stream-2016-10\\10\\01\\00";
        s1 = "E:\\Dataset\\archiveteam-twitter-stream-2016-10\\10\\01\\00\\32.json.bz2";
        s2 = "F:\\Codes\\Java\\OdbConn\\src\\com\\temp\\temp.json";
        //aux.Bzip2UnZip(s1, s2);
        //aux.DeleteFile(s2);
        //String ind[] = new String[]{"0","1","2","3","4","5","6","7","8","9"};

        File f = new File(s3);
        File[] dir = f.listFiles();
        for(int i=0; i<5; i++){
            //aux.Bzip2UnZip(dir[i].getAbsolutePath().toString(),s2);
            //aux.LogWritter("Done: "+dir[i].getAbsolutePath()+"\n");
            //aux.DeleteFile(s2);
        }

    }
}
