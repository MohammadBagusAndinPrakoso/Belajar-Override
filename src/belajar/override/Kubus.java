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
public class Kubus extends BangunRuang {
    float s; //s = sisi kubus
    
    @Override
    void volume(){
        float volume = s*s*s;
        System.out.println("Volume Kubus : " +volume);
    }
    
    @Override
    void luasPermukaan(){
        float lP = 6*s*s; //lP = Luas Permukaan
        System.out.println("Luas Permukaan Kubus : " +lP +"\n");
    }
}
