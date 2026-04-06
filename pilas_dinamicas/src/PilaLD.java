public class PilaLD implements PilaTDA {

    Nodo primero;

    public void InicializarPila(){
        primero = null;
    }

    public void Apilar(int x) {
        Nodo aux = new Nodo();
        aux.info = x;
        aux.sig = primero;
        primero = aux;
    }

    public void Desapilar(){
        if (!PilaVacia()) {
            primero = primero.sig;
        }
    }

    public boolean PilaVacia(){
        return (primero == null);
    }

    public int Tope(){
        if (PilaVacia()) {
            throw new RuntimeException("Pila vacía");
        }
        return primero.info;
    }
}