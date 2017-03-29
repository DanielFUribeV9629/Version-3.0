package Escudo;

import ejercito.CompositePersonaje;

public class EscudoHombre extends EscudoAbs implements CompositePersonaje{

    @Override
    public String Escudo() {
        return "imagenes/Adarga.jpg";
        
    }

    @Override
    public String getCaracteristicas() {
    return this.Escudo();
    }
        
}
