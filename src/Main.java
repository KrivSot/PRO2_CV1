import models.PizzaMenuItem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World!");

        System.out.println("Hello again!");
        int num = 10;
        int num2 = 15;

        if(num == num2){
            System.out.println("num == num2");
        }
        else if (num < num2) {
            System.out.println("num < num2");
        }

        boolean b1 = false;

        String text1 = "aaa";
        String text2 = "aaa";
        if(text1 == text2){
            System.out.println("text1==text2");
        }
        else{
            System.out.println("text1!=text2");
        }

        PizzaMenuItem item1 = new PizzaMenuItem(190, "Hawai", "Pineapple pizza");
        PizzaMenuItem item2 = new PizzaMenuItem(190, "Hawai", "Pineapple pizza");

        PizzaMenuItem item3 = item1;

        item3.setPrice(200);

        if(item1 != item2)
            System.out.println("item1 is not equal to item2.");
        else System.out.println("item1 is equal to item2.");

        System.out.println(item3);
        List<PizzaMenuItem> pizzaItems = new ArrayList<>();
        pizzaItems.add(item1);
        pizzaItems.add(item2);
        pizzaItems.add(item3);

        //foreach in java
        for(PizzaMenuItem it : pizzaItems){
            System.out.println(it);
        }

        PizzaMenuItem itemFromList = pizzaItems.get(2);
        System.out.println(itemFromList);
    }
}
