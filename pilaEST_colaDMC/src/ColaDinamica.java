package implementacion;
import interfaces.colaDMC;

public class ColaDinamica implements colaDMC{

    private Nodo frente;
    private Nodo fondo;

    @Override
    public void InicializarCola() {
        frente = null;
        fondo = null;
    }

    @Override
    public void Acolar(int x) {
        Nodo Nodo = new Nodo(x,null);
        if (ColaVacia()) {
            frente = Nodo;
        } else {
            fondo.setNext(Nodo);
        }
        fondo = Nodo;
    }

    @Override
    public void Desacolar() {
        if (!ColaVacia()) {
            frente = frente.getNext();
            if (frente == null) {
                fondo = null;
            }
        }
    }

    @Override
    public int Primero() {
        return frente.getData();
    }

    @Override
    public boolean ColaVacia() {
        return frente == null;
    }

}
