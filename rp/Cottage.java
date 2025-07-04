package rp;

public class Cottage extends Building implements Flyable {
    public Cottage() {
    System.out.println("Parcelle en place ...");
    }

    public void build(String material)
    {
        System.out.println("Construction du batiment en " + material);
    }

    public void fly(String energy)
    {
        System.out.println("La maison vole avec du "+ energy);
    }
}
