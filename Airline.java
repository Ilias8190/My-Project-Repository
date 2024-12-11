import java.util.ArrayList;
import java.util.List;

public class Airline {
    private List<Airplane> airplanes;
    private List<Airports> airports;
    private String airline; 
    
 public Airline() {
        this.airplanes = new ArrayList<>();
        this.airports = new ArrayList<>();
        this.airline = "";
    }
     public void setNumberOfAirplanes(Airplane airplane) {
        this.airplanes.add(airplane);
    }
    
    public void setLocations(Airports airports) {
        this.airports.add(airports);
    }
       public List<Airplane> getNumberOfAirplanes() {
        return this.airplanes;
    }
    
    public List<Airports> getLocations() {
        return this.airports;
    }
    public void Airplanes() {
        for (Airplane airplane : airplanes) {
            System.out.println(airplane.getAirplaneDetails());
        }
    }
    
    public void Locations() {
        for (Airports airport : airports) {
            System.out.println(airport.getLocation());
        }
    }
}
    
