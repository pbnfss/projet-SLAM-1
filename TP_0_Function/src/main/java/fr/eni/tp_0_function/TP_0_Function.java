/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fr.eni.tp_0_function;

import java.util.Scanner;

/**
 *
 * @author erwan
 */
public class TP_0_Function {

    public static void main(String[] args) {
        
        int intResultatSoustraction = simpleSoustraction(10,7);
        System.out.println(intResultatSoustraction);

       tableDeMultiplication(8,15);
        /*
        String strChiffre = codeCesar("ABCD", 2);
        System.out.println(strChiffre);
        
        int intBinaireConverti = conversionBaseDix(111);
        System.out.println(intBinaireConverti);
       */
        simpleAffichageSoustraction(3,4);

        simpleEntreeEtAffichage();
    }

     public static void simpleEntreeEtAffichage()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un nombre");
        int nombre = scanner.nextInt();
        System.out.println("Le nombre que vous avez rentré est : " + nombre);
        /*
         * Vous devez simplement demander dans cette fonction à l'utilisateur 
         * de rentrer un nombre. Ensuite, à l'aide de println(), vous devrez
         * afficher ce nombre
         * Par exemple, si j'appelle la fonction simpleEntreeEtAffichage();
         * Elle demandera "Quel nombre voulez-vous afficher", et si l'utilisateur
         * entre 3, la fonction devra afficher 3
         * Cette fonction ne retourne rien.
        */
    }
     
    public static int simpleSoustraction(int intA, int intB)
    {
         int soustraction = intA - intB;
         System.out.println(soustraction);
         return soustraction;
        /*
         * Vous devez simplement coder une fonction qui retourne le résultat
         * de la soustraction intA - intB.
         * Par exemple, si j'appelle la fonction simpleSoustraction(3,4);
         * Elle devra retourner -1
        */
    }


    public static void simpleAffichageSoustraction(int intA, int intB)
    {
        int sous = intA - intB;
        System.out.println(sous);
        /*
         * Vous devez simplement coder une fonction qui affiche le résultat
         * de la soustraction intA - intB.
         * Par exemple, si j'appelle la fonction simpleAffichageSoustraction(3,4);
         * Elle devra afficher dans la console -1
        */
    }

    public static void tableDeMultiplication(int a, int b){
    int i=0;
    while (i<=b) {
    System.out.println(a + " x " + i + " = " + (a*i));
    i++;
    }
}
    /*
    public static int conversionBaseDix(int intNbrBinaireConvertir)
    {
    
        /*
         * Pour cette fonction, il est conseillé de comprendre comment on 
         * convertit un nombre binaire en base 10, veuillez suivre ce lien :
         * https://fr.wikihow.com/convertir-un-nombre-binaire-en-nombre-d%C3%A9cimal
         * 
         * En effet, cette fonction va prendre en paramètre un nombre binaire,
         * il faudra alors retourner sa conversion en base 10.
         * Exemple si on appelle : conversionBaseDix(int 111);
         * il faudra retourner 7 (en effet, 1*2^0 + 1*2^1 + 1*2^2 = 7)
        
    }
    
    public static String codeCesar(String strMot, int intDecalage) //QUESTION BONUS
    {
        
         * Ecrire une fonction qui va permettre de chiffre un mot strMot à 
         * l'aide d'un décalage intDecalage.
         * Par exemple, si on appelle : codeCesar("ABCD", 2);  
         * Il faudra retourner la chaîne suivante : "CDEF"
        */
        
    }

