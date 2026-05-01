package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // age < 15 - children's category
        // age >= 15 && age > 18 - youth category
        // age >= 18 - adult category
        int age = 19;
        String category;
        if(age < 15){
            System.out.println("children's category");
        }else if(age >= 15 && age < 18){
            System.out.println("youth category");
            // Aqui é uma redundância fazer -> }else if(age >= 18){
        }else {
            System.out.println("adult category");

            // Outra maneira de se fazer para deixar o código mais limpo é add uma String assim:

            if (age < 15) {
                category = "children's category";
            } else if (age >= 15 && age < 18) {
                category = "youth category";
            } else {
                category = "adult category";
            }
            System.out.println(category);
        }
    }
}
