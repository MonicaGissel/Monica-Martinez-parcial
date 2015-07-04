

import java.util.ArrayList;
import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author T-107
 */
public class GeneradorCalificaciones {

   
public static    ArrayList<Evaluacion> generarCalificaciones(){
        ArrayList<Evaluacion> Evaluaciones =new ArrayList <Evaluacion>();

       
        Evaluacion E1= new Evaluaciones("petra,8.5");
        Evaluacion E2 = new Evaluaciones("roberta8.6");
        Evaluacion E3= new Evaluaciones("jose,7.4");
        Evaluacion.add(E1);
        Evaluacion.add(E2);
  Evaluacion.add(E3);
  
return Evaluaciones;
    }

    private static class Evaluaciones extends Evaluacion {

        public Evaluaciones(String petra) {
        }
    }
}
 


