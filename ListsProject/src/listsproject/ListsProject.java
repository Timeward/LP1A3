package listsproject;

import java.util.Scanner;

public class ListsProject {
    
    public static void main(String[] args) {
        
        ProductList List = new ProductList();
        
        while(true){
        
            Scanner menuOption = new Scanner(System.in);// Cria um scanner
            System.out.println("Choose an Option:");
            System.out.println("1: Add Product to List");
            System.out.println("2: Sell Product from List");
            System.out.println("3: Display Product List");
            int pick = menuOption.nextInt();//Lê o input name
        
            try{
                switch(pick){
                    case 1:
                        List.addProduct();
                        break;
                    case 2:
                        System.out.println("O número escolhido foi: 2.");
                        break;
                    case 3:
                        List.listProduct();
                        break;
                }
            }
            catch(Exception e){}                
            }
        }
    }    