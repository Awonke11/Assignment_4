/*
 * A TariffTable records parking tariffs for a pay-to-stay car park.
 * Author: Awonke Mnotoza
 * Date: 27 August 2022
 * Student number: MNTAWO002 
 */

public class TariffTable {
    private int maxSize;
    TimePeriod[] tariffTimePeriodList;
    Money[] tariffMoneyList;

    public TariffTable(int maxSize) {
        this.maxSize = maxSize;
        this.tariffTimePeriodList = new TimePeriod[maxSize];
        this.tariffMoneyList = new Money[maxSize];

        this.toString();
    }

    // ^ Add the tariff for the given period to the table
    public void addTariff(TimePeriod period, Money tariff) {
        for (int i = 0; i < maxSize; i++) {
            if (tariffTimePeriodList[i] == null && tariffMoneyList[i] == null) {
                tariffTimePeriodList[i] = period;
                tariffMoneyList[i] = tariff;
            }
        }
    }

    // ^ Obtain the tariff for the given length of stay
    public Money getTariff(Duration lengthOfStay) {
        for (int j = 0; j < maxSize; j++) {
            long durationStay = lengthOfStay.intValue();

            long lowerBoundValue = tariffTimePeriodList[j].lowerBound().intValue();
            long upperBoundValue = tariffTimePeriodList[j].upperBound().intValue();

            if (lowerBoundValue <= durationStay && durationStay <= upperBoundValue) {
                return tariffMoneyList[j];
            }
        }
        return null;
    }

    // ^ Obtain a String representation of this TariffTable in the form:
    public String toString() {
        for (int i = 0; i < maxSize;) {
            while (i < maxSize) {
                if (this.tariffTimePeriodList[i] != null && this.tariffMoneyList[i] != null) {
                    return String.format("%s : %s \n", this.tariffTimePeriodList[i].toString(),
                            this.tariffMoneyList[i].toString());
                } else {
                    return null;
                }
            }
        }
        return null;
    }

}
