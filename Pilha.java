/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 119210119
 */
class Pilha {
    private Celula topo;

    /**
    * Construtor da classe que cria uma pilha sem elementos.
    */
    public Pilha() {
        topo = null;
    }


    /**
    * Insere elemento na pilha (politica FILO).
    * @param x Instituicao elemento a inserir.
    */
    public void inserir(Object x) {
        Celula tmp = new Celula(x);
        tmp.prox = topo;
        topo = tmp;
        tmp = null;
    }


    /**
    * Remove elemento da pilha (politica FILO).
    * @return Elemento Instituicao removido.
    * @trhows Exception Se a sequencia nao contiver elementos.
    */
    public Object remover() throws Exception {
        if (topo == null) {
            throw new Exception("Erro ao remover!");
        }

        Object resp = topo.elemento;
        Celula tmp = topo;
        topo = topo.prox;
        tmp.prox = null;
        tmp = null;
        return resp;
    }


    /**
    * Mostra os elementos separados por espacos, comecando do topo.
    */
    public void mostrar() {
        for(Celula i = topo; i != null; i = i.prox){
            System.out.println(i.elemento);
        }
    }

    public void mostrarRec() {
        mostrarRec(topo);
    }

    public void mostrarRec(Celula i) {
        if(i != null){
            mostrarRec(i.prox);
            System.out.println(i.elemento);
        }
    }
}
