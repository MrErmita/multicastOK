package org.example;

import java.net.*;
import java.io.*;

public class MulticastClient {
    public static void main(String[] args) throws IOException {
        // Buffer per ricevere i dati
        byte[] bufferIN = new byte[1024];

        // Parametri del gruppo multicast
        int porta = 6789; // Porta su cui ricevere i messaggi
        String gruppo = "255.4.5.6"; // Indirizzo IP del gruppo multicast

        // Creazione dell'indirizzo del gruppo multicast
        InetAddress group = InetAddress.getByName(gruppo);
        // Ottenimento dell'interfaccia di rete locale
        NetworkInterface netIf = NetworkInterface.getByInetAddress(InetAddress.getLocalHost());

        // Creazione del socket multicast
        try (MulticastSocket socket = new MulticastSocket(porta)) {
            // Unirsi al gruppo multicast tramite l'interfaccia di rete
            socket.joinGroup(new InetSocketAddress(group, porta), netIf);

            // Creazione del pacchetto per ricevere i dati
            DatagramPacket packetIN = new DatagramPacket(bufferIN, bufferIN.length);
            socket.receive(packetIN); // Attesa della ricezione del pacchetto

            // Stampa delle informazioni sul pacchetto ricevuto
            System.out.println("Ho ricevuto i dati di lunghezza " + packetIN.getLength() +
                    " da: " + packetIN.getAddress().toString() + " porta: " + packetIN.getPort());
            // Stampa del contenuto del messaggio ricevuto
            System.out.write(packetIN.getData(), 0, packetIN.getLength());
            System.out.println();

            // Abbandonare il gruppo multicast
            socket.leaveGroup(new InetSocketAddress(group, porta), netIf);
        }
    }
}
