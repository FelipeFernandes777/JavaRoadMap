package POO.introducao;

public class Main {
    public static void main(String[] args) {
//        Estudante[] estudantes = new Estudante[5];

        Estudante felipe = new Estudante(13,"Felipe Fernandes",88.5f);
        Estudante emanuelle = new Estudante();

//        felipe.rno = 13;
//        felipe.nomes = "Felipe Fernandes";
//        felipe.nota = 88.5f;

        felipe.apresentacao();
    }
}
class Estudante {
    int rno;
    String nome;
    float nota;

     Estudante () {
         this.rno = 12;
         this.nome = "Emanuelle Assis";
         this.nota = 98.5f;
    }
    Estudante (int rno, String nome, float nota) {
        this.rno = rno;
        this.nome = nome;
        this.nota = nota;
    }
    Estudante (Estudante outroEstudante) {
        this.rno = outroEstudante.rno;
        this.nome = outroEstudante.nome;
        this.nota = outroEstudante.nota;
    }

    void apresentacao(){
        System.out.println("Olá! Meu nome é " + this.nome);
    }

    void trocaNome(String novoNome) {
         this.nome = novoNome;
    }
}