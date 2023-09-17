/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package co.unicauca.tallerpolimorfismo.modelo;

import co.unicauca.tallerpolimorfismo.modelo.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Santiago Nieto <santiagonietu@unicauca.edu.co>
 * @author Ledy Astudillo <lmastudillo@unicauca.edu.co>
 */
public class pruebasUnitarias {

    /**
     * @brief La función pruebaViajeFamiliar prueba las propiedades de un objeto
     * ViajeFamiliar.
     */
    @Test
    public void pruebaViajeFamiliar() throws ParseException {
        var viajeFam = new ViajeFamiliar("Popayan", "Bogota", 1250000, new SimpleDateFormat("dd/MM/yyyy").parse("01/05/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("05/05/2019"), 5);

        // El método `assertEquals()` se utiliza para comparar el valor esperado con el valor real. En
        // este caso se utiliza para verificar que las propiedades del objeto `viajeFam` estén
        // configuradas correctamente.
        assertEquals(viajeFam.getOrigen(), "Popayan");
        assertEquals(viajeFam.getDestino(), "Bogota");
        assertEquals(viajeFam.getCosto(), 1250000);
        assertEquals(viajeFam.getFechaSalida(), new SimpleDateFormat("dd/MM/yyyy").parse("01/05/2019"));
        assertEquals(viajeFam.getFechaLlegada(), new SimpleDateFormat("dd/MM/yyyy").parse("05/05/2019"));
        assertEquals(viajeFam.getFamilia(), 5);

    }

    /**
     * @brief La función pruebaViajeIncentivo prueba la creación y recuperación de
     * propiedades para un objeto ViajeIncentivo.
     */
    @Test
    public void pruebaViajeIncentivo() throws ParseException {

        var viajeIncent = new ViajeIncentivo("Popayan", "Medellin", 2100000, new SimpleDateFormat("dd/MM/yyyy").parse("03/06/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("09/06/2019"), "Emtel");

        //Está utilizando el método `assertEquals()` para comparar los valores
        // esperados con los valores reales de las propiedades del objeto `viajeIncent`. Si los valores
        // coinciden, la prueba pasa. Si alguna de las aserciones falla, se generará un error que
        // indica que las propiedades del objeto no están configuradas correctamente.
        assertEquals(viajeIncent.getOrigen(), "Popayan");
        assertEquals(viajeIncent.getDestino(), "Medellin");
        assertEquals(viajeIncent.getCosto(), 2100000);
        assertEquals(viajeIncent.getFechaSalida(), new SimpleDateFormat("dd/MM/yyyy").parse("03/06/2019"));
        assertEquals(viajeIncent.getFechaLlegada(), new SimpleDateFormat("dd/MM/yyyy").parse("09/06/2019"));
        assertEquals(viajeIncent.getEmpresa(), "Emtel");
    }

    /**
     * @brief La función pruebaViajeIndividual prueba la creación y recuperación de
     * propiedades para un objeto ViajeIndividual.
     */
    @Test
    public void pruebaViajeIndividual() throws ParseException {
        var viajeIndv = new ViajeIndividual("Popayan", "San Andres", 4250000,
                new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));

        // Está utilizando el método `assertEquals()` para comparar los valores
        // esperados con los valores reales de las propiedades del objeto `viajeIndv`. Si todas las
        // afirmaciones pasan, significa que las propiedades del objeto están configuradas
        // correctamente. Si alguna de las aserciones falla, se generará un error indicando que las
        // propiedades del objeto no están configuradas correctamente.
        assertEquals(viajeIndv.getOrigen(), "Popayan");
        assertEquals(viajeIndv.getDestino(), "San Andres");
        assertEquals(viajeIndv.getCosto(), 4250000);
        assertEquals(viajeIndv.getFechaSalida(), new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"));
        assertEquals(viajeIndv.getFechaLlegada(), new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));
    }

    /**
     * @brief La función pruebaViajeTodoIncluido prueba los métodos constructor y
     * getter de la clase ViajeTodoIncluido.
     */
    @Test
    public void pruebaViajeTodoIncluido() throws ParseException {
        var viajeTodoInc = new ViajeTodoIncluido("Popayan", "Cartagena", 7350000,
                new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));

        // Utiliza el método `assertEquals()` para comparar los
        // valores esperados con los valores reales de las propiedades. Si todas las afirmaciones
        // pasan, significa que las propiedades del objeto están configuradas correctamente. Si alguna
        // de las aserciones falla, se generará un error indicando que las propiedades del objeto no
        // están configuradas correctamente.
        assertEquals(viajeTodoInc.getOrigen(), "Popayan");
        assertEquals(viajeTodoInc.getDestino(), "Cartagena");
        assertEquals(viajeTodoInc.getCosto(), 7350000);
        assertEquals(viajeTodoInc.getFechaSalida(), new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"));
        assertEquals(viajeTodoInc.getFechaLlegada(), new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));

    }

}
