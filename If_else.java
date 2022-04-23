/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.if_else;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class If_else {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama : ");
        String name = input.nextLine();
        
        if(!name.trim().equals("")){
            System.out.println("Nama : "+name);
        } else {
            System.out.println("Nama Harus Diisi");
    }
}}
