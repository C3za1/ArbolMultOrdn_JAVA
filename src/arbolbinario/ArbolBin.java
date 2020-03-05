
package arbolbinario;

public class ArbolBin {
    NodoB Padre;
    NodoB Raiz;
    
    public ArbolBin()
    {
        Raiz = null;
    }
    
    public void InsertarNodo(int dato)
    {
        if(Raiz == null)
        {
            Raiz = new NodoB(dato);
        }else
        {
            Raiz.Insertar(dato);
            
        }
    }
    
    public void Preorden(NodoB Nodo)
    {
        if (Nodo == null)
        {
            return;
        }else
        {
            System.out.println(Nodo.dato + "");
            Preorden(Nodo.Hizq);
            Preorden(Nodo.Hder);
        }
    }
    
    public void Enorden(NodoB Nodo)
    {
        if (Nodo == null)
        {
            return;
        }else
        {
            Enorden(Nodo.Hizq);
            System.out.println(Nodo.dato + "");
            Enorden(Nodo.Hder);
        }
    }
    
    public void Postorden(NodoB Nodo)
    {
        if (Nodo == null)
        {
            return;
        }else
        {
            Postorden(Nodo.Hizq);
            Postorden(Nodo.Hder);
            System.out.println(Nodo.dato + "");
        }
    }
    
}
