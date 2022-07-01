package Arvores;

import java.util.ArrayList;
import java.util.Iterator;

public class Arvore {

    private No root;
    private int tamanho;

    public Arvore(Object o) {
        root = new No(null, o);
        tamanho = 1;
    }

    public No parent(No n) {
        return n.parent();
    }

    public Iterator children(No n) {
        return n.children();
    }

    public boolean isInternal(No n) {
        return n.childrenNumber() > 0;
    }

    public boolean isExternal(No n) {
        return n.childrenNumber() == 0;
    }

    public boolean isRoot(No n) {
        return n == this.root;
    }

    public void addChild(No n, Object o) {
        n.addChild(new No(n, o));
        tamanho++;
    }

    public Object remove(No n) throws InvalidNodeException {
        if(isInternal(n)) throw new InvalidNodeException();
        No parent = n.parent();
        if(parent != null)
            parent.removeChild(n);
        tamanho--;
        return n.element();
    }

    public void swapElements(No v, No w) {
        Iterator vChildren = v.children();
        Iterator wChildren = w.children();
        No vParent = v.parent();
        No wParent = w.parent();
    }

    public int size() {
        return tamanho;
    }

    public int height() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }



    class No {
        private Object o;
        private No pai;
        private ArrayList<No> filhos;

        public No(No pai, Object o) {
            this.pai = pai;
            this.o = o;
        }

        public Object element() {
            return this.o;
        }

        public No parent() {
            return this.pai;
        }

        public Iterator children() {
            return filhos.iterator();
        }

        public int childrenNumber() {
            return this.filhos.size();
        }

        public void addChild(No o) {
            this.filhos.add(o);
        }

        public void removeChild(No o) {
            this.filhos.remove(o);
        }
    }
}