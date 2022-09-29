package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Hashtable<String, ArrayList<String>> hashtable = new Hashtable<String, ArrayList<String>>();
        ArrayList<String> eu = new ArrayList<String>();
        ArrayList<String> claire = new ArrayList<String>();
        ArrayList<String> bob = new ArrayList<String>();
        ArrayList<String> alice = new ArrayList<String>();

        eu.add("Claire");
        eu.add("Alice");
        eu.add("Bob");

        claire.add("Thom");
        claire.add("Jonny");

        bob.add("Anuj");
        bob.add("Peggy");

        alice.add("Peggy");

        hashtable.put("Eu", eu);
        hashtable.put("Claire", claire);
        hashtable.put("Bob", bob);
        hashtable.put("Alice", alice);

        System.out.println("Animais | Contatos");

        for (Map.Entry<String, ArrayList<String>> animal : hashtable.entrySet()){
            System.out.println(animal.getKey() + " | " + animal.getValue());
        }
    }
}
