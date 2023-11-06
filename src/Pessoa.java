import java.time.LocalDate;

public class Pessoa {
    //Atributos
    private String nome;
    private LocalDate datadeNascimento;
    private String cpf;
    private double altura;
    private double peso;

    private  int idFederacao;
    public  int getidFederacao(){
        return  idFederacao;
    }

    public void setIdFederacaoFederacao(int idfederacao) {
       this.idFederacao = idfederacao;
    }
    // Getters e setters

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDatadeNascimento() {
        return datadeNascimento;
    }

    public void setDatadeNascimento(LocalDate datadeNascimento) {
        this.datadeNascimento = datadeNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Metodos
    public String sacar(){
        return "Não sei sacar...";
    }
}
