package it.epicode.Multimedial;

public class Immagine extends ElementoMultimediale implements  Show {
    int luminosita;

    public Immagine(int luminosita) {
        this.luminosita = luminosita;
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
    public void show() {
        System.out.println("Sto riproducendo un immagine con luminosita " + luminosita);
        for (int i = 0; i < luminosita; i++) {
            System.out.println("Immagine " +  "*".repeat(luminosita));
        }
    }

    @Override
    public void play() {

    }
}



