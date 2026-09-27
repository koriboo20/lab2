public class MarketingClub extends Club {

    private int budget;

    public MarketingClub(String c, int m, int budget) {
        super(c, m);
        this.budget = budget;
    }

    // Deducts the amount from budget. Does nothing (and returns false) if the
    // resulting budget would be negative.
    public boolean useBudget(int amount) {
        if (budget - amount < 0) {
            return false;
        }
        budget = budget - amount;
        return true;
    }

    @Override
    public int determineBudget() {
        if (budget > 1000) {
            return 0;
        }
        return super.determineBudget();
    }
}
