package Cuerpo;

import ejercito.CompositePersonaje;

public class CuerpoHechizero extends CuerpoAbs implements CompositePersonaje{

    @Override
    public String Cuerpo() {
        return "imagenes/Hechizero.jpg";
        
    }

    @Override
    public String getCaracteristicas() {
    return this.Cuerpo();
    }
       
}
