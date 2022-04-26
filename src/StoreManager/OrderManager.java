package StoreManager;

import StoreItems.Menu;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class OrderManager {
  Scanner sc = new Scanner(System.in);
  Menu menu = new Menu();
  int answer;
  private int clientID = 1;
  ArrayList<Order> ordreOversigt = new ArrayList();

  public Order makeOrder() {
    Order order = new Order(LocalDateTime.now(),clientID++);
/*    menu.getMenuKort();
    int orderNr = chooseOrderNumber();
    IItem ChosenOrder = menu.menuKort.get(orderNr - 1);
    return ChosenOrder;*/
    System.out.println("How many pizzas would you like? TYPE 99 TO DELETE");
    answer = sc.nextInt();
    if (answer == 99) {
        deleteOrder();
    }else{

    for (int i = 0; i < answer; i++) {
        System.out.print("Which number? ");

        order.getOrderedPizzas().add(menu.menuKort.get(sc.nextInt() - 1));
        //ordreOversigt.add(makeOrder());
        // sc.nextLine();
    }
    }

    return order;
  }

  public void viewOrder() {
      if(answer ==99){

      }else {
          ordreOversigt.add(makeOrder());
      }
    for (int i = 0; i < ordreOversigt.size(); i++) {
      System.out.println(ordreOversigt.get(i));
    }
    /*
    currentPizza = makeOrder().;
    System.out.println(" ---YOUR CHOICE--- ");
    System.out.println("Name: " + currentPizza.GetName() + '\n'
            + "Description: " + currentPizza.GetDescription() + '\n'
            + "Price: " + currentPizza.GetCost());
    System.out.println();
    clientOrder = new Order(currentPizza);
    System.out.println(" ---ORDER INFO--- ");
    System.out.println("OrderInfo => " + clientOrder.getOrderItem() + "\nOrderStatus => " + "\nOrder Date & Time => " + clientOrder.getOrderTime() + " \n Client ID: " + clientOrder.getClientID());
    System.out.println();*/
  }

  /*
  public IOrder SelectClientOrder() {
    IOrder tmpOrder = clientOrder;
    return tmpOrder;
  }

  public void addOrderToQueue() {
    IOrder value = SelectClientOrder();

  }

  public void RemoveOrderFromQueue() {
    IOrder value = SelectClientOrder();
  }*/
/*
  public void showOrders() {
    for (int i = 0; i < ordreOversigt.size(); i++){
      System.out.println(ordreOversigt.get(i));
    }
  }*/

/*
  public int chooseOrderNumber() {
    System.out.print("Hello, please choose a pizza by number: ");

    int input = sc.nextInt();

    System.out.println("Thank you ! you have chosen nr: " + input + '\n');

    //Denne delete funktion virker ikke.
    if (input == 99) {
      deleteOrder();
    }
    return input;
  }*/

  public void deleteOrder() {
    viewOrder();
    System.out.println("\nWhat order would you like to delete? ");
   // int input = sc.nextInt();
    answer = sc.nextInt();
   // sc.nextLine();

    for (int i = 0; i < ordreOversigt.size(); i++) {
      if (ordreOversigt.get(i).getClientID() == answer) {
        ordreOversigt.remove(ordreOversigt.get(i));
          System.out.println("You deleted order: " + answer);
          viewOrder();
      }
    }
  }
}

