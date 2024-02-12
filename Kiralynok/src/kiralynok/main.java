package kiralynok;

import model.Tabla;

public class main {
    
    public static void main(String[] args) {
        
        Tabla t = new Tabla('*');
        System.out.println(t.Megjelenit());
        t.Elhelyez(5);
        System.out.println(t.Megjelenit());
        
        
    }
}
