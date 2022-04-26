package StoreItems;

import java.util.*;

public class Menu {
  StoreDataBase data = new StoreDataBase();
  public ArrayList<Pizza> menu = getMenuKort();

  public ArrayList<Pizza> getMenuKort() {
    menu = data.createMenu();

    return menu;
    }

    public void PrintMenu () {
      for (int i = 0; i < menu.size(); i++) {
        System.out.println(i+1 + ". " +  menu.get(i));
      }

    }

}
