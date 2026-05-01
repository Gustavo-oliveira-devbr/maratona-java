package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int number01 = 10;
        int number02 = 20;
        int result = number01 * number02;
        System.out.println(result);

        // % significa resto
        int rest = 21 % 8;
        System.out.println(rest);

        // < > <= >= == != operadores lógicos que sempre retornam valores booleanos
        // menor, maior, menor igual, maior igual, igual, diferente

        boolean isTenMoreThanTwenty = 10 > 20;
        boolean isTenLessThanTwenty = 10 < 20;
        boolean isTenEqualsTwenty = 10 == 20;
        boolean isTenDifferentFromTwenty = 10 != 20;

        // Não se pode usar valores incomparáveis tipo comparar um número com uma string

        System.out.println("Ten more than twenty? "+isTenMoreThanTwenty);
        System.out.println("Ten less than twenty? "+isTenLessThanTwenty);
        System.out.println("Ten is equals twenty? "+isTenEqualsTwenty);
        System.out.println("Ten is different from twenty? "+isTenDifferentFromTwenty);

        /*
         Operadores lógicos: && (and)
                             || (or)
                              ! (not)
         */

        int age = 29;
        float salary = 3500F;
        boolean isWithinTheLawGreaterThanThirty = age >= 30 && salary >= 4612;
        boolean isWithinTheLawLessThanThirty = age < 30 && salary >= 3381;
        System.out.println("isWithinTheLawGreaterThanThirty "+isWithinTheLawGreaterThanThirty);
        System.out.println("isWithinTheLawLessThanThirty "+isWithinTheLawLessThanThirty);
        // Usando "and" os todos os valores tem que estar positivos

        double totalCheckingAccountBalance = 200;
        double totalCheckingSavingsAccount = 10000;
        float playstationPrice = 5000F;
        boolean isPlaystationFiveAffordable = totalCheckingAccountBalance > playstationPrice || totalCheckingSavingsAccount > playstationPrice;
        System.out.println("isPlaystationFiveAffordable "+isPlaystationFiveAffordable);

        // Outros operadores de atribuição: = += -= *= /= %=

        double bonus = 1800;
        bonus += 1000;
        // Serve para simplificar bonus = bonus + 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        int accountant = 0;
        accountant += 1; // Contador recebe Contador + 1
        accountant++; //serve para abreviar ainda mais funciona tanto com + quanto com -
        accountant--;
        ++accountant;
        --accountant;
        int accountant2 = 0;
        System.out.println(accountant2++); // Dessa maneira primeiro é executada a impressão então o valor fica zerado
        System.out.println(++accountant2); // Assim primeiro é incrementado e valor e depois impresso então temos um valor
    }
}