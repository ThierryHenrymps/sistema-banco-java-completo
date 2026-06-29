/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco.model;
import java.time.LocalDateTime;

/**
 *
 * @author henry
 */
public class Extrato {

    private Long id;
    private Long contaId;
    private String tipo;
    private double valor;
    private LocalDateTime data;


    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }


    public Long getContaId(){
        return contaId;
    }

    public void setContaId(Long contaId){
        this.contaId = contaId;
    }


    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }


    public double getValor(){
        return valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }


    public LocalDateTime getData(){
        return data;
    }

    public void setData(LocalDateTime data){
        this.data = data;
    }

}