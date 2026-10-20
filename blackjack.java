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
     private int play3 = cards();
     private int play4 = cards();
     private int play5 = cards();


     public void deal(){
        
          System.out.println("you have " + play1 + " and " + play2);
        System.out.println("the dealer is showing " + bot1);
    }
    public void hit(){
        Scanner input = new Scanner(System.in);
        System.out.println("1 = hit\n2 = stand");
        int hit = input.nextInt();
        int total = play1 + play2 + play3;
        if (hit == 1){
            System.out.println("you got " + play3);
            System.out.println("total: " + total);
        } else if (hit == 2){
            return;
        } else {
            hit();
        }
        
    }
}


    