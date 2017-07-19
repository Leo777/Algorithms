package interviewCake;


public class HighestNumberCalculator {

    public int getProductOf3HighestValue(int[] input) {

        int highestValue = Math.max(input[0], input[1]);
        int lowestValue = Math.min(input[0], input[1]);
        int highestProductOf2 = input[0] * input[1];
        int lowestProductOf2 = input[0] * input[1];
        int highestProductOf3 = input[0] * input[1] * input[2];

        for (int i = 2; i < input.length; i++) {
            int current = input[i];

            highestProductOf3 = Math.max(Math.max(highestProductOf3,
                    current * highestProductOf2), current * lowestProductOf2);


            highestProductOf2 = Math.max(Math.max(highestProductOf2, current * highestValue), lowestValue * current);

            lowestProductOf2 = Math.min(Math.min(lowestProductOf2, current * highestValue), lowestValue * current);

            highestValue = Math.max(highestValue, current);

            lowestValue = Math.min(lowestValue, current);
        }


        return highestProductOf3;
    }
}
