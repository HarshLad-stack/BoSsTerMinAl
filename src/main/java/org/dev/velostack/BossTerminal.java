package org.dev.velostack;

import java.util.Scanner;

public class BossTerminal {
    public static void main(String[] args) {
        Ansi.bannerInstant();
        String prompt="VeloStack@MATRIX-NODE:~/workspace$:~";
        Scanner scanner= new Scanner(System.in);
        while (true){
            System.out.print(prompt);
            String input=scanner.nextLine().trim();
            if(input.equalsIgnoreCase("exit"))break;
            System.out.println("You typed: " + input);

        }
        scanner.close();
        System.out.println("Boss Terminal shutting down.");System.out.println("Boss Terminal shutting down.");
    }
}
