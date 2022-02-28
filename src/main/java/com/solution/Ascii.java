package com.solution;

public class Ascii {

    public static void main(String[] args) {
       
    	String art=AsciiArt.printChar('A');
    	System.out.println(art);
    	char c= ScanChar("S");
    	System.out.println(c);
    }
    public static char ScanChar(String art)
    {
        // Iterate over each character from A to Z.
        for (char c = 'A'; c <= 'Z'; c++)
        {
            // Check to see if the character corresponds with the ASCII art.
            if (AsciiArt.printChar(c) == art)
            {
                // Return the character if it does.
                return c;
            }
        }

        // Optionally use a null character to indicate that the string passed
        // doesn't correspond to any valid ASCII art.
        return (char)0;
    }
    
    static class AsciiArt {
        public static String printChar(char s) {
    	return "S";
        }
    }
}


