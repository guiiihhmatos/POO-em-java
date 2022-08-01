/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guilhermesantana
 */
public class ContaCorrente extends Conta {
  
  private static int SEQUENCIAL = 1;  
  
  public ContaCorrente()
  {
      super.agencia = AGENCIA_PADRAO;
      super.numero = SEQUENCIAL++;
      
  }

    @Override
    public void ImprimirExtrato() {
        System.out.println("-- Extrato Conta Corrente --");
        super.ImprimirInformacoes();
    }
}
