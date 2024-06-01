package com.ingjuanfg.herencia;

/*
* Para esta clase estamos diciendo que hereda de Prueba pero que no tiene ninguna otra caracteristica, por eso el unico codigo es solo el constructor con la palabra
* super, obligatoria por estar heredando de Prueba. Recuerda que si Prueba no tiene un constructor, no estoy oobligado a hacerla en esta y por lo tanto, esta clase estaria vacia.
* */
public class PruebaNoFuncional extends Prueba{
    public PruebaNoFuncional(int id, String titulo) {
        super(id, titulo);
    }
}
