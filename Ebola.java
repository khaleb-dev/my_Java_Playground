import java.util.Scanner;

// Ex 5.1 Pg 86
public class Ebola {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Please, Select an option: Press [S] to [S]tart or [E] to [E]nd.");

            String toggle = input.next();

            switch (toggle) {
                case "S":
                    System.out.println("==== Ebola Symptoms ====");
                    System.out.println("The Symptoms of Ebola includes: ");
                    System.out.println("1. Fever");
                    System.out.println("2. Aches and pains, such as severe headache and muscle and joint pain.");
                    System.out.println("3. Weakness and fatigue.");
                    System.out.println("4. Sore throat.");
                    System.out.println("5. Loss of apetite.");

                    break;

                case "E":
                    System.out.println("==== Program ENDED ====");
                    return;
            
                default:
                    break;
            }
        }
    }
}
