package interpreter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FuncionarioTest {

    @Test
    void deveCalcularExpressaoComFormula() {
        Funcionario funcionario = new Funcionario();
        funcionario.setSalariofixo(1000.0);
        funcionario.setBonus(100.0);

        assertEquals(1001.0, funcionario.calcularSalario());
    }

}
