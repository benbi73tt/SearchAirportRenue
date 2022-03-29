import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.*;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Scanner;

public class Project {

    public static void main(String[] args) throws IOException {

        Scanner n = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String a = n.nextLine();


        LineIterator it = FileUtils.lineIterator(new File("src/main/java/helper/air1.csv"), "UTF-8");
        String dam;
        String[] res;
        Instant start = Instant.now();
        int count = 0;
        try {
            while (it.hasNext()) {
                dam = it.nextLine();
                res = dam.split(",");
                if (res[1].contains(a)) {
                    System.out.println(Arrays.toString(res));
                    count++;
                }
            }
        } finally {
            Instant finish = Instant.now();
            long elapsed = Duration.between(start, finish).toMillis();
            System.out.println("Прошло времени, мс: " + elapsed +
                    " Строк : " + count);
        }
    }

//    public static void main(String[] args) throws Exception {
//        CsvToBean csv = new CsvToBean();
//        String csvFilename = "src/main/java/helper/air1.csv";
//        Scanner n = new Scanner(System.in);
//        System.out.println("Введите строку и столбец: ");
//        String a = n.nextLine();
//        int m = Integer.parseInt(n.nextLine());
//        CSVReader csvReader = new CSVReader(new FileReader(csvFilename));
//        List<String[]> list = new ArrayList<>();
//        //Read CSV line by line and use the string array as you want
//        String[] nextLine;
//        Instant start = Instant.now();
//        int numberOfRows = 0;
//        while ((nextLine = csvReader.readNext()) != null) {
//            if (nextLine[m].contains(a)) {
//                System.out.println(nextLine[m]);
//                numberOfRows++;
//            }
//        }
//        Instant finish = Instant.now();
//        long elapsed = Duration.between(start, finish).toMillis();
//
//        System.out.println(
//                        "Прошло времени, мс: " + elapsed +
//                        " Количество строк: " + numberOfRows);
//    }
}
