public class Hare {

    private static final int WALKING = 10;
    private int count_carrot = 0;

    public int sum_carrot(int number_of_carrots_in_the_first_garden,
                          int number_of_carrots_in_the_second_garden,
                          int number_of_carrots_in_the_third_garden,
                          int number_of_carrots_in_the_fourth_garden,
                          int number_of_carrots_in_the_fifth_garden)
    {

        for (int i = 0; i < WALKING; i++ ){
            if (number_of_carrots_in_the_first_garden >= 5){
                number_of_carrots_in_the_first_garden -= 5;
                count_carrot += 5;
                continue;
            }
            if (number_of_carrots_in_the_second_garden >= 2 && number_of_carrots_in_the_first_garden > 0){
                number_of_carrots_in_the_second_garden -= 2;
                number_of_carrots_in_the_first_garden -= 1;
                count_carrot += 3;
                continue;
            }
            if (number_of_carrots_in_the_third_garden > 0 && number_of_carrots_in_the_second_garden > 0){
                number_of_carrots_in_the_third_garden -= 1;
                number_of_carrots_in_the_second_garden -= 1;
                count_carrot +=2;
                continue;
            }
            if (number_of_carrots_in_the_fourth_garden > 0 && number_of_carrots_in_the_first_garden > 0){
                number_of_carrots_in_the_fourth_garden -= 1;
                number_of_carrots_in_the_first_garden -= 1;
                count_carrot +=2;
                continue;
            }
            if (number_of_carrots_in_the_first_garden > 0) {
                count_carrot += number_of_carrots_in_the_first_garden;
                number_of_carrots_in_the_first_garden = 0;
                continue;
            }
            if (number_of_carrots_in_the_second_garden > 0){
                if (number_of_carrots_in_the_second_garden >= 2){
                    count_carrot += 2;
                    number_of_carrots_in_the_second_garden -= 2;
                    continue;
                }
                count_carrot += number_of_carrots_in_the_second_garden;
                number_of_carrots_in_the_second_garden = 0;
                continue;
            }
            if (number_of_carrots_in_the_third_garden > 0) {
                count_carrot += 1;
                number_of_carrots_in_the_third_garden -= 1;
                continue;
            }
            if (number_of_carrots_in_the_fourth_garden > 0){
                count_carrot += 1;
                number_of_carrots_in_the_fourth_garden -= 1;
                continue;
            }
            if (number_of_carrots_in_the_fifth_garden > 0){
                count_carrot += 1;
                number_of_carrots_in_the_fifth_garden -= 1;
                continue;
            }

            System.out.println("The hare made " + i + " runs");
            break;
        }
        return count_carrot;
    }
}
