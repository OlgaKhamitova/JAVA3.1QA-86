public class BonusMilesService {

    public int calculateBonusMiles(int price) {
        int bonus = 20;
        int miles = price / bonus;
        return miles;

    }
}
