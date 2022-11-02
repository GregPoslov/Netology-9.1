public class Radio {
    private int currentVolume;
    private int currentStation;
    public Radio() {

    }
    public Radio(int stationsCount){

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) { // Если меньше нуля уходим
            return;
        }
        if (currentVolume > 10) { // Если больше 10 уходим
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
        if (currentStation > 9) { // Если больше 9 уходим
            return;
        }
        this.currentStation = currentStation;
    }

    public void increaseVolume() { // Увеличение звука на 1
        if (currentVolume < 10) {
            currentVolume++;
        } else { // Иначе переключаем на 0
            currentVolume = 0;
        }
    }

    public void reductionVolume() { // Звук больше минимальной уменьшаем на 1
        if (currentVolume > 0) {
            currentVolume--;
        } else { // Иначе переключаем на 10
            currentVolume = 10;
        }
    }

    public void increaseStation() { // Увеличение станции на 1
        if (currentStation < 9) {
            currentStation++;
        } else { // Иначе переключаем на 0
            currentStation = 0;
        }
    }

    public void reductionStation() { // Станция больше минимальной уменьшаем на 1
        if (currentStation > 0) {
            currentStation--;
        } else { // Иначе переключаем на 9
            currentStation = 9;
        }
    }
}