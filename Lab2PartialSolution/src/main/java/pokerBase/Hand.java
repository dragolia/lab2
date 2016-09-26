package pokerBase;

import java.util.ArrayList;

import pokerEnums.eCardNo;
import pokerEnums.eHandStrength;
import pokerEnums.eRank;
import pokerEnums.eSuit;

public class Hand {

	private ArrayList<Card> CardsInHand;

	private ArrayList<Card> getCardsInHand() {
		return CardsInHand;
	}

	private static boolean isHandFlush(ArrayList<Card> cards) {
		boolean bIsFlush = false;
		
		if (cards.get(eCardNo.FirstCard.getCardNo()).geteSuit() == cards.get(eCardNo.FifthCard.getCardNo()).geteSuit()) {
			bIsFlush = true;
		}
		

		return bIsFlush;
	}

	private static boolean isStraight(ArrayList<Card> cards, Card highCard) {
		boolean bIsStraight = false;
		boolean a = cards.get(eCardNo.FirstCard.getCardNo()).geteRank().getiRankNbr()+1 == cards.get(eCardNo.SecondCard.getCardNo()).geteRank().getiRankNbr();
		boolean b = cards.get(eCardNo.SecondCard.getCardNo()).geteRank().getiRankNbr()+1 == cards.get(eCardNo.ThirdCard.getCardNo()).geteRank().getiRankNbr();
		boolean c = cards.get(eCardNo.ThirdCard.getCardNo()).geteRank().getiRankNbr()+1 == cards.get(eCardNo.FourthCard.getCardNo()).geteRank().getiRankNbr();
		boolean d = cards.get(eCardNo.FourthCard.getCardNo()).geteRank().getiRankNbr()+1 == cards.get(eCardNo.FifthCard.getCardNo()).geteRank().getiRankNbr();
		
		 
		if (a == true && b == true && c==true && d == true )  {
			bIsStraight = true;

		}
		

		return bIsStraight;
	}

	public static boolean isHandRoyalFlush(Hand h, HandScore hs) {

		boolean isRoyalFlush = false;
		boolean a = h.getCardsInHand().get(eCardNo.FirstCard.getCardNo()).geteRank().getiRankNbr()+1 == h.getCardsInHand().get(eCardNo.SecondCard.getCardNo()).geteRank().getiRankNbr();
		boolean b = h.getCardsInHand().get(eCardNo.SecondCard.getCardNo()).geteRank().getiRankNbr()+1 == h.getCardsInHand().get(eCardNo.ThirdCard.getCardNo()).geteRank().getiRankNbr();
		boolean c = h.getCardsInHand().get(eCardNo.ThirdCard.getCardNo()).geteRank().getiRankNbr()+1 == h.getCardsInHand().get(eCardNo.FourthCard.getCardNo()).geteRank().getiRankNbr();
		boolean d = h.getCardsInHand().get(eCardNo.FourthCard.getCardNo()).geteRank().getiRankNbr()+1 == h.getCardsInHand().get(eCardNo.FifthCard.getCardNo()).geteRank().getiRankNbr();
		boolean e = h.getCardsInHand().get(eCardNo.FirstCard.getCardNo()).geteSuit() == h.getCardsInHand().get(eCardNo.SecondCard.getCardNo()).geteSuit();
		boolean f = h.getCardsInHand().get(eCardNo.SecondCard.getCardNo()).geteSuit() == h.getCardsInHand().get(eCardNo.ThirdCard.getCardNo()).geteSuit();
		boolean g = h.getCardsInHand().get(eCardNo.ThirdCard.getCardNo()).geteSuit() == h.getCardsInHand().get(eCardNo.FourthCard.getCardNo()).geteSuit();
		boolean i = h.getCardsInHand().get(eCardNo.FourthCard.getCardNo()).geteSuit() == h.getCardsInHand().get(eCardNo.FifthCard.getCardNo()).geteSuit();
		boolean j = h.getCardsInHand().get(eCardNo.FirstCard.getCardNo()).geteRank()==eRank.TEN; 
		if (j==true && a == true && b == true && c==true && d == true && e == true && f == true && g==true && i == true  )
		{isRoyalFlush = true;
		hs.setHandStrength(eHandStrength.StraightFlush.getHandStrength());
		hs.setHiHand(h.getCardsInHand().get(eCardNo.SecondCard.getCardNo()).geteRank().getiRankNbr());
		hs.setLoHand(0);
		}
		// TODO Implement this method
		return isRoyalFlush;
	}

