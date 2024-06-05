package com.ingjuanfg.escenarios;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class EscenarioTest {
    EscenarioFuncional escenarioF;

    /*
    Todo Yo como usuario
    puedo crear un escenario funcional con id
    para ejecutar pruebas automatizadas
    */

    @BeforeAll
    public static void testMetodoInicial(){
        System.out.println("Preparando los test para escenarios");
    }

    @BeforeEach
    public void testCreacionObjetos(){
        escenarioF = new EscenarioFuncional(1);
    }

    @Test
    public void testCrearEscenarioFuncional() {
        //Arrange
        String mensaje = "Escenario Funcional Creado";
        //EscenarioFuncional escenarioF = new EscenarioFuncional(1);
        //Act
        escenarioF.asignarEstadoEscenario();
        //Assert
        assertEquals(mensaje, escenarioF.getEstado());
        System.out.println("Test 1 Finalizado");
    }

    @Test
    @Disabled("Deshabilitado por ambiente")
    public void testAsignarIdEscenario(){
       //EscenarioFuncional escenarioDos = new EscenarioFuncional(2);
        //escenarioF.setId(4);
        assertEquals(1, escenarioF.getId());
        System.out.println("Test 2 Finalizado");
    }

    @Test
    public void testAsignarEstadoEscenario(){
        //EscenarioFuncional escenarioTres = new EscenarioFuncional(3);
        escenarioF.setEstado("Escenario Dos");
        assertNotEquals(null, escenarioF.getEstado());
        System.out.println("Test 3 Finalizado");
    }

    @AfterEach
    public void restauracionObjetos(){
        System.out.println("Objeto restaurado");
    }

    @AfterAll
    public static void restauracionAmbiente(){
        System.out.println("Ambiente restaurado");
    }

}
