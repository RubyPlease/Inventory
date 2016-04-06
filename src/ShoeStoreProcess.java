import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by RobertBarber on 4/5/16.
 */
public class ShoeStoreProcess {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<ShoeInventoryItem> shoesInventory = new ArrayList<>();

    public static void shoeStoreProcess() {

        while (true){
            System.out.println("1. Add new item\n" +
                    "2. Remove an item from shoeInventory\n" +
                    "3. Change quantity of an item\n" +
                    "4. View shoeInventory");

            String option = scanner.nextLine();

            switch (option) {
                case "1": {
                    System.out.println("Please enter new item");
                    String text = scanner.nextLine();

                    ShoeInventoryItem shoe = new ShoeInventoryItem(text, 1);
                    shoesInventory.add(shoe);
                    break;
                }
                case "2": {
                    System.out.println("Please choose index number to remove");
                    int index = scanner.nextInt();

                    shoesInventory.remove(index);
                    break;
                }
                case "3": {
                    System.out.println("Please choose index number");
                    int index = scanner.nextInt();
                    System.out.println("Please enter new quantity");
                    int quantity = scanner.nextInt();
                    ShoeInventoryItem tempShoeInv = shoesInventory.get(index);
                    tempShoeInv.setQuantity(quantity);
                    shoesInventory.remove(index);
                    shoesInventory.add(tempShoeInv);
                    break;
                }
                case "4": {
                    int i = 0;
                    for (ShoeInventoryItem shoe : shoesInventory) {

                        System.out.printf("%s. %s", i++, shoe.toString());
                    }
                    break;
                }
                default:
                    System.out.println("Please choose an option");
                    break;

            }

        }
    }
}