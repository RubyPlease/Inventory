/**
 * Created by RobertBarber on 4/4/16.
 */
public class ShoeInventoryItem {
    private String name;

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private int quantity;

    public String getName() {
        return name;
    }

    public ShoeInventoryItem(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("Name: %s  qty %s\n", name, quantity);
    }
}


/*
I got tennis shoesInventory, basketball shoesInventory, football cleats, baseball cleats, soccer cleats,
house shoesInventory, hiking boots, running shoesInventory, dress shoesInventory. I am the shoe
 */