/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 *
 * When a keyword is included in another word, it will still return the corresponding
 * response to the keyword. Saying "I know all the state capitals" will return a "Why so negative?"
 * because there is a no in know. This is not the appropriate response.
 */
public class Magpie2
{
	/**
	 * Get a default greeting
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 *
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	 /*
	 When more than one keyword appears in a string, the response depends on which keyword
	 is accounted for first in the if statement. For example, the string "My mother has a dog but no cat"
	 would correspond to the response "Why so negative?" because the code checks if there is a "no" before
	 it checks if there is a "mother", "dog", or a "cat".
	 */
	public String getResponse(String statement)
	{
		String response = "";
		statement = statement.trim();
		if (statement.length() == 0)
		{
			response = "I am lonely. Please speak to me.";
		}
		else if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (statement.indexOf("dog") >= 0
				|| statement.indexOf("cat") >= 0)
		{
			response = "Tell me more about your pets.";
		}
		else if (statement.indexOf("Mr. Mykolyk") >= 0)
		{
			response = "He is the #GUDFAM ring leader.";
		}
		else if (statement.indexOf("Lindsay") >= 0
				|| statement.indexOf("Xinqing") >= 0)
		{
			response = "Oh em gee, those are the members of the best duo in 251.";
		}
		else if (statement.indexOf("251") >= 0)
		{
			response = "That's the best room in Stuy.";
		}
		else if (statement.indexOf("APCS") >= 0)
		{
			response = "What a great, nurturing AP class.";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichResponse == 4)
		{
			response = "I have to go water my rat.";
		}
		else if (whichResponse == 5)
		{
			response = "I think so too.";
		}

		return response;
	}
}
