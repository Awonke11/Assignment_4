/*
 * A program that contains the lower and upper time bounds of a parking ticket
 * Author: Awonke Mnotoza
 * Student number: MNTAWO002
 * Date: 24 August 2022
 */

public class TimePeriod {

    // & Initializing the Duration objects using the principle of Encapsulation
    private Duration lowerHour;
    private Duration upperHour;

    public TimePeriod(Duration lowerBound, Duration upperBound) {
        this.lowerHour = lowerBound;
        this.upperHour = upperBound;

        // ^ The time bounds Output
        this.toString();
    }

    // ^ Obtain the lower bound for this time period
    public Duration lowerBound() {
        return this.lowerHour;
    }

    // ^ Obtain the upper bound for this time period
    public Duration upperBound() {
        return this.upperHour;
    }

    // ^ Determine whether the given duration falls within this time period
    public boolean includes(Duration duration) {
        long givenDuration = duration.intValue("minute");

        if (givenDuration >= this.lowerHour.intValue("minute") && givenDuration < this.upperHour.intValue("minute")) {
            return true;
        }
        return false;
    }

    // ^ Determine whether this time period precedes the other time period
    public boolean precedes(TimePeriod other) {
        if (other.lowerHour.intValue("minute") >= this.lowerHour.intValue("minute")) {
            return true;
        }
        return false;
    }

    // ^ Determine whether this time period is adjacent to the other time period
    public boolean adjacent(TimePeriod other) {
        long firstClassLower = this.lowerHour.intValue("minute");
        long firstClassUpper = this.upperHour.intValue("minute");

        long secondClassLower = other.lowerHour.intValue("minute");
        long secondClassUpper = other.upperHour.intValue("minute");

        if ((firstClassUpper == secondClassLower) || (secondClassUpper == firstClassLower)) {
            return true;
        }
        return false;
    }

    // ^ Obtain a String representation of this TimePeriod object
    public String toString() {
        long lowerHour = this.lowerHour.intValue("minute");
        long upperHour = this.upperHour.intValue("minute");

        if (upperHour < 30) {
            return String.format("[%s minutes .. %s minutes]", lowerHour, upperHour);
        } else if (lowerHour >= 30 && upperHour < 60) {
            return String.format("[%s minutes .. %s hour]", lowerHour, upperHour / 60);
        } else if (lowerHour >= 60 && upperHour < 180) {
            return String.format("[%s hour .. %s hours]", lowerHour / 60, upperHour / 60);
        } else if (upperHour >= 180 && upperHour < 360) {
            return String.format("[%s hours .. %s hours]", lowerHour / 60, upperHour / 60);
        } else if (lowerHour >= 360 && upperHour < 720) {
            return String.format("[%s hours .. %s hours]", lowerHour / 60, upperHour / 60);
        } else {
            return String.format("[%s hours .. %s hours]", lowerHour / 60, upperHour / 1440);
        }
    }
}
