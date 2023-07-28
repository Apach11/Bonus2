public class BonusMilesService {
    public int calculate(int price) {
        int reward = 20;
        int miles = price / reward;
        return miles;
    }
}