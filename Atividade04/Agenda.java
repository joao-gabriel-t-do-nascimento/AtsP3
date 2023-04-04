package at04;

public class Agenda {
    protected String[] nome = new String[500];
    protected String[] email = new String[500];
    protected String[] palavraChave = new String[500];
    protected int pos = 0;

    public void inserir(String nome, String email, String palavraChave) {
        if (pos == 500) {
            throw new IllegalStateException("Nã há espaço na agenda");
        }
        this.nome[pos] = nome;
        this.email[pos] = email;
        this.palavraChave[pos] = palavraChave;
        pos++;
    }

    void buscarNome(String nome){
        for(int i = 0; i < this.nome.length; i++){
            if(this.nome[i].equals(nome)){
                System.out.println("Nome:" + this.nome + ", email:" + this.email);
            }
        }
    }

    void buscarEmail(String email){
        for(int i = 0; i < this.email.length; i++){
            if(this.email[i].equals(email)){
                System.out.println("Nome:" + this.nome[i] + ", email:" + this.email[i]);
                break;
            }
        }
    }

    void buscarPosisção(int pos){
        System.out.println("Nome:" + this.nome[pos] + ", email:" + this.email[pos]);
    }

    void setNome(String nome){
        this.nome[this.pos] = nome;
    }
}
