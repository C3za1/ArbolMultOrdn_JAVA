
package arbolbinario;

import java.util.Scanner;

public class ArbolBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArbolBin ab = new ArbolBin();
        int dato;
        int opc;
        
        do
        {
            System.out.println("Inserte un dato: ");
            dato = sc.nextInt();
            ab.InsertarNodo(dato);
            
            System.out.println("Continuar 1 detener 0");
            opc = sc.nextInt();
        }while (opc!= 0);
        System.out.println("Preorden");
        ab.Preorden(ab.Raiz);
        System.out.println("Enorden");
        ab.Enorden(ab.Raiz);
        System.out.println("Postorden");
        ab.Postorden(ab.Raiz);
    }
    
}
