public class CriadorApoliceResidencial extends CriadorApolice(){
    private double valorImovel;

    public CriadorApoliceResidencial(double valorImovel, List<String> documentosApresentados, String nomeSegurado){
        super(documentosApresentados, nomeSegurado)
        this.valorImovel = valorImovel;
    }

    @Override
    protected Apolice criarApolice(){
        return new ApoliceResidencial(
            this.valorImovel,
            this.documentosApresentados,
            this.nomeSegurado
        );
    }
}