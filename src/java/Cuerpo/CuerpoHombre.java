package Cuerpo;

import ejercito.CompositePersonaje;

public class CuerpoHombre extends CuerpoAbs implements CompositePersonaje{

    @Override
    public String Cuerpo() {
        return "imagenes/Hombre.jpg";
    }

    @Override
    public String getCaracteristicas() {
    return this.Cuerpo();
    }
      
}
