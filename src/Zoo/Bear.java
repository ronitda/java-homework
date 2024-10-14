package Zoo;

public class Bear implements Animals{

    private String specie;
    private String breed;
    private String name;
    private int birthYear;

    public Bear(String breed, String name, int birthYear) {
        this.specie = "Bear";
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
