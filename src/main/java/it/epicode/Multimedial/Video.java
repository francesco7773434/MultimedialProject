package it.epicode.Multimedial;

public class Video extends ElementoMultimediale implements Play {
    int volume;
    int luminosita;

    public Video(int durata, int volume, int luminosita) {
        super(durata);
        this.volume = volume;
        this.luminosita = luminosita;
    }

    public Video(int volume, int luminosita) {
        this.volume = volume;
        this.luminosita = luminosita;
    }

    public void abbassaVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    public void alzaVolume() {
        volume++;
    }


    public void abbassaLuminosita() {
        if (luminosita > 0) {
            luminosita--;
        }
    }


    public void alzaLuminosita() {
        luminosita++;
    }

    @Override
    public void play() {
        System.out.println("Sto riproducendo un video con volume " + volume + " e luminosita " + luminosita);
        for (int i = 0; i < getDurata(); i++) {
            System.out.print("!");
        }
        for (int i = 0; i < luminosita; i++) {
            System.out.print("*");
        }
    }
}
