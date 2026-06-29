/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco.model;

/**
 *
 * @author henry
 */
public class ContaCorrente extends ContaBancaria {

    private double limiteChequeEspecial;

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {

        if(saldo + limiteChequeEspecial >= valor){
            saldo -= valor;
        }
    }
}
