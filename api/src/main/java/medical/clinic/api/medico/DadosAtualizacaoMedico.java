package medical.clinic.api.medico;

import jakarta.validation.constraints.NotNull;
import medical.clinic.api.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
                                     String nome,
                                     String telefone,
                                     DadosEndereco endereco) {
}
