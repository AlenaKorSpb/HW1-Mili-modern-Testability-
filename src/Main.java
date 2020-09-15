public class Main {
    public static void main(String[] args) {
        BonusMilesService bonusMilesService = new BonusMilesService();
        long mili = bonusMilesService.calculate(10_000);
        System.out.println(mili);
    }
}
