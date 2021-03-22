/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptosbasicos;

import ico.fes.Automovil;
import java.awt.Color;

/**
 *
 * @author cristian Barboza
 */
public class ConceptosBasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Automovil miVocho= new Automovil();
        miVocho.setMarca("VW");
        miVocho.setSubMarca("Sedan");
        miVocho.setModelo(1970);
        miVocho.setColor(Color.RED);
        System.out.println(miVocho);
        
       Automovil miAcura=new Automovil();
       
       miAcura.setMarca("Honda");
       miAcura.setSubMarca("Acura");
       miAcura.setModelo(1990);
       miAcura.setColor(Color.BLUE);
        System.out.println(miAcura);
        
       Automovil miMustang=new Automovil();
       miMustang.setMarca("Ford");
       miMustang.setSubMarca("Fastback ");
               miMustang.setModelo(1964);
               miMustang.setColor(Color.ORANGE);
               System.out.println(miMustang);
                       
       
       
    }
    
}
