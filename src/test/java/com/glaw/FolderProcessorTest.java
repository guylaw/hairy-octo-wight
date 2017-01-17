package com.glaw;

import static org.junit.Assert.assertFalse;

import java.io.File;
import java.util.ArrayList;

import org.junit.Test;

public class FolderProcessorTest {

  @Test
  public void test() {
    FolderProcessor processor = new FolderProcessor();
    ArrayList<File> list = processor.createFileList(new File("/home/glaw/dir1"));
    assertFalse("File list is null", list == null);
  }

}
