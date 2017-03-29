package Armadura;

import ejercito.CompositePersonaje;

public class ArmaduraElfo extends ArmaduraAbs implements CompositePersonaje{


    @Override
    public String Armadura() {
        return "imagenes/Elfica.jpg";
    }

    @Override
    public String getCaracteristicas() {
        return this.Armadura();
    }

    
}
