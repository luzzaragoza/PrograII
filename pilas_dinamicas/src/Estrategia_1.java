public class Estrategia_1 implements PilaTDA {

    Nodo primero;

    public void InicializarPila() {
        primero = null;
    }

    public void Apilar(int x) {
        Nodo nuevo = new Nodo();
        nuevo.info = x;
        nuevo.sig = null;

        if (primero == null) {
            primero = nuevo;
        } else {
            Nodo aux = primero;
            while (aux.sig != null) {
                aux = aux.sig;
            }
            aux.sig = nuevo; // se agrega al final
        }
    }

    public void Desapilar() {
        if (!PilaVacia()) {
            if (primero.sig == null) {
                primero = null;
            } else {
                Nodo aux = primero;
                while (aux.sig.sig != null) {
                    aux = aux.sig;
                }
                aux.sig = null; // elimina el último
            }
        }
    }

    public int Tope() {
        if (PilaVacia()) throw new RuntimeException("Pila vacía");

        Nodo aux = primero;
        while (aux.sig != null) {
            aux = aux.sig;
        }
        return aux.info;
    }

    public boolean PilaVacia() {
        return primero == null;
    }
}