public class conjuntoLD implements conjuntoTDA {
    nodo c;

    public void inicializarconjunto() {
        c = null;
    }

    public boolean conjuntovacio() {
        return (c == null);
    }

    public void agregar(int x) {
        if (!this.pertenece(x)) {
            nodo aux = new nodo();
            aux.info = x;
            aux.sig = c;
            c = aux;
        }
    }

    public int elegir() {
        return c.info;
    }

    public void sacar(int x) {
        if (c != null) {
            if (c.info == x) {
                c = c.sig;
            } else {
                nodo aux = c;
                while (aux.sig != null && aux.sig.info != x)
                    aux = aux.sig;
                if (aux.sig != null)
                    aux.sig = aux.sig.sig;
            }
        }
    }

    public boolean pertenece(int  x) {
        nodo aux = c;
        while ((aux != null) && (aux.info != x)) {
            aux = aux.sig;
        }
        return (aux != null);
    }
}






