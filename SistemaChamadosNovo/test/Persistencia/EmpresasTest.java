/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Persistencia.EmpresaDAO;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 *
 * @author Daniel Reis
 */
public class EmpresasTest 
{
    
    @Test
    public void EmpresaTestNull()
    {
        EmpresaDAO empresa= new EmpresaDAO();
        assertNotNull(empresa.voltaEmpresa());
    }
    
    @Test
    public void EmpresasTestNull()
    {
        EmpresaDAO empresa = new EmpresaDAO();
        assertNotNull(empresa.getEmpresas());
    }
    
}
