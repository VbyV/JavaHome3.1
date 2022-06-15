public class BonusMilesService {
    public int calculate(int cost) {
        int percent;
        if (cost >= 20) {
            percent = 5;
        } else {
            percent = 0;
        }
        int miles = cost * percent / 100;
        return miles;
    }

}
