/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vortex;

import java.io.File;

/**
 *
 * @author Sanjay Maharjan
 */
public class Listing {

    public File folder;
    File[] listOfFiles;
    /**
     * @param args the command line arguments
     */
    public Listing(String list)
    {
          // TODO code application logic here
        folder = new File(list);
        listOfFiles = folder.listFiles();

    for (int i = 0; i < listOfFiles.length; i++) {
      if (listOfFiles[i].isFile()) {
        System.out.println("File " + listOfFiles[i].getName());
      } else if (listOfFiles[i].isDirectory()) {
        System.out.println("Directory " + listOfFiles[i].getName());
      }
    }
    }
    
}
