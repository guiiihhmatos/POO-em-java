/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guilhermesantana
 */
public interface IConta { //não precisa declarar public pq a interface já é publica
    
    void Sacar(double valor);
    
    void Depositar(double valor);
    
    void Transferir(double valor, Conta contaDestino);
    
    void ImprimirExtrato();
    
}
