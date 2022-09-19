package models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class PizzaMenu {

    private List<PizzaMenuItem> menuItems;
    private LocalDateTime lastUpdate;

    public PizzaMenu() {
        menuItems = new ArrayList<>();
    }

    public void addItem(PizzaMenuItem itemToAdd){
        menuItems.add(itemToAdd);
        lastUpdate = LocalDateTime.now();
    }
    public void removeItem(PizzaMenuItem itemToRemove){
        menuItems.remove(itemToRemove);
    }

    public void removeItem(String itemToRemove){
        PizzaMenuItem toDelete = null;
        for(PizzaMenuItem it : menuItems){
            if(it.getName() == itemToRemove){
                toDelete = it;
                break;
            }
        }

        if(toDelete!=null){
            menuItems.remove(toDelete);
        }
    }

    public List<PizzaMenuItem> getMenuItems(){
        return menuItems;
    }

    public int getMenuSize(){
        return menuItems.size();
    }

    public LocalDateTime getLastUpdate(){
        return lastUpdate;
    }

    @Override
    public boolean equals(Object obj){
        return ((PizzaMenu)obj).getMenuSize() == getMenuSize();
    }
}
