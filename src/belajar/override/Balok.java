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
public class Balok extends BangunRuang {
    float p; //p = panjang balok
    float l; //l = lebar balok
    float t; //t = tinggi balok
    
    @Override
    void volume(){
        float volume = p*l*t;
        System.out.println("Volume Kubus : " +volume);
    }
    
    @Override
    void luasPermukaan(){
        float lP = 2 * (p*l + p*t +l*t); //lP = Luas Permukaan
        System.out.println("Luas Permukaan Kubus : " +lP +"\n");
    }
}
