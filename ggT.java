
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nadine
 */
public class ggT {
    
    public static void main(String args[]){
        
        Scanner eingabe = new Scanner(System.in);
        
        System.out.println("Was soll ihre erste Zahl sein: ");
        int ersteZahl = eingabe.nextInt();
        System.out.println("Was soll ihre zweite Zahl sein: ");
        int zweiteZahl = eingabe.nextInt();
        
        int ggT = ggtAusrechnen(ersteZahl,zweiteZahl);
        
        System.out.println("Der ggT ist " + ggT);
        
    }
    
    private static int ggtAusrechnen(int ersteZahl, int zweiteZahl){
    
        if(ersteZahl == 0){
            
            return 0;
    
        } else if(zweiteZahl == 0){
        
            return 0;
            
        }
        
        while(zweiteZahl != 0){
        
            if (ersteZahl > zweiteZahl){
                
                ersteZahl = ersteZahl - zweiteZahl;
                        
            }else{
            
                zweiteZahl = zweiteZahl - ersteZahl;
            }
        }
        return ersteZahl;
    }
}