	public static boolean isHandStraightFlush(Hand h, HandScore hs) {
		boolean isRoyalFlush = false;
		boolean a = h.getCardsInHand().get(eCardNo.FirstCard.getCardNo()).geteRank().getiRankNbr()+1 == h.getCardsInHand().get(eCardNo.SecondCard.getCardNo()).geteRank().getiRankNbr();
		boolean b = h.getCardsInHand().get(eCardNo.SecondCard.getCardNo()).geteRank().getiRankNbr()+1 == h.getCardsInHand().get(eCardNo.ThirdCard.getCardNo()).geteRank().getiRankNbr();
		boolean c = h.getCardsInHand().get(eCardNo.ThirdCard.getCardNo()).geteRank().getiRankNbr()+1 == h.getCardsInHand().get(eCardNo.FourthCard.getCardNo()).geteRank().getiRankNbr();
		boolean d = h.getCardsInHand().get(eCardNo.FourthCard.getCardNo()).geteRank().getiRankNbr()+1 == h.getCardsInHand().get(eCardNo.FifthCard.getCardNo()).geteRank().getiRankNbr();
		boolean e = h.getCardsInHand().get(eCardNo.FirstCard.getCardNo()).geteSuit() == h.getCardsInHand().get(eCardNo.SecondCard.getCardNo()).geteSuit();
		boolean f = h.getCardsInHand().get(eCardNo.SecondCard.getCardNo()).geteSuit() == h.getCardsInHand().get(eCardNo.ThirdCard.getCardNo()).geteSuit();
		boolean g = h.getCardsInHand().get(eCardNo.ThirdCard.getCardNo()).geteSuit() == h.getCardsInHand().get(eCardNo.FourthCard.getCardNo()).geteSuit();
		boolean i = h.getCardsInHand().get(eCardNo.FourthCard.getCardNo()).geteSuit() == h.getCardsInHand().get(eCardNo.FifthCard.getCardNo()).geteSuit();
		if (a == true && b == true && c==true && d == true && e == true && f == true && g==true && i == true  )
		{isRoyalFlush = true;
		hs.setHandStrength(eHandStrength.StraightFlush.getHandStrength());
		hs.setHiHand(h.getCardsInHand().get(eCardNo.SecondCard.getCardNo()).geteRank().getiRankNbr());
		hs.setLoHand(0);
		}
		// TODO Implement this method
		return isRoyalFlush;
	}

	public static boolean isHandFourOfAKind(Hand h, HandScore hs) {

		boolean bHandCheck = false;

		if (h.getCardsInHand().get(eCardNo.FirstCard.getCardNo()).geteRank() == h.getCardsInHand()
				.get(eCardNo.FourthCard.getCardNo()).geteRank()) {
			bHandCheck = true;
			hs.setHandStrength(eHandStrength.FourOfAKind.getHandStrength());
			hs.setHiHand(h.getCardsInHand().get(eCardNo.FirstCard.getCardNo()).geteRank().getiRankNbr());
			hs.setLoHand(0);
			ArrayList<Card> kickers = new ArrayList<Card>();
			kickers.add(h.getCardsInHand().get(eCardNo.FifthCard.getCardNo()));
			hs.setKickers(kickers);

		} else if (h.getCardsInHand().get(eCardNo.SecondCard.getCardNo()).geteRank() == h.getCardsInHand()
				.get(eCardNo.FifthCard.getCardNo()).geteRank()) {
			bHandCheck = true;
			hs.setHandStrength(eHandStrength.FourOfAKind.getHandStrength());
			hs.setHiHand(h.getCardsInHand().get(eCardNo.SecondCard.getCardNo()).geteRank().getiRankNbr());
			hs.setLoHand(0);
			ArrayList<Card> kickers = new ArrayList<Card>();
			kickers.add(h.getCardsInHand().get(eCardNo.FirstCard.getCardNo()));
			hs.setKickers(kickers);
		}

		return bHandCheck;
	}

