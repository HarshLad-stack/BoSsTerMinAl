package org.dev.velostack;

public class Ansi {
    private static  final String  asciiBanner= """
            ██╗   ██╗███████╗██╗      ██████╗ ███████╗████████╗ █████╗  ██████╗██╗  ██╗    ██████╗  ██████╗ ███████╗███████╗    ████████╗███████╗██████╗ ███╗   ███╗██╗███╗   ██╗ █████╗ ██╗        \s
            ██║   ██║██╔════╝██║     ██╔═══██╗██╔════╝╚══██╔══╝██╔══██╗██╔════╝██║ ██╔╝    ██╔══██╗██╔═══██╗██╔════╝██╔════╝    ╚══██╔══╝██╔════╝██╔══██╗████╗ ████║██║████╗  ██║██╔══██╗██║        \s
            ██║   ██║█████╗  ██║     ██║   ██║███████╗   ██║   ███████║██║     █████╔╝     ██████╔╝██║   ██║███████╗███████╗       ██║   █████╗  ██████╔╝██╔████╔██║██║██╔██╗ ██║███████║██║        \s
            ╚██╗ ██╔╝██╔══╝  ██║     ██║   ██║╚════██║   ██║   ██╔══██║██║     ██╔═██╗     ██╔══██╗██║   ██║╚════██║╚════██║       ██║   ██╔══╝  ██╔══██╗██║╚██╔╝██║██║██║╚██╗██║██╔══██║██║        \s
             ╚████╔╝ ███████╗███████╗╚██████╔╝███████║   ██║   ██║  ██║╚██████╗██║  ██╗    ██████╔╝╚██████╔╝███████║███████║       ██║   ███████╗██║  ██║██║ ╚═╝ ██║██║██║ ╚████║██║  ██║███████╗   \s
              ╚═══╝  ╚══════╝╚══════╝ ╚═════╝ ╚══════╝   ╚═╝   ╚═╝  ╚═╝ ╚═════╝╚═╝  ╚═╝    ╚═════╝  ╚═════╝ ╚══════╝╚══════╝       ╚═╝   ╚══════╝╚═╝  ╚═╝╚═╝     ╚═╝╚═╝╚═╝  ╚═══╝╚═╝  ╚═╝╚══════╝   \s
            """;
    public static  void  bannerInstant(){
        System.out.println("\u001B[36m" + asciiBanner + "\u001B[0m");
    }
    public static void bannerAnimated(){
        for(String line: asciiBanner.split("\n")){
            System.out.println("\u001B[36m" + line + "\u001B[0m");
            try{
                Thread.sleep(50);

            }catch (Exception e){
                Thread.currentThread().interrupt();
            }
        }
    }
    public static String prompt(String cwdName){
        return "\u001B[36m[Velostack@BossTerminal " + cwdName + "]$ \u001B[0m";

    }
    public static String info(String msg) { return "\u001B[32m" + msg + "\u001B[0m"; }   // green
    public static String warn(String msg) { return "\u001B[33m" + msg + "\u001B[0m"; }   // yellow
    public static String error(String msg) { return "\u001B[31m" + msg + "\u001B[0m"; }
}
