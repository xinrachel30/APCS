/*
Pseudopseudohypoparathyroidism -- Xinqing Lin, Jeffery Tang, May Qiu
APCS pd 6
LAB08 -- America's Next Top Data Scientist
2022-04-05
time spent: 2 hr
*/
/*
 * Arrays of objects
 */

import core.data.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Welcome03_List {

   public static void main(String[] args) {
     DataSource ds = DataSource.connect("http://weather.gov/xml/current_obs/index.xml").load();
     ArrayList<WeatherStation> allstns = ds.fetchList("WeatherStation", "station/station_name",
                                                      "station/station_id", "station/state",
                                                      "station/latitude", "station/longitude");
     System.out.println("Total stations: " + allstns.size());

      // Scanner sc = new Scanner(System.in);
      // System.out.println("Enter a state abbreviation: ");
      // String state = sc.next();
      // System.out.println("Stations in " + state);
      // for (WeatherStation ws : allstns) {
      //    if (ws.isLocatedInState(state)) {
      //       System.out.println("  " + ws.getId() + ": " + ws.getName());
      //    }
      // }
   }

  public class WeatherStation {

    private String name;
    private String id;
    private String state;
    private double lat;
    private double lng;

    public WeatherStation(String name, String id, String state, double lat, double lng) {
        this.name = name;
        this.id = id;
        this.lat = lat;
        this.lng = lng;
        this.state = state;
     }

    public String getId() {
      return id;
    }

    public String getName() {
      return name;
    }

    public boolean isLocatedInState(String state) {
      return this.state.equals(state);
    }
  }
}
