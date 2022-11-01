import java.util.Scanner;

public class Sixth {
    void oneOne(){
        int result = 1;
        while (result<=512) {
            System.out.println(result);
            result *= 2;
        }
    }
    void oneTwo(){
        int result = 1;
        do {
            System.out.println(result);
            result*=2;
        } while (result<=512);
    }
    void Two() {
        int i = 0;
        System.out.println(i);
        while (i < 50) {
            i++;
            if (i == 4 || i == 24) {
                continue;
            }
            if (i == 48) {
                break;
            }
            System.out.println(i);
        }
    }
    void Three(){
        System.out.println("Введите число n: ");
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        int factorial = 1;
        for (int i=1;i<=n;i++){
            factorial*=i;
        }
        System.out.println("Факториал числа " +n +" равен "+  factorial);
    }

    public static void main(String[] args){
        Sixth sixth = new Sixth();

        sixth.Three();

    }
}
