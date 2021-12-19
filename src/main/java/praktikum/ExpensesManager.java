package praktikum;

public class ExpensesManager {

    double[] expenses;

    ExpensesManager() {
        expenses = new double[7];
    }


    double saveExpense(double moneyBeforeSalary, double expense, int day) {
        moneyBeforeSalary = moneyBeforeSalary - expense;
        expenses[day - 1] = expenses[day - 1] + expense;
        System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
        if (moneyBeforeSalary < 1000) {
            System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
        }
        return moneyBeforeSalary;
        // Печать вопросов и считывание ответов оставьте в классе Praktikum


    }

    void printAllExpenses() {
        for (int i = 0; i < this.expenses.length; i++) {
            System.out.println("День " + (i + 1) + ". Потрачено " + this.expenses[i] + " рублей");
        }
    }

    double findMaxExpense() {
        double maxExpense = 0;
        for (int i = 0; i < this.expenses.length; i++) {
            if (this.expenses[i] > maxExpense) {
                maxExpense = this.expenses[i];
            }
        }
        return maxExpense;
    }

}