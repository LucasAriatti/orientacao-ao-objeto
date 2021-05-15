/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author Lucas
 */
public class Lutador {
    
    
    
    
     private String nome ;
    private String nascionalidade;
    private int idade;
    private double altura; 
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    
    
    
    
    public void apresentar(){
        System.out.println("Lutador "+ this.getNome());
        System.out.println("Origem "+ this.getNascionalidade());
        System.out.println(getIdade()+ " anos");
        System.out.println(this.getAltura()+ " m de altura");
        System.out.println("Peso "+ this.getPeso()+" KG");
        System.out.println("Ganhou "+ this.getVitorias());
        System.out.println("Perdeu "+ this.getDerrotas());
        System.out.println("Empatou "+ this.getEmpates());
    }
    public void status() {
        System.out.println(this.getNome());
        System.out.println("é um peso "+ this.getPeso());
        System.out.println(this.getVitorias()+ " Vitorias");
        System.out.println(this.getDerrotas() + " Derrotas");
        System.out.println(this.getEmpates() + " Empates");
    }
    public void ganharLuta(){
        setVitorias(getVitorias() +1);
    }
    public void perderLuta(){
        setDerrotas(getDerrotas() +1);
    }
    public void empatarLuta(){
        setEmpates(getEmpates() +1);
    }

    public Lutador(String no,
            String na,
            int id,
            double al,
            double pe,
            int vi,
            int de,
            int em)
    {
        this.nome = no;
        this.nascionalidade = na;
        this.idade = id;
        this.altura = al;
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
        this.setPeso(pe);
    }

    
    
    
    
    
    
    
    
    
    public void setCategoria() {
        if(peso < 52.2){
            this.categoria = "Inválido";
        } else if(this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if(this.peso <= 83.9){
            this.categoria = "Médio";
        } else if(this.peso <= 120.2){
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }
        
        
    

    public void setPeso(double pe) {
        this.peso = pe;
        setCategoria();
                
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public double getPeso() {
        return peso;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public String getNascionalidade() {
        return nascionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public String getCategoria() {
        return categoria;
    }
    
    

    
    
    
    
    
    
    
            
          
}

