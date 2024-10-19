/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author hekimcanaktas
 */
public class Main {
    public static void main(String[] args) {
        int sayi1,sayi2,sayi3;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz: ");
        sayi1 = scanner.nextInt();
 
        System.out.println("İkinci sayıyı giriniz: ");
                sayi2 = scanner.nextInt();
                
         System.out.println("Üçüncü sayıyı giriniz: ");
        sayi3 = scanner.nextInt();
        
        if(sayi1<sayi2 && sayi1<sayi3){
            if(sayi2<sayi3){
                System.out.println("Sıralama :sayi1<sayi2<sayi3");
            }
            else{
                System.out.println("Sıralama :sayi1<sayi3<sayi2");
            }
        }
        else if(sayi2<sayi1 && sayi2<sayi3){
            if(sayi1<sayi3){
                System.out.println("Sıralama : sayi2<sayi1<sayi3");
            }
            else{
                 System.out.println("Sıralama : sayi2<sayi3<sayi1");
               
            }
        }
        
        else{
            if(sayi2<sayi1){
                System.out.println("Sıralama: sayi3<sayi2<sayi1");
            }
            
            else{
                System.out.println("Sıralama : sayi3<sayi1<sayi2");
            }
        }

        
    }
  
}
