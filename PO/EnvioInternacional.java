public class EnvioInternacional extends Envios{ // D: aqui as abstraçoes sao mais importantes que os detalhes!
   

    public EnvioInternacional(Encomenda encomenda, localdate data, double precoBase){
       
        precoBase = precoBase * 2.5;

        this.encomenda = encomenda;
        this.data = data;
        this.precoBase = precoBase;
     

    }
    @Override
    public void EnviarInternacional(){
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