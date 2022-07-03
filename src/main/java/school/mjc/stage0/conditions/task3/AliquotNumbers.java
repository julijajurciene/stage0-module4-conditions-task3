package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public void isFirstAliquot(int first, int second) {
        String result;
        if (first % second == 0) {
            result = "Aliquot";
        } else {
            result = "Not aliquot";
        }

        System.out.println(result);
    }
}
