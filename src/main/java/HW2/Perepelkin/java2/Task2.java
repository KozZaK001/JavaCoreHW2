package HW2.Perepelkin.java2;

import HW2.Perepelkin.java2.exception.*;
import HW2.Perepelkin.java2.tools.Converter;

public class Task2 {
    public static void main(String[] args) {
        String[][] correctMatrix = {
                {"5", "4", "2", "6"},
                {"0", "7", "3", "5"},
                {"1", "3", "8", "4"},
                {"2", "5", "7", "3"}
        };
        String[][] wrongSizeMatrix = {
                {"0", "4", "4", "7"},
                {"5", "5", "6", "1"},
                {"4", "2"},
                {"3", "7", "7", "2"}
        };
        String[][] wrongChar = {
                {"5", "6", "7", "2"},
                {"2", "3", "3", "5"},
                {"4", "5", "", "7"},
                {"3", "0", "5", "8"}
        };

        try {
            System.out.println(Converter.strConverter(correctMatrix));
        } catch (CustomException e) {
            e.getMessage();
        }


        try {
            System.out.println(Converter.strConverter(wrongSizeMatrix));
        } catch (CustomException e) {
            System.err.println(e.getMessage());
        }

        try {
            System.out.println(Converter.strConverter(wrongChar));
        } catch (CustomException e) {
            System.err.println(e.getMessage());
        }
    }
}
