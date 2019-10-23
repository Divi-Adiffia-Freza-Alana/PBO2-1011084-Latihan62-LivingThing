/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg1011084.latihan62.livingthing;

/**
 *
 * @author Freza
 */
public class Human extends LivingThing {
    private String nama;

   

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = "Rizki Adam Kurniawan";
    }

    @Override
    public void eat(String nama) {
     System.out.println("Makan");    
    }

    @Override
    public void breath(String nama) {
        System.out.println("Bernafas");  
    }

    @Override
    public void walk(String nama) {
       System.out.println(" Sedang Berjalan");  
    }

    
}
