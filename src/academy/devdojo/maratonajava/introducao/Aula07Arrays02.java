package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // Valores padrão quando array não tem valor declarado:
        // byte, short, int, long, float and double = 0
        // char = '\u0000' ' '
        // boolean = false
        // String = null

        String[] names = new String[3];
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
    }
}
