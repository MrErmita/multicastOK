package org.example;

import java.net.*;
import java.io.*;
import java.util.*;

public class ServerMulticast {

    public static void main(String[] args) throws IOException {
        boolean attivo = true;
        byte[] bufferOUT = new byte[1024];
        int conta = 20;
        int porta = 6789;

        // indirizzo IP del gruppo multicast
        InetAddress group = InetAddress.getByName("255.4.5.6");

        // socket multicast
        MulticastSocket socket = new MulticastSocket(porta);

        // stringa che contiene la data e l'ora attuali
        String dString;

        // ciclo che invia i pacchetti di dati
        while (attivo) {
            // crea la stringa che contiene la data e l'ora attuali
            dString = new Date().toString();
            // crea il buffer di uscita con la stringa creata
            bufferOUT = dString.getBytes();

            // crea il pacchetto di dati da inviare
            DatagramPacket packet;

            packet = new DatagramPacket(bufferOUT, bufferOUT.length, group, porta);

            // invia il pacchetto di dati
            socket.send(packet);

            // attendi 1 secondo
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("Error occurred: "+e.getMessage());
            }
            // decrementa il contatore
            conta--;
            // se il contatore e' uguale a 0, esce dal ciclo
            if (conta == 0) {
                System.out.println("SERVER IN CHIUSURA. Buona serata.");
                attivo = false;
            } else {
                // stampa il messaggio che indica il numero di secondi rimanenti
                System.out.println("SERVER attivo per altri " + conta + " secondi.");
            }
        }

        // chiude la socket
        socket.close();
    }
}