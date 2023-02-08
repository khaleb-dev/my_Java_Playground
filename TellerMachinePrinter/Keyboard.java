package TellerMachinePrinter;

import java.util.Scanner;

public class Keyboard {
    private Scanner input;

    public Keyboard(){
        input = new Scanner(System.in);
    }

    public int getInt(){
        return input.nextInt();
    }

    public String getLine(){
        return input.nextLine();
    }

    public String getString(){
        return input.next();
    }
}