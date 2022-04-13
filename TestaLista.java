
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
public class TestaLista {
    public static void main(String[] args){
        Lista lista = new Lista();
        int max = 10;
        Random random = new Random();
        
        for (int i=0; i< max; i++){
            int num = Math.abs(random.nextInt()) % max;
            lista.inserirInicio(num);
         }
        lista.mostrar();
            
    }
}

