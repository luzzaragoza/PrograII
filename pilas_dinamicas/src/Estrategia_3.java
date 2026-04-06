public class Estrategia_3 implements PilaTDA {

    Nodo primero;
    int cantidad;

    public void InicializarPila() {
        primero = null;
        cantidad = 0;
    }

    public void Apilar(int x) {
        Nodo nuevo = new Nodo();
        nuevo.info = x;
        nuevo.sig = primero;
        primero = nuevo;
        cantidad++;
    }

    public void Desapilar() {
        if (!PilaVacia()) {
            primero = primero.sig;
            cantidad--;
        }
    }

    public int Tope() {
        if (PilaVacia()) throw new RuntimeException("Pila vacía");
        return primero.info;
    }

    public boolean PilaVacia() {
        return cantidad == 0;
    }
}