public class Test {
    public static void main(String[] args) {
        Amplificador amplificador = new Amplificador();
        ReprodutorDVD reprodutorDVD = new ReprodutorDVD();
        Projetor projetor = new Projetor();
        Luz luz = new Luz();

        Facade homeTheater = new Facade(amplificador, reprodutorDVD, projetor, luz);

        homeTheater.assistirFilme("O Senhor dos Anéis");

        homeTheater.desligarFilme();
    }
}
