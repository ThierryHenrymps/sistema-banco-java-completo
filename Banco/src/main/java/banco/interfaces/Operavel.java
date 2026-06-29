/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco.interfaces;

import banco.model.Conta;

public interface Operavel {

    void depositar(double valor);

    void sacar(double valor);

    void transferir(Conta destino, double valor);

}