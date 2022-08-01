/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guilhermesantana
 */
public abstract class Conta implements IConta{ //essa classe é abstract pq uma classe abstract nunca pode ser instanciada. Ela vai dar as informações pros filhos
    
    protected static final int AGENCIA_PADRAO = 1;
    protected int agencia; //protected pra poder usar o super. reescrever o construtor na sua classe filha - conta corrente e conta poupança
    protected int numero;
    protected double saldo;
    
    public void Sacar(double valor) {
        this.saldo -= valor;
    }

    public void Depositar(double valor) {
        this.saldo += valor;
    }

    public void Transferir(double valor, Conta contaDestino) {
        this.Sacar(valor);
        contaDestino.Depositar(valor);
    }
    
    protected void ImprimirInformacoes()
    {
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
    
    
    public int getAgencia()
    {
        return this.agencia;
    }
    
    public int getNumero()
    {
        return this.numero;
    }
    
    public double getSaldo()
    {
        return this.saldo;
    }

    
}
