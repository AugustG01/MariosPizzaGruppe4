package StoreManager;

import Interfaces.IItem;
import Interfaces.IOrder;
import StoreItems.Pizza;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Order implements IOrder
{
  private IItem _order;
  private LocalDateTime _time ;
  private int clientID = 1;

  public Order(IItem pizza){
    this._order = pizza;
    this._time = LocalDateTime.now();
  }

  public IItem getOrderItem() {
    return this._order;
  }

  public String getOrderTime() {
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    String formattedDate = this._time.format(myFormatObj);
    return formattedDate;
  }



  public int setClientID(){
    return clientID;
  }
  public int getClientID(){
    return clientID++;
  }
}
