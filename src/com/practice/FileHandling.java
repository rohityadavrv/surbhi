package com.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// Reading from a file
//public class FileHandling {
//
//    public static void main(String[] args) {
//
//        try {
//            File file = new File("C:/d/SourceFile");
//            FileInputStream fs = new FileInputStream(file);
//
//            int c=0;
//            System.out.println(fs.read());
//            while((c=fs.read()) !=-1){
//               System.out.print((char) c) ;
//            }
//
//            fs.close();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//    }
//
//
//}


//Writing to a file
public class FileHandling {

    public static void main(String[] args) {

        try {
            File inputfile = new File("C:/d/SourceFile");
            File outputfile = new File("C:/d/DestinationFile");
            FileInputStream fs1 = new FileInputStream(inputfile);
            FileOutputStream fs2 = new FileOutputStream(outputfile);

            int c=0;

            while((c=fs1.read()) !=-1){
                fs2.write(c);
                System.out.print((char) c) ;
            }

            fs1.close();
            fs2.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }


}