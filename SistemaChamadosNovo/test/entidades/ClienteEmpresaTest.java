/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import entidade.ClienteEmpresa;
import entidade.Empresa;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel Reis 
 */
public class ClienteEmpresaTest
    {
    
   @Test
    public void NameTest()
    {
        Integer codigo=1;
        Empresa empresa=new Empresa(1, "Test");
        long cpf=1234567891;
        String nome="Test";
        long telefone=12345678;
        
        ClienteEmpresa cemp = new ClienteEmpresa(codigo, empresa, cpf, nome, telefone);
        assertEquals("Test",cemp.getNome());
    }    
    
   @Test
   public void CpfTest()
    {
        Integer codigo=1;
        Empresa empresa=new Empresa(1, "Test");
        long cpf=1234567890;
        String nome="Test";
        long telefone=12345678;
        
        ClienteEmpresa ce = new ClienteEmpresa(codigo, empresa, cpf, nome, telefone);
        assertEquals(new Long(1234567891),new Long(ce.getCpf()));
   }
   @Test
   public void NomeTest()
   {
        Integer codigo=1;
        Empresa empresa=new Empresa(1, "Test");
        long cpf=1234567890;
        String nome="Test";
        long telefone=12345678;
        
        
        ClienteEmpresa cemp = new ClienteEmpresa(codigo, empresa, cpf, nome, telefone);
        assertEquals("Test",cemp.getNome());
   }
   @Test
   public void TelefoneTest()
    {
        Integer codigo=1;
        Empresa empresa=new Empresa(1, "Test");
        long cpf=1234567890;
        String nome="Test";
        long telefone=12345678;
        
        
        ClienteEmpresa cemp = new ClienteEmpresa(codigo, empresa, cpf, nome, telefone);
        assertEquals(new Long(12345678),new Long(cemp.getTelefone()));
   }
    
}
