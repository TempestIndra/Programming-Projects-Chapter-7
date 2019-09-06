public class Card {

    public String CardFace, value;

    public Card(int n) {
        if (n / 4 == 0) {
            CardFace = "Heart";
        } else if (n / 4 == 1) {
            CardFace = "Club";
        } else if (n / 4 == 2) {
            CardFace = "Diamond";
        } else {
            CardFace = "Spade";
        }
        if (n % 4 == 1) {
            value = "ace";
        } else if (n % 13 == 11) {
            value = "Jack";
        } else if (n % 13 == 12) {
            value = "Queen";
        } else if (n % 13 == 0) {
            value = "King";
        } else
            value = String.valueOf( n%13 );
    }

    public String toString(){
        return "CardFace " + CardFace + " Value " +value;
    }
}
