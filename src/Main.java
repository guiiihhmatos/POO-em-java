/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guilhermesantana
 */
public class Main {
    
    public static void main(String[] args)
    {
        ContaCorrente cc = new ContaCorrente();
        ContaCorrente cc2 = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        
        cc.Depositar(1000);
        cc.Transferir(340, cp);
        
        cc.ImprimirExtrato();
        cc2.ImprimirExtrato();
        cp.ImprimirExtrato();
    }
}
