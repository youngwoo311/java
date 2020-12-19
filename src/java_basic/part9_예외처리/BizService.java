package java_basic.part9_예외처리;

public class BizService {

    public void BizMethod(int i) throws BizException {
        System.out.println("비즈니스 메소드 시작");

        if(i < 0) {
            throw new BizException("매개변수 i는 0 이상이어야 합니다.");
        }
        System.out.println("비즈니스 메소드 종료");
    }
}