	public static boolean isHandFullHouse(Hand h, HandScore hs) {

		boolean isFullHouse = false;
		if (h.getCardsInHand().get(eCardNo.FirstCard.getCardNo()).geteRank() == h.getCardsInHand().get(eCardNo.ThirdCard.getCardNo()).geteRank() && (h.getCardsInHand().get(eCardNo.FourthCard.getCardNo()).geteRank() == h.getCardsInHand().get(eCardNo.FifthCard.getCardNo()).geteRank()))  {
			isFullHouse = true;
			hs.setHandStrength(eHandStrength.FullHouse.getHandStrength());
			hs.setHiHand(h.getCardsInHand().get(eCardNo.FirstCard.getCardNo()).geteRank().getiRankNbr());
			hs.setLoHand(0);

		} 
		return isFullHouse;

	}

	public static boolean isHandFlush(Hand h, HandScore hs) {

		boolean bIsFlush = false;
		if (h.getCardsInHand().get(eCardNo.FirstCard.getCardNo()).geteSuit() == h.getCardsInHand().get(eCardNo.FifthCard.getCardNo()).geteSuit())  {
			bIsFlush = true;
			hs.setHandStrength(eHandStrength.Flush.getHandStrength());
			hs.setHiHand(h.getCardsInHand().get(eCardNo.FirstCard.getCardNo()).geteRank().getiRankNbr());
			hs.setLoHand(0);

		} 
		return bIsFlush;
	}

	public static boolean isHandStraight(Hand h, HandScore hs) {

		boolean bIsStraight = false;
	
		
		boolean a = h.getCardsInHand().get(eCardNo.FirstCard.getCardNo()).geteRank().getiRankNbr()+1 == h.getCardsInHand().get(eCardNo.SecondCard.getCardNo()).geteRank().getiRankNbr();
		boolean b = h.getCardsInHand().get(eCardNo.SecondCard.getCardNo()).geteRank().getiRankNbr()+1 == h.getCardsInHand().get(eCardNo.ThirdCard.getCardNo()).geteRank().getiRankNbr();
		boolean c = h.getCardsInHand().get(eCardNo.ThirdCard.getCardNo()).geteRank().getiRankNbr()+1 == h.getCardsInHand().get(eCardNo.FourthCard.getCardNo()).geteRank().getiRankNbr();
		boolean d = h.getCardsInHand().get(eCardNo.FourthCard.getCardNo()).geteRank().getiRankNbr()+1 == h.getCardsInHand().get(eCardNo.FifthCard.getCardNo()).geteRank().getiRankNbr();
		if (a == true && b == true && c==true && d == true )
		{
			bIsStraight = true;
			hs.setHandStrength(eHandStrength.Straight.getHandStrength());
			hs.setHiHand(h.getCardsInHand().get(eCardNo.FirstCard.getCardNo()).geteRank().getiRankNbr());
			hs.setLoHand(0);
		}
		return bIsStraight;
	}

