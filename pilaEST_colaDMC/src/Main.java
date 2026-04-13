import implementacion.PilaEstatica;
import implementacion.ColaDinamica;
import interfaces.pilaEST;
import interfaces.colaDMC;

public class Main {
    public static void main(String[] args) {

        pilaEST p = new PilaEstatica();
        colaDMC c = new ColaDinamica();

        p.InicializarPila();
        c.InicializarCola();

        p.Apilar(1);
        p.Apilar(2);
        p.Apilar(3);

        desPilaAcola("pila estatica", p, c);

        while (!c.ColaVacia()) {
            System.out.println(c.Primero());
            c.Desacolar();
        }
    }

    public static void desPilaAcola(String nombre, pilaEST pila, colaDMC cola) {

        while (!pila.PilaVacia()) {
            int tope = pila.Tope();
            cola.Acolar(tope);
            pila.Desapilar();
        }
    }

}
