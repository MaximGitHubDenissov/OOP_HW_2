package Aquarium;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    private List<Animal> animals = new ArrayList<>();

    public Aquarium AddAnimal(Animal newAnimal) {
        animals.add(newAnimal);
        return this;
    }

    public void ShowAll() {
        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }

    }

    public void ShowSwimable() {
        List<Swimable> sw = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Swimable) {
                sw.add((Swimable)animal);
            }

        }
        for (Swimable swimable : sw) {
            System.out.println(swimable);
            
        }
        
    }
    public void ShowCrowlable() {
        List<Crowlable> cr = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Crowlable) {
                cr.add((Crowlable)animal);
            }

        }
        for (Crowlable crowlable : cr) {
            System.out.println(crowlable);
            
        }
        
    }
    
}
