/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pert2.pkg10118046.latihan30.cakep;

import java.util.Scanner;

/**
 *
 * @author
 *  Nama              : M. Hilmy Naufal
 *  Kelas             : IF2
 *  NIM               : 10118046
 *  Deskripsi Program : cakep sangad boss
 */
public class PBO2PERT210118046Latihan30Cakep {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_BRIGHT_BLUE   = "\u001B[94m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    /**
     * @param args the command line arguments
     */
    
    public static void cakepBener(){
        System.out.println(ANSI_RED + "Cakep Bener." + ANSI_PURPLE + "Good Job");
    }
    
    public static void tetepCakep(){
        System.out.println(ANSI_RED + "Tetep cakep sih.\n" + ANSI_CYAN + "Sing penting paham konsep nya yee.\n" + ANSI_RESET + "Keep the code works dude");    
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(ANSI_RED + "Kamu " + ANSI_GREEN + "ngerjain sendiri " + ANSI_YELLOW + "latihan 17 sampe " + ANSI_BLUE + "latihan 30 ini?");
        System.out.print(ANSI_BLUE + "Jawab " + ANSI_RED + "(Yoi/Enggak) : ");
        Scanner scanner = new Scanner(System.in);
        String pilih = scanner.next();
        pilih = pilih.toUpperCase();
        if (pilih.equals("YA")) cakepBener();
        else if (pilih.equals("ENGGAK")) tetepCakep();
        System.out.println("Developed by: M. Hilmy Naufal");
    }

}
