package main.java.com.valeryvash.javacore.chapter15;

interface DoubleNumericArrayFunc {
    double func(double[] n) throws EmptyArrayException;
}

class EmptyArrayException extends Exception {
    EmptyArrayException() {
        super("Massive is empty");
    }
}

public class LambdaExceptionDemo {
    public static void main(String[] args) throws EmptyArrayException {
        double values[] = {1.0, 2.0, 3.0, 4.0};


        DoubleNumericArrayFunc average = (n) ->
        {
            if (n.length == 0) throw new EmptyArrayException();

            double sum = 0;

            for (int i = 0; i < n.length; i++) {
                sum += n[i];
            }
            return sum / n.length;

        };

        System.out.println("Average value equals: " + average.func(values));

        System.out.println("Stroke will not be printed " + average.func(new double[0]));

    }
}
