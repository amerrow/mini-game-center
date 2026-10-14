import java.util.Scanner;
public class wordle {
    
    public static String pickWord(){
        int num = (int)(Math.random()*21);
        String word = "";
        if (num == 0){
            word = "apple";
        } else if (num == 1){
            word = "beach";
        }else if (num == 2){
            word = "brain";
        }else if (num == 3){
            word = "chair";
        }else if (num == 4){
            word = "dance";
        }else if (num == 5){
            word = "earth";
        }else if (num == 6){
            word = "light";
        }else if (num == 7){
            word = "plant";
        }else if (num == 8){
            word = "water";
        }else if (num == 9){
            word = "brick";
        }else if (num == 10){
            word = "brush";
        }else if (num == 11){
            word = "clock";
        }else if (num == 12){
            word = "cloud";
        }else if (num == 13){
            word = "flame";
        }else if (num == 14){
            word = "fruit";
        }else if (num == 15){
            word = "lemon";
        }else if (num == 16){
            word = "night";
        }else if (num == 17){
            word = "prism";
        }else if (num == 18){
            word = "spark";
        }else if (num == 19){
            word = "spire";
        }else if (num == 20){
            word = "whale";
        }
        return word;
    }
    
    public static String guess(){
        System.out.println("enter a 5 letter word");
        Scanner input = new Scanner(System.in);
        String gues = input.nextLine();
        
        if (gues.length() != 5){
            return guess();
        }
        return gues;
    }
    public static void check(String gues, String word){
        String gues1 = gues.substring(0, 1);
        String gues2 = gues.substring(1, 2);
        String gues3 = gues.substring(2, 3);
        String gues4 = gues.substring(3, 4);
        String gues5 = gues.substring(4, 5);

        String word1 = word.substring(0, 1);
        String word2 = word.substring(1, 2);
        String word3 = word.substring(2, 3);
        String word4 = word.substring(3, 4);
        String word5 = word.substring(4, 5);
        
        if (gues1.equals(word1)){
            System.out.println("1 = green");
        } else if (gues1.equals(word2) || gues1.equals(word3) || gues1.equals(word4) || gues1.equals(word5)){
            System.out.println("1 = yellow");
        } else {
            System.out.println("1 = red");
        }
        if (gues2.equals(word2)){
            System.out.println("2 = green");
        } else if (gues2.equals(word1) || gues2.equals(word3) || gues2.equals(word4) || gues2.equals(word5)){
            System.out.println("2 = yellow");
        } else {
            System.out.println("2 = red");
        }
        if (gues3.equals(word3)){
            System.out.println("3 = green");
        } else if (gues3.equals(word2) || gues3.equals(word1) || gues3.equals(word4) || gues3.equals(word5)){
            System.out.println("3 = yellow");
        } else {
            System.out.println("3 = red");
        }
        if (gues4.equals(word4)){
            System.out.println("4 = green");
        } else if (gues4.equals(word2) || gues4.equals(word3) || gues4.equals(word1) || gues4.equals(word5)){
            System.out.println("4 = yellow");
        } else {
            System.out.println("4 = red");
        }
        if (gues5.equals(word5)){
            System.out.println("5 = green");
        } else if (gues5.equals(word2) || gues5.equals(word3) || gues5.equals(word4) || gues5.equals(word1)){
            System.out.println("5 = yellow");
        } else {
            System.out.println("5 = red");
        }


    }
    public static void checkGuess(String word){
        String gues = guess();
        
        if (gues.equals(word)){
            System.out.println("you win!");
            return;
        }else {
            check(gues, word);
            checkGuess(word);
        }
        
    }
    public static void playGame(){
        String word = pickWord();
        checkGuess(word);
    }
    
}