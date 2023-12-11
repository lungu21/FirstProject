package md.orange.filemanagementservice;

import java.io.File;
import java.io.IOException;

public class FileManager {

    public static void createTheFileIfItDoesNotExist(File inputFile) {

        if (inputFile.exists()) {
            System.out.println("The file already exist");
        } else {
            System.out.println("The file does not exist, it has to be create");
            try {
                inputFile.createNewFile();
            } catch (IOException e) {
                System.out.println("There is an exception: " + e.getMessage());

            }
        }
    }

    public static void informItTheFileExist(File file) {
        if (file.exists()) {
            System.out.println("Fisierul exista");
        } else System.out.println("The file is not present");
    }

    public static void printTheFileName(File file) {
        System.out.println("The file name is: " + file.getName());
    }

    public static void printTheAbsolutePath(File file) {
        System.out.println("The file absolute path: " + file.getAbsolutePath());

    }

    public static void printIfTheFileIsDirectory(File inputFile) {
        System.out.println(inputFile.isDirectory());

//        if (inputFile.isDirectory()) {
//            System.out.println("This is a directory");
//        }
//        else System.out.println("This is not a directory");
    }

    public static void deleteTheFileIfExist( File inputfile){
        if(inputfile.exists()){
           if(inputfile.delete()){
            System.out.println("Fisierul a fost sters");
        } else {
               System.out.println("The file exists, but was not deleteld");
           }}
           else {
            System.out.println("The file does not exist");
        }
    }





}




