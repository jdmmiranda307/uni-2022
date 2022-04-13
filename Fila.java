/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 119210119
 */
class Fila {
    private Celula primeiro;
    private Celula ultimo;


    /**
    * Construtor da classe que cria uma fila sem elementos (somente no cabeca).
    */
    public Fila() {
        primeiro = new Celula();
        ultimo = primeiro;
    }


    /**
    * Insere elemento na fila (politica FIFO).
    * @param x Instituicao elemento a inserir.
    */
    public void inserir(Object x) throws Exception {
        ultimo.prox = new Celula(x);
        ultimo = ultimo.prox;
    }


    /**
    * Remove elemento da fila (politica FIFO).
    * @return Elemento Instituicao removido.
    * @trhows Exception Se a fila nao tiver elementos.
    */
    public Object remover() throws Exception {
        if (primeiro == ultimo) {
            throw new Exception("Erro ao remover!");
        }
        Celula tmp = primeiro;
        primeiro = primeiro.prox;
        Object resp = primeiro.elemento;
        tmp.prox = null;
        tmp = null;
        return resp;
    }

    public void mostrar(){
        for(Celula i = primeiro.prox; i != null; i = i.prox) {
            System.out.println(i.elemento);
        }
    }
}
