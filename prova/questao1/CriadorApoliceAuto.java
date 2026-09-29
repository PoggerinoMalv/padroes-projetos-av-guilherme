public class CriadorApoliceAuto extends CriadorApolice(){
    private double valorVeiculo;

    public CriadorApoliceAuto(double valorVeiculo, List<String> documentosApresentados, String nomeSegurado){
        super(documentosApresentados, nomeSegurado)
        this.valorVeiculo = valorVeiculo;
    }

    @Override
    protected Apolice criarApolice(){
        return new ApoliceAuto(
            this.valorVeiculo,
            this.documentosApresentados,
            this.nomeSegurado
        );
    }
}