package rp;

//Nous sommes ici dans une interface, une API est une inteface
//Il faut voir cela comme le menu d'un restaurant
//Ici on parle des choses volantes
//L'interface se termine en -able (un adjectif)
//L'interface est publique mais on ne l'écrit pas

@FunctionalInterface //Il s'agit d'une interface fonctionelle car il n'y a qu'une méthode 
public
interface Flyable { //Ne pas oublier de signaler que c'est une interface ! Une interface peut être étendue mais aussi implémentée dans une classe avec le mot clé 'implement'
    public final int flySpeed = 20; //C'est une constante
    public void fly(String energy);
    
    default public void test() //On implémente du code dans l'interface avec le default, si y'en a dans les classes à cette méthode est écrasée !
    {
        System.out.println("Test");
    }
}
