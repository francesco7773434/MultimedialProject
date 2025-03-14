package it.epicode.Multimedial;

public class TestMultimediale {
    public static void main(String[] args) {
        // Creazione di un array di elementi multimediale
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];


        elementi[0] = new Immagine(5);
        elementi[1] = new Audio(3, 7);
        elementi[2] = new Video(4, 6, 8);
        elementi[3] = new Immagine(3);
        elementi[4] = new Audio(5, 9);


        for (ElementoMultimediale elemento : elementi) {
            if (elemento instanceof Immagine) {
                ((Immagine) elemento).show();
            } else if (elemento instanceof Audio) {
                ((Audio) elemento).play();
            } else if (elemento instanceof Video) {
                ((Video) elemento).play();
            }
            System.out.println();
        }
    }
}
