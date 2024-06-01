package com.ingjuanfg.abstracta;

//Al tener una clase abstracta. aplica el mismo concepto que la clase normal que heredamos en la carpeta Herencia. Solo basta con agregar el extends y el nombre de la clase.
//para heredar y usar lo de esta clase. Sin embargo, la diferencia es que al ser una clase abstracta y tener un metodo solo con la firma, debemos sobreescribirlo.
//VER COMENTARIO MAS ABAJO
public class PruebaFuncional extends Prueba {
    private String tipoPrueba;

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

    //esta anotacion significa que el metodo existe en una clase abstracta o interface (en este caso la primera) y que debe especificarse cual es el cuerpo del metodo
    //es decir, que hace esta clase, Es por esto que se crea la anotación, se llama la firma del metodo de la clase abstracta con el mismo nombre y se procede a agregar
    //la logica que esta requiere para el proceso.

    @Override
    public String obtenerResultado(){
        return "La Prueba Funcional es " + getEstado();
    }
}
