




public interface colaprioridad  {
    void inicializarcola();
    // la cola esta inicializada
    void acolarprioridad(int x, int prioridad);
    // la cola esta inicializada y no vacia
    void desacolar();
    // cola inicializada
    boolean colavacia();
    // la cola esta inicializada y no vacia
    int primero();
    int prioridad();
}

public void pasarcola(cola origen, cola destino)
{
    while (!origen.colavacia()) {
        destino.acolarprioridad(origen.primero());
        origen.desacolar();
    }
}