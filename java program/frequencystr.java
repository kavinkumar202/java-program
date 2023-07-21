class HelloWorld {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        int l = str.length();
        String a[] = str.split("");
        int b[] = new int[26]; // Initialize the array with a fixed size of 26 for English alphabets
        
        for (char c : str.toCharArray()) {
            b[c - 'a']++; // Increment the count of the corresponding character
        }
        
        for (int i = 0; i < l; i++) {
            System.out.println(a[i] + ": " + b[a[i].charAt(0) - 'a']);
        }
    }
}