import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.PriorityQueue;

/*
 * PriorityQueue : ordonnée, accepte les doublons, refuse les valeurs nulles, not thread-safe
 * 
 * peek() prend le plus haut
 * poll() cite l'élément et l'enlève
 * 
 * ArrayDeque : Ordonnée, accepte les doublons, refuse les valeurs nulles, not thread-safe, c'est une liste doublement chainée
 * → Plus pratique que stack pour un environnement mono-thréadé
 */

public class Queue {
    public static void main(String []args)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        pq.add(155);
        pq.add(5);
        pq.add(-14);

        Iterator it = pq.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next()); //Ordre naturel cité
        }

        //PriorityQueue<Cat> pq2 = new PriorityQueue<Cat>();
        //pq2.add(new Cat("Miaou",2)); //On peut ajouter autre chose que des nombres !

        System.out.println(pq.peek()); 

        ArrayDeque<Integer> adq = new ArrayDeque<Integer>();

        adq.addFirst(4);
        adq.addFirst(15);
        adq.addLast(0);
        adq.removeFirst();

        Iterator it2 = adq.iterator();

        while(it2.hasNext())
        {
            System.out.println(it2.next());
        }

        System.out.println(adq.getFirst());

        adq.offerFirst(15); //Ajoute un élément
        adq.removeLastOccurrence(15); //Enlève la dernier occurence de 15
    }
}
