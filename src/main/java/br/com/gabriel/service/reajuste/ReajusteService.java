package br.com.gabriel.service.reajuste;

import br.com.gabriel.model.Funcionario;

import java.math.BigDecimal;
import java.util.List;

public class ReajusteService {

    private final List<ValidacaoReajuste> validacoes;

    public ReajusteService(List<ValidacaoReajuste> validacoes) {
        this.validacoes = validacoes;
    }

    public void reajustarSalarioDoFuncionaro(Funcionario funcionario, BigDecimal aumento) {
        validacoes.forEach(validacaoReajuste -> validacaoReajuste.validar(funcionario, aumento));

        BigDecimal salarioReajustado = funcionario.getSalario().add(aumento);

        funcionario.atualizarSalario(salarioReajustado);
    }
}
