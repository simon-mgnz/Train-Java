import rp.*;

public class Interface {
    public static void main(String[] args) {
        Cottage c1 = new Cottage();
        c1.build("bois");

        Ship s1 = new Ship();
        Glider g1 = new Glider();
        s1.moveXY(15, 57);
        g1.moveXY(45,95);

        c1.fly("rien");
        g1.fly("vent");

        Cottage c2 = new Cottage();
        Glider g2 = new Glider();
    }
}
