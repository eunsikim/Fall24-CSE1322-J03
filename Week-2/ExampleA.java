public class ExampleA {
    public static char[] getArray(){
        char[] res = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};

        return res;
    }

    public static char[] reverse(char[] original){
        char[] reversed = new char[original.length];

        // Processing
        for(int i = 0, j = original.length - 1; i < reversed.length; i++, j--){
            reversed[i] = original[j];
        }

        return reversed;
    }

    public static void main(String[] args) {
        char[] array = getArray();

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]);
        }

        System.out.println();

        char[] arrayReversed = reverse(array);
        for(int i = 0; i < arrayReversed.length; i++){
            System.out.print(arrayReversed[i]);
        }
    }
}