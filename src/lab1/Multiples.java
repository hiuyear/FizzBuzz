package lab1;

public class Multiples {
    public static int multiples(int n, int a, int b){
        int count = 0;
        for (int i = 1; i < n; i++) {
            boolean DivisibleBy3 = i % a == 0;
            boolean DivisibleBy5 = i % b == 0;

            if (DivisibleBy3 || DivisibleBy5) {
                count++;
            }
        }
        return count;
    }

    public static int multiples() { // overload, this version with empty arguments
        int count = 0;
        for (int i = 1; i < 1000; i++) {
            boolean DivisibleBy3 = i % 3 == 0;
            boolean DivisibleBy5 = i % 5 == 0;

            if (DivisibleBy3 || DivisibleBy5) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // first create object Multiples with instance count
        //access m's instance variable count
        int count1 = Multiples.multiples(1000, 3, 5);
        int count2 = Multiples.multiples();  // overload
        System.out.println(count1);
        System.out.println(count2);
        }
    }

//Here’s the rule of thumb:
//
//Instance method/variable (no static) → you must first create an object of the class, then use it.
//
//Multiples m = new Multiples();
//System.out.println(m.count);
//
//
//Static method/variable → it belongs to the class itself, so you can call it directly without making an object.
//
//int count = Multiples.multiples();
//System.out.println(count);
//
//
//That’s why in the refactored version, we wrote:
//
//public static int multiples() { ... }

    // MY PREVIOUS SOLUTION (WORKS BUT WRONG)
//    int count = 0;
//    public Multiples() {
//        for (int i = 0; i < 1000; i++) {
//            boolean DivisibleBy3 = i % 3 == 0;
//            boolean DivisibleBy5 = i % 5 == 0;
//            boolean DivisibleBy6 = i % 6 == 0;
//            boolean DivisibleBy9 = i % 9 == 0;
//
//            if (DivisibleBy3 || DivisibleBy5 || DivisibleBy6 || DivisibleBy9) {
//                count++;
//            }
//        }
//    }
// above code also works, but creates an in-class instance variable
//    // then to call this, in the main arg function, you would first use
//    // Multiples m = new multiples()
//    // int count = m.count()
//    // Systems.out.println(count)
