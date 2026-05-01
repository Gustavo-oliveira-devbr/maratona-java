package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salary = 3000;
        String donateMessage = "I'm going to donate 500 to the orphanage";
        String notDonateMessage = "I can't afford to donate yet, but I will be able to!";

        // Operadores ternários tem essa sintaxe -> (condition) ? true : false;
        // Pode ser feito assim -> String result = salary > 5000 ? donateMessage : notDonateMessage;
        // Também pode ser feito da maneira abaixo poupando necessidade das Strings acima:

        String result = salary > 5000 ? "I'm going to donate 500 to the orphanage" : "I can't afford to donate yet, but I will be able to!";
        System.out.println(result);
    }
}
