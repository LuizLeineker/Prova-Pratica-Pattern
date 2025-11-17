package N4;

public abstract class Handler {
    protected Handler nextHandler;

    public Handler setNextHandler(Handler nextHandler){
        this.nextHandler = nextHandler;
        return nextHandler;
    }

}