
package escola;


        public class Escola {
    // Atributos privados
    private String nome;
    private String endereco;

    // Construtor da classe
    public Escola(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    // Getter para o atributo nome
    public String getNome() {
        return nome;
    }

    // Setter para o atributo nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para o atributo endereco
    public String getEndereco() {
        return endereco;
    }

    // Setter para o atributo endereco
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // Método para exibir informações da escola
    public void exibirInformacoes() {
        System.out.println("Nome da Escola: " + nome);
        System.out.println("Endereço da Escola: " + endereco);
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        // Criando um objeto Escola
        Escola escola = new Escola("Escola Exemplo", "Rua das Flores, 123");

        // Exibindo as informações da escola
        escola.exibirInformacoes();

        // Modificando o nome e o endereço da escola
        escola.setNome("Nova Escola Exemplo");
        escola.setEndereco("Avenida Central, 456");

        // Exibindo as informações atualizadas
        escola.exibirInformacoes();
    }
}

    
    

