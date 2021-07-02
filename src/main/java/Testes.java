import java.util.Locale;

public class Testes {
    public static void main(String[] args) {

        var nome = " Andre";

        var sobreNome = "Gomes ";

        var nomecompleto = nome + sobreNome;

        var texto = "BrasiléLindo";

        System.out.println(nomecompleto);

        System.out.println("Char na posição : " + nomecompleto.charAt(5));

        System.out.println("Quantidade: " + nomecompleto.length());
        System.out.println("Quantidade: " + nomecompleto.length());

        System.out.println("Sem Trim [" + texto + "]");
        System.out.println("Com Trim [" + texto.trim() + "]");

        System.out.println("Lower" + texto.toLowerCase());
        System.out.println("Upper" + texto.toUpperCase());

        System.out.println("Contém M?" + texto.contains("M"));
        System.out.println("Contém B?" + texto.contains("B"));

        System.out.println("Replace " + texto.replace("B","$"));
        System.out.println("Equals?" + texto.equals("BrasiléLindo" ));

        System.out.println("Equals?" + texto.equalsIgnoreCase("BrasiléLindo"));
        System.out.println("Substring(0,6)=" + texto.substring(0,6));



    }
}
