package streams;

import java.io.*;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class strings {
    public static void main(String[] args) throws IOException {
        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        System.out.println(s);*/
        Optional<Integer> sum = Stream.of(1,2,3,4,5).reduce((prev,next)->prev+next);
        System.out.println(sum);
        //nums.forEach(i-> System.out.println(i));
    }
}
