package io.spring.framework.springInAction.Chapter1;

import org.junit.jupiter.api.Test;

public class BraveKnightTest {

	@Test
	public void knightShouldEmbarkOnQuest(){
		Quest quest = new RescueDamselQuest();
		BraveKnight knight = new BraveKnight(quest);
		knight.embarkOnQuest();
	}
	
}

  