package io.spring.framework.springInAction.Chapter1;

import java.io.PrintStream;

public class SlayDragonQuest implements Quest{

	private PrintStream stream;
	
	public SlayDragonQuest(PrintStream steam){
		this.stream = steam;
	}
	
	@Override
	public void embark() {
		stream.println("embarking on quest to slay the dragon");
	}

}

  