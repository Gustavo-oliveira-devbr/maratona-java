package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main (String[] args) {
        /*
         int, double, float, char, bye, short, long, boolean
         tipos primitivos são escritos em letra minúscula
         */
        int age = 10;
        long largeNumber = (long) 155.23;
        // Casting não é muito usado para isso mas aqui vemos que é possivel
        double salaryDouble = 2000.0;
        float salaryFloat = 2500.0F;
        byte ageByte = 10;
        short ageShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char character = '\u0041';
        // String não é um tipo primitivo, é uma classe
        String name = "Melina";

        System.out.println("The age is"+age+" years!");
        System.out.println("Char: "+character);
        System.out.println(largeNumber);
        System.out.println(name);

        // Mudança do level do Java para a versão 8
    }
}