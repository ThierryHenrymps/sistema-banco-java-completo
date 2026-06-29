/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco.model;
import banco.interfaces.Operavel;
/**
 *
 * @author henry
 */
public class Conta implements Operavel{
    private Long id;
    private String numero;
    private String agencia;
    private double saldo;
    private String tipo;
    private Cliente cliente;

    public Conta() {
    }

      public Conta(Long id, String numero, String agencia, double saldo, String tipo, Cliente cliente) {
        this.id = id;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.tipo = tipo;
        this.cliente = cliente;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }


    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }





public void depositar(double valor){

    if(valor <= 0){
        return;
    }

    saldo += valor;

}



public void sacar(double valor){

    if(valor <= 0){
        return;
    }


    if(valor > saldo){
        return;
    }


    saldo -= valor;

}



public void transferir(Conta destino, double valor){

    if(destino == null){
        return;
    }


    if(valor <= 0){
        return;
    }


    if(valor > saldo){
        return;
    }


    if(this.id.equals(destino.getId())){
        return;
    }


    saldo -= valor;

    destino.saldo += valor;

}
    }

