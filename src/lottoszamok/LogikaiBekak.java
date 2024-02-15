/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lottoszamok;

import java.util.Scanner;

/**
 *
 * @author LajkóGergő(SZOFT_202
 */
public class LogikaiBekak {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String beka = "🐸";
        String level = "__";//levél amin a béka ülhet
        String[] jatekter = {beka, beka, beka, level};
        System.out.println("Melyikkel lépsz?");
        int lepes = sc.nextInt();
        //Megjelenités
        //játékelemek:
     
        for (int i = 0; i < jatekter.length; i++) {
            if(lepes == 1){
                System.out.println("Az elsővel nem tudsz lépni");
            }else if(lepes == 2){
                jatekter[3] = jatekter[2]; 
            }
            System.out.printf("%2s ", jatekter[i]);
        }
        System.out.println("");//sortörlés
        //választási opciók:
    }
}

