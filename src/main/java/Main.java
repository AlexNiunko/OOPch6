import Animals.Animal;
import Animals.Cat;
import Animals.Dog;
import Animals.Horse;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal>list=new ArrayList<>();
        Cat cat=new Cat(14,"fish");
        Dog dog=new Dog(10,"meat");
        Horse horse=new Horse(25,"Grass" );
        list.add(cat);
        list.add(dog);
        list.add(horse);

        Vet vet=new Vet("John");
        for (Animal animal:list){
            vet.treer(animal);
        }

    }
}
