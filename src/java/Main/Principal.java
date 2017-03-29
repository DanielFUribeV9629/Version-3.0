package Main;

import Personaje.Personaje;
import Singleton.Singleton;
import ejercito.Director;
import ejercito.Ejercito;
import ejercito.PersonajeConcreto;

public class Principal {

    public static void main(String[] args) {
        
//        -----------BUILDER----------------------------------
        
        Director director = new Director();
         director.ConstruirPersonaje();
        //    -----------PROTOTYPE----------------------------
        
       
       
        
        
        Ejercito e = Personaje.getEjercito("ho"); //Switch para caso 1 ho, case 2 = en case 3 = el, case 4 = he
        Singleton w = new Singleton();
        w.blabla();
    

    }

}
