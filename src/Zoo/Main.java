package Zoo;

import java.io.*;

public class Main {

    public static void createAnimal(Zoo zoo, String specie, String breed, String name, String birthYear) throws Exception {


        if(!zoo.hasArea(specie)) throw new Exception("Area para animales de tipo " + specie + " no existe");
        ZooArea area = zoo.getArea(specie);
        if(area.isFull()) throw new Exception("Area para " + specie + "esta llena");

        Animals newAnimal;
        switch (specie.toLowerCase()) {
            case "lion":
                newAnimal = new Lion(breed, name, Integer.parseInt(birthYear));
                break;
            case "bear":
                newAnimal = new Bear(breed, name, Integer.parseInt(birthYear));
                break;
            default:
                throw new Exception("No se conoce la especie " + specie);
        }

        area.addAnimal(newAnimal);

    }

    public static void main(String[] args) {

        Zoo zoo = new Zoo("Zoo Park");

        try{
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Usuario\\IdeaProjects\\Zoo\\src\\Zoo\\input.txt"));

            String line;
            while( (line=reader.readLine()) != null){
                String[] lineData = line.split(",");

                switch(lineData[0]){
                    case "area":
                        createArea(zoo, lineData[1], lineData[2]);
                        break;
                    case "animal":
                        createAnimal(zoo, lineData[1], lineData[2], lineData[3], lineData[4]);
                        break;
                }

            }

            zoo.showData();

        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el archivo de entrada");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    private static void createArea(Zoo zoo, String specieArea, String maxAnimals) throws Exception {

        if(zoo.hasArea(specieArea))
            throw new Exception("Area con nombre " + specieArea + "ya existe");

        try {
            ZooArea newArea = new ZooArea(Integer.parseInt(maxAnimals));
            zoo.addZooArea(specieArea, newArea);
        } catch (NumberFormatException e){
            throw new Exception("No se puede parsear el numero maximo de animales");
        }

    }


}
