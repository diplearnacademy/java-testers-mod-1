package com.ingjuanfg.abstracta;


public class MainAbstracta {
        public static void main(String[] args) {

            //SE CREAN LOS OBJETOS

            //Si descomentas la linea 10 vas a ver un error y esto es debido a que Prueba al ser una clase abstracta no se puede crear objetos de ella. Ya se usan son las clases hijas.
            //Prueba prueba01 = new Prueba(1, "CP 01");
            PruebaFuncional pruebaF02 = new PruebaFuncional(2, "CP F 02");
            PruebaNoFuncional pruebaNF03 = new PruebaNoFuncional(3, "CP NF 03");

            //se llaman metodos SET para asignar informacion a cada objeto creado
            //asignamos un estado a la prueba funcional
            pruebaF02.setEstado("EN EJECUCION");

            //no asignamos un estado directamente a la prueba no funcional sino que invocamos el metodo ejecutar() que sobre escribimos en esta clase hija
            pruebaNF03.ejecutar();

            //Aca se puede ver que ambos metodos sobreescritos en las clases, responden a lo que se les esta solicitando.
            System.out.println(pruebaF02.getTitulo() + " " +pruebaF02.obtenerResultado());
            System.out.println(pruebaNF03.getTitulo() + " " +pruebaNF03.obtenerResultado());
        }
}
