/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.amazon;

import java.util.Date;

/**
 *
 * @author marulandaaf
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        showMenu();
    }
    
    public static void showMenu(){
        int exit = 0;
        do {
            System.out.println("Bienvenido a Amazon View :) \n");
            System.out.println("Selecciona una opción:");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("3. Books");
            System.out.println("4. Magazine");
            System.out.println("5. Report");
            System.out.println("6. Report Today");
            System.out.println("0. Exit");
            
            //Leer la respuesta del usuario
            int response = 0;
            
            switch(response){
                case 0:
                    break;
                case 1:
                    showMovies();
                    break;
                case 2:
                    showSeries();
                    break;
                case 3:
                    showBooks();
                    break;
                case 4:
                    showMagazines();
                    break;
                case 5:
                    makeReport();
                    break;
                case 6: 
                    makeReport(new Date());
                    break;
                default:
                    System.out.println("\n .....¡¡Selecciona una opción!!... \n");
                    break;
            }
            
        } while (exit != 0);
        
    
    }
    
    public static void showMovies(){
        int exit = 0;        
        do {            
            System.out.println("\n ::MOVIES:: \n");
        } while (exit != 0);
    }
    
    public static void showSeries(){
        int exit = 0;        
        do {            
            System.out.println("\n ::SERIES:: \n");
        } while (exit != 0);
    }
    
    public static void showChapters(){
        int exit = 0;        
        do {            
            System.out.println("\n ::CHAPTERS:: \n");
        } while (exit != 0);
    }
    
    public static void showBooks(){
        int exit = 0;        
        do {            
            System.out.println("\n ::BOOKS:: \n");
        } while (exit != 0);
    }
    
    public static void showMagazines(){
        int exit = 0;        
        do {            
            System.out.println("\n ::MAGAZINES:: \n");
        } while (exit != 0);
    }
    
    public static void makeReport(){
    
    }
    
    public static void makeReport(Date date){
    
    }
    
}
