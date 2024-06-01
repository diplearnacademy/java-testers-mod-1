package com.ingjuanfg.abstracta;

//Mismo comentario de la clase PruebaFuncional. Aplica el mismo concepto.
public class PruebaNoFuncional extends Prueba{

    public PruebaNoFuncional(int id, String titulo) {
        super(id, titulo);
    }

    @Override
    public String obtenerResultado() {
        return "La Prueba No Funcional es " + getEstado();
    }

    //Si bien este metodo no esta declarado como abstracto en la clase padre. al heredarlo, puedo sobreescribirlo si es necesario.
    @Override
    public void ejecutar(){
      setEstado("NO SE PUEDE EJECUTAR");
    }
}
