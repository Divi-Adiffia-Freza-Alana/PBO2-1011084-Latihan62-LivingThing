/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg1011084.latihan62.livingthing;

/**
 *
*Nama  : Divi Adiffia Freza Alana
*Kelas : PBO2
*Nim   : 10118084
*Deskripsi Program : Program ini berisi program untuk menampilkan program Living thing
 */
public class PBO21011084Latihan62LivingThing {
    /**
    
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Human Human = new Human();
        Human.setNama("Rizki Adam Kurniawan");
        System.out.printf(Human.getNama()+" ");Human.walk(null);
        System.out.printf(Human.getNama()+" ");Human.breath(null);
        System.out.printf(Human.getNama()+" ");Human.eat(null);
        
        
        
        
        
    }
    
}