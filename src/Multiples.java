public class Multiples {
    public static void main(String[] args) {
        int k = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0){
                System.out.println(i);
                k ++;
            }
        }
        System.out.println("Total number of multiples of 3 and 5: " + k);
    }
}
