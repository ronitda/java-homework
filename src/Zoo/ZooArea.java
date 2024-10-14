package Zoo;

import java.util.ArrayList;

public class ZooArea {
    private final int maxAnimals;
    private final ArrayList<Animals> animals;

    public ZooArea(int maxAnimals) {
        this.maxAnimals = maxAnimals;
        this.animals = new ArrayList<>();
    }

    public int getMaxAnimals() {
        return maxAnimals;
    }

    public boolean addAnimal(Animals animal) {
        if (animals.size() < maxAnimals) {
            animals.add(animal);
            return true;
        } else {
            System.out.println("This area is at full capacity and cannot add more animals.");
            return false;
        }
    }

    public ArrayList<Animals> getAnimals() {
        return animals;
    }

    public int getAnimalCount() {
        return animals.size();
    }

    public boolean isFull(){
        return animals.size()==maxAnimals;
    }
}