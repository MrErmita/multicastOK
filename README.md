# Multicast Communication Project

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Last Commit](https://img.shields.io/github/last-commit/MrErmita/multicastOK?style=for-the-badge)
![Issues](https://img.shields.io/github/issues/MrErmita/multicastOK?style=for-the-badge)


## Descrizione
Questo progetto implementa una comunicazione multicast tra un **server** e **client multipli**, utilizzando i socket UDP in Java. Il server invia messaggi periodici a un gruppo multicast, e i client si uniscono a questo gruppo per ricevere i messaggi.

## Struttura del Progetto
- **`ServerMulticast.java`**: Invia un messaggio ogni secondo ai client connessi.
- **`MulticastClient.java`**: Riceve i messaggi dal gruppo multicast e li stampa in console.

## Requisiti
- Java 8+
- Connessione di rete

## Come Eseguire il Progetto

### 1. Compilare i file Java
```sh
javac -d out src/org/example/*.java
```

### 2. Avviare il Server Multicast
```sh
java -cp out org.example.ServerMulticast
```

### 3. Avviare uno o più Client Multicast
```sh
java -cp out org.example.MulticastClient
```

## Funzionamento
1. Il server invia messaggi contenenti data e ora a intervalli di **1 secondo**.
2. I client si connettono al gruppo multicast e ricevono i messaggi in tempo reale.
3. Dopo **20 secondi**, il server si chiude automaticamente.

## Possibili Miglioramenti
- Gestione dinamica del numero di messaggi inviati.
- Aggiunta di un'interfaccia grafica per la visualizzazione dei messaggi.
- Implementazione di un meccanismo di riconnessione per i client disconnessi.

## Contributi
Sentiti libero di inviare **pull request** o segnalare **issue** se trovi problemi o vuoi migliorare il progetto!

## Licenza
Questo progetto è distribuito sotto la licenza **MIT**. 📜

