package holiday;
// Ex 5.6 pg 111
public class HolidayRun {

    public boolean compareHolidayMonth(Holiday holidayOne, Holiday holidayTwo) {
        if (holidayOne.getMonth() == holidayTwo.getMonth()) {
            return true;
        }
        else {
            return false;
        }
    }

    public double avgDate(Holiday[] holiday) {
        double avgDay = (holiday[0].getDay() + holiday[1].getDay())/2;
        return avgDay;
    }

    public static void main(String[] args) {
        Holiday holiday = new Holiday("Independence Day", 1, "October");
    }
}
