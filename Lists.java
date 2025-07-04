/*
 * ArrayList : mono-thread, accès direct,
 * LinkedList :insertion rapides (indirect, pas pour la lecture
 * Vector : multi-thread, accès direct aussi,
 * Stack : LIFO (indirect) (last in first out), multi-thread, pas ptimisé pour la lecture
 * 
 * Attention la capacité n'est pas de la Taille (Taille <= Capacité)
 * add() : ajouter une liste
 * addAll() : ajouter tout
 * remove(<index>) : enleve de la liste
 * clear() : vide la liste
 * size() : taille (Vector uniquement)
 * capacity() : capacité
 * isEmpty() (empty()) : vérifie si c'est vide (boolean)
 */

import java.util.ArrayList; //Ne pas oublier d'importer !!!!
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

public class Lists {
    public static void main(String[] args) {
        
    
        ArrayList<Cat> group = new ArrayList<Cat>(5); //Collection dynamique de 5 chats.

        Cat c1 = new Cat("Toudoux",2);
        Cat c2 = new Cat("Toudoux2",6);
        Cat c3 = new Cat("Toudoux3",4);
        group.add(c1);
        group.add(c2);
        group.add(c3);

        for(Cat c : group) //C'est group faire attention
            c.meow();

            group.remove(1);
        for(Cat c : group) //C'est group faire attention
            c.meow();    

        //System.out.println("Capacité :" group.capacity());

        //Collections.sort(group); pour trier ici ça marche pas

        ArrayList<String> gr = new ArrayList<String>();

        String a1 = "a";
        String a2 = "A";
        String a3 = "B";
        gr.add(a1);
        gr.addFirst(a2); //Ajouter en premier
        gr.addLast(a3); //Ajouter en dernier

        for(String e : gr)
            System.out.println(e);

        LinkedList<Cat> grp= new LinkedList<Cat>();
        grp.add(c1);
        grp.add(c2);
        grp.add(c3);
        ListIterator<Cat> lit = grp.listIterator();
        while(lit.hasNext())
            lit.next().meow(); //Meme chose mais plus opti !

        Stack<Cat> grp2= new Stack<Cat>();
        grp2.push(c1);
        grp2.push(c2);
        grp2.push(c3);

        grp2.peek().meow(); //Le dernier uniquement !
    }
}
