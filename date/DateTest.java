package date;

// Ex 5.12 Pg 121
public class DateTest {
    public static void main(String[] args) {
        // create date instance
        Date date = new Date(12, 25, 2022);
        System.out.println(date.displayDate());
        
        // can get month or day or year only via getters
        System.out.println("month is " + date.getMonth());
        System.out.println("day is " + date.getDay());
        System.out.println("year is " + date.getYear());
        
        // can change month or day or year via setters
        date.setMonth(1);
        date.setDay(1);
        date.setYear(2023);
        System.out.println("date changed to " + date.displayDate());
    }
}
