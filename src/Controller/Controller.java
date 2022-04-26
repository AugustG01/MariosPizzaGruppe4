package Controller;

import StoreItems.Menu;
import StoreManager.OrderManager;

public class Controller {
    public boolean gameOn = true;
    OrderManager ordMan = new OrderManager();
    Menu menu = new Menu();

    public void go(){
      gameOn();
    }

    public void gameOn(){
        //menu.PrintMenu();
        //skal laves som en switch
        while(gameOn == true){

            menu.PrintMenu();

            ordMan.viewOrder();
           // ordMan.addOrderToQueue();
            //ordMan.showOrders();

        }
    }

}
