package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int age = 15;
        boolean isAuthorizedPurchaseDrinks = age >= 18;
        if (age >= 18) {
            System.out.println("authorized to purchase alcoholic beverages");
        }

        if (age < 18 ) {
            System.out.println("Not permitted to purchase alcoholic beverages");
        }

        // Fiz de uma maneira simples com o que já tinha estudado de lógica e abaixo a mais complexa do prof, ambas funcionam para essa tarefa simples

        if (isAuthorizedPurchaseDrinks){
            System.out.println("authorized to purchase alcoholic beverages");
        }

        if (!isAuthorizedPurchaseDrinks){
            System.out.println("Not permitted to purchase alcoholic beverages");
        }
    }
}
