package br.com.gabriel.service.promocao;

import br.com.gabriel.ValidacaoException;
import br.com.gabriel.model.Cargo;
import br.com.gabriel.model.Funcionario;

public class PromocaoService {

    public void promover(Funcionario funcionario, boolean metaBatida) {
        Cargo cargoAtual = funcionario.getDadosPessoais().getCargo();

        if (Cargo.GERENTE == cargoAtual) {
            throw new ValidacaoException("Gerentes nao podem ser promovidos!");
        }

        if (!metaBatida) {
            throw new ValidacaoException("Funcionario nao bateu a meta!");
        }

        Cargo novoCargo = cargoAtual.getProximoCargo();
        funcionario.promover(novoCargo);
    }
}
