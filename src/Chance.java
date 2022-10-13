public class Chance extends Field {
    public Chance(int id, String label, int cost, int income) {
        super(id, label, cost, income);
    }

    @Override
    public String onLand(Player p) {
        String s = super.onLand(p);
        s += "\n Træk et kort fra bunken. (Tast J eller N): ";

        return s;
    }

    //Todo:implementer denne metode sådan at der bliver trukket et kort fra bunken (se Task 2.b)
    public String onAccept(Player p) {
        ChanceCard c = Board.getChanceCard();

        return "Du har trukket kortet: " + c.getNameOfCard() +
                "\n Du skal betale: " + c.getCardExpense() +
                "\n Du skal have: " + c.getCardIncome() + " kr. tilbage";
    }
}
