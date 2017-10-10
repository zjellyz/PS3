package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgEnum.eRank;
import pkgEnum.eSuit;
import pkgException.DeckException;

public class DeckTest {

	@Test(expected = DeckException.class)
	public void TestEmptyDeck() throws DeckException {
		// TODO: Build a deck, draw until you get a DeckException
		Deck Deck1 = new Deck();
		for (int i = 0; i < 100; i++) {
			Card c = Deck1.Draw();
		}
	}

	@Test
	public void TestDrawSuit() {
		// TODO: Build a deck, test the Draw(eSuit) method
		Deck iDeck = new Deck();
		Card c = iDeck.DrawSuit(eSuit.CLUBS);
		assertTrue(c.geteSuit() == eSuit.CLUBS);
	}

	@Test
	public void TestDrawRank() {
		// TODO: Build a deck, test the Draw(eRank) method
		Deck iDeck = new Deck();
		Card c = iDeck.DrawRank(eRank.KING);
		assertTrue(c.geteRank() == eRank.KING);
	}

	@Test
	public void TestDeckRankCount() {
		// TODO: Build a deck, test the DeckRankCount method
		Deck iDeck = new Deck();
		assertEquals(iDeck.countRank(pkgEnum.eRank.ACE), 4);
	}

	@Test
	public void TestDeckSuitCount() {
		// TODO: Build a deck, test the DeckSuitCount method
		Deck iDeck = new Deck();
		assertEquals(iDeck.countSuit(pkgEnum.eSuit.DIAMONDS), 13);
	}

}
