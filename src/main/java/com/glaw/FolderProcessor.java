package com.glaw;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class FolderProcessor {

  ArrayList<File> createFileList(File folder){
    ArrayList<File> list = new ArrayList<File>();
    list.addAll(Arrays.asList(folder.listFiles()));
    ArrayList<File> subList = new ArrayList<File>();
    for(File file : list ){
      if(file.isDirectory()){
        subList.addAll(createFileList(file));
      }
    }
    list.addAll(subList);
    return list;
  }
  

}
