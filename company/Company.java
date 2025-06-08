package company;

import taxes.TaxSystem;

public class Company {
    private String title;
    private int debit; // доходы
    private int credit; // расходы
    private TaxSystem taxSystem;

    // Конструктор
    public Company(String title, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;
        this.debit = 0;
        this.credit = 0;
    }

    // Метод изменения налоговой системы
    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    // Метод учета денег
    public void shiftMoney(int amount) {
        if (amount > 0) {
            debit += amount;
        } else if (amount < 0) {
            credit += Math.abs(amount);
        }
        // если amount == 0, ничего не делаем
    }

    // Метод уплаты налогов
    public void payTaxes() {
        int tax = taxSystem.calcTaxFor(debit, credit);
        System.out.println("Компания " + title + " уплатила налог в размере: " + tax + " руб.");
        // Обнуляем счётчики
        debit = 0;
        credit = 0;
    }
}
