package Modelo;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * Created by Andrés Ramos Seguí.
 */
public class Datos {
    private final PriorityQueue<Nodo> heap_nodos;
    private final ArrayList<Simbolo> tabla_simbolos_frecuencias;
    private final byte[] caracteresExcluidos = System.getProperty("line.separator").getBytes();




    public Datos() {
        tabla_simbolos_frecuencias = new ArrayList<>();
        heap_nodos = new PriorityQueue<>();

    }

    public void addSimbolo(int simbolo){
        for (byte b : caracteresExcluidos) {
            if (simbolo == b){
                return;
            }
        }
        int pos = tabla_simbolos_frecuencias.indexOf(new Simbolo(simbolo));
        if (pos != -1){
            tabla_simbolos_frecuencias.get(pos).addUnoMas();

        } else {
            tabla_simbolos_frecuencias.add(new Simbolo(simbolo));
        }
    }

    public void showFrecuencias(){
        for (Simbolo b : tabla_simbolos_frecuencias) {
            System.out.println(b.toString());
        }
    }
}