	public static boolean isHandThreeOfAKind(Hand h, HandScore hs) {

		boolean isThreeOfAKind = false;
		if (h.getCardsInHand().get(eCardNo.FirstCard.getCardNo()).geteRank() == h.getCardsInHand()
				.get(eCardNo.ThirdCard.getCardNo()).geteRank()) {
			isThreeOfAKind = true;
			hs.setHandStrength(eHandStrength.ThreeOfAKind.getHandStrength());
			hs.setHiHand(h.getCardsInHand().get(eCardNo.FirstCard.getCardNo()).geteRank().getiRankNbr());
			hs.setLoHand(0);
			ArrayList<Card> kickers = new ArrayList<Card>();
			kickers.add(h.getCardsInHand().get(eCardNo.FourthCard.getCardNo()));
			kickers.add(h.getCardsInHand().get(eCardNo.FifthCard.getCardNo()));
			hs.setKickers(kickers);

		} else if (h.getCardsInHand().get(eCardNo.ThirdCard.getCardNo()).geteRank() == h.getCardsInHand()
				.get(eCardNo.FifthCard.getCardNo()).geteRank()) {
			isThreeOfAKind = true;
			hs.setHandStrength(eHandStrength.ThreeOfAKind.getHandStrength());
			hs.setHiHand(h.getCardsInHand().get(eCardNo.ThirdCard.getCardNo()).geteRank().getiRankNbr());
			hs.setLoHand(0);
			ArrayList<Card> kickers = new ArrayList<Card>();
			kickers.add(h.getCardsInHand().get(eCardNo.FirstCard.getCardNo()));
			kickers.add(h.getCardsInHand().get(eCardNo.SecondCard.getCardNo()));
			hs.setKickers(kickers);
		}
		return isThreeOfAKind;
	}
	public static boolean isHandTwoPair(Hand h, HandScore hs) {

		boolean isTwoPair = false;
		if (h.getCardsInHand().get(eCardNo.FirstCard.getCardNo()).geteRank() == h.getCardsInHand().get(eCardNo.SecondCard.getCardNo()).geteRank() && (h.getCardsInHand().get(eCardNo.ThirdCard.getCardNo()).geteRank() == h.getCardsInHand().get(eCardNo.FourthCard.getCardNo()).geteRank())) {
			isTwoPair = true;
			hs.setHandStrength(eHandStrength.TwoPair.getHandStrength());
			hs.setHiHand(h.getCardsInHand().get(eCardNo.FirstCard.getCardNo()).geteRank().getiRankNbr());
			hs.setLoHand(0);
			ArrayList<Card> kickers = new ArrayList<Card>();
			kickers.add(h.getCardsInHand().get(eCardNo.FifthCard.getCardNo()));
			hs.setKickers(kickers);

		} else if (h.getCardsInHand().get(eCardNo.SecondCard.getCardNo()).geteRank() == h.getCardsInHand().get(eCardNo.ThirdCard.getCardNo()).geteRank() && (h.getCardsInHand().get(eCardNo.FifthCard.getCardNo()).geteRank() == h.getCardsInHand().get(eCardNo.FourthCard.getCardNo()).geteRank()))  {
			isTwoPair = true;
			hs.setHandStrength(eHandStrength.TwoPair.getHandStrength());
			hs.setHiHand(h.getCardsInHand().get(eCardNo.SecondCard.getCardNo()).geteRank().getiRankNbr());
			hs.setLoHand(0);
			ArrayList<Card> kickers = new ArrayList<Card>();
			kickers.add(h.getCardsInHand().get(eCardNo.FirstCard.getCardNo()));
			hs.setKickers(kickers);
		}
		return isTwoPair;
	}

