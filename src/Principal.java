public class Principal {
    public static void main(String[] args) {
        Filme primeiroFilme = new Filme();
        primeiroFilme.nome = "Interestelar";
        primeiroFilme.anoDeLancamento = 2014;
        primeiroFilme.duracaoEmMinutos = 169;

        primeiroFilme.exibeFichaTecnica();
        primeiroFilme.avalia(8);
        primeiroFilme.avalia(10);
        primeiroFilme.avalia(5);
        System.out.println("A soma das avaliações é: " + primeiroFilme.somaAvaliacoes);
        System.out.println("O total de avaliações é: " + primeiroFilme.totalDeAvaliacoes);
        System.out.println("A média das avaliações é: " + primeiroFilme.retornaMedia());
    }
}
