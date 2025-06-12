public class stringbuilder {
    public static void main(String[] args) {
        //reversing a string useing string builder function

        String s = "Hello"; 
        StringBuilder str = new StringBuilder(s);
        System.out.println("Original String is: "+str);
        System.out.println("The Character at the 0nd position: "+ str.charAt(0));
        System.out.println("Inserting A in the starting of string : "+ str.insert(0, 'A'));
        System.out.println("Deleting H from String : "+ str.delete(1,2 ));
        System.out.println("Reversed String is: "+str.reverse());
    }   
}
