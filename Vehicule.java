/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Vehicule {
    public String modeleVehicule;
    public String couleurVehicule;
    public int idVehicule;
    public boolean panneVehicule;


    public Vehicule(){
//        System.out.println("Création d'une voiture");
        modeleVehicule = "Inconnu";
        couleurVehicule = "Inconnu";
        idVehicule = 1;
    }

    public Vehicule(String modele, String couleur, int ident, boolean panne){
//        System.out.println("Création d'une voiture avec paramétres...");
        modeleVehicule = modele;
        couleurVehicule = couleur;
        idVehicule = ident;
        panneVehicule = panne;

    }

    public String getModele(){
        return modeleVehicule;
    }

    public String getCouleur(){
        return couleurVehicule;
    }

    public int getId(){
        return idVehicule;
    }

    public String getEtat(){
        if(panneVehicule==false){
            return "Normal";
        }
        else{
            return "En panne !";
        }
    }

}


//
//  private String nomVille;
//  private String nomPays;
//  private int nbreHabitants;
//  private char categorie;
//
//  public Ville(){
//    System.out.println("Création d'une ville !");
//    nomVille = "Inconnu";
//    nomPays = "Inconnu";
//    nbreHabitants = 0;
//    this.setCategorie();
//  }
//
//  public Ville(String pNom, int pNbre, String pPays)
//  {
//    System.out.println("Création d'une ville avec des paramètres !");
//    nomVille = pNom;
//    nomPays = pPays;
//    nbreHabitants = pNbre;
//    this.setCategorie();
