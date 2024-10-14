package Zoo;

public class Lion implements Animals{
    private String specie;
    private String breed;
    private String name;
    private int birthYear;

    public Lion(String breed, String name, int birthYear) {
        this.specie = "Lion";
        this.breed = breed;
        this.name = name;
        this.birthYear = birthYear;
    }

    @Override
    public String getSpecie() {
        return specie;
    }

    @Override
    public String getBreed() {
        return breed;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getBirthYear() {
        return birthYear;
    }
}
