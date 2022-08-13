package Lab1;
import java.util.Scanner;
public class lab1 {
	//array of the most common words in the english language
	static String[] common = {"the","be","to","of","and","in","that","have","it","for","not","on","with","he","as","you","do","at","this","but","his","by","from","they","we","say","her","she","or","will","an","my","one","all","would","there","their","what","so","up","out","if","about","who","get","which","go","when"};
	static String ciphertext1 = "fqjcb rwjwj vnjax bnkhj whxcq nawjv nfxdu mbvnu ujbbf nnc";
	static String ciphertext2 = "oczmz vmzor jocdi bnojv dhvod igdaz admno ojbzo rcvot jprvi oviyv aozmo cvooj ziejt dojig toczrdnzno jahvi fdiyv xcdzq zoczn zxjiy";
	
	static String plaintext1 = "He who fights with monsters should look to it that he himself does not become a monster. And if you gaze long into an abyss, the abyss also gazes into you";
	static String plaintext2 = "There is a theory which states that if ever anybody discovers exactly what the Universe is for and why it is here, it will instantly disappear and be replaced by something even more bizarre and inexplicable. There is another theory which states that this has already happened";
	static String plaintext3 = "Whenever I find myself growing grim about the mouth; whenever it is a damp, drizzly November in my soul; whenever I find myself involuntarily pausing before coffin warehouses, and bringing up the rear of every funeral I meet; and especially whenever my hypos get such an upper hand of me, that it requires a strong moral principle to prevent me from deliberately stepping into the street, and methodically knocking people’s hats off - then, I account it high time to get to sea as soon as I can";
	//input
	static Scanner in = new Scanner(System.in);
	public static StringBuffer decrypter(String text, int s){
		StringBuffer result= new StringBuffer();
		for (int i=0; i<text.length(); i++){//loop runs through plaintext string
			if (Character.isUpperCase(text.charAt(i))){//if the character is upper case it shifts to the appropriate upper case letter
				char ch = (char)(((int)text.charAt(i) + s - 65) % 26 + 65);
				result.append(ch);//adds shifted letter to decrypted text
			}
			else if(Character.isWhitespace(text.charAt(i))) {//if charactert is a space, this omits it from the decrypted text

				//result.append(' ');
			}
			else {//if the character is lower case it shifts to the appropriate lowercase letter
				char ch = (char)(((int)text.charAt(i) + s - 97) % 26 + 97);
				result.append(ch);//adds shifted letter to decrypted text
			}
		}
		return result;
	}

	public static StringBuffer decryption(String text) {
		StringBuffer plaintext = new StringBuffer();
		int counter = 0;
		int key = 0;
		for(int i = 0; i < 26; i++) { //loops through alphabet and all possible shifts
			plaintext = decrypter(text, i);//shifts text by given key
			for(String x: common) {//compares decrypted text to list of most common english words
				if(plaintext.toString().contains(x)) {
					counter++; 		//if an actual word can be found in the decrypted text, the counter will go up
				}
			}
			//System.out.println(counter);
			if(counter > 10) {//if enough english words are found in the decrypted text, the decrypted text is likely correct and the loop will break
				key = i; //shift key is saved
				break;
			}
			else {//otherwise the loop continues and the counter resets
				counter = 0;
			}
		}
		System.out.println("\tKey:\t" + key);
		System.out.println("Plain  Text:\t" + plaintext);
		return plaintext;
	} 

	public static StringBuffer encrypter(String text, int s) {
		StringBuffer result = new StringBuffer();
		for (int i=0; i<text.length(); i++){//loop runs through plaintext string
			if (Character.isUpperCase(text.charAt(i))){//if the character is upper case it shifts it to the appropriate upper case letter
				char ch = (char)(((int)text.charAt(i) + s - 65) % 26 + 65);
				result.append(ch);//adds shifted letter to encrypted text
			}
			else if(Character.isWhitespace(text.charAt(i))) {//if character is a space, this omits it from the cipher text

				//result.append(' ');
			}
			else if(Character.isLowerCase(text.charAt(i))){//if the character is lower case it shifts it to the appropriate lower case letter
				char ch = (char)(((int)text.charAt(i) + s - 97) % 26 + 97);
				result.append(ch);
			}
			else {
				//omits characters that are not letters
			}
		}
		return result;
	}
	
