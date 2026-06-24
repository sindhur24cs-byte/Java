
publicclass Program4 {
publicstaticvoid main(String[] args) {
// Constructor 1: Using a string literal
       String str1 = "Hello, World!";
       System.out.println("Constructor 1: Using a string literal: " + str1);
 
// Constructor 2: Using a character array
char[] charArray = {'H', 'e', 'l', 'l', 'o'};

       String str2 = new String(charArray);
       System.out.println("Constructor 2: Using a character array: " + str2);
 
// Constructor 3: Using a portion of a character array
       String str3 = new String(charArray, 2, 3); // Starts at index 2, length 3
       System.out.println("Constructor 3: Using a portion of a character array: " + str3);
 
// Constructor 4: Using bytes and specifying character encoding
byte[] byteArray = {72, 101, 108, 108, 111}; // ASCII values for "Hello"
       String str4 = new String(byteArray);
       System.out.println("Constructor 4: Using bytes and specifying character encoding: " + str4);
 
// Constructor 5: Using bytes, specifying character encoding, and specifying range
       String str5 = new String(byteArray, 2, 3); // Starts at index 2, length 3
       System.out.println("Constructor 5: Using bytes, specifying character encoding, and specifying range: " + str5);
 
// Constructor 6: Using another String object
       String str6 = new String(str1);
       System.out.println("Constructor 6: Using another String object: " + str6);
 
 
   }
}

