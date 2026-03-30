public interface conjuntoTDA {
    void inicializarconjunto();
    boolean conjuntovacio();
    void agregar(int x);
    int elegir();
    void sacar(int x);
    boolean pertenece(int x);
}