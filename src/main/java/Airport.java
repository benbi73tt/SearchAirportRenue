import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor

public class Airport {
    private String airportID;
    private String name;
    private String city;
    private String country;
    private String iata;

    public Airport(String[] res) {
        airportID = res[0];
        name = res[1];
        city = res[2];
        country = res[3];
        iata = res[4];




    }


    @Override
    public String toString() {
        return "Airport{" +
                "airportID=" + airportID +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", iata='" + iata + '\'' +

                '}' + "\n";
    }

    public String getAirportID() {
        return airportID;
    }

    public void setAirportID(String airportID) {
        this.airportID = airportID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIata() {
        return iata;
    }

    public void setIata(String iata) {
        this.iata = iata;
    }

//    public String getIcao() {
//        return icao;
//    }
//
//    public void setIcao(String icao) {
//        this.icao = icao;
//    }
//
//    public String getLatitude() {
//        return latitude;
//    }
//
//    public void setLatitude(String latitude) {
//        this.latitude = latitude;
//    }
//
//    public String getLongtitude() {
//        return longtitude;
//    }
//
//    public void setLongtitude(String longtitude) {
//        this.longtitude = longtitude;
//    }
//
//    public long getAltitude() {
//        return altitude;
//    }
//
//    public void setAltitude(long altitude) {
//        this.altitude = altitude;
//    }
//
//    public int getTimezone() {
//        return timezone;
//    }
//
//    public void setTimezone(int timezone) {
//        this.timezone = timezone;
//    }
//
//    public String getDst() {
//        return dst;
//    }
//
//    public void setDst(String dst) {
//        this.dst = dst;
//    }
//
//    public String getDbTimezone() {
//        return dbTimezone;
//    }
//
//    public void setDbTimezone(String dbTimezone) {
//        this.dbTimezone = dbTimezone;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public String getSource() {
//        return source;
//    }
//
//    public void setSource(String source) {
//        this.source = source;
//    }
}
