package Interfaces;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface IOrder
{
  IItem getOrderItem();
  String getOrderTime();



  int getClientID();
  int setClientID();
}
