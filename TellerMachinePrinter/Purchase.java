package TellerMachinePrinter;

public class Purchase {
    private Customer customer;
    private ArrayList<ItemPurchase> itemPurchase;
    private double total;

    public Purchases(Customer customer, ArrayList<ItemPurchase> itemPurchase){
        this.customer = customer;
        this.itemPurchase = itemPurchase;

        calculateTotal();
    }

    public void addItem(ItemPurchase item){
        this.itemPurchase.add(item);
    }

    public double calculateTotal(){
        for(int i=0; i<itemPurchase.size(); i++){
            this.total += itemPurchase.get(i).getAmount();
        }
    }
}
