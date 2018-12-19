
public class EnumDemo2 {
	private enum Suit{CLUBS,DIAMONDS,HEARTS,SPADES}

	public static void main(String[] args) {
		Suit s = Suit.valueOf("DIAMONDS");
		switch(s) {
		case CLUBS : System.out.println(Suit.CLUBS);break;
		case DIAMONDS : System.out.println(Suit.DIAMONDS);break;
		case HEARTS : System.out.println(Suit.HEARTS);break;
		default : System.out.println(Suit.SPADES);
		}
		

	}

}
