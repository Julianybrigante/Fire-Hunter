
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author blackNite
 */
public class test {
        static int dado() {
        int a;
        a = new Random().nextInt(6) + 1; //Gera a classe ate o numero 5.
        return a;
        }
        /*static int funocaodado (int a){
        switch(a){
            
        }
        return
        */
    public static void main(String[] args) {
            int dado,acao,opcao;
            dado = dado();
            System.out.println(dado);
            switch(dado){
                case 1:
                    System.out.println("Escolha entre: ataque no escudo ou ataque na vida");
                    break;
                case 2:
                    System.out.println("Escolha entre: ataque no escudo ou cura");
                    break;
                case 3:
                    System.out.println("ataque na vida");
                    break;
                case 4:
                    System.out.println("cura na vida");
                    break;
                case 5:
                    System.out.println("ataque na vida ou cura");
                    break;
                case 6:
                    System.out.println("ataque no escudo ou ataque na vida ou cura");
                    break;
            }
            System.out.println("fim do menu");
    }
}
