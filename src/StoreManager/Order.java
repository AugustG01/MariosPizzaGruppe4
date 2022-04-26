package StoreManager;

import StoreItems.Pizza;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Order
{
  private LocalDateTime time ;
  private int clientID;
  ArrayList<Pizza> orderedPizzas = new ArrayList<>();


  public Order(LocalDateTime time, int clientID) {
    this.time = time;
    this.clientID = clientID;
  }

  public ArrayList<Pizza> getOrderedPizzas() {
    return orderedPizzas;
  }


  public int getClientID(){
    return clientID;
  }

  @Override
  public String toString() {
    return "-------CURRENT ORDERS-------" +
            "\nTime:" + time +
            "\nOrder number: " + clientID + "\n" +orderedPizzas.toString().replace("[", "").replace("]","").replace(",", "\n" );
  }
}
