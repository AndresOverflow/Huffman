package datos;

/**
 * Created by Andrés Ramos Seguí.
 */
public class Simbolo {
    int valor_ascii;
    int frequencia;

    public Simbolo(int valor_ascii, int frequencia) {
        this.valor_ascii = valor_ascii;
        this.frequencia = frequencia;
    }

    public int getValor_ascii() {
        return valor_ascii;
    }

    public void setValor_ascii(int valor_ascii) {
        this.valor_ascii = valor_ascii;
    }

    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        this.frequencia = frequencia;
    }
}
