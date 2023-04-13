package Atividade04;

public class ContatoBasico extends Agenda {
    private String[] telefones = new String[500];

    void setTelefone(String telefone) {
        telefones[this.pos] = telefone;
    }

    void getDados() {
        for (int i = 0; i < 500; i++) {
            if (nome[i] == null && email[i] == null && telefones[i] == null) {
                break;
            }
            System.out.println("Nome:" + this.nome[i] + ", email:" + this.email[i] + "telefone: " + telefones[i]);
        }
    }
}
