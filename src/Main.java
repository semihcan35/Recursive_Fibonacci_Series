import java.util.Scanner;
public class Main {
    static int fib(int number){
        if(number==1 || number==2){
            return 1;
        }
        return fib(number-1)+fib(number-2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.println("Sayiyi giriniz:");
        number = input.nextInt();

        System.out.println(fib(number));
    }
}