/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author USUARIO
 */
public class main {
    public static void main(String[] args) {
        splash splash=new splash();
        splash.setVisible(true);
        
        try {
            for(int i=0;i<=100;i++){
            Thread.sleep(40);
            splash.proceso.setValue(i);
            splash.ini.setText("Iniciando...  "+(Integer.toString(i))+" %");
            if(i==100){
            splash.setVisible(false);
            new login();
            
            }
                    }
        } catch (Exception e) {
        }
    }
    
}
