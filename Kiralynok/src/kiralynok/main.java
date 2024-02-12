package kiralynok;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import model.Tabla;

public class main {
    
    private static final String SEP = System.lineSeparator();
    
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
        
        
        String fajlnev = "tablak64.txt";
 
    }
    
}
