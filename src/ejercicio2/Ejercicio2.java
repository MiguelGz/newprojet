/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner modelos =new Scanner(System.in);
        String Samsung_S7, Huawey_P8,Iphone_6,x,a,b,d,e;
        
        
        System.out.println("Catalogo de Equipos en Oferta : ");
        System.out.println(" ");
        System.out.println("A.Samsung S7 ----Codigo: (0612) ");
        System.out.println("B.Huawey P8  ----Codigo: (0456) " );
        System.out.println("C.iPhone 6   ----Codigo: (0783");
        
        System.out.println("Ingresa el codigo del equipo: ");
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
                            System.out.println(" -Precio S/ 99 ");
                            System.out.println(" -Minutos Ilimitados");
                            System.out.println(" -RPC Ilimitado");
                            System.out.println(" -Interned 7 GB");
                            System.out.println(" -SMS Ilimitados");
                        
                            System.out.println("  ");
                            System.out.println("2.Claro Max 149");
                            System.out.println(" -Precio S/ 149 ");
                            System.out.println(" -Minutos Ilimitados");
                            System.out.println(" -RPC Ilimitado");
                            System.out.println(" -Interned 8 GB");
                            System.out.println(" -SMS Ilimitados");
                            
                            System.out.println("  ");
                            System.out.println("3.Claro Max 189");
                            System.out.println(" -Precio S/ 189 ");
                            System.out.println(" -Minutos Ilimitados");
                            System.out.println(" -RPC Ilimitado");
                            System.out.println(" -Interned 9 GB");
                            System.out.println(" -SMS Ilimitados");
                            
                            b=modelos.nextLine();
        
                            int B=Integer.parseInt(b);
                            
                            break;
                    }
                            switch  (a){
                                case "1":
                                    
                                    
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Adquisrites el Samsung S7");
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
                                    System.out.println("Adquisrites el Samsung S7");
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
                                    System.out.println("Adquisrites el Samsung S7");
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
                            case "2":
                            
                            System.out.println(" ");
                            System.out.println("Elegiste la Red Movistar ");
                            System.out.println("Elije un plan para tu equipo : ");
                            
                            System.out.println("1.Plan Vuela 99");
                            System.out.println(" -Precio S/ 99 ");
                            System.out.println(" -Minutos Ilimitados");
                            System.out.println(" -RPM Ilimitado");
                            System.out.println(" -Interned 6 GB");
                            System.out.println(" -SMS Ilimitados");
                        
                            System.out.println("  ");
                            System.out.println("2.Plan Vuela 199");
                            System.out.println(" -Precio S/ 199 ");
                            System.out.println(" -Minutos Ilimitados");
                            System.out.println(" -RPM Ilimitado");
                            System.out.println(" -Interned 14 GB");
                            System.out.println(" -SMS Ilimitados");
                            
                            System.out.println("  ");
                            System.out.println("3.Plan Vuela 299");
                            System.out.println(" -Precio S/ 299 ");
                            System.out.println(" -Minutos Ilimitados");
                            System.out.println(" -RPM Ilimitado");
                            System.out.println(" -Interned 24 GB");
                            System.out.println(" -SMS Ilimitados");
                           
                            d=modelos.nextLine();
        
                            int D=Integer.parseInt(d);
                            switch  (a){
                                case "1":
                                    
                                     System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Adquisrites el Samsung S7");
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
                                    System.out.println("Adquisrites el Samsung S7");
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
                                    System.out.println("Adquisrites el Samsung S7");
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
                           
                            e=modelos.nextLine();
        
                            int E=Integer.parseInt(e);
                            switch  (a){
                                case "1":
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Adquisrites el Samsung S7");
                                    System.out.println("Especificaciones: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    System.out.println("Elegiste el Plan FunPack 109 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPE Ilimitado");
                                    System.out.println(" -Interned 4 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println(" ");
                                    System.out.println("El monto a pagar al sera sera de S/109 ");
                                    
                                    break;
                                    
                                case "2":
                                    System.out.println(" ");
                                    System.out.println("Adquisrites el Samsung S7");
                                    System.out.println("Especificaciones: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    
                                    System.out.println("Elegiste el Plan FunPack 119 ");
                                    
                                    
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPE Ilimitado");
                                    System.out.println(" -Interned 7 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println(" ");
                                    System.out.println("El monto a pagar al sera sera de S/119 ");
                                    
                                    break;
                                    
                                case "3":
                                    
                                    System.out.println(" ");
                                     System.out.println("Adquisrites el Samsung S7");
                                    System.out.println("Especificaciones: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    
                                    System.out.println("Elegiste el Plan FunPack 155 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPE Ilimitado");
                                    System.out.println(" -Interned 12 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println(" ");
                                    System.out.println("El monto a pagar al sera sera de S/155 ");
                                    
                                    break;
                                    
                            }
                            
                            
                            
                        
                    
                            
                break;
                    }
            case "0456":
                
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
                int i=Integer.parseInt(a);
                
                    switch (a){
                        case "1":
                            
                            System.out.println(" ");
                            System.out.println("Elegiste la Red Claro ");
                            System.out.println("Elije un plan para tu equipo : ");
                            
                            System.out.println("1.Claro Max 99");
                            System.out.println(" -Precio S/ 99 ");
                            System.out.println(" -Minutos Ilimitados");
                            System.out.println(" -RPC Ilimitado");
                            System.out.println(" -Interned 7 GB");
                            System.out.println(" -SMS Ilimitados");
                        
                            System.out.println("  ");
                            System.out.println("2.Claro Max 149");
                            System.out.println(" -Precio S/ 149 ");
                            System.out.println(" -Minutos Ilimitados");
                            System.out.println(" -RPC Ilimitado");
                            System.out.println(" -Interned 8 GB");
                            System.out.println(" -SMS Ilimitados");
                            
                            System.out.println("  ");
                            System.out.println("3.Claro Max 189");
                            System.out.println(" -Precio S/ 189 ");
                            System.out.println(" -Minutos Ilimitados");
                            System.out.println(" -RPC Ilimitado");
                            System.out.println(" -Interned 9 GB");
                            System.out.println(" -SMS Ilimitados");
                            b=modelos.nextLine();
        
                            int h=Integer.parseInt(b);
                            
                            switch  (a){
                                case "1":
                                    
                                    
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Adquisrites el Samsung S7");
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
                                    System.out.println("Adquisrites el Samsung S7");
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
                                    System.out.println("Adquisrites el Samsung S7");
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
                            case "2":
                            
                            System.out.println(" ");
                            System.out.println("Elegiste la Red Movistar ");
                            System.out.println("Elije un plan para tu equipo : ");
                            
                            System.out.println("1.Plan Vuela 99");
                            System.out.println(" -Precio S/ 99 ");
                            System.out.println(" -Minutos Ilimitados");
                            System.out.println(" -RPM Ilimitado");
                            System.out.println(" -Interned 6 GB");
                            System.out.println(" -SMS Ilimitados");
                        
                            System.out.println("  ");
                            System.out.println("2.Plan Vuela 199");
                            System.out.println(" -Precio S/ 199 ");
                            System.out.println(" -Minutos Ilimitados");
                            System.out.println(" -RPM Ilimitado");
                            System.out.println(" -Interned 14 GB");
                            System.out.println(" -SMS Ilimitados");
                            
                            System.out.println("  ");
                            System.out.println("3.Plan Vuela 299");
                            System.out.println(" -Precio S/ 299 ");
                            System.out.println(" -Minutos Ilimitados");
                            System.out.println(" -RPM Ilimitado");
                            System.out.println(" -Interned 24 GB");
                            System.out.println(" -SMS Ilimitados");
                           
                            d=modelos.nextLine();
        
                            int g=Integer.parseInt(d);
                            switch  (a){
                                case "1":
                                    
                                     System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Adquisrites el Samsung S7");
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
                                    System.out.println("Adquisrites el Samsung S7");
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
                                    System.out.println("Adquisrites el Samsung S7");
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
                           
                            e=modelos.nextLine();
        
                            int f=Integer.parseInt(e);
                            switch  (a){
                                case "1":
                                    System.out.println(" ");
                                    System.out.println("Gracias por la Compra: ");
                                    System.out.println(" ");
                                    System.out.println("Adquisrites el Samsung S7");
                                    System.out.println("Especificaciones: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    System.out.println("Elegiste el Plan FunPack 109 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPE Ilimitado");
                                    System.out.println(" -Interned 4 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println(" ");
                                    System.out.println("El monto a pagar al sera sera de S/109 ");
                                    
                                    break;
                                    
                                case "2":
                                    System.out.println(" ");
                                    System.out.println("Adquisrites el Samsung S7");
                                    System.out.println("Especificaciones: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    
                                    System.out.println("Elegiste el Plan FunPack 119 ");
                                    
                                    
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPE Ilimitado");
                                    System.out.println(" -Interned 7 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println(" ");
                                    System.out.println("El monto a pagar al sera sera de S/119 ");
                                    
                                    break;
                                    
                                case "3":
                                    
                                    System.out.println(" ");
                                     System.out.println("Adquisrites el Samsung S7");
                                    System.out.println("Especificaciones: " );
                                    System.out.println("Pantalla : 	4.7");
                                    System.out.println("Camara  : 8MP");  
                                    System.out.println("Procesador : 1.4 Ghz ");
                                    System.out.println(" ");
                                    
                                    System.out.println("Elegiste el Plan FunPack 155 ");
                                    System.out.println(" -Minutos Ilimitados");
                                    System.out.println(" -RPE Ilimitado");
                                    System.out.println(" -Interned 12 GB");
                                    System.out.println(" -SMS Ilimitados");
                                    System.out.println(" ");
                                    System.out.println("El monto a pagar al sera sera de S/155 ");
                                    
                                    break;
                                    
                
             case "0783":
                 
                 System.out.println("  "); 
                 System.out.println("Usted selecciono el iPhone 6 ");
                System.out.println("CARACTERISTICAS " );
                System.out.println("Pantalla : 	4.7");
                System.out.println("Camara  : 8MP");  
                System.out.println("Procesador : 1.4 Ghz ");    
                
                break;
            
            }
        }
    }
}

            
        
        
       
        
        

        
       
    
   

