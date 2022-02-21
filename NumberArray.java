import java.text.DecimalFormat;
import java.util.Scanner;
// Ex 5.10 pg 117
public class NumberArray {
    public static String computeAverage(int[] scores) {
        double sum = 0;
        double avg = 0;

        for (int score : scores) {
            sum = sum + score;
        }

        avg = sum / scores.length;
        DecimalFormat formater = new DecimalFormat("#.##");

        return formater.format(avg);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The program has began. \nStart entering your scores. \nType [q] to quit program.");
        int[] scores = new int[9];
        int nextIndex = 0;
        
        while (true) {
            String toggle = input.next();

            switch (toggle) {
                case "q":
                    System.out.println("Average of numbers = " + computeAverage(scores));
                    return;
            
                default:
                    if(nextIndex < scores.length){
                        scores[nextIndex] = Integer.parseInt(toggle);
                        ++nextIndex;
                    }
                    else {
                        System.out.println("Average of numbers = " + computeAverage(scores));
                        nextIndex = 0;
                    }

                    break;
            }
        }
    }
}
