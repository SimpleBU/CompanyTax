package taxes;

// УСН "Доходы минус расходы" — 15% от разницы (доходы - расходы)
public class USNIncomeMinusExpenses extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        int profit = debit - credit;
        if (profit < 0) profit = 0;
        return (int) (profit * 0.15);
    }
}
