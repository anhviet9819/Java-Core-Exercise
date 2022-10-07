package Bai14.Exception;

public class InvalidInputException extends RuntimeException{
    public InvalidInputException(){
        System.out.println("Input files have unknown errors !!!");
    }
}
