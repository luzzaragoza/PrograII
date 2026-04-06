public class Estrategia_2 implements PilaTDA {

    Nodo primero;

    public void InicializarPila() {
        primero = null;
    }

    public void Apilar(int x) {
        Nodo nuevo = new Nodo();
        nuevo.info = x;
        nuevo.sig = primero;
        primero = nuevo; // inserta al inicio
    }

    public void Desapilar() {
        if (!PilaVacia()) {
            primero = primero.sig; // elimina el primero
        }
    }

    public int Tope() {
        if (PilaVacia()) throw new RuntimeException("Pila vacía");
        return primero.info;
    }

    public boolean PilaVacia() {
        return primero == null;
    }
}