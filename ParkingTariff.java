public class ParkingTariff {

    int collectionLength;
    String[] money;
    private TimePeriod[] timePeriodList;

    public ParkingTariff() {
        collectionLength = 10;

        money = new String[collectionLength];
        money[0] = String.format("R%d.00", 10);
        money[1] = String.format("R%d.00", 15);
        money[2] = String.format("R%d.00", 20);
        money[3] = String.format("R%d.00", 30);
        money[4] = String.format("R%d.00", 40);
        money[5] = String.format("R%d.00", 50);
        money[6] = String.format("R%d.00", 60);
        money[7] = String.format("R%d.00", 70);
        money[8] = String.format("R%d.00", 90);
        money[9] = String.format("R%d.00", 100);

        timePeriodList = new TimePeriod[collectionLength];
        timePeriodList[0] = new TimePeriod(new Duration("hour", 0), new Duration("hour", 1));
        timePeriodList[1] = new TimePeriod(new Duration("hour", 1), new Duration("hour", 2));
        timePeriodList[2] = new TimePeriod(new Duration("hour", 2), new Duration("hour", 3));
        timePeriodList[3] = new TimePeriod(new Duration("hour", 3), new Duration("hour", 4));
        timePeriodList[4] = new TimePeriod(new Duration("hour", 4), new Duration("hour", 5));
        timePeriodList[5] = new TimePeriod(new Duration("hour", 5), new Duration("hour", 6));
        timePeriodList[6] = new TimePeriod(new Duration("hour", 6), new Duration("hour", 7));
        timePeriodList[7] = new TimePeriod(new Duration("hour", 7), new Duration("hour", 8));
        timePeriodList[8] = new TimePeriod(new Duration("hour", 8), new Duration("hour", 9));
        timePeriodList[9] = new TimePeriod(new Duration("hour", 9), new Duration("hour", 10));

        this.toString();
    }

    public String toString() {

        for (int i = 0; i < collectionLength;) {
            while (i < collectionLength) {
                return String.format("%s : %s \n", timePeriodList[i].toString(), money[i]);
            }
            i++;
        }
        return null;
    }

}
