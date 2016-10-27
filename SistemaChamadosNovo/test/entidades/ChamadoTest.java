/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import entidade.Chamado;
import entidade.ClienteEmpresa;
import entidade.Empresa;
import entidade.Tecnico;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel Reis 
 */
public class ChamadoTest {
    
    @Test
    public void BancodeDadosTest()
     {
        
        String titulo="Titulo do chamado";
        String descrição="Tipo do chamado";
        int prioridade = 1;           
        Tecnico tecnico = new Tecnico("felipe", 12345678);
        ClienteEmpresa cliente = new ClienteEmpresa(1, new Empresa(1, "Empresa Teste"),1231231230, "04:00", 12345678);
        String sistemaOperacional = "windows";
        String versaoSO = "4.0";
        String bancoDeDados="IBM";
        
        
        Chamado ch1 = new  Chamado(titulo, descrição, prioridade, tecnico, cliente, sistemaOperacional, versaoSO, bancoDeDados);
        Chamado ch2 = new  Chamado(titulo, descrição, prioridade, tecnico, cliente, sistemaOperacional, versaoSO, bancoDeDados);
        assertEquals(true,ch1.equals(ch2));
    }
    
    @Test
    public void DesempenhoTest()
    {
       
        String titulo="Titulo do chamado";
        String descrição="Tipo do chamado";
        int prioridade = 1;            
        Tecnico tecnico = new Tecnico("felipe", 12345678);
        ClienteEmpresa cliente = new ClienteEmpresa(1, new Empresa(1, "Empresa Teste"),1231231230, "04:00", 12345678);
        String sistemaOperacional = "WINDOWS";
        String versaoSO = "40";        
        String operacao="Att";
        double tempoOperacao = 1;
        
        Chamado ch1=new Chamado(titulo, descrição, prioridade, tecnico, cliente, sistemaOperacional, versaoSO, operacao, tempoOperacao);
        Chamado ch2=new Chamado(titulo, descrição, prioridade, tecnico, cliente, sistemaOperacional, versaoSO, operacao, tempoOperacao);
        
        assertEquals(true,ch1.equals(ch2));
    }
    
    @Test
    public void EqualsRedeTest()
    {
        Integer codigo = 1;
        
        String titulo="Titulo do chamado";
        String descrição="Tipo do chamado";
        int prioridade = 1;            
        Tecnico tecnico = new Tecnico("felipe", 12345678);
        ClienteEmpresa cliente = new ClienteEmpresa(1, new Empresa(1, "Empresa Teste"),1231231230, "04:00", 12345678);
        String sistemaOperacional = "WINDOWS";
        String versaoSO = "4.0";        
        String tipoConexao="Local";
        String enderecoRede="1";       
        
        
        Chamado chamado1 = new Chamado(codigo, titulo, descrição, prioridade, tecnico, cliente, sistemaOperacional, versaoSO, tipoConexao, enderecoRede);
        Chamado chamado2 = new Chamado(codigo, titulo, descrição, prioridade, tecnico, cliente, sistemaOperacional, versaoSO, tipoConexao, enderecoRede);
        
        assertEquals(true,chamado1.equals(chamado2));
    }
    
}
