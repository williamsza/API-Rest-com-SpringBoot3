package medical.clinic.api.medico;

import medical.clinic.api.endereco.DadosEnderecco;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEnderecco endereco) {
    
}
