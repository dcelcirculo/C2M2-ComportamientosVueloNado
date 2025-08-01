public class Duck extends Animal {
    private String breed;

    public Duck(String nombre, Integer edad, String breed) {
        super(nombre, edad);
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

}
