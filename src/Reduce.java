public class Reduce {
    public static void main(String[] args) {
        int counT = 0;
        int a = 100;
        while (a != 0){
            if (a % 2 == 0) {
                a = a / 2;
            }
            else if (a % 2 == 1) {
                 a = a - 1;
            }
            counT ++;
        }
        System.out.println("The total count time is " + counT);
    }
}
