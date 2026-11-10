package mediator;

public abstract class Pessoa {

    public String reclamar(String mensagem) {
        return CentralAtendimento.getInstance().receberReclamacao(mensagem);
    }

    public String sugerir(String mensagem) {
        return CentralAtendimento.getInstance().receberSugestao(mensagem);
    }

    public String elogiar(String mensagem) {
        return CentralAtendimento.getInstance().receberElogio(mensagem);
    }
}
