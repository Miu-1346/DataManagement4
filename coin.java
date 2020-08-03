import jeliot.io.*;
import java.io.PrintStream;

public class coin {
    public static void main() {
       int round =1;
       int heads =0;
       int tails =0;
       
       for(; round<4;){
       double coin = Math.floor(Math.random()*2)+1;
       
           if(coin== 1){
              System.out.println("Round"+round+":"+"Heads");
              round++;
              heads++;
           }
           if(coin== 2){
              System.out.println("Round"+round+":"+"Tails");
              round++;
              tails++;
           }
       }
       System.out.println("Heads:"+heads+" "+"Tails:"+tails);

    }
}
