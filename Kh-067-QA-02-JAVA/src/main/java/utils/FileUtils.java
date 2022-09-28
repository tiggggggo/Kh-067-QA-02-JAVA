package utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {

    public static boolean createIfNotExists(String filePath)  {

            File myObj = new File(filePath);
        try {
            return myObj.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static List<String> readFile(String filePath){
        List<String> result = new ArrayList<>();
        try (BufferedReader buffer = new BufferedReader(
                new FileReader(filePath))) {
            String fileString;
            while ((fileString = buffer.readLine()) != null) {
                result.add(fileString);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;

    }


    public static void writeFile(String filePath, List<String> listOfWords){
        try (BufferedWriter buffer = new BufferedWriter(
                new FileWriter(filePath,true))) {
            for (String word : listOfWords) {
                buffer.write(word+"\n");
            }
            } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}


