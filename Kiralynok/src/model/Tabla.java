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
                tablazat += "" + T[i][j];
            }
            tablazat += "\n";
        }
        return tablazat;
    }

    public void Elhelyez(int N) {
        int i = 0;
        while (i < N) {
            int egyik = (int) (Math.random() * 8);
            int masik = (int) (Math.random() * 8);
            if (this.T[egyik][masik] == this.UresCella) {
                this.T[egyik][masik] = 'K';
                i++;
            }
        }
    }

    public boolean UresOszlop(int m) {
        int i = 0;
        while (i <= 7 && this.T[i][m] == this.UresCella) {
            i++;
        }
        return !(i <= 7);
    }

    public boolean UresSor(int m) {
        int i = 0;
        while (i <= 7 && this.T[m][i] == this.UresCella) {
            i++;
        }
        return !(i <= 7);
    }

    public int UresOszlopokSzama() {
        int db = 0;
        for (int i = 0; i <= 7; i++) {
            if (UresOszlop(i)) {
                db++;
            }
        }
        return db;
    }

    public int UresSorokSzama() {
        int db = 0;
        for (int i = 0; i <= 7; i++) {
            if (UresSor(i)) {
                db++;
            }
        }
        return db;
    }

    public char[][] getT() {
        return T;
    }

}
