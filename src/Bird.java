public class Bird extends Animal {
    private String breed;

    public Bird(String nombre, Integer edad, String breed) {
        super(nombre, edad);
        this.breed = breed;
    }

    @Override
    public void fly() {
        System.out.println(
                "Emigramos en invierno. Algunas de nosotras recorremos más de 30.000 kilómetros en un solo año.");
    }

}
