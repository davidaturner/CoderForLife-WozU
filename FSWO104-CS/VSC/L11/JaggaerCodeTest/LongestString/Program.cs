using System;
using System.Text;
namespace LongestString {
    class Program {
        static void Main (string[] args) {
            Console.WriteLine ("Hello World!");
            string a = "ecabcffggh";
            string b = "cabcdffggh";

            string result = Longeststring (a, b);
            if ( result != String.Empty) {
                Console.WriteLine ("Match! " + result);
            } else {
                Console.WriteLine("No Match");
            }
            Console.WriteLine("DONE!");
        }

        static string matchFound = String.Empty;
        
        static int MAX_RECURSIVES = 20;
        static int recursiveLevel = 0;
        static string Longeststring (string a, string b) {

            incrementRecursiveLevel (a, b);

            // base case 0: exceeds MAX_RECURSIVES
            if (recursiveLevel > MAX_RECURSIVES) {
                return String.Empty;
            }

            // base case 1: empty a or b
            if (String.IsNullOrEmpty (a) || String.IsNullOrEmpty (b)) {
                decrementRecursiveLevel ("null or empty a or b");
                return matchFound;
            }

            // base case 2: no match if a.Length or b.Length == 1
            if (a.Length == 1 || b.Length == 1) {
                decrementRecursiveLevel ("a or b not a string");
                return matchFound;
            }

            // Recursive case
            if (FindFirst(a, b) < b.Length) {
                Console.WriteLine("candidates - " + a + " " + matchFound);
                updateMatchFound(a);
            } 
            else {
                string a0 = Substring(a, 0, a.Length-1);
                string candidate = Longeststring(a0, b);
                updateMatchFound(candidate);
                String a1 = Substring(a, 1, a.Length-1);
                candidate = Longeststring(a1, b);
                updateMatchFound(candidate);
            }

            decrementRecursiveLevel ("end recursive");
            return matchFound;
        }

        static void updateMatchFound(string candidate) {
            /* TODO add an array of candidates that were rejected */
            /* So that we don't keep trying and re-trying them. */
            /* (base case 3) */
            if (candidate != String.Empty) {
                if ( (matchFound == String.Empty) ||
                    (candidate.Length > matchFound.Length)) {
                    matchFound = candidate;
                }
            }
        }
        static int FindFirst (string a, string b) {

            int i = 0;
            int j = 0;
            int strstart = b.Length;
            while (i < b.Length) {
                // Console.WriteLine (a[j] + " " + b[i]);
                // if a==b
                if (a[j] == b[i]) {
                    // check strstart and update
                    strstart = (strstart == b.Length) ? i : strstart;
                    // Console.WriteLine (strstart);
                    // if j equals a.Length-1, return strstart
                    if (j == a.Length - 1) {
                        // Console.WriteLine ("Found! = " + strstart);
                        return strstart;
                    }
                    // increment j
                    j++;
                    // else
                } else {
                    // set strstart
                    strstart = b.Length;
                    // Console.WriteLine (strstart);
                    // set j = 0
                    j = 0;
                }
                i++;
            }
            // if we still have more a to test, set strstart;
            if (j < a.Length && strstart < b.Length) {
                // Console.WriteLine ("Excess: " + a[j]);
                strstart = b.Length;
            }
            // return strstart
            return strstart;
        }
        static string Substring (string s, int start, int length) {
            StringBuilder reduced = new StringBuilder ();
            for (int i = start; i < start+length; i++) {
                reduced.Append (s[i].ToString ());
            }
            return reduced.ToString ();
        }
        static void incrementRecursiveLevel (string a, string b) {
            recursiveLevel++;
            Console.WriteLine (recursiveLevel + " - a b - " + a + " " + b);
        }
        static void decrementRecursiveLevel (string returnval) {
            recursiveLevel--;
            Console.WriteLine (recursiveLevel + " - " + returnval);
        }
    }
}