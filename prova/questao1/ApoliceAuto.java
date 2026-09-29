public class ApoliceAuto extends Apolice {
    private double valorVeiculo;

    public ApoliceAuto(double valorVeiculo, List<String> documentosApresentados, String nomeSegurado){
        super(documentosApresentados, nomeSegurado)
        this.valorVeiculo = valorVeiculo;
    }

    @Override
    public double calcularPremio(){
        return (this.valorVeiculo * 0.8) / 12
    }
}