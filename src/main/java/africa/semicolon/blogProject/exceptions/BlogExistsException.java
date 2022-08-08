package africa.semicolon.blogProject.exceptions;

public class BlogExistsException extends RuntimeException{
    public BlogExistsException(){
        super();
    }
    public BlogExistsException(String message){
        super(message);
    }
    public BlogExistsException(String message,Throwable cause){
        super(message,cause);
    }
    public  BlogExistsException(Throwable cause){
        super(cause);
    }

}
