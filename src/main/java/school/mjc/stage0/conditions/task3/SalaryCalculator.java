package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        int result;
        if (salary < 0) {
            System.out.println("wrong input!");
        } else if (salary <= 10000) {
            System.out.println(salary * (1 - 0.15));
        } else if (salary > 10000 && salary <= 20000) {
            System.out.println(salary * (1 - 0.18));
        } else {
            System.out.println(salary * (1 - 0.2));
        }
    }
}
