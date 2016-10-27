/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import entidade.Tecnico;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel Reis 
 */
public class TecnicoTest 
    {
    
    @Test
    public void NomeTest()
    {
        Tecnico tecnico = new Tecnico("Test", 12345678);
        assertEquals("Test",tecnico.getNome());
    }
    
    
    @Test
    public void TelefoneTest()
    {
        Tecnico tecnico = new Tecnico("Test", 12345678);
        assertEquals(new Long(12345678),new Long(tecnico.getTelefone()));
    }
    
}
