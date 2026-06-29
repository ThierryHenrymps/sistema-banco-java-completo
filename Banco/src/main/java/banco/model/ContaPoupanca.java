/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco.model;

/**
 *
 * @author henry
 */
public class ContaPoupanca extends ContaBancaria {

    private double taxaRendimento;

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {

        if(saldo >= valor){
            saldo -= valor;
        }
    }

    public void aplicarRendimento(){
        saldo += saldo * taxaRendimento;
    }
}
