public class CriadorApoliceVida extends CriadorApolice(){
    private double capitalSegurado;

    public CriadorApoliceVida(double capitalSegurado, List<String> documentosApresentados, String nomeSegurado){
        super(documentosApresentados, nomeSegurado)
        this.capitalSegurado = capitalSegurado;
    }

    @Override
    protected Apolice criarApolice(){
        return new ApoliceVida(
            this.capitalSegurado,
            this.documentosApresentados,
            this.nomeSegurado
        );
    }
}