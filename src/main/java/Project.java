import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.bean.ColumnPositionMappingStrategy;
import au.com.bytecode.opencsv.bean.CsvToBean;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Project {

    public static void main(String[] args) throws IOException {

        Scanner n = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String a = n.nextLine();


        LineIterator it = FileUtils.lineIterator(new File("C:\\github\\SearchAirport\\src\\main\\java\\helper\\airports.csv"), "UTF-8");
        String dam;
        String[] res;
        List<Airport> result = new ArrayList<>();
        Instant start = Instant.now();
        try {
            while (it.hasNext()) {
                dam = it.nextLine();
                res = dam.split(",");
                if (res[1].contains(a)) {
                    result.add(new Airport(res));
                }
            }
        } finally {
            Instant finish = Instant.now();
            long elapsed = Duration.between(start, finish).toMillis();
            System.out.println(result +
                    "\n Прошло времени, мс: " + elapsed +
                    " Строк : " + result.size());
        }
//        Instant start = Instant.now();
//        Files.lines(Paths.get("C:\\github\\SearchAirport\\src\\main\\java\\helper\\airports.csv"), StandardCharsets.UTF_8).forEach(System.out::println);
//        Instant finish = Instant.now();
//        long elapsed = Duration.between(start, finish).toMillis();
//        System.out.println(
//                "\n Прошло времени, мс: " + elapsed);
    }
}


//    public static void main(String[] pArgs) throws IOException {
//        String fileName = "C:\\github\\SearchAirport\\src\\main\\java\\helper\\airports.csv";
//        File file = new File(fileName);
//
//        byte[] fileBytes = Files.readAllBytes(file.toPath());
//        char singleChar;
//        String n = "";
//        Instant start = Instant.now();
//        for (byte b : fileBytes) {
////            singleChar = (char) b;
//
//            if (b == 10) {
//                if (n.contains("Bo"))
//                    System.out.println(n);
//                n = "";
//            } else
//                n += (char)b;
//        }
//        Instant finish = Instant.now();
//        long elapsed = Duration.between(start, finish).toMillis();
//        System.out.println(
//                "\n Прошло времени, мс: " + elapsed);
//    }
//}

//    public static void main(String[] args) throws IOException {
//        FileReader fileReader = null;
//        CSVFormat csvFileFormat = CSVFormat.INFORMIX_UNLOAD_CSV.withQuote(null);
//        String fileName = "C:\\github\\SearchAirport\\src\\main\\java\\helper\\airports.csv";
//
//        fileReader = new FileReader(fileName);
//        CSVParser csvFileParser = new CSVParser(fileReader, csvFileFormat);
//
//        List<CSVRecord> csvRecords = new ArrayList<>();
//        Instant start = Instant.now();
//        for (CSVRecord csvRecord : csvFileParser) {
////            System.out.println(csvRecord);
//           if(csvRecord.get(1).contains("Bo"))
//               csvRecords.add(csvRecord);
//
//        }
//        csvFileParser.close();
//                    Instant finish = Instant.now();
//            long elapsed = Duration.between(start, finish).toMillis();
//            System.out.println(
//                    "Прошло времени, мс: " + elapsed );}
//}
