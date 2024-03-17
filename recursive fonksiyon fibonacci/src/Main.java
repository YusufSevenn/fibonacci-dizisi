import java.util.Scanner;
public class Main {
    public static int fibonacci(int a){
        if(a == 1 || a == 2){
            return 1;
        }

        return fibonacci(a - 1) + fibonacci(a - 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;

        System.out.println("fibonacci dizisinin kacinci elemani ekrana bastirilisin?");
        a = input.nextInt();

        System.out.println(fibonacci(a));

    }
}