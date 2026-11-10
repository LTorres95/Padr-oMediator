package mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class ClienteTest {

    @Test
    void deveEncaminharReclamacaoAoSuporte() {
        Cliente cliente = new Cliente();

        assertEquals("A central de atendimento agradece seu contato.\n"
                        + "O suporte vai analisar a reclamação: Meu pedido chegou danificado.",
                cliente.reclamar("Meu pedido chegou danificado."));
    }

    @Test
    void deveEncaminharSugestaoAoSuporte() {
        Cliente cliente = new Cliente();

        assertEquals("A central de atendimento agradece seu contato.\n"
                        + "O suporte vai avaliar a sugestão: Oferecer entrega aos domingos.",
                cliente.sugerir("Oferecer entrega aos domingos."));
    }

    @Test
    void deveEncaminharElogioAoSuporte() {
        Cliente cliente = new Cliente();

        assertEquals("A central de atendimento agradece seu contato.\n"
                        + "O suporte agradece o elogio: A troca foi resolvida rapidamente.",
                cliente.elogiar("A troca foi resolvida rapidamente."));
    }

    @Test
    void deveManterInstanciaUnicaDaCentral() {
        assertSame(CentralAtendimento.getInstance(), CentralAtendimento.getInstance());
    }

    @Test
    void deveManterInstanciaUnicaDoSuporte() {
        assertSame(Suporte.getInstance(), Suporte.getInstance());
    }
}
