/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package programaidade.programaidade;

import java.util.Scanner;

/**
 *
 * @author Jefferson
 */
public class ProgramaIdade {
    /* Condição Composta */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Em que ano você nasceu ? ");
        int nasc = t.nextInt();
        int i = 2023 - nasc;
        if (i >= 18) {
            System.out.println("Maior de Idade");
        } else {
            System.out.println("Menor de idade ");
        }
        /*
         * Se a idade for maior ou igual a 18 aparecerá maior de idade se não
         * aparecerá menor de idade
         */

    }

}
