package com.cap.exception_example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
 class File_notFound_Demo {
 
    public static void main(String args[])    {
        //try {
 
            //// Following file does not exist
            File file = new File("E:\\businessrule999.txt"); // 
 
            //try {
				try {
					FileReader fr = new FileReader(file);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					 System.out.println("File does not exist in that location ");
				}
			//} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				// System.out.println("File does not exist in that location ");
			//}
          //  fr.close();
      //  } catch (FileNotFoundException e) {
           //System.out.println("File does not exist");
       // }
    }
 }
//}
