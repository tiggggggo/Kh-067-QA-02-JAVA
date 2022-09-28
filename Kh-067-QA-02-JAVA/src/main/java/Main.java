import utils.FileUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        boolean result = FileUtils.createIfNotExists("test.txt");
        System.out.println(result);

        List<String> resultList = FileUtils.readFile("test.txt");
        System.out.println(resultList);

        FileUtils.writeFile("test.txt", Collections.singletonList("Hello"));
    }
}
