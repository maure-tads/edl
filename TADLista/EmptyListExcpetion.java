public class EmptyListExcpetion extends RuntimeException {
    
    public EmptyListExcpetion() {
        super("The list is already empty.");
    }
}
