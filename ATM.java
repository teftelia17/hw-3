public class ATM {
    public int countBanknotes(int sum) {
        int count = 0;
        int[] banknotes = new int[] {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int i = 0;
        while (sum != 0) {
            if (sum - banknotes[i] < 0) {
                i++;
            }
                if (sum - banknotes[i] >= 0) {
                count += 1;
                sum -= banknotes[i];
                    if (sum - banknotes[i] == 0){
                        count +=1;
                        break;
                    }
                }
            }
        return count;
    }
    public static void main(String[] args) {
        ATM atm = new ATM();

        System.out.println(atm.countBanknotes(2277 ));
    }
}
