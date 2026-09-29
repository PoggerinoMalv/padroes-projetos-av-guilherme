public class ApoliceVida extends Apolice {
    public double capitalSegurado;

    public ApoliceVida(double capitalSegurado, List<String> documentosApresentados, String nomeSegurado){
        super(documentosApresentados, nomeSegurado);
        this.capitalSegurado = capitalSegurado;
    }

    public double calcularPremio(){
        return (capitalSegurado * 0.03) / 12;
    }
}