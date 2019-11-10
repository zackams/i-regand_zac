package com.sugema.i_regand;
import android.os.Environment;
import android.util.Log;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

public class Get_File {

    static int spc_count=-1;

    public ArrayList<String> Process(File aFile, ArrayList<String> mylists) {
        spc_count++;
        String spcs = "";
        for (int i = 0; i < spc_count; i++)
            spcs += " ";
        if(aFile.isFile()) {
            //System.out.println(spcs + "[FILE] " + aFile.getName());
            Log.d("path", aFile.toString());
            if(aFile.getName().endsWith(".pdf")){
                mylists.add(aFile.getName());
            }
        }
        else if (aFile.isDirectory()) {
            //System.out.println(spcs + "[DIR] " + aFile.getName());
            File[] listOfFiles = aFile.listFiles();
            if(listOfFiles!=null) {
                for (int i = 0; i < listOfFiles.length; i++)
                    Process(listOfFiles[i],mylists);
            } else {
                //System.out.println(spcs + " [ACCESS DENIED]");
            }
        }
        spc_count--;
        return mylists;
    }

    /*public static void main(String[] args) {
        String nam = "D:/";
        File aFile = new File(nam);
        ArrayList<String> mylists;
        mylists = new ArrayList<>();
        Process(aFile,mylists);

        for(int i=0;i<mylists.size();i++){
            System.out.println(mylists.get(i));
        }
    }*/

}