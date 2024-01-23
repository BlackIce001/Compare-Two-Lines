public class stline {
    double slope;
    double intercept;

    stline(double s,double i)
    {
        this.slope=s;
        this.intercept=i;
    }
    public double calculateSlope() {
        return slope;
    }

    // Method to calculate the intercept of the line
    public double calculateIntercept() {
        return intercept;
    }
    boolean equals(stline other) {

        return this.slope == other.slope && this.intercept == other.intercept;
    }


}
