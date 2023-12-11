package md.orange.filemanagementservice;

import java.io.*;

public class OutputFileWriterManager {
    public static void writeDataIntoFileWithFileWriter(File file, String content) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write(content);
        } catch (IOException e) {
            System.out.println("There has been an exception " + e.getMessage());
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void writeDataIntoFileBufferedWriter(File file, String content) {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file));
            bufferedWriter.write(content);
            bufferedWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
