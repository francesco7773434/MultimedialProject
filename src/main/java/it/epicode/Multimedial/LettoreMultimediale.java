package it.epicode.Multimedial;

import java.util.Scanner;

public class LettoreMultimediale {
    public static void main(String[] args) {
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];
        Scanner scanner = new Scanner(System.in);

        // Creazione degli oggetti multimediali e memorizzazione nell'array
        for (int i = 0; i < elementi.length; i++) {
            System.out.println("Inserisci il tipo di elemento multimediale (immagine,  audio,  video):");
            String tipo = scanner.nextLine();
            switch (tipo) {
                case "immagine":
                    System.out.println("Inserisci la luminosita dell'immagine:");
                    int luminosita = scanner.nextInt();
                    scanner.nextLine();
                    elementi[i] = new Immagine(luminosita);
                    break;

                case "audio":
                    System.out.println("Inserisci la durata dell'audio:");
                    int durata = scanner.nextInt();
                    System.out.println("Inserisci il volume dell'audio:");
                    int volume = scanner.nextInt();
                    scanner.nextLine();
                    elementi[i] = new Audio(durata, volume);
                    break;

                case "video":
                    System.out.println("Inserisci la durata del video:");
                    durata = scanner.nextInt();
                    System.out.println("Inserisci il volume del video:");
                    volume = scanner.nextInt();
                    System.out.println("Inserisci la luminosita del video:");
                    int luminositaVideo = scanner.nextInt();
                    scanner.nextLine();
                    elementi[i] = new Video(durata, volume, luminositaVideo);
                    break;
                default:
                    System.out.println("Tipo di elemento multimediale non valido.");
                    i--;
                    break;
            }
        }

        // Stampa della lista degli elementi
        System.out.println("Lista degli elementi creati:");
        for (int i = 0; i < elementi.length; i++) {
            System.out.println((i + 1) + ". " + elementi[i].getClass().getSimpleName());
        }

        // Ciclo per scegliere e eseguire un oggetto
        int scelta = -1;
        while (scelta != 0) {
            System.out.println("Scegli un elemento da eseguire (1-5) o 0 per terminare:");
            scelta = scanner.nextInt();

            if (scelta == 0) {
                System.out.println("Programma terminato.");
                break;
            }

            if (scelta >= 1 && scelta <= 5) {
                ElementoMultimediale elemento = elementi[scelta - 1];
                System.out.println("Dettagli dell'elemento selezionato:");
                if (elemento instanceof Show) {
                    ((Show) elemento).show();
                } else if (elemento instanceof Play) {
                    ((Play) elemento).play();
                }
            } else {
                System.out.println("Scelta non valida. Inserisci un numero da 1 a 5 oppure 0 per terminare.");
            }
        }

        scanner.close();

    }
}
