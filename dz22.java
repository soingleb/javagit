import java.util.Scanner;

public class dz22 {

    public static void main(String[] args) {
        System.out.println("vvedi 4islo bol'she 9 menishe 100");
        Scanner number1 = new Scanner(System.in);
        int n = number1.nextInt();
        while (n<10||n>97) {
            Scanner number2 = new Scanner(System.in);
            n = number1.nextInt();
        }
        int a = n / 10 + n % 10;
        System.out. println("Summa =" + a);
    }
}
