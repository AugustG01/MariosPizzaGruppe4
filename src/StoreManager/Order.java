package StoreManager;

import StoreItems.Pizza;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Order
{
  private LocalDateTime _time ;
  private int clientID;
  ArrayList<Pizza> orderedPizzas = new ArrayList<>();


  public Order(LocalDateTime _time, int clientID) {
    this._time = _time;
    this.clientID = clientID;
  }


  public String getOrderTime() {
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    String formattedDate = this._time.format(myFormatObj);
    return formattedDate;
  }



  public ArrayList<Pizza> getOrderedPizzas() {
    return orderedPizzas;
  }

  public void setOrderedPizzas(ArrayList<Pizza> orderedPizzas) {
    this.orderedPizzas = orderedPizzas;
  }

  public int setClientID(){
    return clientID;
  }
  public int getClientID(){
    return clientID;
  }

  @Override
  public String toString() {
    return "-------CURRENT ORDERS-------" +
            "\nTime:" + _time +
            "\nOrder number: " + clientID + "\n" +orderedPizzas.toString().replace("[", "").replace("]","").replace(",", "\n" );
  }
}
