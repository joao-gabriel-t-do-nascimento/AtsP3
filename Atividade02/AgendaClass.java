package Atividade02;

public class AgendaClass {
    private String[] contato_name = new String[1];
    private Long[] numero_contato = new Long[1];
    int contatosTotais = 0;

    public void addContato(Long nc, String cn) {
        String[] cnMaisUm = new String[contato_name.length + 1];
        Long[] ncMaisUm = new Long[numero_contato.length + 1];

        for (int i = 0; i < cnMaisUm.length - 1; i++) {
            cnMaisUm[i] = contato_name[i];
            ncMaisUm[i] = numero_contato[i];
        }
        cnMaisUm[contatosTotais] = cn;
        ncMaisUm[contatosTotais] = nc;
        contato_name = cnMaisUm;
        numero_contato = ncMaisUm;

        contatosTotais = contatosTotais + 1;
    }

    public void listar() {
        for (int i = 0; i < contato_name.length; i++) {
            System.out.println("Contato " + i + ": " + contato_name[i] + ", número: " + numero_contato[i]);
        }
    }

    public void remover(int pos) {
        String[] removeName = new String[contato_name.length - 1];
        Long[] removeContato = new Long[numero_contato.length - 1];
        int check = 0;
        for (int i = 0; i < removeContato.length; i++) {
            if (i == pos) {
                check = 1;
            }
            removeName[i] = contato_name[i + check];
            removeContato[i] = numero_contato[i + check];
        }
        contato_name = removeName;
        numero_contato = removeContato;
        contatosTotais--;
    }
}
