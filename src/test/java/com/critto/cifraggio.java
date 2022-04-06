package com.critto;

import java.util.Vector;

public class cifraggio {
    private String testo;
    private String pattern[];
    private String alfabeto = "abcdefghijklmnopqrstuvwxyz";
    private String criptato = "";
    private int k = 0;
    private int currentK;

    public cifraggio(String testo, String pattern[]) {
        this.testo = testo;
        this.pattern = pattern;
    }

    public String cifra(Vector<Chiave> chiavi) {

        for (int i = 0; i < testo.length(); i++) {
            String lettera = Character.toString(testo.charAt(i));
        
            if (lettera.equals(" ")) {
                criptato += " ";
            } else {
                // if(tipo.equals("1"))
                for (int j = 0; j < chiavi.size(); j++) {
                    if(pattern[k] == chiavi.elementAt(j).getNome()){
                        currentK = chiavi.elementAt(j).getK();
                        break;
                    }
                }
                criptato += Character.toString(alfabeto.charAt((alfabeto.indexOf(lettera) + currentK) % 26));
                // else
                // criptato +=
                // Character.toString(alfabeto.charAt((alfabeto.indexOf(lettera)-chiavi[ichiave]+26)%26));

                if (k + 1 == pattern.length ) {
                    k = 0;
                }else
                k++;
            }
        }
        return criptato;
    }
}
