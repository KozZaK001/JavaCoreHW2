package HW2.Perepelkin.java2.exception;

public class MyArraySizeException extends CustomException {

    public MyArraySizeException() {
        super("The matrix must be of size 4x4");
    }
}
