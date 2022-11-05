import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Seventh {
    int[] CreateArray(){
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива n: ");
        n = in.nextInt();
        int[] myArray = new int[n];

        for (int i=0;i<n;i++){
            myArray[i]=new Random().nextInt(10);
        }
        return myArray;
    }
    int[] OutputArray(int[] array){
        System.out.println("\nМассив: ");
        for (int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return array;
    }
    void Average(int intArray[]){
        double average=0;
        for (int element:intArray) {
            average+=element;
        }
        average/=intArray.length;
        System.out.println("Среднее арифметическое= " + average);
    }
    void Second(int[] array){
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+ " ");
            if (array[i]%2!=0){
                newArray.add(array[i]);
                array[i]=0;
            }
        }
        OutputArray(array);
        System.out.println("ArrayList :");
        for (Integer element : newArray){
            System.out.print(element+ " ");
        }
    }
    void Third(){
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<String> namesLength = new ArrayList<String>();
        names.add("Lora");
        names.add("Christina");
        names.add("Sam");
        names.add("James");
        System.out.println("Names: ");
        for (String element : names){
            System.out.println(element);
            namesLength.add(String.valueOf(element.length()));
            System.out.println(element);
        }
        System.out.println("Length of names:");
        for (String length : namesLength)
        {
                System.out.println(length);
        }
    }

public static void main(String args[])
{
    Seventh seventh = new Seventh();
    //int[] myArray = seventh.CreateArray();
    seventh.Third();
}
}
