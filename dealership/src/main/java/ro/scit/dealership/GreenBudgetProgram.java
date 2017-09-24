package main.java.ro.scit.dealership;

public class GreenBudgetProgram {
    private int budget = 1000000;
    private String clientHistory;
    private String dealershipHistory;
    private String carModelHistory;

    public String getDealershipHistory() {
        return dealershipHistory;
    }

    public void setDealershipHistory(String dealershipHistory) {
        this.dealershipHistory = dealershipHistory;
    }


    public String getCarModelHistory() {
        return carModelHistory;
    }

    public void setCarModelHistory(String carModelHistory) {
        this.carModelHistory = carModelHistory;
    }

    public String getClientHistory() {
        return clientHistory;
    }

    public void setClientHistory(String clientHistory) {
        this.clientHistory = clientHistory;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}
