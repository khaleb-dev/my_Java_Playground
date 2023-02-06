package TellerMachinePrinter;

public class TellerMachine{
    private Output output;
    private Keyboard keyboard;
    private Customer customer;
    private Purchase purchase;
    private ItemPurchase item;
    private TellerDatabase tellerDatabase;

    public TellerMachine(){
        output = new Output();
        keyboard = new Keyboard();
        customer = new Customer();
        purchase = new Purchase();

    }

    public void run(){
        output.println("hahahahaha");
    }
}