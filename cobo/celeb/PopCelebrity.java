/*
RachelHateCult: May Qiu, Jeffery Tang, Xinqing Lin
APCS pd6
L09: Some Folkds Call It A Charades
2022-04-26
time spent: 1 hr
*/
import java.util.ArrayList;

public class PopCelebrity extends Celebrity
{

	private ArrayList<String> clueList;

	public PopCelebrity(String answer, String clues)
	{
		super(answer, clues);
		processClues();
	}

	private void processClues()
	{
		String [] clues = super.getClue().split(",");
		clueList = new ArrayList<String>();
		for (String currentClue : clues)
		{
			clueList.add(currentClue);
		}
	}

	@Override
	public String getClue()
	{
		if (clueList.size() == 0)
		{
			processClues();
		}
		String currentClue = clueList.remove(0);

		return currentClue;
	}

	@Override
	public String toString()
	{
		String dsc = "The answer is the pop celebrity, " + getAnswer() + "!\nThe clues are:\n";

		for (String word : super.getClue().split(","))
		{
			dsc += word + "\n";
		}

		return dsc;
	}

}
