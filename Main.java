public class Main {
    public static void main(String[] args) {
        conjuntoLD c = new conjuntoLD();

        c.inicializarconjunto();
        c.agregar(1);
        c.agregar(2);
        c.agregar(1);

        System.out.println(c.pertenece(2)); // true
        c.sacar(2);
        System.out.println(c.pertenece(2)); // false
    }
}