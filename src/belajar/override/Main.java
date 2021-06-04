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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BangunRuang a = new BangunRuang();
        a.volume();
        a.luasPermukaan();
        
        Kubus kubus = new Kubus();
        kubus.s = 5;
        kubus.volume();
        kubus.luasPermukaan();
        
        Balok balok = new Balok();
        balok.p = 10;
        balok.l = 8;
        balok.t = 5;
        balok.volume();
        balok.luasPermukaan();
        
        Tabung tabung = new Tabung();
        tabung.r = 14;
        tabung.t = 10;
        tabung.volume();
        tabung.luasPermukaan();
        tabung.luasSelimut();
    }
    
}
