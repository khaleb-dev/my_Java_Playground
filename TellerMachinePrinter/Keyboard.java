package TellerMachinePrinter;

import java.util.Scanner;

public class Keyboard {
    private Scanner input;

    public Keyboard(){
        this.input = new Scanner(System.in);
        input.useDelimeter("\\n");
    }

    public int getInt(){
        return input.nextIn();
    }

    public String getLine(){
        return input.nextLine();
    }

    public String getString(){
        return input.next();
    }
}