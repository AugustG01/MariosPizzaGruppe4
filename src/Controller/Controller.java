package Controller;

import StoreItems.Menu;
import StoreManager.OrderManager;

public class Controller {
    public boolean gameOn = true;

    OrderManager ordMan = new OrderManager();
    Menu _menu = new Menu();

    public void go(){
      gameOn();
    }

    public void gameOn(){
        //skal laves som en switch
        while(gameOn == true){

            _menu.PrintMenu();

            ordMan.viewOrder();
           // ordMan.addOrderToQueue();
           // ordMan.showOrders();

        }
    }

}

