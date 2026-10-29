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
     private int play6 = 0;
     private int play7 = 0;
     private int total = play1 + play2;
     private int loops = 0;


     public void deal(){
        System.out.println("you have " + play1 + " and " + play2);
        System.out.println("total: " + total);
        System.out.println("the dealer is showing " + bot1);
     }

     public boolean check(){
          if (total > 21){
               System.out.println("you busted");
               return true;
          }
          return false;
     }

    public boolean hit(){
        Scanner input = new Scanner(System.in);
        System.out.println("1 = hit\n2 = stand");
        int hit = input.nextInt();

        if (hit == 1){
          if (loops == 0){
               play3 = cards();
               System.out.println("you got " + play3);
               total = play1 + play2 + play3;
               System.out.println("total: " + total);
               if (check() == true){
                    return true;
               }
               loops++;
          } else if (loops == 1){
               play4 = cards();
               System.out.println("you got " + play4);
               total = play1 + play2 + play3 + play4;
               System.out.println("total: " + total);
               if (check() == true){
                    return true;
               }
               loops++;
          } else if (loops == 2){
               play5 = cards();
               System.out.println("you got " + play5);
               total = play1 + play2 + play3 + play4 + play5;
               System.out.println("total: " + total);
               if (check() == true){
                    return true;
               }
               loops++;
          } else if (loops == 3){
               play6 = cards();
               System.out.println("you got " + play6);
               total = play1 + play2 + play3 + play4 + play5 + play6;
               System.out.println("total: " + total);
               if (check() == true){
                    return true;
               }
               loops++;
          } else if (loops == 4){
               play7 = cards();
               System.out.println("you got " + play7);
               total = play1 + play2 + play3 + play4 + play5 + play6 + play7;
               System.out.println("total: " + total);
               if (check() == true){
                    return true;
               }
               loops++;
          } else {
               return false;
               }
               hit();
          } else if (hit == 2){
               return false;
          } else {
               System.out.println("enter a valid number");
               hit();
          }
        return false;
     }

     private int bot3 = 0;
     private int bot4 = 0;
     private int bot5 = 0;
     private int botTotal = bot1 + bot2;
     private int botLoop = 0;

     public boolean smallCheck(){
          if (botTotal >= total){
               return true;
          } else {
               return false;
          }
     }


     public void botCheck(){
          if (smallCheck() == true){
               
          }else {
               if (botTotal <= 21){
                    if (botLoop == 0){
                         bot3 = cards();
                         System.out.println("dealer got " + bot3);
                         botTotal = bot1 + bot2 + bot3;
                         System.out.println("dealer total: " + botTotal);
                         botLoop++;
                         botCheck();
                    } else if (botLoop == 1){
                         bot4 = cards();
                         System.out.println("dealer got " + bot4);
                         botTotal = bot1 + bot2 + bot3 + bot4;
                         System.out.println("dealer total: " + botTotal);
                         botLoop++;
                         botCheck();
                    } else if (botLoop == 2){
                         bot5 = cards();
                         System.out.println("dealer got " + bot5);
                         botTotal = bot1 + bot2 + bot3 + bot4 + bot5;
                         System.out.println("dealer total: " + botTotal);
                         botLoop++;
                         botCheck();
                    } 
               } 
          }
     }

     public void gameCheck(){
          if (total > botTotal){
               System.out.println("you win");
          } else{
               System.out.println("you lose");
          }
     }
     
     public void gamin(){
          play1 = cards();
          play2 = cards();
          play3 = 0;
          play4 = 0;
          play5 = 0;
          play6 = 0;
          play7 = 0;
          bot1 = cards();
          bot2 = cards();
          bot3 = 0;
          bot4 = 0;
          bot5 = 0;
          loops = 0;
          botLoop = 0;
          total = play1 + play2;
          botTotal = bot1 + bot2;
          deal();
          hit();
          if (check() == true){
               gaminTime();
          } else {
               System.out.println("dealer has " + bot1 + " and "+ bot2);
               System.out.println("dealer total: " + botTotal);
               if (botTotal >= 21){
                    gameCheck();
               } else{
                    botCheck();
                    if (botTotal >= 21){
                         System.out.println("you win");
                    }else {
                         gameCheck();
                    }
               }
          }
          System.out.println("play again?\n1 = yes\n2 = no");
          Scanner input = new Scanner(System.in);
          int again = input.nextInt();
        
          if (again == 1){
              gamin();
          } else if (again == 2){
             App.menu();
          } else {
               System.out.println("enter a valid number");
               gaminTime();
          }
     }

    public void gaminTime(){
          System.out.println("play again?\n1 = yes\n2 = no");
          Scanner input = new Scanner(System.in);
          int again = input.nextInt();
        
          if (again == 1){
               gamin();
          } else if (again == 2){
               App.menu();
          } else {
               System.out.println("enter a valid number");
               gaminTime();
          }
     }
}


   