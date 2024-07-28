public class Facade {
    private Amplificador amplificador;
    private ReprodutorDVD reprodutorDVD;
    private Projetor projetor;
    private Luz luz;

    public Facade(Amplificador amplificador, ReprodutorDVD reprodutorDVD, Projetor projetor, Luz luz) {
        this.amplificador = amplificador;
        this.reprodutorDVD = reprodutorDVD;
        this.projetor = projetor;
        this.luz = luz;
    }

    public void assistirFilme(String filme) {
        System.out.println("Preparando para assistir o filme...");
        luz.dimuir(50);
        projetor.ligar();
        amplificador.ligar();
        amplificador.setVolume(10);
        reprodutorDVD.ligar();
        reprodutorDVD.reproduzir(filme);
    }

    public void desligarFilme() {
        System.out.println("Desligando o sistema de home theater...");
        luz.ligar();
        projetor.desligar();
        reprodutorDVD.desligar();
        amplificador.desligar();
    }
}
