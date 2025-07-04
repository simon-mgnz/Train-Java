package rp;

public class Ship extends Vehicle {
    public Ship()
    {
        this.mMouvementSpeed = 16;
    }

    public void moveXY(int x, int y)
    {
        System.out.println("Le navire se déplace sur l'eau et se déplace en "+ x +", "+ y);
    }
}
