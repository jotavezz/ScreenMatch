import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme primeiroFilme = new Filme();
        primeiroFilme.setNome("Interestelar");
        primeiroFilme.setAnoDeLancamento(2014);
        primeiroFilme.setDuracaoEmMinutos(169);
        System.out.println("Duração do FIlme: " + primeiroFilme.getDuracaoEmMinutos());

        primeiroFilme.exibeFichaTecnica();
        primeiroFilme.avalia(8);
        primeiroFilme.avalia(10);
        primeiroFilme.avalia(5);
        System.out.println("O total de avaliações é: " + primeiroFilme.getTotalDeAvaliacoes());
        System.out.println("A média das avaliações é: " + primeiroFilme.retornaMedia());


        Serie Lupin = new Serie();
        Lupin.setNome("Lupin");
        Lupin.setAnoDeLancamento(2021);
        Lupin.exibeFichaTecnica();
        Lupin.setTemporadas(3);
        Lupin.setEpisodiosPorTemporada(10);
        Lupin.setMinutosPorEpisodio(50);
        System.out.println("Duração da série inteira: " + Lupin.getDuracaoEmMinutos());


    }
}
