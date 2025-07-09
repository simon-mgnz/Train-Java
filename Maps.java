/*
 * HashMap : pas de doublons, pas thread-safe, accès direct, non ordonnée (plus rapide), valeurs nulles (jusqu'à 1 clé null ou peut etre plus)
 * TreeMap : pas de doublons, pas thread-safe, accès direct, ordonnée (plus lent)
 */

import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<String,String>(); //On attend un couple de valeurs (ici String, String)
        
        hm.put("1","Marc");
        hm.put("2","Luc");
        hm.put("15","Marie");
        hm.put("3","Julie");//On ne veut pas de doublons pour la clé mais on peut pour la valeur

        System.out.println(hm.get("15")); //On affiche l'élément de clé "15" 

        if(hm.containsKey("1"))
        {
            if(hm.containsValue("Luc"))
                System.out.println("C'est bon !");
        }

        for(String k : hm.keySet())
            System.out.println(k); //On affiche toutes les clés
        
        TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
        tm.put(1,"Marc");
        tm.put(2,null); //On peut avoir des valeurs nulles
        tm.put(15,"Marie");
        tm.put(3,"Julie");

        System.out.println(tm.get(2)); 

        for(Map.Entry<Integer,String> ent : tm.entrySet())
        {
            System.out.println("Clé : "+ent.getKey()+ " / Valeur : "+ent.getValue());//On affiche tous
        }
    }
}
