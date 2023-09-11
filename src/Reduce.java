public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int count = 0;
        while (n != 0) {
            count++;

            if (n % 2 == 0){
                n = n / 2;
            }

            else {
                n = n - 1;
            }
        }
        System.out.println(count);

    }
}