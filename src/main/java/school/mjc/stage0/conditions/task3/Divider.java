package school.mjc.stage0.conditions.task3;

public class Divider {
    public void isDividableBy5And11(int number) {
        String result;
        if (number == 0) {
            result = "cannot divide by zero";
        } else if (number % 5 == 0 && number % 11 ==0) {
            result = "Dividable";
        } else {
            result = "Non-dividable";
        }
        System.out.println(result);
    }
}
