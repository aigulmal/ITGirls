import java.util.Scanner;

public class Fifth {

    enum DaysOfWeek {Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday};

    public static void main(String[] args){
        /* 1
        System.out.println("Введите температуру: ");

        Scanner inputTemperature = new Scanner(System.in);
        int temperature = inputTemperature.nextInt();

        if (temperature<0){
            System.out.println("Сейчас очень холодно");
        }
        else if(temperature>=0 && temperature<=16){
            System.out.println("Сейчас прохладно");
        }
        else{
            System.out.println("Отличный летний денек!");
        }
        */
        /* 2
        System.out.println("Введите целое число: ");
        Scanner myNumber = new Scanner(System.in);
        int number = myNumber.nextInt();
        String result = (number % 2 == 0) ? "Число четное" : "Число нечетное";
        System.out.println(result);
         */
        /* 3 */
        DaysOfWeek daysOfWeek = DaysOfWeek.Saturday;

        switch (daysOfWeek){
            case Monday:
            case Tuesday:
            case Wednesday:
            case Thursday:
            case Friday:
                System.out.println("Workday");
                break;
            case Saturday:
            case Sunday:
                System.out.println("Weekend");
                break;
        }
    }
}
