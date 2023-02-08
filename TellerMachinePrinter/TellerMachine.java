package TellerMachinePrinter;

import java.util.ArrayList;

public class TellerMachine{
    private Output output;
    private Keyboard keyboard;
    private Customer customer;
    private ItemPurchase item;

    public TellerMachine(){
        output = new Output();
        keyboard = new Keyboard();
    }

    public void run(){
        int userChoice;
        boolean decision = true;

        do {
            userChoice = displayMenu();
            switch (userChoice) {
                case 1:
                    recordNewPurchase();
                    break;
                case 2:
                    output.println("=== GOOD BYE ===");
                    System.exit(0);
                default:
                    output.println("Invalid Option \n");
                    break;
            }
        } while (decision);
    }

    public int displayMenu(){
        output.println("=-=-=-=-=- SUPERMARKET TELLER MACHINE -=-=-=-=-=");
        output.println("Please enter an option from the Menu below");
        output.println("1: New Purchase Entry");
        output.println("2: Shutdown");
        output.println("");
        return keyboard.getInt();
    }

    public void recordNewPurchase(){
        output.println("RECORDING NEW PURCHASE");

        output.println("Customer Name:");
        String cname = keyboard.getString();

        output.println("Customer Phone Number:");
        String cphoneNo = keyboard.getString();

        customer = new Customer(cname, cphoneNo);
        ArrayList<ItemPurchase> items = new ArrayList<ItemPurchase>();

        int choice = newRecordMenu();
        customerItemSwitch(choice, customer, items);
    }

    public void customerItemSwitch(int choice, Customer customer, ArrayList<ItemPurchase> items){
        boolean decision = true;
        do {
            switch (choice) {
                case 1:
                    addItem(customer, items);
                    decision = false;
                    break;
                case 2:
                    viewAddedItems(customer, items);
                    decision = false;
                    break;
                case 3:
                    printCustomerReceipt(customer, items);
                    break;
                case 4:
                    run();
                    decision = false;
                    break;
                default:
                    output.println("Invalid Option \n");
                    break;
            }
        } while (decision);
    }

    public void addItem(Customer customer, ArrayList<ItemPurchase> items){
        output.println("Name of Item:");
        String itemName = keyboard.getString();
        
        output.println("Quantity of purchase:");
        int itemQuantity = keyboard.getInt();
        
        output.println("Amount:");
        int itemAmount = keyboard.getInt();

        item = new ItemPurchase(itemName, itemQuantity, itemAmount);
        items.add(item);
        output.println("=== Item Added ===");

        int choice = newRecordMenu();
        customerItemSwitch(choice, customer, items);
    }

    public void viewAddedItems(Customer customer, ArrayList<ItemPurchase> items){
        output.println("=== Listing items added to current purchase ===");
        for(ItemPurchase item: items){
            output.println(item.toString());
        }
        int choice = newRecordMenu();
        customerItemSwitch(choice, customer, items);
    }

    public int newRecordMenu(){
        output.println("------ENTRY MENU------");
        output.println("Enter:");
        output.println("1 to Add New Item");
        output.println("2 to View Added Items");
        output.println("3 to Print Receipt");
        output.println("4 to Return to Main Menu");

        return keyboard.getInt();
    }

    public void printCustomerReceipt(Customer customer, ArrayList<ItemPurchase> items){
        output.println("=----=----= SALES RECEIPT =----=----=");
        output.println(customer.toString());
        output.println("======ITEMS PURCHASED=====");
        double total = 0.0;
        for(ItemPurchase item: items){
            output.println(item.toString());
            total += item.getAmount();
        }
        output.println("\n GRAND TOTAL: "+total);

        int choice = newRecordMenu();
        customerItemSwitch(choice, customer, items);
    }
}