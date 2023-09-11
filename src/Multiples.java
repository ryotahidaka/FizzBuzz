public class Multiples {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;
        boolean divisibleBy3;
        boolean divisibleBy5;

        while (i < 1000) {
            divisibleBy3 = (i % 3 == 0);
            divisibleBy5 = (i % 5 == 0);

            if (divisibleBy3 || divisibleBy5) {
                count++;
            }
            i++;
        }
        System.out.println(count);
    }
}
