package md.orange.filemanagementservice;

import java.io.File;

public class FileExecutionService {
    public static void main(String[] args) {

        File demoFile = new File("src/main/java/md/orange/filemanagementservice/test.txt");
     FileManager.createTheFileIfItDoesNotExist(demoFile);
     FileManager.informItTheFileExist(demoFile);
     InputFileReadManager.readDataFromTextFile(demoFile);
     InputFileReadManager.readDataFromTextFileUsingFileReader(demoFile);
     System.out.println();
     InputFileReadManager.readDataFromATextFileUsingBufferedReader(demoFile);

     String contentForTheFile =  "Vladka e cea mai desteapta \n another line";
     OutputFileWriterManager.writeDataIntoFileWithFileWriter(demoFile,contentForTheFile );
     OutputFileWriterManager.writeDataIntoFileBufferedWriter(demoFile, "empty");
      //  FileManager.deleteTheFileIfExist(demoFile);





    }
}
