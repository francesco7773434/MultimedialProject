package it.epicode.Multimedial;

public class Audio extends ElementoMultimediale implements Play {
    int volume;

    public Audio(int durata, int volume) {
        super(durata);
        this.volume = volume;
    }

    public Audio(int volume) {
        this.volume = volume;
    }

    public void abbassaVolume() {
        if (volume > 0) {
            volume--;
        }
    }


    public void alzaVolume() {
        volume++;
    }

    @Override
    public void play() {
        System.out.println("Sto riproducendo un audio con volume " + volume);
        for (int i = 0; i < getDurata(); i++) {
            System.out.print("!");
        }
    }
}
