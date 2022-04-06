/*
Pseudopseudohypoparathyroidism -- Xinqing Lin, Jeffery Tang, May Qiu
APCS pd 6
LAB08 -- America's Next Top Data Scientist
2022-04-05
time spent: 2 hr
*/

public class Cereal {

  private String name;
  private char type;
  private int Calories;
  private int Protein;
  private int Fat;
  private int Sodium;
  private double Fiber;
  private double Carbohydrates;
  private int Sugar;
  private int Potassium;
  private int Vitamins;
  private int Shelf;
  private double Weight;
  private double Cups;
  private double Rating;

  public Cereal(String name, char type, int Calories, int Protein, int Fat, int Sodium, double Fiber, double Carbohydrates, int Sugar, int Potassium, int Vitamins, int shelf, double Weight, double Cups, double Rating) {
    this.name = name;
    this.type = type;
    this.Calories = Calories;
    this.Protein = Protein;
    this.Fat = Fat;
    this.Sodium = Sodium;
    this.Fiber = Fiber;
    this.Carbohydrates = Carbohydrates;
    this.Sugar = Sugar;
    this.Potassium = Potassium;
    this.Vitamins = Vitamins;
    this.Shelf = Shelf;
    this.Weight = Weight;
    this.Cups = Cups;
    this.Rating = Rating;
  }

  public String getName() {
    return name;
  }

  public char getType() {
    return type;
  }

  public int getCalories() {
    return Calories;
  }

  public int getProtein() {
    return Protein;
  }

  public int getFat() {
    return Fat;
  }

  public int getSodium() {
    return Sodium;
  }

  public double getFiber() {
    return Fiber;
  }

  public double getCarbohydrates() {
    return Carbohydrates;
  }

  public int getSugar() {
    return Sugar;
  }

  public int getPotassium() {
    return Potassium;
  }

  public int getVitamins() {
    return Vitamins;
  }

  public int getShelf() {
    return Shelf;
  }

  public double getWeight() {
    return Weight;
  }

  public double getCups() {
    return Cups;
  }

  public double getRating() {
    return Rating;
  }

  public String toString() {
    return getName() + " " + getType() + " " + getCalories() + " " + getProtein() + " " + getFat() + " " + getSodium() + " " + getFiber() + " " + getCarbohydrates() + " " + getSugar() + " " + getPotassium() + " " + getVitamins() + " " + getShelf() + " " + getWeight() + " " + getCups() + " " + getRating();
  }

  public static void main(String[] args) {
    Cereal May = new Cereal("100% Bran", 'C', 70, 4, 1, 130, 10, 5, 6, 280, 25, 3, 1, 0.33, 68.402973);
    System.out.println(May);

    Cereal Jeffery = new Cereal("100% Natural Bran", 'C', 120, 3, 5, 15, 2, 8, 8, 135, 0, 3, 1, 1, 33.983679);
    System.out.println(Jeffery);

    Cereal Lindsay = new Cereal("All-Bran", 'C', 70, 4, 1, 260, 9, 7, 5, 320, 25, 3, 1, 0.33, 59.425505);
    System.out.println(Lindsay);

    Cereal middleSchool = new Cereal("All-Bran with Extra Fiber", 'C', 50, 4, 0, 140, 14, 8, 0, 330, 25, 3, 1, 0.33, 93.704912);
    System.out.println(middleSchool);
  }

}
