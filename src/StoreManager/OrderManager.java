package StoreManager;

import StoreItems.Menu;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class OrderManager {
  Scanner sc = new Scanner(System.in);
  Menu mnu = new Menu();
  int answer;
  private int clientID = 1;
  ArrayList<Order> orderOverview = new ArrayList();

  public Order makeOrder() {
    Order order = new Order(LocalDateTime.now(),clientID++);

    System.out.println("\nHow many pizzas would you like? TYPE 99 TO DELETE");
    answer = sc.nextInt();
    if (answer == 99) {
        deleteOrder();
    }else{

    for (int i = 0; i < answer; i++) {
        System.out.print("Which number? ");

        order.getOrderedPizzas().add(mnu.menu.get(sc.nextInt() - 1));
     }
    }
    return order;
  }

  public void viewOrder() {

    for (int i = 0; i < orderOverview.size(); i++) {
      System.out.println(orderOverview.get(i));

    }
      if(answer ==99){

      }else {
          orderOverview.add(makeOrder());
      }
  }

  
  public void deleteOrder() {
    //viewOrder();
    System.out.println("\nWhat order would you like to delete? ");

    answer = sc.nextInt();


    for (int i = 0; i < orderOverview.size(); i++) {
      if (orderOverview.get(i).getClientID() == answer) {
        orderOverview.remove(orderOverview.get(i));
          System.out.println("YOU DELETED ORDER!: " + answer+"\n");
          viewOrder();
      }
    }
  }
}

