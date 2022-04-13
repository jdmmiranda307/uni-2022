
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 119210119
 */
public class TestaPilha {
    public static void main(String[] args){
        Pilha pilha = new Pilha();
        int max = 10;
        Random random = new Random();
        Object el = null;
        
        for (int i=0; i< max; i++){
            int num = Math.abs(random.nextInt()) % max;
            System.out.println("insere " + num);
            pilha.inserir(num);
         }
        pilha.mostrar();
        
        try {
            el = pilha.remover();
        } catch (Exception ex) {
            Logger.getLogger(TestaLista.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("remove " + el);
        pilha.mostrar();
            
    }
}
