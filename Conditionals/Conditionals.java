package Conditionals;

import java.util.Scanner;

/**
    Declarações condicionais,expressões ou simplesmentes condicionais. São recursos de linguagens de programação que ->
    dizem ao computador para executar determinadas ações desde que determinada condição seja atendida.

    Declarações são usadas para instruir o computador, em qual decisão deve ser tomada quando dadas algumas condições.
    Estas decisões são tomadas e somente se as condições pré declaradas forem "true"ou "false"
 */
public class Conditionals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String day = in.next();

        //Condição
        if (day.equals("Monday")){
            //Decisão
            System.out.println("Go to School");
        }

        System.out.println("Digite o clima");
        String clima = in.next();
        WeatherSwitch(clima);

        /* Operador ternario (?,:)*/
        /** Uma forma abreviada de verificar a condição. Se a condição for verdadeira, o resultado de ? é retornado ->
         * mas se a condição for falsa o resultado de : é tomado */;

         int number = 18;
         String output = (number % 2 == 0) ? "Numero par" : "Numero impar";

        System.out.println(output);

        /**
         *  Instrução aninhada
         *  Representa um bloco if, dentro de outro bloco if.
         *  A condição interna so é executada quando a condição externa é verdadeira
         * */

        int weight = 60;
        if(number >= 18){
            System.out.println("Primeiro if");
            if (weight > 50){
                System.out.println("Segundo if");
            } else {
                System.out.println("Else, segundo if");
            }
        } else {
            System.out.println("Else, primeiro if");
        }

        SwitchEnum();
    }

    public static void Weather(String myDay) {
        //Condição
        if(myDay.equals("Sunny")){
            //Decisão
            System.out.println("Read in the library");
            //2nd Condição
        } else if (myDay.equals("Raining")) {
            System.out.println("Read at home");
            //3rd Condição
        } else if (myDay.equals("Cloudy")) {
            System.out.println("Read in the garden");
        } else {
            //Desição padrão
            System.out.println("Get some sleep");
        }
    }

    public static void WeatherSwitch(String myDay) {
        /**
         Switch é outra versão da declaração condicional.
         Cada bloco é finalizado com uma palavra chave "break", as declarações em switch são expressas com "cases".
        O break é opcional, quando chega a instrução break, ele salta o controle após a expressão. Se ela uma instrução->
         break, não for encontrada ela executa o proximo caso.
        O valor default é opcional.
         A expressão deve ser byte, short, int,long ( Com seu tipo Wrapper ), enums e string.
         **/
        switch (myDay){
            case "Sunny":
                System.out.println("Read in the library");
                break;
            case "Raining":
                System.out.println("Read at home");
                break;
            case "Cloudy":
                System.out.println("Read in the garden");
                break;
            default:
                System.out.println("Get some Sleep");
                break;
        }
    }

    public static void SwitchEnum() {
        enum Day {Dom,Seg,Ter,Qua,Qui,Sex,Sab}

        Day[] DayNow = Day.values();

        for (Day now : DayNow) {
            switch (now) {
                case Dom -> System.out.println("Domingo");
                case Seg -> System.out.println("Segunda");
                case Ter -> System.out.println("Terça");
                case Qua -> System.out.println("Quarta");
                case Qui -> System.out.println("Quinta");
                case Sex -> System.out.println("Sexta");
                case Sab -> System.out.println("Sabado");
            }
        }
    }

    public static void NestedSwitch(){
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1:
                System.out.println("Felipe");
                break;
            case 2:
                System.out.println("Emanuelle");
                break;
            case 3:
                System.out.println("Emp numero 3");
                switch (department){
                    case "TI":
                        System.out.println("Departamento de TI");
                    case "Diretores":
                        System.out.println("Diretores");
                    default:
                        System.out.println("Insira um departamento valido");
                }
                break;
            default:
                System.out.println("Insira um ID valido.");
        }
    }
}
