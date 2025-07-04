package rp;

public class Glider extends Vehicle implements Flyable {//On peut importer autant d'interface qu'on veut mais jamais plus de une classe.
    public Glider()
    {
        this.mMouvementSpeed = 28;
    }

    public void moveXY(int x, int y)
    {
        System.out.println("Le glider vole en  "+ x +", "+ y);
    }

    public void fly(String energy)
    {
        System.out.println("Le glider vole avec du " + energy + " à "+flySpeed+ " km/h");
    }
}