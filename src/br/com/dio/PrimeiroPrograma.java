package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        Gato gato = new Gato();
        System.out.println(gato);

        Livro Livro = new Livro("o problema dos tres corpos",300);

       /* int a = 2;
        int b = 3;
        System.out.println("Hello World! " + "Hi" + (a + b));*/
    }
}
class Livro {
    private String nome;
    private String numpaginas;

    public Livro(String nome, String numpaginas) {
        this.nome = nome;
        this.numpaginas = numpaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumpaginas() {
        return numpaginas;
    }

    public void setNumpaginas(String numpaginas) {
        this.numpaginas = numpaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numpaginas='" + numpaginas + '\'' +
                '}';
    }
}
