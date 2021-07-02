public class StringFormat {
    public static void main(String[] args) {

        var nome = "Wanderosn";
        var sobrenome = "Dantas";

        final var nomecompleto = nome + sobrenome;

        System.out.println(nome);
        System.out.println("Nome do cliente" + nome);
        System.out.println("Nome completo do cliente: " + nomecompleto);

        final var mensagem = String.format("O cliente %s possui sobre nome %s ", nome,sobrenome);
        System.out.println(mensagem);

        System.out.println(String.format("Numero %.2f ", 1.2345d));

    }
}
