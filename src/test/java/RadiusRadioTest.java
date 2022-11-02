import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadiusRadioTest {
    @Test
    public void fromStationZeroToStationOne() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(0);

        radio.setCurrentStation(15);

        int expected = 15;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void fromVolumeZeroToOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void fromVolumeTenToEleven() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.reductionVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
