import rp.*;

public class Polymorphism {
    public static void main(String[] args) {
        
        Vehicle[] someVehicles = new Vehicle[3];//On crée un tableau de 3 véhicles
        someVehicles[0] = new Ship();
        someVehicles[1] = new Glider();
        someVehicles[2] = new Glider();

        Building[] someBuildings = new Building[2];
        someBuildings[0] = new Cottage();
        someBuildings[1] = new Cottage();

        someVehicles[1].moveXY(15, 45);

        Flyable[] elements = {new Glider(), new Cottage(), new Cottage()}; //On créé plein d'éléments volants

        for(Flyable e : elements)
            e.fly("vent"); //On les fait tous voler !


    }
}