	public static StringBuffer encryption(String text) {
		StringBuffer ciphertext = new StringBuffer();
		int counter = 0;
		int key = 0;
		for(int i = 0; i < 26; i++) {//loops through every caesar cipher key
			ciphertext = encrypter(text, i);//method shifts characters by a shift amount
			for(String x: common) {//compares ciphertext to array of common words english words
				if(ciphertext.toString().contains(x)) {
					counter++;							//if an actual word can be found in the cipher text, the counter will go up
				}
			}

			
			if(counter == 1) {	//if the counter counted a word in the encrypted text, it will break the loop and use that key
				key = i;
				break;
			}
			else { //otherwise the loop will continue and reset the counter
				//System.out.println(i + ". " + counter);
				counter = 0;
			}
		}
		
		//System.out.println(key);
		System.out.println("Cipher Text:\t" + ciphertext); //prints out encrypted method
		return ciphertext;
	}
	
	public static void menu() {
		boolean cont = false;
		while(!cont) {
			String[] choices = {"Character", "Keys","Skull Keys", "Gems", "Black Badge", "Magic Carpets"};
			int i = 0;
			for(String c: choices) {
				i++;
				System.out.print(i + ". " + c + "\n");
			}
			System.out.print(">>");
			if(in.hasNextInt())
			{
				int choice = in.nextInt();
				if(choice == 1)
				{
					menu1(); //leads to sub-menu 1
				}
				else if(choice == 2)
				{
					menu2(); //leads to sub-menu 2
				}
				else if(choice == 3)
				{
					cont = true; //exits program
				}
				else //Verifies choice validity
				{
					System.out.println("Error. Try again");
					cont = false;
				}
			}
			else
			{
				System.out.println("Error. Try again");
				in.next();
			}
		}

	}
	
	public static void menu1() {
		boolean cont = false;
		while(!cont) {
			System.out.println("1. Message 1");
			System.out.println("2. Message 2");
			System.out.println("3. Exit program");
			System.out.print(">>");
			if(in.hasNextInt())
			{
				int choice = in.nextInt();
				if(choice == 1)
				{
					System.out.println("Cipher Text:\t" + ciphertext1);
					decryption(ciphertext1);
				}
				else if(choice == 2)
				{
					System.out.println("Cipher Text:\t" + ciphertext2);
					decryption(ciphertext2);
				}
				else if(choice == 3)
				{
					cont = true; //exits program
				}
				else //Verifies choice validity
				{
					System.out.println("Error. Try again");
					cont = false;
				}
			}
			else
			{
				System.out.println("Error. Try again");
				in.next();
			}
		}


	}

	public static void menu2() {
		boolean cont = false;
		while(!cont) {//continuous loop until broken
			System.out.println("1. Message 1");
			System.out.println("2. Message 2");
			System.out.println("3. Message 3");
			System.out.println("4. Exit program");
			System.out.print(">>");
			if(in.hasNextInt())//input validation
			{
				int choice = in.nextInt();//input validation
				if(choice == 1)
				{
					System.out.println("Plain  Text:\t" + plaintext1);//key = 2
					encryption(plaintext1);
				}
				else if(choice == 2)
				{
					System.out.println("Plain  Text:\t" + plaintext2);//key = 5
					encryption(plaintext2);
				}
				else if(choice == 3)
				{
					System.out.println("Plain  Text:\t" + plaintext3);//key = 11
					encryption(plaintext3);
				}
				else if(choice == 4)
				{
					cont = true; //exits program
				}
				else //Verifies choice validity
				{
					System.out.println("Error. Try again");
					cont = false;
				}
			}
			else
			{
				System.out.println("Error. Try again");
				in.next();
			}
		}


	}

	
	public static void main(String[] args)
	{
		menu();
	}
}
