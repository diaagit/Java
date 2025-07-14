public class Strings {
    public static void main(String[] args) {
        //concatenation
        String firstName = "Diya";
        String lastName = "Jain";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);  //Diya Jain
        System.out.println(fullName.length());

        //charAt
        for(int i = 0; i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }

        //compare
        String name1 = "Diya";
        String name2 = "Diya11";

        if(name1.compareTo(name2) == 0){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        //substring

        String sentence = "Welcome to the World of Java";
        String language = sentence.substring(24,sentence.length());
        System.out.println(language);
    }
    
}
