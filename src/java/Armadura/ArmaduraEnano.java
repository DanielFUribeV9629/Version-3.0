package Armadura;

import ejercito.CompositePersonaje;

public class ArmaduraEnano extends ArmaduraAbs implements CompositePersonaje{

    @Override
    public String Armadura() {
        return "imagenes/Discos.jpg";
        
    }

    @Override
    public String getCaracteristicas() {
        return this.Armadura();
    }

}
