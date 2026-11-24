public class EnvioExpresso extends Envios{
    

    public EnvioExpresso(Encomenda encomenda, localdate data, double precoBase){
        valor = 10;
        (if Encomenda.getPeso > valor){
            resultado = Encomenda.getPeso - valor;
            resultado = resultado * 15;
            return resultado + precoBase;

        }
        this.encomenda = encomenda;
        this.data = data;
        this.precoBase = precoBase;

        return precoBase;

    }

    @Override
    public void EnviarExpresso(){
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