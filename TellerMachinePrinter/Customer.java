package TellerMachinePrinter;

public class Customer {
    private String name;
    private String phoneNo;

    public Customer(String name, String phoneNo){
        this.name = name.toUpperCase();
        this.phoneNo = phoneNo;
    }

    public String getName(){
        return name;
    }

    public void setPhoneNo(String phoneNo){
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString(){
        return String.format("----- CUSTOMER -----\n Name: %s \n Contact: %s", name, phoneNo);
    }
}
