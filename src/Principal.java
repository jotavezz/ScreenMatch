import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme primeiroFilme = new Filme();
        primeiroFilme.setNome("Interestelar");
        primeiroFilme.setAnoDeLancamento(2014);
        primeiroFilme.setDuracaoEmMinutos(169);

        primeiroFilme.exibeFichaTecnica();
        primeiroFilme.avalia(8);
        primeiroFilme.avalia(10);
        primeiroFilme.avalia(5);
        System.out.println("O total de avaliações é: " + primeiroFilme.getTotalDeAvaliacoes());
        System.out.println("A média das avaliações é: " + primeiroFilme.retornaMedia());
        System.out.println(primeiroFilme.retornaMedia());

    }
}
