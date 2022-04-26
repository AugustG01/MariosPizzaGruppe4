package StoreManager;

import Controller.Controller;
import Interfaces.IItem;
import Interfaces.IOrder;
import StoreItems.Menu;
import StoreItems.Pizza;

import javax.naming.ldap.Control;
import java.util.Dictionary;
import java.util.Queue;
import java.util.Scanner;

public class OrderManager {

  Menu _menu;
  // global variable for current chosen pizza
  IItem currentPizza;
  IOrder clientOrder;
  StoreQueue _storeQueue;


  public OrderManager() {
    _menu = new Menu();
    _storeQueue = new StoreQueue();
  }

  private IItem makeOrder() {
    Dictionary<Integer, IItem> menu = _menu.getMenuKort();
    int orderNr = chooseOrderNumber();
    IItem ChosenOrder = menu.get(orderNr - 1);
    return ChosenOrder;
  }

  public void viewOrder() {
    currentPizza = makeOrder();
    System.out.println(" ---YOUR CHOICE--- ");
    System.out.println("NAme: " + currentPizza.GetName() + '\n'
            + "Description: " + currentPizza.GetDescription() + '\n'
            + "Price: " + currentPizza.GetCost());
    System.out.println();
    clientOrder = new Order(currentPizza, OrderState.Ready);
    System.out.println(" ---ORDER INFO--- ");
    System.out.println("OrderInfo => " + clientOrder.getOrderItem() + "\nOrderStatus => " + clientOrder.GetOrderStatus()
            + "\nOrder Date & Time => " + clientOrder.getOrderTime());
    System.out.println();
  }

  public IOrder SelectClientOrder() {
    IOrder tmpOrder = clientOrder;
    return tmpOrder;
  }

  public void addOrderToQueue() {
    IOrder value = SelectClientOrder();
    _storeQueue.AddOrder(value);
  }

  public void RemoveOrderFromQueue() {
    IOrder value = SelectClientOrder();
    _storeQueue.DeleteOrder(value);
  }

  public void viewQueueList() {

    System.out.println(" ---QUEUE INFO--- ");
    for (IOrder item : _storeQueue.QueueOverview) {
      System.out.println("Client ID: " + item.getClientID() + " | Date&Time: " + item.getOrderTime() + " | OrderName: " + item.getOrderItem()
              + " | ");
    }
  }


  public int chooseOrderNumber() {
    System.out.print("Hello, please choose a pizza by number: ");
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();

    System.out.println("Thank you ! you have chosen nr: " + input + '\n');

    //Denne delete funktion virker ikke.
    /*if (input == 99) {
      System.out.println("Which order would you like to delete? ");
      orderValue = sc.nextInt();
      for (int i = 0; i < _storeQueue.QueueOverview.size(); i++) {

        if (orderValue == _storeQueue.QueueOverview.peek().getClientID())
          _storeQueue.QueueOverview.remove(_storeQueue.QueueOverview.peek().getClientID());
      }
    }*/
    return input;
    }

  }

