package med.voll.api.medico;

import med.voll.api.endereco.DadosEndereco;

import java.util.Objects;

public final class DadosCadastroMedico {
    private final String nome;
    private final String email;
    private final String crm;
    private final Especialidade especialidade;
    private final DadosEndereco endereço;

    DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereço) {
        this.nome = nome;
        this.email = email;
        this.crm = crm;
        this.especialidade = especialidade;
        this.endereço = endereço;
    }

    public String nome() {
        return nome;
    }

    public String email() {
        return email;
    }

    public String crm() {
        return crm;
    }

    public Especialidade especialidade() {
        return especialidade;
    }

    public DadosEndereco endereço() {
        return endereço;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (DadosCadastroMedico) obj;
        return Objects.equals(this.nome, that.nome) &&
                Objects.equals(this.email, that.email) &&
                Objects.equals(this.crm, that.crm) &&
                Objects.equals(this.especialidade, that.especialidade) &&
                Objects.equals(this.endereço, that.endereço);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, email, crm, especialidade, endereço);
    }

    @Override
    public String toString() {
        return "DadosCadastroMedico[" +
                "nome=" + nome + ", " +
                "email=" + email + ", " +
                "crm=" + crm + ", " +
                "especialidade=" + especialidade + ", " +
                "endereço=" + endereço + ']';
    }

//teste
}
