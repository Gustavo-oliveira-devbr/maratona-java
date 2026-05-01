package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double annualSalary = 65000;
        double firstTrack = 9.70 / 100;
        double secondTrack = 37.35 / 100;
        double thirdTrack = 49.50 / 100;
        double taxAmount;
        if (annualSalary <= 34712) {
            taxAmount = annualSalary * firstTrack;
        }else if (annualSalary >= 34713 && annualSalary <= 68507) {
            taxAmount = annualSalary * secondTrack;
        }else {
            taxAmount = annualSalary * thirdTrack;
        }
        System.out.println("Total annual tax amount: "+taxAmount);
    }
}
