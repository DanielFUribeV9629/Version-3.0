package Escudo;

import ejercito.CompositePersonaje;

public class EscudoElfo extends EscudoAbs implements CompositePersonaje{

    @Override
    public String Escudo() {
        return "imagenes/Dorado.jpg";
        
    }

    @Override
    public String getCaracteristicas() {
       return this.Escudo();
    }
    
}