	public static boolean isHandPair(Hand h, HandScore hs) {
		boolean isPair = false;
		if (h.getCardsInHand().get(eCardNo.FirstCard.getCardNo()).geteRank() == h.getCardsInHand()
				.get(eCardNo.SecondCard.getCardNo()).geteRank()) {
			isPair = true;
			hs.setHandStrength(eHandStrength.Pair.getHandStrength());
			hs.setHiHand(h.getCardsInHand().get(eCardNo.FirstCard.getCardNo()).geteRank().getiRankNbr());
			hs.setLoHand(0);
			ArrayList<Card> kickers = new ArrayList<Card>();
			kickers.add(h.getCardsInHand().get(eCardNo.ThirdCard.getCardNo()));
			kickers.add(h.getCardsInHand().get(eCardNo.FourthCard.getCardNo()));
			kickers.add(h.getCardsInHand().get(eCardNo.FifthCard.getCardNo()));
			hs.setKickers(kickers);

		} else if (h.getCardsInHand().get(eCardNo.SecondCard.getCardNo()).geteRank() == h.getCardsInHand()
				.get(eCardNo.ThirdCard.getCardNo()).geteRank()) {
			isPair = true;
			hs.setHandStrength(eHandStrength.Pair.getHandStrength());
			hs.setHiHand(h.getCardsInHand().get(eCardNo.SecondCard.getCardNo()).geteRank().getiRankNbr());
			hs.setLoHand(0);
			ArrayList<Card> kickers = new ArrayList<Card>();
			kickers.add(h.getCardsInHand().get(eCardNo.FirstCard.getCardNo()));
			kickers.add(h.getCardsInHand().get(eCardNo.FourthCard.getCardNo()));
			kickers.add(h.getCardsInHand().get(eCardNo.FifthCard.getCardNo()));
			hs.setKickers(kickers);
		}
		else if (h.getCardsInHand().get(eCardNo.ThirdCard.getCardNo()).geteRank() == h.getCardsInHand()
				.get(eCardNo.FourthCard.getCardNo()).geteRank()) {
			isPair = true;
			hs.setHandStrength(eHandStrength.Pair.getHandStrength());
			hs.setHiHand(h.getCardsInHand().get(eCardNo.ThirdCard.getCardNo()).geteRank().getiRankNbr());
			hs.setLoHand(0);
			ArrayList<Card> kickers = new ArrayList<Card>();
			kickers.add(h.getCardsInHand().get(eCardNo.FirstCard.getCardNo()));
			kickers.add(h.getCardsInHand().get(eCardNo.SecondCard.getCardNo()));
			kickers.add(h.getCardsInHand().get(eCardNo.FifthCard.getCardNo()));
			hs.setKickers(kickers);
		}
		else if (h.getCardsInHand().get(eCardNo.FourthCard.getCardNo()).geteRank() == h.getCardsInHand()
				.get(eCardNo.FifthCard.getCardNo()).geteRank()) {
			isPair = true;
			hs.setHandStrength(eHandStrength.Pair.getHandStrength());
			hs.setHiHand(h.getCardsInHand().get(eCardNo.FourthCard.getCardNo()).geteRank().getiRankNbr());
			hs.setLoHand(0);
			ArrayList<Card> kickers = new ArrayList<Card>();
			kickers.add(h.getCardsInHand().get(eCardNo.FirstCard.getCardNo()));
			kickers.add(h.getCardsInHand().get(eCardNo.SecondCard.getCardNo()));
			kickers.add(h.getCardsInHand().get(eCardNo.ThirdCard.getCardNo()));
			hs.setKickers(kickers);
		
		}
		return isPair;
	}
	public static boolean isHandHighCard(Hand h, HandScore hs) {
		hs.setHandStrength(eHandStrength.HighCard.getHandStrength());
		hs.setHiHand(h.getCardsInHand().get(eCardNo.FirstCard.getCardNo()).geteRank().getiRankNbr());
		hs.setLoHand(0);
		ArrayList<Card> kickers = new ArrayList<Card>();
		kickers.add(h.getCardsInHand().get(eCardNo.SecondCard.getCardNo()));
		kickers.add(h.getCardsInHand().get(eCardNo.ThirdCard.getCardNo()));
		kickers.add(h.getCardsInHand().get(eCardNo.FourthCard.getCardNo()));
		kickers.add(h.getCardsInHand().get(eCardNo.FifthCard.getCardNo()));
		hs.setKickers(kickers);
		return true;
	}
}
