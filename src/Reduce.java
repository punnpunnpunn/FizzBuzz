public class Reduce {
    public static void main(String[] args) {
        int i = 100;
        int s = 0;
        while (i > 0) {
            if (i % 2 == 0) {
                i /= 2;
            }
            else {
                i--;
            }
            System.out.println(i);
            s++;
        }
        System.out.println("Total Steps: " + s);
    }
}
