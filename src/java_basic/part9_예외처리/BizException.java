package java_basic.part9_예외처리;

public class BizException extends RuntimeException {

    public BizException(String msg) {
        super(msg);
    }

    public BizException(Exception ex) {
        super(ex);
    }
}
