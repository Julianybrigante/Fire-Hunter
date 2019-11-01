/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class menu_jogo {

    static int menu() {
        int escolha;
        Scanner teclado = new Scanner(System.in);
        System.out.println("1 - INICIAR");
        System.out.println("2 - INSTRUÇÕES");
        System.out.println("3 - SAIR");
        escolha = teclado.nextInt();

        return escolha;
    }

    static void iniciar() {
        Scanner teclado = new Scanner(System.in);
        Random dado = new Random();
        int p1, p2, d1, d2;
        String personagem1 = "mago", personagem2 = "cavaleiro",
                personagem3 = "ranger", personagem4 = "druida";

        do {
            d1 = dado.nextInt(6) + 1;

            d2 = dado.nextInt(6) + 1;
        } while (d1 == d2);
        System.out.println("dado p1 : " + d1 + " dado p2: " + d2);
        if (d1 > d2) {
            System.out.println("p1 escolha seu personagem:\n 1:mago\n 2: caveleiro\n 3: druida\n 4: ranger");
            p1 = teclado.nextInt();
            System.out.println("p2 escolha seu personagem:\n 1:mago\n 2: caveleiro\n 3: druida\n 4: ranger");
            p2 = teclado.nextInt();
        } else {
            System.out.println("p2 escolha seu personagem:\n 1:mago\n 2: caveleiro\n 3: druida\n 4: ranger");
            p2 = teclado.nextInt();
            System.out.println("p1 escolha seu personagem:\n 1:mago\n 2: caveleiro\n 3: druida\n 4: ranger");
            p1 = teclado.nextInt();
        }
        escolhasjogador(p1, p2);
        Batalha(p1, p2, d1, d2);
    }

    static void escolhasjogador(int p1, int p2) {
        if (p1 == 1) {
            System.out.println("mago");
        } else if (p1 == 2) {
            System.out.println("cavaleiro");
        } else if (p1 == 3) {
            System.out.println("ranger");
        } else if (p1 == 4) {
            System.out.println("druida");
        }
        System.out.println("VS");
        if (p2 == 1) {
            System.out.println("mago");
        } else if (p2 == 2) {
            System.out.println("cavaleiro");
        } else if (p2 == 3) {
            System.out.println("ranger");
        } else if (p2 == 4) {
            System.out.println("druida");
        }
    }

    static void Batalha(int p1, int p2, int d1, int d2) {
        int opcaoP1, opcaoP2, choose;
        Scanner teclado = new Scanner(System.in);
        Random dadoLuta = new Random();
        int ecolha1, escolha2;

        if (d1 > d2) {

            opcaoP1 = dadoLuta.nextInt(6) + 1;
            System.out.println("dado player 1: " + opcaoP1);
            switch (opcaoP1) {
                case 1:
                    System.out.println("1 - ataque no escudo \n ou \n 2- cura");
                    choose = teclado.nextInt();
                    break;
                case 2:
                    System.out.println("1- ataque no escudo \n ou \n 2- cura");
                    break;
                case 3:
                    System.out.println("ataque na vida");
                    break;
                case 4:
                    System.out.println("cura");
                    break;
                case 5:
                    System.out.println("1 - ataque na vida \n ou \n 2- cura");
                     choose = teclado.nextInt();
                    break;
                case 6:
                    System.out.println("1 - ataque no escudo \n ou \n 2- cura \n ou \n 3 - ataque na vida");
                     choose = teclado.nextInt();
                    break;
            }

            opcaoP2 = dadoLuta.nextInt(6) + 1;
            System.out.println("dado player 2: " + opcaoP2);
            switch (opcaoP2) {
                case 1:
                    System.out.println("1 - ataque no escudo \n ou \n 2 - cura");
                     choose = teclado.nextInt();
                    break;
                case 2:
                    System.out.println("1 - ataque no escudo \n ou \n 2 - cura");
                     choose = teclado.nextInt();
                    break;
                case 3:
                    System.out.println("ataque na vida");
                    break;
                case 4:
                    System.out.println("cura");
                    break;
                case 5:
                    System.out.println("1 - ataque na vida \n ou \n 2 - cura");
                     choose = teclado.nextInt();
                    break;
                case 6:
                    System.out.println("1 - ataque no escudo \n ou \n 2 - cura \n ou \n 3- ataque na vida");
                     choose = teclado.nextInt();
                    break;
            }
        } else {
          
            opcaoP2 = dadoLuta.nextInt(6) + 1;
            System.out.println("dado player 2: " + opcaoP2);
            switch (opcaoP2) {
                case 1:
                    System.out.println("1 - ataque no escudo \n ou \n 2 - cura");
                     choose = teclado.nextInt();
                    break;
                case 2:
                    System.out.println("1 - ataque no escudo \n ou \n 2 - cura");
                     choose = teclado.nextInt();
                    break;
                case 3:
                    System.out.println("ataque na vida");
                    break;
                case 4:
                    System.out.println("cura");
                    break;
                case 5:
                    System.out.println("1 - ataque na vida \n ou \n 2 - cura");
                     choose = teclado.nextInt();
                    break;
                case 6:
                    System.out.println("1 - ataque no escudo \n ou \n 2 - cura \n ou \n 3 - ataque na vida");
                     choose = teclado.nextInt();
                    break;
            }
            
            opcaoP1 = dadoLuta.nextInt(6) + 1;
            System.out.println("dado player 1: " + opcaoP1);
            switch (opcaoP1) {
                case 1:
                    System.out.println("1 - ataque no escudo \n ou \n 2- cura");
                     choose = teclado.nextInt();
                    break;
                case 2:
                    System.out.println("1- ataque no escudo \n ou \n 2- cura");
                     choose = teclado.nextInt();
                    break;
                case 3:
                    System.out.println("ataque na vida");
                    break;
                case 4:
                    System.out.println("cura");
                    break;
                case 5:
                    System.out.println("1 - ataque na vida \n ou \n 2- cura");
                     choose = teclado.nextInt();
                    break;
                case 6:
                    System.out.println("1 - ataque no escudo \n ou \n 2- cura \n ou \n 3 - ataque na vida");
                     choose = teclado.nextInt();
                    break;
            }
        }
    }

    static void instruções() {
        Scanner teclado = new Scanner(System.in);
        int esc;
        System.out.println("____O jogo apresentará 4 personagens______");
        System.out.println("____os dois jogadores - usuário 1 e 2 - jogarão o dado,"
                + "o jogador que tirar o maior número é o primeiro a escolher e inicia a partida____");
        System.out.println("____ambos jogadores escolhem seus personagens____");
        System.out.println("____quem tirou o número maior no dado inicia a partida____");
        System.out.println("____cada personagem inicia com 25 de escudo e 25 de vida____");
        System.out.println("____cada número do dado dará até 3 opções, dentre elas:"
                + " ataque a vida, ataque a escudo e cura____");
        System.out.println("____O personagem vencedor será o que conseguir zerar primeiro a"
                + " vida e o escudo do adversário____");
        System.out.println("____então o jogo apresentará o vencedor____");
        System.out.println("*******iniciar o jogo - 1, sair - 2*******");
        esc = teclado.nextInt();
        if (esc == 1) {
            iniciar();
        }

    }

    public static void main(String[] args) {
        int escolha = menu();

        switch (escolha) {
            case 1:
                iniciar();
                break;
            case 2:
                instruções();
                break;

        }
    }
}
