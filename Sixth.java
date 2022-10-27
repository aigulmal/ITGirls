import java.util.Scanner;

public class Sixth {
    public static void main(String[] args){
        //1.1
        //int power=0;
        //int result = 0;
        /*
        while (power<10){
            result = (int) Math.pow(2, power);
            power++;
            System.out.println(result);
        }*/
        //1.2
        /*
        do{
            result = (int) Math.pow(2, power);
            power++;
            System.out.println(result);
        }
        while (power<10);
        */
        //1.1.1
        /*int result = 1;
        while (result<=512){
            System.out.println(result);
            result*=2;
        }
        */
        //1.1.2
        /*int result = 1;
        do {
            System.out.println(result);
            result*=2;
        } while (result<=512);
        */
        //2
        /*
        int i = 0;
        while(i < 50) {
            i++;
            if (i == 4 || i==24){
                continue;
            }
            if(i==48){
                break;
            }
            System.out.println(i);
        }*/
        //3
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
}
