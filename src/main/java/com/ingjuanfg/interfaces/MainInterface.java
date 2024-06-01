package com.ingjuanfg.interfaces;

public class MainInterface {
    public static void main(String[] args) {

        //Al igual que el ejemplo de clases abstractas. Una interface no permite crear objetos y lo mismo con la clase abstracta. Por eso solo se va a crear objetos de las otras 2 clases.
        PruebaFuncional pruebaF01 = new PruebaFuncional(1, "CP Interface 01");
        PruebaNoFuncional pruebaNF02 = new PruebaNoFuncional();

        pruebaF01.setDescripcion("Prueba E2E Funcional");


        //CASO DE PRUEBA FUNCIONAL
        System.out.println("CASO DE PRUEBA FUNCIONAL");
        pruebaF01.ejecutar();
        System.out.println(pruebaF01.obtenerResultado());

        System.out.println("\n");

        //CASO DE PRUEBA NO FUNCIONAL
        //Para este caso no podemos preguntar con metodos get por iud, titulo, descripcion, etc. Por que esta clase no hereda de Prueba. Por tal motivo solo podemos usar los 2 metodos sobreescritos.
        System.out.println("CASO DE PRUEBA NO FUNCIONAL");
        pruebaNF02.ejecutar();
        System.out.println(pruebaNF02.obtenerResultado());
    }
}
