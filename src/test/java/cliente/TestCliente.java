package cliente;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import java.util.List;

import entidade.Cliente;

class TestCliente {

    /**
     * Testa o construtor sem argumentos do cliente.
     */
    @Test
    void testCliente() {
        Cliente instancia = new Cliente();
        assertTrue("".equals(instancia.getCliente_id()) && "".equals(instancia.getNome()) && "".equals(instancia.getCpf()));
    }

    @Test
    void testClienteIdInt() {
        Cliente instancia = new Cliente();
        instancia.setCliente_Id(1);
        assertTrue("1".equals(instancia.getCliente_id()) && "".equals(instancia.getNome()) && "".equals(instancia.getCpf()));
    }

    @Test
    void testParaString() {
        Cliente instancia = new Cliente();
        String esperado = "clienteId: - Nome : - CPF :";
        assertEquals(esperado, instancia.toString());
    }    
}
