import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        menu(); 
    }
    public static void menu(){
        Scanner input = new Scanner(System.in);
        System.out.println("games:\n1 = wordle\n2 = black jack\n3 = quit");
        int game = input.nextInt();
        if (game == 1){
            wordle.gameTime();
        } else if (game == 2){
            System.out.println("black jack");
        } else if (game == 3){
           return;
        } else {
            System.out.println("enter a valid number");
            menu();
        }
        }
}