package java_intermediate.part3_java.util_패키지;

public class Box<E> {

    private E obj;

    public void setObj(E obj) {
        this.obj = obj;
    }

    public E getObj() {
        return obj;
    }
}
