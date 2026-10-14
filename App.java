import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        menu(); 
    }
    public static void menu(){
        Scanner input = new Scanner(System.in);
        System.out.println("games:\n1 = wordle\n2 = black jack");
        int game = input.nextInt();
        if (game == 1){
            wordle.playGame();
        } else if (game == 2){
            System.out.println("black Jack");
        } else {
            System.out.println("please enter a valid number");
            menu();
        }
        }
}