public class Duck extends Animal {
    private String breed;

    public Duck(String name, Integer age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void fly() {
        System.out.println("El pato emigra en la primavera o en el otoño.");
    }

    @Override
    public void swim() {
        System.out.println("Puedo nadar de 3 a 9 kilometros por hora.");
    }

    public String getBreed() {
        return breed;
    }

}
