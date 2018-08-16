
package ejercicio42video51;

import java.util.*;

public class Ejercicio42Video51 {

    public static int indiceCocheMBarato(Vehiculo coches[]){
        
        float precio;
        int indice = 0;
        
        precio = coches[0].getPrecio();
        for(int i=1; i<coches.length; i++){
            if(coches[i].getPrecio()<precio){
                precio = coches[i].getPrecio();
                indice=i;
            }
        }
        
        return indice;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner entrada = new Scanner(System.in);
        
        String marca,modelo;
        float precio;
        int numeroVehiculos,indiceBarato;
        
        System.out.println("DIGITE LA CANTIDAD DE VEHICULOS: ");
        numeroVehiculos = entrada.nextInt();
        
        Vehiculo coches[] = new Vehiculo[numeroVehiculos];
        
        for(int i=0; i<coches.length; i++){
        entrada.nextLine();
        System.out.println("\nDIGITE LAS CARACTERISTICAS DEL COCHE " + (i+1)+" : ");
        System.out.print("INTRODUCE MARCA: ");
        marca = entrada.nextLine();
        System.out.print("INTRODUZCA MODELO: ");
        modelo = entrada.nextLine();
        
        System.out.print("INTRODUZCA PRECCIO: ");
        precio = entrada.nextFloat();
        
        coches[i] = new Vehiculo(marca,modelo,precio);
        
        }
        
        indiceBarato = indiceCocheMBarato(coches);
        System.out.println("\nEL COCHE MAS BARATO ES: ");
        System.out.println(coches[indiceBarato].mostrarDatos());
    }
    
}
