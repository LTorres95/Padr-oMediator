package mediator;

public class CentralAtendimento {

    private static final CentralAtendimento instance = new CentralAtendimento();

    private final Departamento departamento = Suporte.getInstance();

    private CentralAtendimento() {
    }

    public static CentralAtendimento getInstance() {
        return instance;
    }

    public String receberReclamacao(String mensagem) {
        return "A central de atendimento agradece seu contato.\n"
                + departamento.receberReclamacao(mensagem);
    }

    public String receberSugestao(String mensagem) {
        return "A central de atendimento agradece seu contato.\n"
                + departamento.receberSugestao(mensagem);
    }

    public String receberElogio(String mensagem) {
        return "A central de atendimento agradece seu contato.\n"
                + departamento.receberElogio(mensagem);
    }
}
