public class Radio {
    private int currentVolume;
    private int currentStation;
    private int maxStation;

    public Radio() {
        this.maxStation = 9;
    }

    public Radio(int stationsCount) {
        this.maxStation = stationsCount - 1;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) { // Если меньше нуля уходим
            return;
        }
        if (currentVolume > 100) { // Если больше 100 уходим
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) { // Если меньше нуля уходим
            return;
        }
        if (currentStation > maxStation) { // Если больше 9 уходим
            return;
        }
        this.currentStation = currentStation;
    }

    public void increaseVolume() { // Увеличение звука на 1
        if (currentVolume < 100) {
            currentVolume++;
        }


    }

    public void reductionVolume() { // Звук больше минимальной уменьшаем на 1
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public void increaseStation() { // Увеличение станции на 1
        if (currentStation < maxStation) {
            currentStation++;
        } else { // Иначе переключаем на 0
            currentStation = 0;
        }
    }

    public void reductionStation() { // Станция больше минимальной уменьшаем на 1
        if (currentStation > 0) {
            currentStation--;
        } else { // Иначе переключаем на maxStation
            currentStation = maxStation;
        }
    }
}