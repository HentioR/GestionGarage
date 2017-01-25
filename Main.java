/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[] options = { "Garage", "Ajouter une voiture", "Supprimer une voiture"};
        System.out.println("--------------------\n       MENU \n--------------------");
        int p = 1;
        for(String op : options) {
            System.out.println(p +")" + op);
            p++;
        }













//        Scanner home = new Scanner(System.in);
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        System.out.println("Vous avez saisi : "+ str);
//
        for (int i = 0; i < 10; i++) {
            Vehicule clio = new Vehicule("Clio", "Verte", false );
            // System.out.println(clio.idVehicule);
        }
        //

//
//        if(String home)
//
//	System.out.println("Sous menu 3 : tapez 3");
//       System.out.println("Modéle : "+clio.getModele()+"\nCouleur : "+clio.getCouleur()+"\nIdentifiant : "+clio.getId()+"\nEtat : "+clio.getEtat());

    }

}

