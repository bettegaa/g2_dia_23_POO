public class Envio{  // L: as filhas de Envio tem as mesmas responsabilidades garantidas que a classe mae aqui! 
//Alem do O: tudo é privado porem permite extensoes
    private Encomenda encomenda;
    private localdate data;
    private double precoBase;


    public Envio(Encomenda encomenda, localdate data, double precoBase){
        this.encomenda = encomenda;
        this.data = data;
        this.precoBase = precoBase
        
    }

    

    public void Enviar(){

        return precoBase;

    }

    public double getPrecoBase(){
        return precoBase;
    }


    public localdate.getData(){
        return data;
    }

    public Encomenda getEncomenda(){
        return encomenda
    }


    public void Registrar(){
        relatorio = ArrayList<>;
        

        relatorio.add(Envio.getPrecoBase());
        relatorio.add(Envio.getData());
        relatorio.add(Encomenda.Envio.getEncomenda());
        return relatorio;
    }

}