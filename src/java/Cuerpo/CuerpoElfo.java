package Cuerpo;

import ejercito.CompositePersonaje;

public class CuerpoElfo extends CuerpoAbs implements CompositePersonaje{

    @Override
    public String Cuerpo() {
        return "imagenes/Elfo.jpg";
        
    }

    @Override
    public String getCaracteristicas() {
      return this.Cuerpo();
    }
    
}
