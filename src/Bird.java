public class Bird extends Animal {
    private String breed;

    public Bird(String name, Integer age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void fly() {
        System.out.println(
                "Emigramos en invierno. Algunas de nosotras recorremos más de 30.000 kilómetros en un solo año.");
    }

    public String getBreed() {
        return breed;
    }

}
