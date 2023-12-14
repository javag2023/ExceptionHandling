package example;

public class MyException extends Exception {
    private String myOwnMessage;

    public MyException(String myMessage,
                       String s,
                       Throwable throwable) {

        super(s, throwable);
        this.myOwnMessage = myMessage;
    }

    public String getMyOwnMessage() {
        return myOwnMessage;
    }
}
