package TellerMachinePrinter;

public class Output {
    /**
     * print and move cursor to next line
     */
    public void println(String message){
        System.out.println(message);
    }

    /**
     * print without moving cursor to next line
     */
    public void print(String message){
        System.out.print(message);
    }
}