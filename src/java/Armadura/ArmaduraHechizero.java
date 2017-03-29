package Armadura;

import ejercito.CompositePersonaje;

public class ArmaduraHechizero extends ArmaduraAbs implements CompositePersonaje{

    @Override
    public String Armadura() {
        
        return "imagenes/Tunica.jpg";
        
    }

    @Override
    public String getCaracteristicas() {
    return this.Armadura();
    }

}
