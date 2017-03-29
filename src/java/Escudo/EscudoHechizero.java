package Escudo;

import ejercito.CompositePersonaje;

public class EscudoHechizero extends EscudoAbs implements CompositePersonaje{

    @Override
    public String Escudo() {
        return "imagenes/Magico.jpg";
        
    }

    @Override
    public String getCaracteristicas() {
    return this.Escudo();
    }
       
}
