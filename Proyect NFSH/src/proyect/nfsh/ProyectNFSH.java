 // salto de linea = \n 
  

package proyect.nfsh;

import java.util.Scanner;

//---------------------------------------------------------------------------------------------------------------------------------------//

public class ProyectNFSH {


    
    public static void main(String[] args) {
 // declaracion de variables
 String Exit=null; 
do{
 
        int a=0,  carro=0, sm=0, SelA=0, preT=0, selpe=0, selta=0, selar=0, selAex=0, selAi=0, selAel=0, adda=0 ; 
        
 double precio=0, pt=0, ppe=0, pta=0, par=0, paex=0, pai=0, pael=0, total=0; 
 
//---------------------------------------------------------------------------------------------------------------------------------
 String nameC = null, nameTr = null, namePe = null, nameTap = null, nameAr = null, nameAex = null, nameAi = null, nameAel = null ;
      

       Scanner leer1 = new Scanner (System.in); 
       Scanner leer2 = new Scanner (System.in); 
       Scanner leer3c = new Scanner (System.in);
       Scanner leersm = new Scanner(System.in); 
       Scanner leerSelA = new Scanner(System.in);
       Scanner leerpreT = new Scanner(System.in);
       Scanner leerselpe = new Scanner(System.in);
       Scanner leerselta = new Scanner(System.in);
      Scanner leerselar = new Scanner(System.in);
      Scanner leerselAex= new Scanner(System.in);
      Scanner leerselAi = new Scanner(System.in);
      Scanner leerselAel = new Scanner(System.in);
      Scanner leeradda = new Scanner(System.in);
      Scanner leerExit= new Scanner(System.in);
  //=================================================================================
  do{     
  do{
            
        
           
        System.out.println("                ====    Consecionario N.F.S.H.    ===== \n"
                + "1 ====    Comenzar Con La personalizacion De Su Vehiculo   ==== \n  "   );         
             
        System.out.println("        1.Seleccione La Gama Que Desea Adquirir "
                        + "\n        2.salir \n       "
                              + "\n  SELECCIONE UNA OPCION PARA CONTINUAR \n");
        System.out.println("=========================================================================");
        a = leer1.nextInt ();      
        System.out.println("=========================================================================");
 
  if(a==1) {
 System.out.print(
          "1-Sedan Economico                              Q.18,940.00        \n"
         + "2-Sedan                                        Q.23,570.00          \n"
         + "3-Deportivo                                    Q.24,100.00          \n"                                   
         + "4-hibrido                                      Q.25,100.00           \n"
         + "5-Coupe                                        Q.19,350.00          \n"
         + "6-Coupe Deportivo                              Q.24,100.00         \n"
         + "7-Compacto                                     Q.16,190.00         \n"
         + "8-Hatchback                                    Q.20,150.00          \n"
         + "9-Economico Version Rally                      Q.34,700.00        \n"
         + "10-regresar al menu principal                           \n"
         
         + " \n Porfavor  Seleccione La Opcion Que Desea Adquirir;"
         + "\n");
 
carro = leer3c.nextInt();
 if(carro == 1 ) { 
        nameC="Sedan economico";
        precio= 18940.00;
 }
  if(carro == 2 ) { 
        nameC="Sedàn ";
        precio= 23570;
 }       
 if(carro == 3 ) { 
        nameC="deportivo";
        precio= 24100.00;
 }
 if(carro == 4 ) { 
        nameC="hibrido";
        precio= 25100.00;
 }
  if(carro == 5 ) { 
        nameC="coupe";
        precio= 19350.00;
 }
   if(carro == 6 ) { 
        nameC="coupe deportivo";
        precio= 24100.00;
 }

   if(carro == 7 ) { 
        nameC="compacto";
        precio= 16190.00;
 }
   
   if(carro == 8 ) { 
        nameC="hatchback";
        precio= 20150.00;
 }
   
   if(carro == 9 ) { 
        nameC="economico version rally";
        precio= 34700.00;
 }
 
 }
     if(a == 2){
       
         System.out.print("\n" + "====    Gracias por su visita    =====" + "\n");
  
   System.exit(0);
   }

        } while(carro == 10);    
     
        System.out.print(" \n" + "la gama que selecciono es: " +nameC+"\n"); 
 
        System.out.print("¿desea agregar aditamentos o amenidades? "
                + "\n 1.yesenia \n"
                + "2. Nel \n");
        
        System.out.println("=========================================================================");
       
        sm=leersm.nextInt();
        
        System.out.println("=========================================================================");
        if(sm==1){
         do{
            do{   
        System.out.println("       ====    Consecionario N.F.S.H.    ===== \n"
                + " ====    seleccion de aditamentos o amenidades  ==== \n  "   );      
         
       System.out.println(""
               + "1-Tipo De Transmision \n"
               + "2-Color De Pintura Exterior \n"
               + "3-Color Te Tapiceria \n "
               +"4-Aros \n"
               + "5-Accesorios Exteriores \n"
               + "6-Acesorios Interiores \n"
               + "7-Accesorios Electronicos \n"
               + "8-Regresar a Menu Principal \n");
       
       
        SelA=leerSelA.nextInt();
        
        if(SelA == 1){
            System.out.print(""
                    + "====Tipos de Transmisiòn  ====\n"
                    
            + "1-Manual                           Q. 00.00 \n"
            + "2-C.V.T.                               Q. 800.00\n"
            + "3-Manual Con Turbo                     Q. 00.00\n "
          + "4-C.V.T. con Turbo                     Q. 800.00 \n"
            + "5-Regresar al menu de Aditamentos o amenidades\n"
            ); 
            
            preT=leerpreT.nextInt();
            
       if(preT==1){
           nameTr= "Manual                   Q. 00.00";
              pt=00.00;               
       }
       if(preT==2){
           nameTr= "C.V.T.                  Q. 800.00";
              pt=800.00; }
              
       if(preT==3){
           nameTr= "Manual con Turbo                   Q 00.00";
              pt=00.00; }
              
       if(preT==4){
           nameTr= "C.V.T. con Turbo                  Q 800.00";
              pt=800.00; }
       
       //====================================================================
        }
       if(SelA == 2){
           System.out.print(""
                    + "====    Colores de pintura Exterior  ====\n"
                   + "\n"
                   
                   + "1-cosmic blue                0.00 \n"
                   + "2-Bunrgundy Night             0.00  \n "
                   + "3-Rallye Red                    0.00\n"
                   + "4-Crystal Black                 0.00\n"
                   + "5-Modern Steel                 0.00\n"
                   + "6-Taffeta White                0.00\n"
                   + "7-Energy Green                  0.00\n"
                   + "8-Kona Coffe                     0.00\n"
                   + "9-Orange Fury                    0.00\n"
                   + "10-Helios Yellow                     0.00\n"
                   + "11-Sonic Gray                        0.00\n"
                   + "12-polished Metal                    0.00\n"
                   + "13-regresar a menu de adittamentos o amenidades\n"           );

           
           selpe =leerselpe.nextInt();
           
           if( selpe ==1){
               namePe="cosmic blue                  0.00";
               ppe= 0.00;       }
               
           if( selpe==2){
               namePe="burgundy Nigth                  0.00";
               ppe= 0.00; }
               
           if( selpe ==3){
               namePe="Rallye Red                  0.00";
               ppe= 0.00; }
               
               if( selpe ==4){
               namePe="Crystal Black                  0.00";
               ppe= 0.00;   }
               
               if( selpe ==5){
               namePe="Modern Steel                 0.00";
               ppe= 0.00;   }
               
               if( selpe ==6){
               namePe="Taffeta white                  0.00";
               ppe= 0.00;   }
               
               if( selpe ==7){
               namePe="Energy Green                  0.00";
               ppe= 0.00;   }
               
               if( selpe ==8){
               namePe="Kona Coffe                  0.00";
               ppe= 0.00;   }
               
               if( selpe ==9){
               namePe="Orange Fury                  0.00";
               ppe= 0.00;   }
               
               if( selpe ==10){
               namePe="Helios Yellow                  0.00";
               ppe= 0.00;   }
               
               if( selpe==11){
               namePe="Sonic Gray                  0.00";
               ppe= 0.00;   }
               
               if( selpe==12){
               namePe="Polisher Metal                  0.00";
               ppe= 0.00;   }
       }
  //=======================================================================================
  
  if(SelA==3){
        
            System.out.print(""
                    + "====Color de Tapiceria ====\n"
                    + "\n"
                    + "1-Gray Cloth                           0.00 \n"
                    + "2-Black Cloth                          0.00 \n"
                    + "3-Black/Gray Cloth                     0.00\n"
                    + "4-Red/Black Suede Effect-Fabric        0.00\n "
                    + "5-regresar a menu de adittamentos o amenidades\n");
            
            selta=leerselta.nextInt();
            
            if(selta==1){
            nameTap= "Gray Cloth                 0.00";
            pta=0.00;             }

if(selta==2){
            nameTap= "Black Cloth                 0.00";
            pta=0.00;             }

if(selta==3){
            nameTap= "Black/ Gray Cloth                0.00";
            pta=0.00;             }

if(selta==4){
            nameTap= "Red/Black Suede Effect-Fabrick                 0.00";
            pta=0.00;             }
  }
  //=========================================================================================
  if(SelA == 4){
        System.out.println("                ====    Consecionario N.F.S.H.    ===== \n");
           System.out.print(""
                    + "====    Tamaño de Aros  ====\n"
                   + "\n"
                   + "1-15 pulgadas               Q.0.00 \n"
                   + "2-16 pulgadas               Q.0.00 \n"
                   + "3-17 pulgadas               Q.168,00.00 \n"
                   + "4-18 pulgadas               Q.1700.00 \n"
                   + "5-19 pulgadas               Q.3,000.00\n"
                   + "6-regresar a menu de adittamentos o amenidades\n");
           
           selar=leerselar.nextInt();
           
   if(selar==1) {
       nameAr= "15 pulgadas                 0.00";
       par= 0.00;  }
   
    if(selar==2) {
       nameAr= "16 pulgadas                 0.00";
       par= 0.00;  }
    
     if(selar==3) {
       nameAr= "17 pulgadas                 1680.00";
       par= 1680.00;  }
     
      if(selar==4) {
       nameAr= "18 pulgadas                 1700.00";
       par= 1700.00;  }
      
       if(selar==5) {
       nameAr= "19 pulgadas                 3011.00";
       par= 3011.00;  }        }
  
//=================================================================================
if(SelA == 5){
       System.out.println("                ====    Consecionario N.F.S.H.    ===== \n");      
    System.out.print(""
                    + "====    Accesorios Exteriores  ==== \n" 
            
                   + " 1-Body Side Molding                Q. 217.00 \n"
                   + "2-Car Cover                         Q. 230.00 \n"
                   + "3-Declkid Spoiler                   Q. 299.00\n"
                   + "4-Door Edge Film                    Q. 42.00\n"
                   + "5-Door Trim Chrome                  Q. 285.00\n"
                   + "6-Door Visor                        Q. 185.00\n"
                   + "7-Front Fender Emblems              Q.50.00\n"
                   + "8-Rear Bumper Applique              Q.70.00\n"
                   + "9-Fog Lights                        Q. 325.00\n"
                   + "10-Nose lights                        Q.150.00\n"
                   + "11-Moonrof Visor                    Q. 138.00\n"
                   + "12-Splash Guard Set                  Q. 104.00\n"
                   + "13-Dust Cover                         Q. 350.00\n"
                   + "14-Door Mirror Cover- Carbon fiber  Q. 520.00\n"
                   + "15-Door edge Guards                Q. 84.00 \n"
                   + "16-regresar a menu de adittamentos o amenidades\n"    );
    
selAex = leerselAex.nextInt(); 

if(selAex ==1){
    nameAex="Body Side Molding                  Q. 217.00";
    paex= 217.00;   }
        
   if(selAex ==2){
    nameAex="Car Cover                           Q. 230.00";
    paex= 230.00; }
    
   if(selAex ==3){
    nameAex="Decklid Spoiler                    Q. 299.00";
    paex= 217.00;   }
   
   if(selAex ==4){
    nameAex="Door Edge Flilm                    Q. 42.00 ";
    paex= 42.00 ;   }
   
   if(selAex ==5){
    nameAex="Door Trim Chrome                  Q. 285.00";
    paex= 285.00;   }
   
   if(selAex ==6){
    nameAex="Door Visor                          Q. 185.00";
    paex= 185.00;   }
   
   if(selAex ==7){
    nameAex="Front Fender Emblems              Q. 50.00";
    paex= 50.00;   }
   
   if(selAex ==8){
    nameAex="Rear Bumper Applique               Q. 70.00";
    paex= 70.00;   }
   
   if(selAex ==9){
    nameAex="Fog Lights                            Q. 325.00";
    paex= 325.00;   }
   
   if(selAex ==10){
    nameAex="Noser Mascs                          Q. 158.00";
    paex= 150.00;   }
   
   if(selAex ==11){
    nameAex="Moonrof Visor                         Q. 138.00";
    paex= 138.00;   }
   
   if(selAex ==12){
    nameAex="Splash Guard Set                      Q. 104.00";
    paex= 104.00;   }
   
   if(selAex ==13){
    nameAex="Dust Cover                             Q. 350.00";
    paex= 350.00;   }
   
   if(selAex ==14){
    nameAex="Door Mirror Cover-Carbon Fiber      Q. 520.00";
    paex= 520.00;   }
   
   if(selAex ==15){
    nameAex="Door Edge Film                          Q. 84.00";
    paex= 84.00;   }           } 
 
 //=======================================================================================       
        if(SelA == 6){
     System.out.println("                ====    Consecionario N.F.S.H.    ===== \n");    
    System.out.print(""
                    + "====   Accesorios Interiores   ==== \n"
            + "1-All-Seasons Floor Mats                 Q. 142.00\n"
            + "2-Automatic-Dimming Mirror              Q. 219.00\n"
            + "3-Cargo Hook                               Q. 12.00\n"
            + "4-Cargo Net                                Q. 49.00\n"
            + "5-console Illumination                      Q. 250.00\n"
            + "6-Cargo Organizer                          Q. 87.00\n"
            + "7-Door Panel Protrector                    Q. 149.00\n"
            + "8-Armes compartiment                      Q. 337.00\n"
            + "9-Door Sill Trim Illuminated                Q. 290.00\n"
            + "10-Cargo Cover                               Q. 166.00\n"
            + "11-Cargo Liner                                Q. 187.00\n"
            + "12-regresar a menu de adittamentos o amenidades\n"         );
    
    
   selAi = leerselAi.nextInt();
    if( selAi == 1){
        nameAi=" All-Seasons Floor Mats                 Q. 142.00" ;
        pai = 142.00 ;  }
    
     if( selAi == 2){
        nameAi=" Automatic-Dimming Mirror              Q. 219.00" ;
        pai = 219.00 ;  }
     
      if( selAi == 3){
        nameAi=" Cargo Hook                               Q. 12.00" ;
        pai = 12.00 ;  }
      
       if( selAi == 4){
        nameAi=" Cargo Net                                Q. 49.00" ;
        pai = 49.00 ;  }
       
        if( selAi == 5){
        nameAi=" console Illumination                   Q. 250.00" ;
        pai = 142.00 ;  }
        
         if( selAi == 6){
        nameAi=" Cargo organizer                       Q. 87.00" ;
        pai = 87.00 ;  }
         
          if( selAi == 7){
        nameAi=" Door Panel Protector                  Q. 149.00" ;
        pai = 149.00 ;  }
          
           if( selAi == 8){
        nameAi=" Armrest Compartiment                 Q. 337.00" ;
        pai = 337.00 ;  }
           
            if( selAi == 9){
        nameAi=" Door Sill Trim Illuminated             Q. 290.00" ;
        pai = 290.00 ;  }
            
             if( selAi == 10){
        nameAi=" Cargo Cover                             Q. 166.00" ;
        pai = 166.00 ;  }
             
              if( selAi == 11){
        nameAi=" Cargo Liner                               Q. 187.00" ;
        pai = 187.00 ;  }        }
        
    //======================================================================================
        if(SelA == 7){
       System.out.println("                ====    Consecionario N.F.S.H.    ===== \n");  
    System.out.print(""
                    + "====   Accesorios Electronicos   ==== \n"
            + "\n"
            + "1-Wireless Phone Charger                Q. 305.00\n"
            + "2-USB Charger-2.1Amp.                   Q. 120.00\n"
            + "3-Puddle Light                          Q. 185.00\n"
            + "4-Parking Sensors                       Q. 514.00\n"
            + "5-regresar a menu de adittamentos o amenidades\n");
    
   
    selAel=leerselAel.nextInt();
   
    if(selAel==1){
        nameAel= "Wireless Phone Charger                 Q. 305.00";
        pael=305.00;  }

  if(selAel==2){
        nameAel= "USB Charger-2.1Amp.                  Q. 120.00";
        pael=120.00;  }
  
    if(selAel==3){
        nameAel= "Puddle Light                              Q. 185.00";
        pael=185.00;  }
    
      if(selAel==4){
        nameAel= "Parking Sensors                          Q. 514.00";
        pael=514.00;  }      }
         
         }while (preT==5 || selpe==13|| selta==5 || selar==6 || selAex==16 || selAi==12 || selAel==5
                 );
         
 //=================================================================================================
 if(SelA<8){
     
         
 System.out.println("                ====    Consecionario N.F.S.H.    ===== \n"
                  + "====    Menu Seleccion de Aditamentos o Amenidades    ====   \n "
                  + "la gama que ha seleccionado es: "+ nameC+"                              "+ precio);
          
          total=precio+pt+ppe+pta+par+paex+pai+pael;
          
          if(preT>0){
              System.out.println("tipo de transmision seleccionada: "+ nameTr);
          }
        
        if( selpe>0) {
            System.out.println("tipo de pintura externa seleccionada: "+ namePe);
        }
        
         if( selta>0){
            System.out.println("tipo seleccionada: "+ nameTap);
        }
        
          if( selar>0){
            System.out.println("tipo de seleccionado: "+ nameAr);
        }
        
           if( selAex>0){
            System.out.println("tipo de Accesorio externo seleccionado: "+ nameAex);
        }
        
            if( selAi>0){
            System.out.println("tipo de Accesorio Interno seleccionado: "+ nameAi);
        }
        
            if( selAel>0){
            System.out.println("tipo de Accesorio electronico: "+ nameAel);
            
        }
        
        System.out.println("su total a pagar ese de: " +total);
        
        System.out.println("desea agregar mas aditamentos o amenidades \n"
                + "1-SI \n"
                + "2-No\n");
        adda=leeradda.nextInt();
 }        
 }while(adda==1);
        
         if(adda==2){
             System.out.println("                ====    Consecionario N.F.S.H.    ===== \n"
                  + "====    Menu Seleccion de Aditamentos o Amenidades    ====   \n "
                  + "la gama que ha seleccionado es: "+ nameC+"                              "+ precio);          
          
          if(preT>0){
              System.out.println("tipo de transmision seleccionada: "+ nameTr);
          }
        
        if( selpe>0) {
            System.out.println("tipo de pintura externa seleccionada: "+ namePe);
        }
        
         if( selta>0){
            System.out.println("tipo seleccionada: "+ nameTap);
        }
        
          if( selar>0){
            System.out.println("tipo de seleccionado de aros: "+ nameAr);
        }
        
           if( selAex>0){
            System.out.println("tipo de Accesorio externo seleccionado: "+ nameAex);
        }
        
            if( selAi>0){
            System.out.println("tipo de Accesorio Interno seleccionado: "+ nameAi);
        }
        
            if( selAel>0){
            System.out.println("tipo de Accesorio electronico: "+ nameAel);
            
        }
        
        System.out.println("su total a pagar ese de: " +total);
        }
         System.out.println("escriba f para regresear al menu principal " );
         
        Exit=leerExit.nextLine();
         
         
        } 
       
        
        
        
  }while(SelA==8);  
        
  if(sm==2){
      System.out.println("       ====    Consecionario N.F.S.H.    ===== \n"
              + "====Resumen de venta====\n");
      
      System.out.println("      ha seleccionado la gama : "+nameC+ "                "+precio);
      
       System.out.println("      no selecciono aditamentos o amenidades" );

       System.out.println("      Su total a pagar es de: "+precio );
       
        System.out.println("    escriba f para volver al menu principal : " );
        
       Exit=leerExit.nextLine();
  }
}while(Exit.equals("f"));
        
    }
   
}
   
