/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomma;

/**
 *
 * @author Mr-Robot
 */
public class Lutador {
    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias, derrotas, empates;
    //Métodos publicos
    public void apresentar(){
        System.out.println("<---ULTRA EMOJI COMBATER APRESENTAR------->");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador "+this.getNome());
        System.out.println("Diretamente de "+this.getNacionalidade());
        System.out.println("com "+this.getIdade()+" anos, altura de "+this.getAltura());
        System.out.println("pesando "+this.getPeso()+"Kg");
        System.out.println(this.getVitorias()+" vitórias");
        System.out.println(this.getDerrotas()+" derrotas e");
        System.out.println(this.getEmpates()+" empates!");
        System.out.println("<--------------------------------------->");
    }
    public void status(){
        System.out.println("<---ULTRA EMOJI COMBATER STATUS DO LUTADOR------->");
        System.out.println(this.getNome()+" é um peso "+this.getCategoria());
        System.out.println("GANHOU "+this.getVitorias()+" vezes");
        System.out.println("PERDEU "+this.getDerrotas()+" vezes");
        System.out.println("EMPATOU "+this.getEmpates()+" vezes");
        System.out.println("<--------------------------------------->");
    }
    public void ganharLutar(){
        this.setVitorias(this.getVitorias() + 1);
        // pode sr usado qualquer um dos 2
        //this.vitorias = this.vitorias + 1;
    }
    public void perderLutar(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLutar(){
        this.setEmpates(this.getEmpates() + 1);
    }
    //Métodos Especias
    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe); 
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getPeso() {
        return peso;
    }
    
    public void setPeso(float peso) {
        this.peso = peso;
        //Vai ser utilizado internamente,chamando ele
        this.setCategoria();
    }
    public String getCategoria() {
        return categoria;
    }
    
    //Vai ser utilizado internamente
    private void setCategoria() {
        if(this.peso < 52.2){
            this.categoria = "INVÁLIDO";
        }else if(this.peso <= 70.3){
            this.categoria = "LEVE";
        }else if(this.peso <= 83.9){
            this.categoria = "MÉDIO";
        }else if(this.peso <= 120.2){
            this.categoria = "PESADO";
        }else{
            this.categoria = "INVÁLIDO";
        }
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
}
