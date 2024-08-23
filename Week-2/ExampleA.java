public class ExampleA {
    public static char[] getArray(){
        char[] res = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};

        return res;
    }

    public static char[] reverse(char[] original){
        char[] reversed = new char[original.length];

        //  We have two counters, `i` goes from 0 to the end of the array
        //  `j` goes from the last index of the array to 0
        //  `i` increases by 1 for each iteration while `j` decreases by 1
        for(int i = 0, j = original.length - 1; i < reversed.length; i++, j--){
            //  We make use of `i` to start filling `reversed` from the "beginning"
            //  and `j` to start inserting the characters from the "end" of `original`
            reversed[i] = original[j];
        }

        return reversed;
    }

    public static void main(String[] args) {
        // `getArray()` returns a `char[]` which means we can
        //  treat `getArray()` as a `char[]`.
        //  Therefore, the following is 100% valid:
        for(int i = 0; i < getArray().length; i++){
            System.out.print(getArray()[i]);
        }
        System.out.println();

        //  But I always recommend doing this instead:
        char[] array = getArray(); 

        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]);
        }
        System.out.println();

        //  Since we want to reverse `array`, we
        //  pass it as an argument for the function
        //  `reverse()` which will return the
        //  reversed version of `array`
        char[] arrayReversed = reverse(array);
        for(int i = 0; i < arrayReversed.length; i++){
            System.out.print(arrayReversed[i]);
        }
    }
}