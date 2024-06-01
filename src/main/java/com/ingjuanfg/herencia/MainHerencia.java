package com.ingjuanfg.herencia;

public class MainHerencia {
        public static void main(String[] args) {

            //Se crean los objectos de las 3 clases para ver sus diferencias.
            Prueba prueba01 = new Prueba(1, "Titulo CP 01");
            PruebaFuncional pruebaF02 = new PruebaFuncional(2, "CP 02");
            PruebaNoFuncional pruebaNF03 = new PruebaNoFuncional(3, "CP 03");

            //se llaman metodos SET para asignar informacion a cada objeto creado
            prueba01.setTitulo("CP 01");
            prueba01.setDescripcion("Prueba CLASE PADRE");
            prueba01.setEstado("EJECUTADO");


            pruebaF02.setDescripcion("Prueba CLASE HIJA PRUEBA FUNCIONAL");
            pruebaF02.setEstado("PENDIENTE");


            pruebaNF03.setDescripcion("Prueba CLASE HIJA PRUEBA NO FUNCIONAL");
            pruebaNF03.setEstado("BLOQUEADO");

            //Llamamos metodos GET para obtener la informacion para cada objeto creado
            System.out.println(prueba01.getDescripcion() + " " +prueba01.obtenerResultado());
            System.out.println(pruebaF02.getDescripcion() + " " +pruebaF02.obtenerResultado());
            System.out.println(pruebaNF03.getDescripcion() + " " +pruebaNF03.obtenerResultado());
        }
}
