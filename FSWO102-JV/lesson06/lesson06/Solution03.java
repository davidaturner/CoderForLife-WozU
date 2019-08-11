package lesson06;

public class Solution03 {

	static class StudentCode {

		static StringBuilder build(String[] words) throws Exception {
			StringBuilder sb = new StringBuilder();
			
			if (words != null && words.length>0) {
				int numberOfWords = 0;
				while( numberOfWords < words.length) {
					if (numberOfWords != words.length-1) {
						sb.append(words[numberOfWords] + " ");
					} else {
						sb.append(words[numberOfWords]);
					}
					numberOfWords++;
				}
			} else {
				throw new Exception("EMPTY");
			}			
			return sb;
		}

		static StringBuilder buildReverse(String[] words) throws Exception {
			StringBuilder sb = new StringBuilder();			
			if (words != null && words.length>0) {
				for(int i=words.length-1; i>=0; i--) {
					if (i != 0) {
						sb.append(words[i] + " ");						
					}
					else {
						sb.append(words[i]);							
					}
				}
			} else {
				throw new Exception("EMPTY");
			}			
			return sb;
		}
	}
	
	public static void main(String[] args) {
		
		try {
			String[] words = new String[5];
			words[0] = "Hello";
			words[1] = "World!";
			words[2] = "I";
			words[3] = "am";
			words[4] = "fine.";
			
			String[] nullwords = null;
			String[] emptywords = new String[5];

			// Build from non-empty words() array.
			System.out.println("\r\nBuild from words() array.");
			StringBuilder sb = StudentCode.build(words);
			if (sb != null && sb.length()>0) {
				System.out.println("Build: " + sb.toString());
			}
			
			// Build from non-empty words() array.
			System.out.println("\r\nBuild Reverse from words() array.");
			sb = StudentCode.buildReverse(words);
			if (sb != null && sb.length()>0) {
				System.out.println("Build Reverse: " + sb.toString());
			}
			
			// Build Reverse from empty nullwords() array. This should cause 
			// an exception.
			System.out.println("\r\nBuild Reverse from nullwords() array.");
			sb = StudentCode.buildReverse(nullwords);
			if (sb != null && sb.length()>0) {
				System.out.println("Build Reverse: " + sb.toString());
			}
			
			// Exception has occurred with nullwords(). This piece of
			// code is NEVER REACHED.
			System.out.println("\r\nBuild Reverse from emptywords() array.");
			sb = StudentCode.buildReverse(emptywords);
			if (sb != null && sb.length()>0) {
				System.out.println("Build Reverse: " + sb.toString());
			}
					
		} catch (Exception e) {
			System.out.println("Unable to build/build reverse(). words array: " + e.getMessage());
		}
	}

}
