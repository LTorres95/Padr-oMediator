package mediator;

public class Suporte implements Departamento {

    private static final Suporte instance = new Suporte();

    private Suporte() {
    }

    public static Suporte getInstance() {
        return instance;
    }

    @Override
    public String receberReclamacao(String mensagem) {
        return "O suporte vai analisar a reclamação: " + mensagem;
    }

    @Override
    public String receberSugestao(String mensagem) {
        return "O suporte vai avaliar a sugestão: " + mensagem;
    }

    @Override
    public String receberElogio(String mensagem) {
        return "O suporte agradece o elogio: " + mensagem;
    }
}
