import java.util.Scanner;
public class blackjack {
    public static int cards(){
        int ran = (int)(Math.random()*13);
        int card = 0;
    
        if (ran == 0){
            card = 11;
        } else if (ran == 1){
             card = 2;
        }else if (ran == 2){
             card = 3;
        }else if (ran == 3){
             card = 4;
        }else if (ran == 4){
             card = 5;
        }else if (ran == 5){
             card = 6;
        }else if (ran == 6){
             card = 7;
        }else if (ran == 7){
             card = 8;
        }else if (ran == 8){
             card = 9;
        }else if (ran == 9){
             card = 10;
        }else if (ran == 10){
             card = 10;
        }else if (ran == 11){
             card = 10;
        }else if (ran == 12){
             card = 10;
        }

        return card;
    }
     private int bot1 = cards();
     private int bot2 = cards();
     private int play1 = cards();
     private int play2 = cards();
     private int play3 = 0;
     private int play4 = 0;
     private int play5 = 0;
     private int total = play1 + play2 + play3 + play4 + play5;


     public void deal(){
        System.out.println("you have " + play1 + " and " + play2);
        System.out.println("the dealer is showing " + bot1);
     }

     public void check(){
          if (total > 21){
               System.out.println("you busted");
               return;
          }
     }

    public void hit(){
        Scanner input = new Scanner(System.in);
        System.out.println("1 = hit\n2 = stand");
        int hit = input.nextInt();
        int loops = 0;

        if (hit == 1){
            if (loops == 0){
               play3 = cards();
               System.out.println("you got " + play3);
               check();
               System.out.println("total: " + total);
            loops++;
            } else if (loops == 1){
               play4 = cards();
               System.out.println("you got " + play4);
               check();
               System.out.println("total: " + total);
               loops++;
            } else if (loops == 2){
               play5 = cards();
               System.out.println("you got " + play5);
               check();
               System.out.println("total: " + total);
               loops++;
            } else {
               return;
            }
            hit();
        } else if (hit == 2){
            return;
        } else {
            hit();
        }
     }

     
     public void gamin(){
          deal();
          hit();
    }
}


    