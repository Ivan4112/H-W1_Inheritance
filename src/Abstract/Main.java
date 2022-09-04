package Abstract;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        run();
    }

    protected static void run(){
        for (int i = 0; i < addAnimal().size(); i++){
            addAnimal().toString(); i++;
        }
    }

   private static List<Animal> addAnimal(){
       List<Animal> animals = new ArrayList<>();
       int numbAnimal = -1;
       Scanner scanner = new Scanner(System.in);
       System.out.println("Which is animal do you want create ? \n1-Dog\n2-Cat\n0-Exit");

       while (numbAnimal!=0){
           numbAnimal = scanner.nextInt();
           String nameAnimal;
           int ageAnimal;
           switch (numbAnimal){
               case 1:
                   System.out.println("Input dog's name & age");
                   nameAnimal = scanner.next();
                   ageAnimal = scanner.nextInt();
                   Animal dog = new Dog(nameAnimal, ageAnimal); dog.voice();
                   animals.add(dog); break;
               case 2:
                   System.out.println("Input cat's name & age");
                   nameAnimal = scanner.next();
                   ageAnimal = scanner.nextInt();
                   Animal cat = new Dog(nameAnimal, ageAnimal); cat.voice();
                   animals.add(cat); break;
               case 0: break;
           }
       }
        return animals;
    }
}
