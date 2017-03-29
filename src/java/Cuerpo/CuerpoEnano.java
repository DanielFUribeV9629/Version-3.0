package Cuerpo;

import ejercito.CompositePersonaje;

public class CuerpoEnano extends CuerpoAbs implements CompositePersonaje{

    @Override
    public String Cuerpo() {
        return "imagenes/Enano.png";
        
    }

    @Override
    public String getCaracteristicas() {
       return this.Cuerpo();
    }
       
}
