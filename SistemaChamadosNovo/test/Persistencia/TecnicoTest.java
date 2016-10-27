/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Persistencia.TecnicoDAO;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author Daniel Reis 
 */
public class TecnicoTest 
    {
    
    @Test
    public void CodigoTestComZero()
    {
        TecnicoDAO tecnico = new TecnicoDAO();
        assertTrue(tecnico.gerarCodigo()>0);
    }
    
    @Test
    public void CodigoTestNegativo()
    {
        TecnicoDAO tecnico = new TecnicoDAO();
        assertFalse(tecnico.gerarCodigo()<0);
    }
    
    @Test
    public void CodigoTestZero()
    {
        TecnicoDAO tecnico = new TecnicoDAO();
        assertFalse(tecnico.gerarCodigo()==0);
    }
    
    @Test
    public void TecnicoTestNull()
    {
        TecnicoDAO tecnico = new TecnicoDAO();
        assertNull(tecnico.voltaCashTecnico());
    }
    
    @Test
    public void TestNull()
    {
        TecnicoDAO tec = new TecnicoDAO();
        assertNull(tec.get(-1));
    }
    
    
}
