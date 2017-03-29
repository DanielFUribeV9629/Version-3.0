package Escudo;

import ejercito.CompositePersonaje;

public class EscudoEnano extends EscudoAbs implements CompositePersonaje{

    @Override
    public String Escudo() {
        return "imagenes/Rodela.jpg";
        
    }

    @Override
    public String getCaracteristicas() {
        return this.Escudo();
    }
        
}
