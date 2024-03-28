import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        double[] priceArray = new double[Bank.NUMBER_OF_BANKS];
        double[] sortedPriceArray = new double[Bank.NUMBER_OF_BANKS];
        Bank[] banks = new Bank[Bank.NUMBER_OF_BANKS];
        Bank bankAndPrice = new Bank();
        for (int i = 0; i < Bank.NUMBER_OF_BANKS; i++) {
            Bank bank = new Bank(Bank.bankNamesArray[i], bankAndPrice.buyPrice());
            priceArray[i] = bank.price;
            sortedPriceArray[i] = bank.price;
            banks[i] = bank;
//            System.out.println(bank); //Вивід переліка банків та курсів додано для тестування
        }
        Arrays.sort(sortedPriceArray);
        int bestBank1 = 0;
        int bestBank2 = 0;
        int bestBank3 = 0;
        for (int i = 0; i < sortedPriceArray.length; i++) {
            if (priceArray[i] == sortedPriceArray[sortedPriceArray.length - 1]) {
                bestBank1 = i;
            } else if (priceArray[i] == sortedPriceArray[sortedPriceArray.length - 2]) {
                bestBank2 = i;
            } else if (priceArray[i] == sortedPriceArray[sortedPriceArray.length - 3]) {
                bestBank3 = i;
            }
        }
        System.out.println("Найкращий курс у наступних банках:");
        System.out.println(banks[bestBank1]);
        System.out.println(banks[bestBank2]);
        System.out.println(banks[bestBank3]);

   }
}