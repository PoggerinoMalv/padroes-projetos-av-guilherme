public class ApoliceResidencial extends Apolice {
    public double valorImovel;

    public ApoliceResidencial(double valorImovel, List<String> documentosApresentados, String nomeSegurado) {
        super(documentosApresentados, nomeSegurado);
        this.valorImovel = valorImovel;
    }

    @Override
    public double calcularPremio(){
        return (valorImovel * 0.15) / 12;
    }
}