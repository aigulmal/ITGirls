package lesson12_1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {
    static void returnLionAge(Optional<List> animalOptional){
        List<Animal> res = animalOptional.get();
        res.stream()
                .filter(animal -> animal.getName() == "lion")
                .forEach(animal -> System.out.println("Lion's age: " + animal.getAge()));
    }

    public static void main(String[] args){

            List<Animal> animals = new ArrayList<>();

            animals.add(new Animal("cow", 1));
            animals.add(new Animal("pig", 9));
            animals.add(new Animal("cat", 3));
            animals.add(new Animal("dog", 4));
            animals.add(new Animal("duck", 4));
            animals.add(new Animal("tiger", 6));
            animals.add(new Animal("zebra", 7));
            animals.add(new Animal("elephant", 8));
            animals.add(new Animal("lion", 2));
            animals.add(new Animal("horse", 1));

            Stream<List> streamAnimals  = Stream.of(animals);

            Optional<List> animalOptional = streamAnimals.findAny();

        List<Animal> res = animalOptional.get();

        System.out.println("===First task===");
            if (animalOptional.isPresent()) {
                if (res.stream().noneMatch(animal -> animal.getName()=="lion")){
                    System.out.println("Return is null");
                    throw new IllegalArgumentException();
                }
                else{
                    returnLionAge(Optional.of(res));
                }
            }

        System.out.println("===\nSecond task===");
        List<Animal> sortedList = animals.stream()
                .sorted(Comparator.comparingInt(Animal::getAge))
                .collect(Collectors.toList());
        sortedList.forEach(System.out::println);

        System.out.println("\n===Third task===");
        int count = (int) res.stream()
                .filter(animal -> animal.getAge()>4)
                .count();
        System.out.println("Animals with age > 4 count = "+count);

        System.out.println("\n===Fourth task===");
        Map<String, Animal> animalsMap = animals.stream()
                .collect(Collectors.toMap(Animal::getName, animal -> animal));
        System.out.println(animalsMap);

        System.out.println("\n===Fifth task===");
        String s = animals.stream().map(animal->animal.getName()+" ".toString()).reduce("", String::concat );
        System.out.println(s);
  }
}

