package com.ingjuanfg.clases;

public class Main {
    public static void main(String[] args) {
        //CREAMOS UN OBJECTO DE CASODEPRUEBA
        CasosDePrueba cp01 = new CasosDePrueba();

        //USAMOS METODOS SET PARA ASIGNAR VALORES
        cp01.setId(1);
        cp01.setTitulo("CP 01");
        cp01.setDescripcion("Caso con erorres d ortogjia");
        cp01.setEstado("CREADO");

        //UTILIZAMOS LOS GET PARA OBTENER LA INFORMACION
        System.out.println("El usuario esta ejecutando el CP" + cp01.getTitulo());
        System.out.println("Estado ACTUAL "+ cp01.getEstado());
        cp01.ejecutar("PENDIENTE");
        System.out.println("El Caso de Prueba " + cp01.getId() +  " con titulo " + cp01.getTitulo() + " esta en estado " + cp01.getEstado()
              + " por fallas en su descripcion: " + cp01.getDescripcion());
    }
}