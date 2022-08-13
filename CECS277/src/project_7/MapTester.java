package project_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Iterator;
public class MapTester
{
	public static void main(String[] args)
	{
		String[] words = {"How", "doth", "the", "little", "crocodile",
				"Improve", "his", "shining", "tail,",
				"And", "pour", "the", "waters", "of", "the", "Nile",
				"On", "every", "golden", "scale!"
		};
		List<String> wordsList = Arrays.asList(words);
		List<Pair<String,Integer>> sizes = ListUtil.map(wordsList, w -> w.length());
		Iterator<Pair<String, Integer>> iter = sizes.iterator();
		Pair<String, Integer> entry = iter.next();
		System.out.println(entry.getFirst() + " = " + entry.getSecond());
		System.out.println("Expected: How = 3");
		entry = iter.next();
		System.out.println(entry.getFirst() + " = " +
				entry.getSecond());
		System.out.println("Expected: doth = 4");
		entry = iter.next();
		System.out.println(entry.getFirst() + " = " +
				entry.getSecond());
		System.out.println("Expected: the = 3");
		entry = iter.next();
		System.out.println(entry.getFirst() + " = " +
				entry.getSecond());
		System.out.println("Expected: little = 6");
		entry = iter.next();
		System.out.println(entry.getFirst() + " = " + entry.getSecond());
		System.out.println("Expected: crocodile = 9");
	}
}
