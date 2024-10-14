package Zoo;

import java.util.HashMap;
import java.util.Map;

public class Zoo {
    private final String name;
    private final Map<String, ZooArea> zooAreas;

    public Zoo(String name) {
        this.name = name;
        this.zooAreas = new HashMap<String, ZooArea>();
    }

    public void addZooArea(String specie, ZooArea area) {
        zooAreas.put(specie, area);
    }


    public boolean hasArea(String area){
        return zooAreas.containsKey(area);
    }

    public  ZooArea getArea(String area){
        return zooAreas.get(area);
    }

    public void showData(){

        System.out.println("****************");
        System.out.println("Mostrando informacion del zoologico: " + name);

        zooAreas.forEach( (key,value) -> {
            System.out.println("******");
            System.out.println("**** Area de " + key + " ****");
            System.out.println("capacidad maxima: " + value.getMaxAnimals());

            System.out.println("---animales--");
            value.getAnimals().forEach( animal -> {
                System.out.println("------");
                System.out.println("specie: " + animal.getSpecie());
                System.out.println("breed: " + animal.getBreed());
                System.out.println("name: " + animal.getName());
                System.out.println("birth year: " + animal.getBirthYear());
            });
        });
    }

}
