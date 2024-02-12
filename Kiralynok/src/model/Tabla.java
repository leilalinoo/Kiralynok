package model;

public class Tabla {
    private char[][] T = new char[8][8];
    private char UresCella;
    
    public Tabla(char c) {
        this.UresCella = c;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                this.T[i][j] = this.UresCella;
            }
        }
    }
    
     public String Megjelenit() {
        String tablazat = "";
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tablazat += ""+T[i][j];
            }
            tablazat +="\n";
        }
        return tablazat;
    }
     
    public char[][] getT(){
        return T;
    }
    
    
}
