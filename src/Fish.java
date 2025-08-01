public class Fish extends Animal {
    private String type;

    public Fish(String name, Integer age, String breed) {
        super(name, age);
        this.type = type;
    }

    @Override
    public void swim() {
        System.out.println(
                "Migramos de un lugar a otro por diversas razones como la reproducción, la búsqueda de alimento o para evitar condiciones ambientales desfavorables.");
    }

}