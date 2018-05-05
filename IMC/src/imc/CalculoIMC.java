/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

/**
 *
 * @author ciee.lab
 */
public class CalculoIMC {
    
    private Double peso;
    private Double altura;

    public CalculoIMC(Double peso, Double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    
    public String informarFaixa(){
        
        Double resultado = this.peso/Math.pow(this.altura, 2);
        
        if(resultado < 16.9){
            return "Muito abaixo do peso";
        }
        else if(resultado < 18.4){
            return "Abaixo do peso";
        }
        else if(resultado < 24.9){
            return "Peso normal";
        }
        else if(resultado < 29.9){
            return "Acima do peso";
        }
        else if(resultado < 34.9){
            return "Obesidade Grau I";
        }
        else if(resultado < 40){
            return "Obesidade Grau II";
        }
        else{
            return "Obesidade Grau III";
        }
    }
    
    
}
