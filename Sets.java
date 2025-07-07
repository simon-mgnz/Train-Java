/*
 * HashSet : Pas de doublons, pas tread-safe, accès direct, pas d'ordre
 * TreeSet : Pas de doublons, pas thread-safe, ordonnée mais pas d'accès direct
 * → ht.headSet(nbr) on prend du + grand au nombre (contraire de ht.tailSet(nbr))
 * → subSet(nbr1,nbr2) De 1 à 2
 * 
 * HashCode()
 * equals() vérifie l'égalité pour éviter les doublons
 */

import java.util.HashSet;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<Integer>(50,(float) 0.6); //à 60% la capacité s'agrandie
        hs.add(15);
        hs.add(14);
        hs.add(3388);

        if(hs.contains(388))
            System.out.println("Oui");

        hs.remove(3388);

        TreeSet<Integer> ht = new TreeSet<Integer>(); //même chose mais change la vitesse de traitement
    }
}
