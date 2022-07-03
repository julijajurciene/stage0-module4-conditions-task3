package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        String result;
        if (month > 2 && month < 6) {
            result = "Spring";
        } else if (month > 5 && month < 9) {
            result = "Summer";
        } else if (month > 8 && month < 12) {
            result = "Autumn";
        } else if (month == 12 || month == 1 || month == 2) {
            result = "Winter";
        } else {
            result = "wrong number!";
        }

        System.out.println(result);
    }
}
