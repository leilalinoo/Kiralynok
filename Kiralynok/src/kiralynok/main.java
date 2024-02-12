package kiralynok;

import model.Tabla;

public class main {
    
    public static void main(String[] args) {
        
        Tabla t = new Tabla('*');
        //4. feladat
        System.out.println(t.Megjelenit());
        //6. feladat
        t.Elhelyez(8);
        System.out.println(t.Megjelenit());
        //7. feladat
        System.out.println(t.UresOszlop(7));
        System.out.println(t.UresSor(1));
        //8. feladat
        System.out.println(t.UresOszlopokSzama());
        System.out.println(t.UresSorokSzama());
        
    }
}
