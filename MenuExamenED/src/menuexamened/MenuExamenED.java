/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuexamened;

import java.util.Scanner;

/**
 *
 * @author DAM103
 */
public class MenuExamenED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc=new Scanner(System.in);
        double horas, sg,km,m;
        int resp;
        do{
            System.out.println("Que quieres realizar");
            System.out.println("1. Cambio de horas a segundos   2. Cambio de kilometros a metros    3. Cambio de km/h a m/s      4. Salir");
            resp=sc.nextInt();
            switch(resp){
                case 1:
                    System.out.println("Cambio de horas a segundos");
                    System.out.println("Dime horas");
                    horas=sc.nextDouble();
                    sg=horas*3600;
                    System.out.println(horas+" horas son "+sg+" segundos");
                    break;
                case 2:
                    System.out.println("Cambio de kilometros a metros");
                    System.out.println("Dime kilometros");
                    km=sc.nextDouble();
                    m=km*1000;
                    System.out.println(km+" kilometros son "+m+" metros");
                    break;
                case 3:
                    //km/h entre 3,6 
                    System.out.println("Km/h a m/s");
            }
        }while(resp!=4);
    }
    
}
