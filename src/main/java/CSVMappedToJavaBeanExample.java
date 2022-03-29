import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.bean.ColumnPositionMappingStrategy;
import au.com.bytecode.opencsv.bean.CsvToBean;

import java.io.FileReader;
import java.time.Duration;
import java.time.Instant;
import java.util.List;

import java.util.Scanner;
import java.util.stream.Collectors;

public class CSVMappedToJavaBeanExample {

    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception
    {

        Scanner n = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String a = n.nextLine();
        CsvToBean csv = new CsvToBean();
        String csvFilename = "src/main/java/helper/airports.csv";
        CSVReader csvReader = new CSVReader(new FileReader(csvFilename));
        //Set column mapping strategy
        List<Airport> list = csv.parse(setColumMapping(), csvReader);



        Instant start = Instant.now();
        List<Airport> result = (search(list,a));
        Instant finish = Instant.now();
        long elapsed = Duration.between(start, finish).toMillis();

        System.out.println("Количество строк: "+result.size()+"\nПрошло времени, мс: " + elapsed+"\n "+ result);
    }

    public static List<Airport> search(List<Airport> list,String a){
        return list.stream().filter(
                 p->{
                     return p.getCity().contains(a);
                 }).collect(Collectors.toList());

    }


    @SuppressWarnings({"rawtypes", "unchecked"})
    private static ColumnPositionMappingStrategy setColumMapping()
    {
        ColumnPositionMappingStrategy strategy = new ColumnPositionMappingStrategy();
        strategy.setType(Airport.class);
        String[] columns = new String[] {"airportID", "name", "city", "country", "iata"};
        strategy.setColumnMapping(columns);
        return strategy;
    }
}