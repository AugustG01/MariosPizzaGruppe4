package StoreItems;


import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.PrimitiveIterator;

public class Pizza
{
  private String name;
  private String description;
  private Integer price;

  public Pizza(String name, String description, Integer price)
  {
    this.name = name;
    this.description = description;
    this.price = price;
  }

  public int getCost() {
    return this.price;
  }


  public String getName() {
    return this.name;
  }


  public String getDescription() {
    return this.description;
  }


  // Overriding toString() method of String class
  @Override
  public String toString() {
    return getName() + " : " + getDescription() + "...";
  }
}
