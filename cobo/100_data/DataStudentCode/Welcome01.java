/*
Pseudopseudohypoparathyroidism -- Xinqing Lin, Jeffery Tang, May Qiu
APCS pd 6
LAB08 -- America's Next Top Data Scientist
2022-04-05
time spent: 2 hr
*/


import core.data.*;

public class Welcome01 {
   public static void main(String[] args) {
      String id1 = "KATL";
      DataSource ds1 = DataSource.connect("http://weather.gov/xml/current_obs/" + id1 + ".xml");
      ds1.setCacheTimeout(15);
      ds1.load();
      ds1.printUsageString();

      String id = "KDVL";
      DataSource ds = DataSource.connect("http://weather.gov/xml/current_obs/" + id + ".xml");
      ds.setCacheTimeout(15 * 60);
      ds.load();
      //ds.printUsageString();
      float temp = ds.fetchFloat("temp_f");
      String loc = ds.fetchString("location");
      System.out.println("The temperature at " + loc + " is " + temp + "F");

      Observation ob1 = ds1.fetch("Observation", "weather", "temp_f", "wind_degrees");
      System.out.println(id1 + ": " + ob1);

      String id2 = "KDVL";
      DataSource ds2 = DataSource.connect("http://weather.gov/xml/current_obs/" + id2 + ".xml");
      ds2.setCacheTimeout(15 * 60);
      ds2.load();
      ds2.printUsageString();
      temp = ds2.fetchFloat("temp_f");
      loc = ds2.fetchString("location");
      System.out.println("The temperature at " + loc + " is " + temp + "F");

      Observation ob2 = ds2.fetch("Observation", "weather", "temp_f", "wind_degrees");

      if (ob1.colderThan(ob2) == 1) {
          System.out.println(id1 + "is colder");
      }
      else if (ob1.colderThan(ob2) == 0) {
          System.out.println("They're the same amount of cold!");
      }
      else {
          System.out.println(id2 + "is colder");
      }
   }
}


class Observation {
   float temp;
   int windDir;   // in degrees
   String description;

   Observation(String description, float temp, int windDir) {
      this.description = description;
      this.temp = temp;
      this.windDir = windDir;
   }

   public int colderThan(Observation obj) {
     if (this.temp > obj.temp) {
       return 1;
     }
     else if (this.temp == obj.temp) {
       return 0;
     }
     else {
       return -1;
     }
   }

   public String toString() {
      return (temp + " degrees; " + description + " (wind: " + windDir + " degrees)");
   }
}
