package StoreItems;

public class Pizza
{
  private String name;
  private String description;
  private int price;

  public Pizza(String name, String description, int price)
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


  @Override
  public String toString() {
    return getName() + " : " + getDescription() + "..."+getCost();
  }
}
