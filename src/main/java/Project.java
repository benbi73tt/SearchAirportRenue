import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.*;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Project {

    public static void main(String[] args) throws IOException {

        Scanner n = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String a = n.nextLine();


        LineIterator it = FileUtils.lineIterator(new File("src/main/java/helper/airports.csv"), "UTF-8");
        String dam;
        String[] res;
        List<String> result = new ArrayList<>();
        Instant start = Instant.now();
        try {
            while (it.hasNext()) {
                dam = it.nextLine();
                res = dam.split(",");
                if (res[1].contains(a)) {
                    result.add("\n"+dam);
                }
            }
        } finally {
            Instant finish = Instant.now();
            long elapsed = Duration.between(start, finish).toMillis();
            System.out.println(result +
                    "Прошло времени, мс: " + elapsed +
                    " Строк : " + result.size());
        }
    }
}
