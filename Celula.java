public class Celula {
    public Object elemento; // Elemento inserido na celula.
    public Celula prox; // Aponta a celula prox.


    /**
     * Construtor da classe.
     */
    public Celula() {
        this(null);
    }

    /**
     * Construtor da classe.
     * @param elemento int inserido na celula.
     */
    public Celula(Object elemento) {
        this.elemento = elemento;
        this.prox = null;
    }
}
