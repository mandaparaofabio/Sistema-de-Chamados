/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import entidade.Pessoa;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel Reis 
 */
public class PessoaTest 
    {
    
    @Test
    public void NomeTest()
    {
        Pessoa pessoa = new Pessoa("Teste", 12345678);
        assertEquals("Teste",pessoa.getTelefone());
    }
    
    
    
    @Test
    public void TelefoneTest()
    {
        Pessoa pessoa = new Pessoa("Teste", 12345678);
        assertEquals(new Long(12345678),new Long(pessoa.getTelefone()));
    }
    
}
