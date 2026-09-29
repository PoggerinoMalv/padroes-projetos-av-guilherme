import java.util.List;

public abstract class Apolice {
    protected List<String> documentosApresentados;
    protected String nomeSegurado;

    public Apolice(List<String> documentosApresentados, String nomeSegurado){
        this.nomeSegurado = nomeSegurado;
        this.documentosApresentados = documentosApresentados;
    }

    public abstract double calcularPremio();

    public String gerarResumo() {
        return String.format(
                """
                Segurado: %s
                Prêmio calculado: R$ %.2f
                Documentos exigidos: %s
                """,
                nomeSegurado,
                calcularPremio(),
                String.join(", ", listarDocumentos())
        );
    }
}