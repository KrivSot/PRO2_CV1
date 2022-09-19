package models;

public class PizzaMenuItem {

    private int price;
    private String name;
    private String desc;

    public PizzaMenuItem(int price, String name, String desc) {
        this.price = price;
        this.name = name;
        this.desc = desc;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return name + "("+price+")";
    }
}
