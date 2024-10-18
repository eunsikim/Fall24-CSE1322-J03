class myException extends Exception {
    public myException(String s) {
        super(s);
    }
}

public class ExampleA {
    public static void main(String[] args) throws myException {
        // We are going to have an array binary numbers
        // We are going to handle the array as `char`
        char[] myBinarayArray = new char[5];

        char userInput = 'a';

        try {

            if (userInput != '0' && userInput != '1') {
                throw new myException("Input must be either 1 or 0");
            } else {
                myBinarayArray[0] = userInput;
                System.out.println("Input added to binary array");
            }
        } catch (myException e) {
            System.out.println(e.getMessage());
        }
    }
}
