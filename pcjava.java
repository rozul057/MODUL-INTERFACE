/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

public class pc extends komputer implements mouse, keyboard, printer{
    
    @Override
    void hidupkan_os(){
        System.out.println("Hidupakan PC");
    }
    @Override
    void matikan_os(){
        System.out.println("Matikan Os");
    }
    @Override
    public void klik_kanan(){
        System.out.println("Klik Kanan");
    }
    @Override
    public void klik_kiri(){
        System.out.println("Klik Kiri");
    }
    @Override
    public void tekan_enter(){
        System.out.println("Tekan Enter");
    }
    @Override
    public void cetak_data(){
        System.out.println("Cetak Data");
    }    
}
