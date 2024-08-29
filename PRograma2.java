public class Programa2 {
    public static void main(String[] args) {
        
        PessoaFisica pessoafisica = new PessoaFisica();

        pessoafisica.setNome("Bruna");
        pessoafisica.setcep("31620-560");
        pessoafisica.setrg("MG-16.536.484");
        pessoafisica.setcpf("155.191.856-03");
        pessoafisica.setprofissao("bombeira");
        
        PessoaFisica.exibirInformacoes();
    }
}
