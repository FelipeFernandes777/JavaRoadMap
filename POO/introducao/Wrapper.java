package POO.introducao;

public class Wrapper {
    /** A classe wrapper em Java fornece o mecanismo para converter primitivo em objeto e objeto em primitivo */
    public static void main(String[] args) {
        /**
         Tipo primitivo	Classe Wrapper
         boolean	    Boolean
         char	        Character
         byte	        Byte
         short	        Short
         int	        Integer
         long	        Longo
         float	        Float
         double	        Double **/
//        int num1 = 10;
//        int num2 = 20;
        Integer num1 = 10;
        Integer num2 = 20;
        Integer num = 45;

        troca(num1, num2);
        System.out.println("Numero 1: " + num1 + "\n" + "Numero 2: " + num2);

        final A felipe = new A("Felipe");
        System.out.println(felipe.name); // Felipe
        felipe.name = "Outro nome";
        System.out.println(felipe.name); // Outro nome


//        Não é possível atribuir um valor à variável final
//        felipe = new A("Novo Objeto");
    }

//    static void troca(int num1, int num2) {
//        int temporario = num1;
//        num1 = num2;
//        num2 = temporario;
//    }

    static void troca(Integer num1, Integer num2) {
        Integer temporario = num1;
        num1 = num2;
        num2 = temporario;
    }
}

class A {
    final int num = 10;
    String name;
    public A (String name) {
        System.out.println("Objeto criado");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Objeto destruido");
    }
}