public class Kelly {
    private double result;

    public void calculate(String sbank, String steamACsgo, String steamBCsgo, String steamAOdd, String steamBOdd) {
        double p;
        double q;
        double winning;
        double losing;
        double bank = Double.parseDouble(sbank);
        double teamACsgo = Double.parseDouble(steamACsgo);
        double teamBCsgo = Double.parseDouble(steamBCsgo);
        double teamAOdd = Double.parseDouble(steamAOdd);
        double teamBOdd = Double.parseDouble(steamBOdd);
        if (teamACsgo >= 50.0) {
            losing = teamACsgo / 100.0;
            winning = teamBCsgo / 100.0;
            p = teamBOdd / 100.0;
            q = teamAOdd / 100.0;
        } else {
            losing = teamBCsgo / 100.0;
            winning = teamACsgo / 100.0;
            p = teamAOdd / 100.0;
            q = teamBOdd / 100.0;
        }
        double b = losing / winning;
        double f = (b * p - q) / b;
        this.result = (double)Math.round(bank * f * 100.0) / 100.0;
    }

    public double getFraction() {
        return this.result;
    }
}
