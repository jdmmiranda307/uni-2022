/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 119210119
 */
class Lista {
    private Celula primeiro;
    private Celula ultimo;


    /**
     * Construtor da classe que cria uma lista sem elementos (somente no cabeca).
     */
    public Lista() {
        primeiro = new Celula();
        ultimo = primeiro;
    }


    /**
     * Insere um elemento na primeira posicao da lista.
     * @param x Object elemento a ser inserido.
     */
    public void inserirInicio(Object x) {
        Celula tmp = new Celula(x);
        tmp.prox = primeiro.prox;
        primeiro.prox = tmp;
        if (primeiro == ultimo) {
            ultimo = tmp;
        }
        tmp = null;
    }


    /**
     * Insere um elemento na ultima posicao da lista.
     * @param x Object elemento a ser inserido.
     */
    public void inserirFim(Object x) {
        ultimo.prox = new Celula(x);
        ultimo = ultimo.prox;
    }


    /**
     * Remove um elemento da primeira posicao da lista.
     * @return resp Object elemento a ser removido.
     * @throws Exception Se a lista nao contiver elementos.
     */
    public Object removerInicio() throws Exception {
        if (primeiro == ultimo) {
            throw new Exception("Erro ao remover (vazia)!");
        }

        Celula tmp = primeiro;
        primeiro = primeiro.prox;
        Object resp = primeiro.elemento;
        tmp.prox = null;
        tmp = null;
        return resp;
    }


    /**
     * Remove um elemento da ultima posicao da lista.
     * @return resp Object elemento a ser removido.
     * @throws Exception Se a lista nao contiver elementos.
     */
    public Object removerFim() throws Exception {
        if (primeiro == ultimo) {
            throw new Exception("Erro ao remover (vazia)!");
        }

        // Caminhar ate a penultima celula:
        Celula i;
        for(i = primeiro; i.prox != ultimo; i = i.prox);

        Object resp = ultimo.elemento;
        ultimo = i;
        i = ultimo.prox = null;

        return resp;
    }


    /**
     * Insere um elemento em uma posicao especifica considerando que o
     * primeiro elemento valido esta na posicao 0.
     * @param x Object elemento a ser inserido.
     * @param pos int posicao da insercao.
     * @throws Exception Se <code>posicao</code> invalida.
     */
    public void inserir(Object x, int pos) throws Exception {

        int tamanho = tamanho();

        if(pos < 0 || pos > tamanho){
            throw new Exception("Erro ao inserir posicao (" + pos + " / tamanho = " + tamanho + ") invalida!");
        } else if (pos == 0){
            inserirInicio(x);
        } else if (pos == tamanho){
            inserirFim(x);
        } else {
            // Caminhar ate a posicao anterior a insercao
            Celula i = primeiro;
            for(int j = 0; j < pos; j++, i = i.prox);

            Celula tmp = new Celula(x);
            tmp.prox = i.prox;
            i.prox = tmp;
            tmp = i = null;
        }
    }


    /**
     * Remove um elemento de uma posicao especifica da lista
     * considerando que o primeiro elemento valido esta na posicao 0.
     * @param posicao Meio da remocao.
     * @return resp Object elemento a ser removido.
     * @throws Exception Se <code>posicao</code> invalida.
     */
    public Object remover(int pos) throws Exception {
        Object resp;
        int tamanho = tamanho();

        if (primeiro == ultimo){
            throw new Exception("Erro ao remover (vazia)!");
        } else if(pos < 0 || pos >= tamanho){
            throw new Exception("Erro ao remover (posicao " + pos + " / " + tamanho + " invalida!");
        } else if (pos == 0){
            resp = removerInicio();
        } else if (pos == tamanho - 1){
            resp = removerFim();
        } else {
            // Caminhar ate a posicao anterior a insercao
            Celula i = primeiro;
            for(int j = 0; j < pos; j++, i = i.prox);

            Celula tmp = i.prox;
            resp = tmp.elemento;
            i.prox = tmp.prox;
            tmp.prox = null;
            i = tmp = null;
        }

        return resp;
    }
   /**
     * Remove um elemento de uma posicao especifica da lista
     * considerando que o primeiro elemento valido esta na posicao 0.
     * @param posicao Meio da remocao.
     * @return resp Object elemento a ser removido.
     * @throws Exception Se <code>posicao</code> invalida.
     */
    public Object removerObject(Object x) throws Exception {
        if ((primeiro == ultimo) || (x == null)) {
            throw new Exception("Lista vazia ou chave invalida!");
        }
        Celula aux = primeiro;
        while (aux.prox != null && aux.prox.elemento.equals(x)){
            aux = aux.prox;
        }
        if (aux.prox == null) {
           return null;
        }
        Celula celulaTmp = aux.prox;
        Object item = celulaTmp.elemento;
        if (aux.prox == null){
            this.ultimo = aux;
        }
        return item;
    }
  
    /**
     * Mostra os elementos da lista separados por espacos.
     */
    public void mostrar() {
        for (Celula i = primeiro.prox; i != null; i = i.prox) {
            System.out.println(i.elemento);
        }
    }

    /**
     * Procura um elemento e retorna se ele existe.
     * @param x Elemento a pesquisar.
     * @return <code>true</code> se o elemento existir,
     * <code>false</code> em caso contrario.
     */
    public boolean pesquisar(Object x) {
        boolean resp = false;
        for (Celula i = primeiro.prox; i != null; i = i.prox) {
            if(i.elemento == x){
                resp = true;
                i = ultimo;
            }
        }
        return resp;
    }

    /**
     * Calcula e retorna o tamanho, em numero de elementos, da lista.
     * @return resp int tamanho
     */
    public int tamanho() {
        int tamanho = 0;
        for(Celula i = primeiro; i != ultimo; i = i.prox, tamanho++);
        return tamanho;
    }
}