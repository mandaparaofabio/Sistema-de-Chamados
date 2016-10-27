/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Persistencia.ClienteDAO;
import entidade.ClienteEmpresa;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel Reis 
 */
public class ClienteTest 
    {
    
    @Test
    public void CodigoTestZero()
    {
        ClienteDAO chamado = new ClienteDAO();
        assertTrue(chamado.gerarCodigo()>0);
    }
    
    @Test
    public void CodigoTestNegativo()
    {
        ClienteDAO chamado = new ClienteDAO();
        assertFalse(chamado.gerarCodigo()<0);
    }
    
    @Test
    public void validarCPFTestComZero()
    {
        ClienteEmpresa cliente = new ClienteEmpresa(Integer.SIZE, null, 0, null, 10030110);
        ClienteDAO chamado = new ClienteDAO();
        assertFalse(chamado.validarCPF(cliente.getCpf()));
    }
    @Test
    public void validarCPFTeNegativo()
    {
        ClienteEmpresa cliente = new ClienteEmpresa(Integer.SIZE, null, -5, null,10030110);
        ClienteDAO chamado = new ClienteDAO();
        assertFalse(chamado.validarCPF(cliente.getCpf()));
    }
    
    @Test
    public void ClienteTestNull()
    {
        ClienteDAO cliente = new ClienteDAO();
        assertNotNull(cliente.voltaCashCliente());
    } 
}
