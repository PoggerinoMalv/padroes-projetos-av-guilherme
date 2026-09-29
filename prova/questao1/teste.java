public class teste {
    public static void main(String[] args) {

        CriadorApolice criadorAuto =
                new CriadorApoliceAuto(
                        60000.00, List.of("CNH","CRLV"), "João da Silva"
                );

        CriadorApolice criadorResidencial =
                new CriadorApoliceResidencial(
                        500000.00, List.of("Escritura","Contrato de locação"), "Maria Souza"
                );

        CriadorApolice criadorVida =
                new CriadorApoliceVida(
                        300000.00, List.of("Documento de identidade","CPF"), "Carlos Oliveira"
                );
}