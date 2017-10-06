/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author GodoyZelaya
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner modelos =new Scanner(System.in);
        String Samsung_S7, Huawey_P8,Iphone_6,x,c= null,a,b = null,d,e= null,f= null,g= null;
        
        
        System.out.println("Catalogo de Equipos en Oferta : ");
        System.out.println(" ");
        System.out.println("A.Samsung S7 ----Codigo: (0612) ");
        System.out.println("B.Huawey P8  ----Codigo: (0456) " );
        System.out.println("C.iPhone 6   ----Codigo: (0783)");
        System.out.println(" ");
        System.out.println(" Ingrese el codigo del equipo: ");
        x=modelos.nextLine();
        
        int X=Integer.parseInt(x);
        
        switch (x){
            
            case "0612":
                
                System.out.println(" ");
                System.out.println("Usted selecciono el Samsung S7 ");
                System.out.println("CARACTERISTICAS " );
                System.out.println("Pantalla : 	4.7");
                System.out.println("Camara  : 8MP");  
                System.out.println("Procesador : 1.4 Ghz ");
                System.out.println(" ");
                
                System.out.println("Ingrese el operador que desea adquirir : ");
                System.out.println(" ");
                System.out.println("1.Claro ");
                System.out.println("2.Movistar ");
                System.out.println("3.Entel ");
                a=modelos.nextLine();
                int A=Integer.parseInt(a);
                
                    switch (a){
                        case "1":
                            
                            System.out.println(" ");
                            System.out.println("Elegiste la Red Claro ");
                            System.out.println("Elije un plan para tu equipo : ");
                            
                            System.out.println("1.Claro Max 99");
                            System.out.println(" -Minutos Ilimitados");
                            System.out.println(" -RPC Ilimitado");
                            System.out.println(" -Interned 7 GB");
                            System.out.println(" -SMS Ilimitados");
                            
                            System.out.println("  ");
                            
                            System.out.println("2.Claro Max 149");
                            System.out.println(" -Minutos Ilimitados");
                            System.out.println(" -RPC Ilimitado");
                            System.out.println(" -Interned 8 GB");
                            System.out.println(" -SMS Ilimitados");
                            
                            System.out.println("  ");
                            
                            System.out.println("3.Claro Max 189");
                            System.out.println(" -Minutos Ilimitados");
                            System.out.println(" -RPC Ilimitado");
                            System.out.println(" -Interned 9 GB");
                            System.out.println(" -SMS Ilimitados");
                           
                            b=modelos.next();
                            int B=Integer.parseInt(b);
                            
                           
                    
                            switch  (b){
                                case "1":
                                    
                                    
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Adquiriste el Samsung S7");
                                    System.out.println("Especificaciones: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    System.out.println("Elegiste el Plan 99 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPC Ilimitado");
                                    System.out.println(" -Interned 7 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println("El monto a pagar sera de S/99 al mes.");
                                    
                                    break;
                                    
                                case "2":
                                    
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Adquiriste el Samsung S7");
                                    System.out.println("Especificaciones: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    System.out.println("Elegiste el Plan 149 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPC Ilimitado");
                                    System.out.println(" -Interned 8 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println("El monto a pagar sera de S/149 al mes.");
                                    break;
                            
                            
                                    
                                case "3":
                                    
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Adquiriste el Samsung S7");
                                    System.out.println("Especificaciones: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    
                                    System.out.println("Elegiste el Plan 189 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPC Ilimitado");
                                    System.out.println(" -Interned 9 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    
                                    System.out.println("El monto a pagar sera de S/189 al mes.");
                                   break;
                                 }
                                break; 
                                                                
                            
                            
                            
                        case "2":
                            
                            System.out.println(" ");
                            System.out.println("Elegiste la Red Movistar ");
                            System.out.println("Elije un plan para tu equipo : ");
                            
                            System.out.println("1.Plan Vuela 99");
                            System.out.println(" -Minutos Ilimitados");
                            System.out.println(" -RPM Ilimitado");
                            System.out.println(" -Interned 6 GB");
                            System.out.println(" -SMS Ilimitados");
                        
                            System.out.println("  ");
                            System.out.println("2.Plan Vuela 199");
                            System.out.println(" -Minutos Ilimitados");
                            System.out.println(" -RPM Ilimitado");
                            System.out.println(" -Interned 14 GB");
                            System.out.println(" -SMS Ilimitados");
                            
                            System.out.println("  ");
                            System.out.println("3.Plan Vuela 299");
                            System.out.println(" -Minutos Ilimitados");
                            System.out.println(" -RPM Ilimitado");
                            System.out.println(" -Interned 24 GB");
                            System.out.println(" -SMS Ilimitados");
                           
                            c=modelos.next();
                            int C=Integer.parseInt(c);
                    
                            
                            switch  (c){
                                case "1":
                                    
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Adquiriste el Samsung S7");
                                    System.out.println("Especificaciones: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    System.out.println("Elegiste el Plan Vuela 99 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPM Ilimitado");
                                    System.out.println(" -Interned 6 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println("El monto a pagar sera de S/99 al mes.");
                                    break;
                                    
                                case "2":
                                    System.out.println("");
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Adquiriste el Samsung S7");
                                    System.out.println("Especificaciones: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    System.out.println("Elegiste el Plan Vuela de 199 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPM Ilimitado");
                                    System.out.println(" -Interned 14 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println("El monto a pagar sera de S/199 al mes.");
                                    break;
                                    
                                case "3":
                                    System.out.println(" ");
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Adquiriste el Samsung S7");
                                    System.out.println("Especificaciones: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    System.out.println("Elegiste el Plan Vuela de 299 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPM Ilimitado");
                                    System.out.println(" -Interned 24 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println("El monto a pagar sera de S/299 al mes.");
                                    
                                    break;
                                    
                                    }
                            
                                 break;
                            
                            case "3":
                            
                                System.out.println(" ");
                                System.out.println("Elegiste la Red Entel ");
                                System.out.println("Elije un plan para tu equipo : ");
                            
                                System.out.println("1.FunPack 109");
                                System.out.println(" -Precio S/ 109 ");
                                System.out.println(" -Minutos Ilimitados");
                                System.out.println(" -RPE Ilimitado");
                                System.out.println(" -Interned 4 GB");
                                System.out.println(" -SMS Ilimitados");
                        
                                System.out.println("  ");
                                System.out.println("2.FunPack 119");
                                System.out.println(" -Precio S/ 119 ");
                                System.out.println(" -Minutos Ilimitados");
                                System.out.println(" -RPE Ilimitado");
                                System.out.println(" -Interned 7 GB");
                                System.out.println(" -SMS Ilimitados");
                            
                                System.out.println("  ");
                                System.out.println("3.FunPack 155");
                                System.out.println(" -Precio S/ 155 ");
                                System.out.println(" -Minutos Ilimitados");
                                System.out.println(" -RPE Ilimitado");
                                System.out.println(" -Interned 12 GB");
                                System.out.println(" -SMS Ilimitados");
                           
                            b=modelos.next();
                            B=Integer.parseInt(b);
                            
                            switch (b){
                                case "1":
                                    System.out.println(" ");
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Adquiriste el Samsung S7");
                                    System.out.println("Especificaciones: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    System.out.println("Elegiste el FunPack de 109 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPE Ilimitado");
                                    System.out.println(" -Interned 4 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println("El monto a pagar sera de S/109 al mes.");
                                    
                                    break;
                                case "2":
                                    System.out.println(" ");
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Adquiriste el Samsung S7");
                                    System.out.println("Especificaciones: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    System.out.println("Elegiste el FunPack de 119 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPE Ilimitado");
                                    System.out.println(" -Interned 7 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println("El monto a pagar sera de S/119 al mes."); 
                                    
                                    break;
                                 
                                case "3":
                                    System.out.println(" ");
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Adquiriste el Samsung S7");
                                    System.out.println("Especificaciones: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    System.out.println("Elegiste el FunPack de 155 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPE Ilimitado");
                                    System.out.println(" -Interned 12 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println("El monto a pagar sera de S/155 al mes.");    
                                    break;
                            }       
                            }
                            break;
                       
                    
                        case "0456":
                
                System.out.println(" ");
                System.out.println("Usted selecciono el Huawey P8 ");
                System.out.println("CARACTERISTICAS " );
                System.out.println("Pantalla : 	4.7");
                System.out.println("Camara  : 8MP");  
                System.out.println("Procesador : 1.4 Ghz ");
                System.out.println(" ");
                
                System.out.println("Ingrese el operador que desea adquirir : ");
                System.out.println(" ");
                System.out.println("1.Claro ");
                System.out.println("2.Movistar ");
                System.out.println("3.Entel ");
                
                a=modelos.nextLine();
                int P=Integer.parseInt(a);
                
                    switch (a){
                        case "1":
                            
                            System.out.println(" ");
                            System.out.println("Elegiste la Red Claro ");
                            System.out.println("Elije un plan para tu equipo : ");
                            
                            System.out.println("1.Claro Max 99");
                            System.out.println(" -Minutos Ilimitados");
                            System.out.println(" -RPC Ilimitado");
                            System.out.println(" -Interned 7 GB");
                            System.out.println(" -SMS Ilimitados");
                            
                            System.out.println("  ");
                            
                            System.out.println("2.Claro Max 149");
                            System.out.println(" -Minutos Ilimitados");
                            System.out.println(" -RPC Ilimitado");
                            System.out.println(" -Interned 8 GB");
                            System.out.println(" -SMS Ilimitados");
                            
                            System.out.println("  ");
                            
                            System.out.println("3.Claro Max 189");
                            System.out.println(" -Minutos Ilimitados");
                            System.out.println(" -RPC Ilimitado");
                            System.out.println(" -Interned 9 GB");
                            System.out.println(" -SMS Ilimitados");
                           
                            e=modelos.next();
                            int E=Integer.parseInt(e);
                            
                           
                    
                            switch  (e){
                                case "1":
                                    
                                    
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Adquiriste el Huawey P8");
                                    System.out.println("Especificaciones: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    System.out.println("Elegiste el Plan 99 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPC Ilimitado");
                                    System.out.println(" -Interned 7 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println("El monto a pagar sera de S/99 al mes.");
                                    
                                    break;
                                    
                                case "2":
                                    
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Adquiriste el Huawey P8");
                                    System.out.println("Especificaciones: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    System.out.println("Elegiste el Plan 149 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPC Ilimitado");
                                    System.out.println(" -Interned 8 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println("El monto a pagar sera de S/149 al mes.");
                                    break;
                            
                            
                                    
                                case "3":
                                    
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Adquiriste el Huawey P8");
                                    System.out.println("Especificaciones: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    
                                    System.out.println("Elegiste el Plan 189 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPC Ilimitado");
                                    System.out.println(" -Interned 9 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    
                                    System.out.println("El monto a pagar sera de S/189 al mes.");
                                   break;
                                 }
                                    break;
                                                                 
                            
                            
                            
                        case "2":
                            
                            System.out.println(" ");
                            System.out.println("Elegiste la Red Movistar ");
                            System.out.println("Elije un plan para tu equipo : ");
                            
                            System.out.println("1.Plan Vuela 99");
                            System.out.println(" -Minutos Ilimitados");
                            System.out.println(" -RPM Ilimitado");
                            System.out.println(" -Interned 6 GB");
                            System.out.println(" -SMS Ilimitados");
                        
                            System.out.println("  ");
                            System.out.println("2.Plan Vuela 199");
                            System.out.println(" -Minutos Ilimitados");
                            System.out.println(" -RPM Ilimitado");
                            System.out.println(" -Interned 14 GB");
                            System.out.println(" -SMS Ilimitados");
                            
                            System.out.println("  ");
                            System.out.println("3.Plan Vuela 299");
                            System.out.println(" -Minutos Ilimitados");
                            System.out.println(" -RPM Ilimitado");
                            System.out.println(" -Interned 24 GB");
                            System.out.println(" -SMS Ilimitados");
                           
                            f=modelos.next();
                            int F=Integer.parseInt(f);
                    
                            
                            switch  (f){
                                case "1":
                                    
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Adquiriste el Huawey P8");
                                    System.out.println("Especificaciones: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    System.out.println("Elegiste el Plan Vuela 99 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPM Ilimitado");
                                    System.out.println(" -Interned 6 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println("El monto a pagar sera de S/99 al mes.");
                                    break;
                                    
                                case "2":
                                    System.out.println("");
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Adquiriste el Huawey P8");
                                    System.out.println("Especificaciones: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    System.out.println("Elegiste el Plan Vuela de 199 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPM Ilimitado");
                                    System.out.println(" -Interned 14 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println("El monto a pagar sera de S/199 al mes.");
                                    break;
                                    
                                case "3":
                                    System.out.println(" ");
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Adquiriste el Huawey P8");
                                    System.out.println("Especificaciones: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    System.out.println("Elegiste el Plan Vuela de 299 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPM Ilimitado");
                                    System.out.println(" -Interned 24 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println("El monto a pagar sera de S/299 al mes.");
                                    
                                    break;
                                    
                                    }
                            
                                 break;
                            
                            case "3":
                            
                                System.out.println(" ");
                                System.out.println("Elegiste la Red Entel ");
                                System.out.println("Elije un plan para tu equipo : ");
                            
                                System.out.println("1.FunPack 109");
                                System.out.println(" -Precio S/ 109 ");
                                System.out.println(" -Minutos Ilimitados");
                                System.out.println(" -RPE Ilimitado");
                                System.out.println(" -Interned 4 GB");
                                System.out.println(" -SMS Ilimitados");
                        
                                System.out.println("  ");
                                System.out.println("2.FunPack 119");
                                System.out.println(" -Precio S/ 119 ");
                                System.out.println(" -Minutos Ilimitados");
                                System.out.println(" -RPE Ilimitado");
                                System.out.println(" -Interned 7 GB");
                                System.out.println(" -SMS Ilimitados");
                            
                                System.out.println("  ");
                                System.out.println("3.FunPack 155");
                                System.out.println(" -Precio S/ 155 ");
                                System.out.println(" -Minutos Ilimitados");
                                System.out.println(" -RPE Ilimitado");
                                System.out.println(" -Interned 12 GB");
                                System.out.println(" -SMS Ilimitados");
                           
                            g=modelos.next();
                            int N=Integer.parseInt(g);
                            
                            switch (g){
                                case "1":
                                    System.out.println(" ");
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Adquiriste el Huawey P8");
                                    System.out.println("Especificaciones: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    System.out.println("Elegiste el FunPack de 109 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPE Ilimitado");
                                    System.out.println(" -Interned 4 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println("El monto a pagar sera de S/109 al mes.");
                                    
                                    break;
                                case "2":
                                    System.out.println(" ");
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Adquiriste el Huawey P8");
                                    System.out.println("Especificaciones: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    System.out.println("Elegiste el FunPack de 119 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPE Ilimitado");
                                    System.out.println(" -Interned 7 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println("El monto a pagar sera de S/119 al mes."); 
                                    
                                    break;
                                 
                                case "3":
                                    System.out.println(" ");
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Adquiriste el Huawey P8");
                                    System.out.println("Especificaciones: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    System.out.println("Elegiste el FunPack de 155 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPE Ilimitado");
                                    System.out.println(" -Interned 12 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println("El monto a pagar sera de S/155 al mes.");  
                                    break;
                            }
                    }
                    break;
                    
                        case "0783":
                
                System.out.println(" ");
                System.out.println("Usted selecciono el iPhone 6 ");
                System.out.println("CARACTERISTICAS " );
                System.out.println("Pantalla : 	4.7");
                System.out.println("Camara  : 8MP");  
                System.out.println("Procesador : 1.4 Ghz ");
                System.out.println(" ");
                
                System.out.println("Ingrese el operador que desea adquirir : ");
                System.out.println(" ");
                System.out.println("1.Claro ");
                System.out.println("2.Movistar ");
                System.out.println("3.Entel ");
                
                a=modelos.nextLine();
                int M=Integer.parseInt(a);
                
                    switch (a){
                        case "1":
                            
                            System.out.println(" ");
                            System.out.println("Elegiste la Red Claro ");
                            System.out.println("Elije un plan para tu equipo : ");
                            
                            System.out.println("1.Claro Max 99");
                            System.out.println(" -Minutos Ilimitados");
                            System.out.println(" -RPC Ilimitado");
                            System.out.println(" -Interned 7 GB");
                            System.out.println(" -SMS Ilimitados");
                            
                            System.out.println("  ");
                            
                            System.out.println("2.Claro Max 149");
                            System.out.println(" -Minutos Ilimitados");
                            System.out.println(" -RPC Ilimitado");
                            System.out.println(" -Interned 8 GB");
                            System.out.println(" -SMS Ilimitados");
                            
                            System.out.println("  ");
                            
                            System.out.println("3.Claro Max 189");
                            System.out.println(" -Minutos Ilimitados");
                            System.out.println(" -RPC Ilimitado");
                            System.out.println(" -Interned 9 GB");
                            System.out.println(" -SMS Ilimitados");
                           
                            e=modelos.next();
                            int E=Integer.parseInt(e);
                            
                           
                    
                            switch  (e){
                                case "1":
                                    
                                    
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Adquiriste el iPhone 6");
                                    System.out.println("Especificaciones: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    System.out.println("Elegiste el Plan 99 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPC Ilimitado");
                                    System.out.println(" -Interned 7 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println("El monto a pagar sera de S/99 al mes.");
                                    
                                    break;
                                    
                                case "2":
                                    
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Adquiriste el iPhone 6");
                                    System.out.println("Especificaciones: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    System.out.println("Elegiste el Plan 149 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPC Ilimitado");
                                    System.out.println(" -Interned 8 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println("El monto a pagar sera de S/149 al mes.");
                                    break;
                            
                            
                                    
                                case "3":
                                    
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Adquiriste el iPhone 6");
                                    System.out.println("Especificaciones: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    
                                    System.out.println("Elegiste el Plan 189 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPC Ilimitado");
                                    System.out.println(" -Interned 9 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    
                                    System.out.println("El monto a pagar sera de S/189 al mes.");
                                   break;
                                 }
                                    break;
                                                                 
                            
                            
                            
                        case "2":
                            
                            System.out.println(" ");
                            System.out.println("Elegiste la Red Movistar ");
                            System.out.println("Elije un plan para tu equipo : ");
                            
                            System.out.println("1.Plan Vuela 99");
                            System.out.println(" -Minutos Ilimitados");
                            System.out.println(" -RPM Ilimitado");
                            System.out.println(" -Interned 6 GB");
                            System.out.println(" -SMS Ilimitados");
                        
                            System.out.println("  ");
                            System.out.println("2.Plan Vuela 199");
                            System.out.println(" -Minutos Ilimitados");
                            System.out.println(" -RPM Ilimitado");
                            System.out.println(" -Interned 14 GB");
                            System.out.println(" -SMS Ilimitados");
                            
                            System.out.println("  ");
                            System.out.println("3.Plan Vuela 299");
                            System.out.println(" -Minutos Ilimitados");
                            System.out.println(" -RPM Ilimitado");
                            System.out.println(" -Interned 24 GB");
                            System.out.println(" -SMS Ilimitados");
                           
                            f=modelos.next();
                            int F=Integer.parseInt(f);
                    
                            
                            switch  (f){
                                case "1":
                                    
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Adquiriste el iPhone 6");
                                    System.out.println("Especificaciones: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    System.out.println("Elegiste el Plan Vuela 99 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPM Ilimitado");
                                    System.out.println(" -Interned 6 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println("El monto a pagar sera de S/99 al mes.");
                                    break;
                                    
                                case "2":
                                    System.out.println("");
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Adquiriste el iPhone 6");
                                    System.out.println("Especificaciones: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    System.out.println("Elegiste el Plan Vuela de 199 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPM Ilimitado");
                                    System.out.println(" -Interned 14 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println("El monto a pagar sera de S/199 al mes.");
                                    break;
                                    
                                case "3":
                                    System.out.println(" ");
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Adquiriste el iPhone 6");
                                    System.out.println("Especificaciones: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    System.out.println("Elegiste el Plan Vuela de 299 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPM Ilimitado");
                                    System.out.println(" -Interned 24 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println("El monto a pagar sera de S/299 al mes.");
                                    
                                    break;
                                    
                                    }
                            
                                 break;
                            
                            case "3":
                            
                                System.out.println(" ");
                                System.out.println("Elegiste la Red Entel ");
                                System.out.println("Elije un plan para tu equipo : ");
                            
                                System.out.println("1.FunPack 109");
                                System.out.println(" -Precio S/ 109 ");
                                System.out.println(" -Minutos Ilimitados");
                                System.out.println(" -RPE Ilimitado");
                                System.out.println(" -Interned 4 GB");
                                System.out.println(" -SMS Ilimitados");
                        
                                System.out.println("  ");
                                System.out.println("2.FunPack 119");
                                System.out.println(" -Precio S/ 119 ");
                                System.out.println(" -Minutos Ilimitados");
                                System.out.println(" -RPE Ilimitado");
                                System.out.println(" -Interned 7 GB");
                                System.out.println(" -SMS Ilimitados");
                            
                                System.out.println("  ");
                                System.out.println("3.FunPack 155");
                                System.out.println(" -Precio S/ 155 ");
                                System.out.println(" -Minutos Ilimitados");
                                System.out.println(" -RPE Ilimitado");
                                System.out.println(" -Interned 12 GB");
                                System.out.println(" -SMS Ilimitados");
                           
                            g=modelos.next();
                            int N=Integer.parseInt(g);
                            
                            switch (g){
                                case "1":
                                    System.out.println(" ");
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Adquiriste el iPhone 6");
                                    System.out.println("Especificaciones: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    System.out.println("Elegiste el FunPack de 109 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPE Ilimitado");
                                    System.out.println(" -Interned 4 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println("El monto a pagar sera de S/109 al mes.");
                                    
                                    break;
                                case "2":
                                    System.out.println(" ");
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Adquiriste el iPhone 6");
                                    System.out.println("Especificaciones: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    System.out.println("Elegiste el FunPack de 119 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPE Ilimitado");
                                    System.out.println(" -Interned 7 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println("El monto a pagar sera de S/119 al mes."); 
                                    
                                    break;
                                 
                                case "3":
                                    System.out.println(" ");
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Adquiriste el iPhone 6");
                                    System.out.println("Especificaciones: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    System.out.println("Elegiste el FunPack de 155 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPE Ilimitado");
                                    System.out.println(" -Interned 12 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println("El monto a pagar sera de S/155 al mes.");  
                                    break;
                            }
                    }
                    break;
                    }
        }
    }

                                    
                  
