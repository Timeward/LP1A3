package listsproject;

import java.util.Scanner;

public class ListsProject {
    
    public static void main(String[] args) {
        System.out.println("Choose an Option:");
        System.out.println("1: Add Product to List");
        System.out.println("2: Sell Product from List");
        System.out.println("3: Display Product List");
        Scanner menuOption = new Scanner(System.in);// Cria um scanner
        int pick = menuOption.nextInt();//Lê o input name
        
        //try{
            switch(pick){
                case 1:
                    System.out.println("O número escolhido foi: 1.");
                case 2:
                    System.out.println("O número escolhido foi: 2.");
                case 3:
                    System.out.println("O número escolhido foi: 3");
          //  }
        }
        //catch(Exception e){}
    }
}