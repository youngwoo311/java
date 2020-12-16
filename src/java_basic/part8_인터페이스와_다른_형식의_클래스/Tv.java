package java_basic.part8_인터페이스와_다른_형식의_클래스;

public interface Tv {

    public int MIN_VOLUME = 0;
    public int MAX_VOlUME = 0;
    public void turnOn();
    public void turnOff();
    public void changeVolume(int volume);
    public void changeChannel(int channel);
}
