/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import entidade.Chamado;
import entidade.ClienteEmpresa;
import entidade.Empresa;
import entidade.Tecnico;
import java.util.Iterator;


/**
 *
 * @author Daniel Reis
 */
public class ChamadoTest {
   
    
  //  @Test
    public void inserirVericarChamadoTest(){
        Tecnico tec = new Tecnico ("felipe", 12345678);
        Empresa emp = new Empresa (123,"mackenzie");
        ClienteEmpresa clienteEmp = new ClienteEmpresa(1,emp, 31355587, "jose", 12345678);
        Chamado ch = new Chamado ("titulo do chamado", "descriçao", 2, tec, clienteEmp, "monitor", "hp","tela");
        ChamadoDAO chamTest = new ChamadoDAO ();
         ch.setCodigo (chamTest.gerarCodigo());    
         boolean achou = false;
         
         if(!chamTest.getChamados().isEmpty()){
             Iterator itr = chamTest.getChamados().iterator();
             while(itr.hasNext()){
                 Chamado cham = (Chamado) itr.next();
                  if(ch.equals(ch)){
                      achou = true;
                      
                  }
                 
             }
             
         }
        
        
    }

    private void ChamadoDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
