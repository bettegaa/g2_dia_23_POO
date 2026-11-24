public interface Registro{   // S = essa classe ficou responsavel apenas por isso, assim eu garanto singularidade dela
public void Registrar(){
        relatorio = ArrayList<>;
        

        relatorio.add(Envio.getPrecoBase());
        relatorio.add(Envio.getData());
        relatorio.add(Encomenda.Envio.getEncomenda());
        return relatorio;
    }


}