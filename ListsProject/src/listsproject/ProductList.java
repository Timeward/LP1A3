package listsproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductList{
    public List<Product> productList = new ArrayList();
    
    public void addProduct(){
        System.out.println("Insert Product Name:");
        Scanner productInput = new Scanner(System.in);// Cria um scanner
        String productName = productInput.nextLine();//Lê o input name
        System.out.println("Insert Product Value:");
        double productPrice = productInput.nextDouble();// lê o input Price
        productList.add(new Product(productName, productPrice));//Instancia novo produto
    }
    public void listProduct(){
        for(int i = 0; i < productList.size(); i++){
            System.out.println(productList.get(i).getName()); //print name of position in list
            System.out.println(productList.get(i).getPrice()); //print price of position in list
            
        }
    }
}