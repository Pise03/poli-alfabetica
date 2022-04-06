package com.critto;

import java.util.Vector;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
   public static void main(String[] args) {
       String testo = "testo segreto";

       Chiave c1 = new Chiave("c1", 5);
       Chiave c2 = new Chiave("c2", 19);
       Chiave c3 = new Chiave("c3", 10);

       Vector <Chiave> chiavi = new Vector<Chiave>();

       chiavi.add(c1);
       chiavi.add(c2);
       chiavi.add(c3);

       String[] pattern = {"c1","c2","c2","c3"};

       cifraggio prova = new cifraggio(testo, pattern);
       String cifratura = prova.cifra(chiavi);

       System.out.println("Parola da cifrare: " + testo);
       System.out.println("Parola cifrata: " + cifratura);
   }
}
