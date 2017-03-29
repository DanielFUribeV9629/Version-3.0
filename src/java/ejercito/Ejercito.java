package ejercito;

import Armadura.ArmaduraAbs;
import Armas.ArmasAbs;
import Cuerpo.CuerpoAbs;
import Escudo.EscudoAbs;

public abstract class Ejercito implements Cloneable{
    
    //    -----------PROTOTYPE----------------------------
    
//    public void Hola(){
//        System.out.println("hola que hace");
//    }
    
    
    
    
    
    
    
    

//    -----------BUILDER----------------------------
    protected  PersonajeConcreto personaje;
    
    public PersonajeConcreto getPersonaje(){
        return personaje;
    }
        
    public void CrearPersonaje (){
        personaje = new PersonajeConcreto();
    }    
//    ------------------------------------------------
    public abstract CuerpoAbs darCuerpo();
          
    public abstract ArmasAbs darArma();
    
    public abstract EscudoAbs darEscudo();
    
    public abstract ArmaduraAbs darArmadura();
    
    public abstract Ejercito clonar();


}
