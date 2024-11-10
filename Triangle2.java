/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Triangle2 {

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {

            for (int j = 0; j < 5-i; j++) {
                System.out.print(" ");
            }
            for(int k=0;k<i;k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}