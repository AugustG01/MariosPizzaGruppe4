package StoreItems;

import Interfaces.IItem;

import java.util.*;

public class Menu {
  StoreDataBase _data = new StoreDataBase();
  public ArrayList<Pizza> menuKort = getMenuKort();
  private Integer bestillingsNr = 0;

  private String answer;

  //Scanner scan = new Scanner(System.in);

  public ArrayList<Pizza> getMenuKort() {
    menuKort = _data.createMenu();
    /*// to get menu list from storedatabase
    List<IItem> tmpContainer = _data.createMenu();
    for (int i = 0; i < tmpContainer.size(); i++) {
      // to populate the menukort
      menuKort.add(tmpContainer.get(i));
      if (bestillingsNr == null) {
        System.out.println("that is not a number");
      } else if (bestillingsNr < 13) {
        bestillingsNr++;

      }

    }*/
    return menuKort;
    }

    public void PrintMenu () {
      for (int i = 0; i < menuKort.size(); i++) {
        System.out.println(i+1 + ". " +  menuKort.get(i) + " " + menuKort.get(i).GetCost());
      }
      System.out.println();


    }



}
