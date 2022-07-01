package Arvores;

public class InvalidNodeException extends Exception{
    public InvalidNodeException() {
        super("O nó não pode ser removido");
    }
}
