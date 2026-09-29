public abstract class CriadorApolice {
    private List<String> documentosApresentados;
    private String nomeSegurado; 

    public abstract Apolice criarApolice();

    public String processarContratacao(){
        Apolice apolice = criarApolice();

        return apolice.gerarResumo;
    }
}