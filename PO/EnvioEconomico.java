public class EnvioEconomico extends Envios{


    public EnvioEconomico(Encomenda encomenda, localdate data, double precoBase){
       
        this.encomenda = encomenda;
        this.data = data;
        this.precoBase = precoBase;
        

    }
    @Override
    public void EnviarEconomico(){
        (if encomenda == null || Encomenda.getPeso < 0 || precoBase < 0 ){
            ThrowException.getException();
        }
        return precoBase;
    }


    @Override
    public void Registrar(){
        relatorio = ArrayList<>;
        relatorio.add(precoBase);
        relatorio.add(data);
        relatorio.add(encomenda);
        return relatorio;
    }



}