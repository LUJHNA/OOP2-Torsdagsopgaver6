public class Tax extends Field{
    public Tax(int ID, String label, int cost, int income) {
        super(ID, label, cost, income);
    }

    @Override
    public String onLand(Player p) {
        String s = super.onLand(p);
        s += "\n Vil du betale fast beløb? Tast J for ja \n (Ellers trækker vi et beløb der svarer til 10 % af dine aktiver)";
        return s;
    }

    @Override
    protected String onAccept(Player p) {
        p.pay(this.cost);
        return p.getName()+" har nu betalt et fast beløb";
    }

    @Override
    protected String onReject(Player p) {
        float calcTax = calculateAssets(p) * 0.1f;
        p.pay((int) calcTax);

        return p.getName() + " Afviste at betale et fast beløb i skat. Vi har derfor trukket 10 % af " + p.getName() + "'s aktiver";
    }

    public int calculateAssets(Player p){

        return p.getBalance() + p.getPropertyValues();
    }

}
