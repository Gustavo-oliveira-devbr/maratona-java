package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // Valores padrão quando array não tem valor declarado:
        // byte, short, int, long, float and double = 0
        // char = '\u0000' ' '
        // boolean = false
        // String = null

        String[] names = new String[3];
        names[0] = "Melina";
        names[1] = "CR7";
        names[2] = "Zoro";
        names[2] = "Luffy";

        for (int i = 0; i < 4; i++) {
            System.out.println(names[i]);
        }
    }
}
