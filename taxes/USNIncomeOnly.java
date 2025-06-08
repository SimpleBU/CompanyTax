package taxes;

// УСН "Доходы" — 6% от доходов
public class USNIncomeOnly extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        return (int) (debit * 0.06);
    }
}

