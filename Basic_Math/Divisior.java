
public class Divisior {

    public static void main(String[] args) {
        int n = 6;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (i % 3 == 0) {
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}