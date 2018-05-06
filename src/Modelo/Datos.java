package Modelo;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * Created by Andrés Ramos Seguí.
 */
public class Datos {
    private final PriorityQueue<Nodo> heap_nodos;
    private final ArrayList<Simbolo> tabla_simbolos_frecuencias;




    public Datos() {
        tabla_simbolos_frecuencias = new ArrayList<>();
        heap_nodos = new PriorityQueue<>();
    }
}
