import java.util.ArrayList;

public class Wallet {
    private String name;
    ArrayList<IScan> cards;
//    private ArrayList<CreditCard> creditCards;
//    private ArrayList<DebitCard> debitCards;
//    private ArrayList<LoyaltyCard> loyaltyCards;
//    private ArrayList<Ticket> tickets;

    public Wallet(String name) {
        this.name = name;
//        this.creditCards = new ArrayList<CreditCard>();
//        this.debitCards = new ArrayList<DebitCard>();
//        this.loyaltyCards = new ArrayList<LoyaltyCard>();
        this.cards = new ArrayList<IScan>();
    }

    public String getName() {
        return name;
    }

    public int getNumberOfItems() {
//        return this.creditCards.size() + this.debitCards.size() + this.loyaltyCards.size() + this.tickets.size();
        return this.cards.size();
    }

    public void addItem(IScan item) {
        this.cards.add(item);
    }
//
//    public void addItem(CreditCard item) {
//        this.cards.add(item);
//    }
//
//    public void addItem(DebitCard item) {
//        this.cards.add(item);
//    }
//
//    public void addItem(LoyaltyCard item) {
//        this.cards.add(item);
//    }
//
//    public void addItem(Ticket item) {
//        this.cards.add(item);
//    }
}
