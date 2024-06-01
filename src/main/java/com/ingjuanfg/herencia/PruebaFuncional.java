package com.ingjuanfg.herencia;

/*
* Extends es la palabra reservada que me permite indicar cual es la clase que deseo heredar. Para este caso. Se hereda y lo unico diferente que tiene esta clase
* que no tiene Prueba, es el atributo tipoPrueba. Por esa razon solo tiene esta info y no se tiene que duplicar el codigo como paso en la carpeta clases con la clase
* con el mismo nombre.
* */
public class PruebaFuncional extends Prueba{
    private String tipoPrueba;

    /*
    * Con respecto a este constructor, tiene un detalle y es que al heredar de Prueba, se debe respetar el constructor de la clase padre. Para esto se usa la palabra reservada
    * super. Con esta palabra se invoca el constructor de la clase padre, se envian los parametros que este pide y queda listo. En caso tal de que se requiera inicializar un atributo adicional
    * como es el caso de tipo de prueba, se puede hacer como se hace normalmente.
    */
    public PruebaFuncional(int id, String titulo){
        super(id, titulo);
        this.tipoPrueba = "Regresion";
    }

    public String getTipoPrueba() {
        return tipoPrueba;
    }

    public void setTipoPrueba(String tipoPrueba) {
        this.tipoPrueba = tipoPrueba;
    }
}
