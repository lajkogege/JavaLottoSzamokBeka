/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lottoszamok;

import java.util.Locale;
import java.util.Random;

/**
 *
 * @author LajkóGergő(SZOFT_202
 */
public class LottoSzamok {

    static Random rnd = new Random();

    public static void main(String[] args) {
        /*Deklarálás*/
        final int SZAM_DB = 90;
        boolean[] szelveny = new boolean[SZAM_DB];

        /*Inicalizálás*/
        for (int i = 0; i < 90; i++) {
            szelveny[i] = false;
        }

        /*Húzás*/
        int db = 0;
        while (db < 5) {
            int v = rnd.nextInt(90);
            if (szelveny[v] == false) {
                szelveny[v] = true;
                db++;
            }

        }

        /* eredmény megjelenítése*/
        System.out.println("A nyerő számok: ");
        for (int i = 0; i < SZAM_DB; i++) {
            if (szelveny[i] == true) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");

    }
}