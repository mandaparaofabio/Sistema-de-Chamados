package entidades;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import entidade.Empresa;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel Reis
 */
public class EmpresaTest 
    {
    
    @Test
    public void ContratoTest()
    {
        
        Empresa empresa = new Empresa(1, "Teste");
        assertEquals(new Long(1),new Long(empresa.getNumeroContrato()));
    }
    
    
    
    @Test
    public void EmpresaTest()
    {
        Empresa emp = new Empresa(1, "Teste");
        assertEquals("Teste",emp.getNomeEmpresa());
    }
    
}
