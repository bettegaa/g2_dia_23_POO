public class Encomenda{
    private String descricao;
    private double peso;
    private Remetente remetente;


     public encomenda(String descricao, double peso, Remetente remetente){
        this.descricao = descricao;
        this.peso = peso;
        this.remetente = remetente;
        
    }


    public double getPeso(){
        return peso;
    }







}