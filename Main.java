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

        System.out.println("--------------------\n       MENU \n--------------------");
        System.out.println("1 - Garage");
        System.out.println("2 - Ajouter une voiture");

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Vous avez saisi : "+ str);

        Vehicule clio = new Vehicule("Clio", "Verte", 1, false );

//        if

//	System.out.println("Sous menu 3 : tapez 3");
//       System.out.println("Modéle : "+clio.getModele()+"\nCouleur : "+clio.getCouleur()+"\nIdentifiant : "+clio.getId()+"\nEtat : "+clio.getEtat());

    }

}

