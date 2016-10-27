/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Persistencia.ChamadoDAO;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 *
 * @author Daniel Reis
 */
public class ChamadoTest 
    {
    
    @Test
    public void CodigoTestNegativo()
    {
        ChamadoDAO chamado = new ChamadoDAO();
        assertFalse(chamado.gerarCodigo()<0);
    }
    
    @Test
    public void CodigoTestComZero()
    {
        ChamadoDAO chamado = new ChamadoDAO();
        assertTrue(chamado.gerarCodigo()>0);
    }
    
    @Test
    public void CodigoRegistroTestComZero()
    {
        ChamadoDAO chamado = new ChamadoDAO();
        assertTrue(chamado.gerarCodigoRegistroChamado()>0);
    }
    
    @Test
    public void CodigoRegistroTestNegativo()
    {
        ChamadoDAO c = new ChamadoDAO();
        assertFalse(c.gerarCodigoRegistroChamado()<0);
    }
    
    @Test
    public void ChamadosTestNull()
    {
        ChamadoDAO c = new ChamadoDAO();
        assertNotNull(c.getChamados());
    }
    
    @Test
    public void RegistrosTestNull()
    {
        ChamadoDAO c = new ChamadoDAO();
        assertNotNull(c.getRegistros());
    }
    
    @Test
    public void TestMaiorZero()
    {
        ChamadoDAO c = new ChamadoDAO();
        assertNull(c.get(0));
    }
    
    @Test
    public void TestNegativo()
    {
        ChamadoDAO c = new ChamadoDAO();
        assertNull(c.get(-1));
    }
    
    
}
