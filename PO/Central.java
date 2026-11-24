public class Central implements Registro{
    private double faturamentoTotal;
    private Envios envioCaro; 



    public void Registrar(){
        relatorio = ArrayList<>;
        

        relatorio.add(Envio.getPrecoBase());
        relatorio.add(Envio.getData());
        relatorio.add(Encomenda.Envio.getEncomenda());
        return relatorio;
    }





    public Central (double faturamentoTotal, Envios envioCaro){

        this.faturamentoTotal = faturamentoTotal;
        this.envioCaro= envioCaro;

    }

    public void exibir(){
        System.out.println(relatorio);
    }

 


}