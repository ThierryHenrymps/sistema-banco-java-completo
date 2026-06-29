/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco.model;

/**
 *
 * @author henry
 */
public abstract class ContaBancaria {

    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public abstract void depositar(double valor);

    public abstract void sacar(double valor);
}
