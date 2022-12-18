import java.io.*;
import java.util.Scanner;

public class Ten {
    //Напиши код, который мог бы копировать строку из одного файла в другой.
    static Scanner scanner = new Scanner(System.in);
    public void writeToFile(Scanner scanner){
        try (FileWriter fileWriter = new FileWriter("10_text.txt")) {
            System.out.println("Введите строку в консоль:");
            String myString = scanner.nextLine();
            fileWriter.write(myString);
        }
        catch(IOException e){
            System.err.println(e.getMessage());
        }
    }
    public void copyStringFromFileToFile(){
        String s="";
        try(FileWriter fileWriter = new FileWriter("10_1_text.txt");
        FileReader fileReader = new FileReader("10_text.txt")){
            int inChar = fileReader.read();
            while (inChar!=-1){
                s+=(char) inChar;
                inChar = fileReader.read();
            }
            fileWriter.write(s);
        }
        catch(IOException e){
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Ten ten = new Ten();
        ten.writeToFile(scanner);
        ten.copyStringFromFileToFile();
    }
}
