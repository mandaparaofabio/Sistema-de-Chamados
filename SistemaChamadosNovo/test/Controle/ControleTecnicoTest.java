/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import controle.ControleTecnicos;
import entidade.Tecnico;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel Reis
 */
public class ControleTecnicoTest {
    
    @Test
    public void InserirTest(){
        ControleTecnicos ct = new ControleTecnicos();
        Tecnico tecnico1 = ct.inserir(12345678, "felipe");
        assertEquals("felipe",tecnico1.getNome());
    }
    
    
    
    
    @Test
    public void InserirTest2(){
        ControleTecnicos ct = new ControleTecnicos();
        Tecnico tec1 = ct.inserir(12345678, "felipe");
        assertEquals(new Long(12345678),new Long(tec1.getTelefone()));
    }
    
}
