package mediator;

public interface Departamento {

    String receberReclamacao(String mensagem);

    String receberSugestao(String mensagem);

    String receberElogio(String mensagem);
}
