/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.override;

/**
 *
 * @author MOKLET1
 */
public class Tabung extends BangunRuang {
    float r; //p = panjang balok
    float t; //t = tinggi balok
    
    @Override
    void volume(){
        float volume = (float) (Math.PI*r*r*t);
        System.out.println("Volume Tabung : " +volume);
    }
    
    @Override
    void luasPermukaan(){
        float lP = (float) (2 * Math.PI * r * (r + t)); //lP = Luas Permukaan
        System.out.println("Luas Permukaan Tabung : " +lP);
    }
    
    void luasSelimut(){
        float d = r*2;
        float lS1 = (float) (Math.PI * d * t);
        double lS2 = (double) (Math.PI * 2 * r * t);
        System.out.println("Luas Selimut Tabung : " +lS1);
        System.out.println("Luas Selimut Tabung : " +lS2 +"\n");
    }
}
