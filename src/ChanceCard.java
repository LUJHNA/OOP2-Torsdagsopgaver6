public class ChanceCard {
   private String nameOfCard;
   private int cardExpense;
   private int cardIncome;

    public ChanceCard(String nameOfCard, int cardExpense, int cardIncome){
        this.nameOfCard = nameOfCard;
        this.cardExpense = cardExpense;
        this.cardIncome = cardIncome;
    }

    public String getNameOfCard() {
        return nameOfCard;
    }

    public int getCardExpense() {
        return cardExpense;
    }

    public int getCardIncome() {
        return cardIncome;
    }
}
