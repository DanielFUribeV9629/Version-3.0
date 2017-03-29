package Armadura;

import ejercito.CompositePersonaje;

public class ArmaduraHombre extends ArmaduraAbs implements CompositePersonaje{

    @Override
    public String Armadura() {
        return "imagenes/Loriga.jpg";
        
    }

    @Override
    public String getCaracteristicas() {
    return this.Armadura();
    }

}
