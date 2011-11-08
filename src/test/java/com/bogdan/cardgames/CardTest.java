package com.bogdan.cardgames;

import org.junit.Test;

import javax.smartcardio.CardChannel;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * @author bogdan
 */
public class CardTest {

    private Card card;

    @Test
    public void createCardTest() throws Exception {
        card = new Card(5, "hearts");
        assertNotNull(card);
    }

    @Test
    public void getValueTest() throws Exception {
        card = new Card(7, "spades");
        assertEquals(7, card.getValue());
    }

    @Test
    public void getSuitTest() throws Exception {
        card = new Card(9, "diamonds");
        assertEquals("diamonds", card.getSuit());
    }

    @Test(expected = Exception.class)
    public void invalidValueTest() throws Exception {
        card = new Card(-1, "clubs");
    }

    @Test(expected = Exception.class)
    public void invalidSuitTest() throws Exception {
        card = new Card(2, "samba");
    }

}
