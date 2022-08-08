import Animals.Animal;

public class Vet {
    protected String name;

    public Vet(String name) {
        this.name = name;
    }
    public void treer(Animal animal){
        System.out.println(animal.getClass()+" is healthy by "+this.name);
    }
}
