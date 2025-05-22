package com.campusdual.classroom;

import java.util.concurrent.ThreadLocalRandom;

public class Exercise10 {

    //TODO ↓
    // Imprimir el color de las pelotas que salgan, hasta que salgan 2 de color azul
    // El mensaje a imprimir es → La bola es de color: COLOR_BOLA
    // COLOR_BOLA puede ser → rojo, azul, verde
    public static void main(String[] args) {
        int blueCount = 0;  // contador de bolas azules
        String ball;

        // Repetir mientras no salgan 2 bolas azules
        do {
            ball = getBall();
            System.out.println(ball);
            if (ball.toLowerCase().equals("azul")) {
                blueCount++;
            }
        } while (blueCount < 2);
    }

    //TODO ↓
    // Un método que devuelva una cadena de texto con el color de una pelota (en minúscula). Dicho color se escogerá de
    // manera aleatoria. Se empleará el método randomWithRange(int min, int max) para escoger un número aleatorio, que
    // lo asociaremos al valor de un color de la siguiente manera:
    // 1 → rojo
    // 2 → azul
    // 3 → verde
    public static String getBall() {
        // Generar número aleatorio del 1 al 3
        int number = randomWithRange(1, 3);
        String color;

        // Asociar número a color
        switch (number) {
            case 1:
                return "rojo";
            case 2:
                return "verde";
            case 3:
                return "azul";
            default:
                return null;
        }

    }

    public static int randomWithRange(int min, int max) {
        return (int)(Math.random() * (max - min + 1)) + min;
    }
}