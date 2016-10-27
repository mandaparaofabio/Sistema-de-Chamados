/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import entidade.Chamado;
import entidade.ClienteEmpresa;
import entidade.Empresa;
import entidade.RegistroChamado;
import entidade.Tecnico;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel Reis
 */
public class RegistroChamadoTest {
    
   @Test
   public void CodigoTest()
    {
        
       Integer codigo = 1;
       
       String assunto="autenticação";
        
        String titulo="Titulo do chamado";
        String descrição="Tipo do chamado";
        int prioridade = 1;   
        
        Tecnico tecnico = new Tecnico("felipe", 12345678);
        ClienteEmpresa cliente = new ClienteEmpresa(1, new Empresa(1, "Empresa Teste"),1231231230, "04:00", 12345678);
        String sistemaOperacional = "WINDOWS";
        String versaoSO = "4.0";
        String bancoDeDados="IBM";
        
        
        Chamado chamado1 = new  Chamado(titulo, descrição, prioridade, tecnico, cliente, sistemaOperacional, versaoSO, bancoDeDados);
        RegistroChamado rc = new RegistroChamado(assunto, chamado1, tecnico);
        rc.setCodigo(codigo);
        
        assertEquals(new Long(1),new Long(rc.getCodigo()));
        
        
   }
    
}
