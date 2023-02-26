package ru.itgirl;

import java.util.Scanner;

public class App
{
    static void printDayOfWeek(){
        try (Scanner input = new Scanner(System.in)) {
            String dayOfWeekEng = input.nextLine();
            DayOfWeek dayOfWeek = DayOfWeek.valueOf(dayOfWeekEng);
            System.out.println("Сегодня " + dayOfWeek.getTitle());
        }
        catch (Exception exception){
            System.out.println(exception);
        }
    }
    public static void main( String[] args )
    {
        printDayOfWeek();
    }
}
