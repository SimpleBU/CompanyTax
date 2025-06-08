import taxes.*;
import company.Company;

public class Main {
    public static void main(String[] args) {
        // Создаем две компании с разными системами налогообложения
        Company company1 = new Company("Газпром", new USNIncomeOnly());
        Company company2 = new Company("Сбер", new USNIncomeMinusExpenses());

        // Начисляем доходы и расходы
        company1.shiftMoney(100_000); // доход
        company1.shiftMoney(-20_000); // расход

        company2.shiftMoney(200_000); // доход
        company2.shiftMoney(-150_000); // расход

        // Уплачиваем налоги
        company1.payTaxes();
        company2.payTaxes();

        // Меняем налоговую систему у второй компании и тестируем снова
        company2.setTaxSystem(new USNIncomeOnly());
        company2.shiftMoney(300_000);
        company2.payTaxes();
    }
}
