
package arbolbinario;

public class NodoB {
    
    int dato;
    
    NodoB Hder;
    NodoB Hizq;
    
    public NodoB(int valor)
    {
        dato = valor;
        NodoB Hizq, Hder = null;
    }
    
    public NodoB()
    {
        NodoB Hizq, Hder = null;
    }
    
    public void Insertar(int valor)
    {
        if (valor<dato)
        {
            if (Hizq == null)
            {
                Hizq = new NodoB(valor);
            }else
             if(valor%2==1)
            {
                Hizq.Insertar(valor);
            }
        }else
        {
            if (valor>dato)
            {
                if (Hder == null)
                {
                    Hder = new NodoB(valor);
                }else
                 if(valor%2==0)   
                {
                    Hder.Insertar(valor);
                }
            }
        }
    }
}
