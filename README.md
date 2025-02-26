# 📡 Multicast Chat
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![GitHub repo size](https://img.shields.io/github/repo-size/MrErmita/multicastOK?style=for-the-badge)
![GitHub last commit](https://img.shields.io/github/last-commit/MrErmita/multicastOK?style=for-the-badge)
![GitHub issues](https://img.shields.io/github/issues/MrErmita/multicastOK?style=for-the-badge)

Un semplice sistema di comunicazione basato su **Multicast UDP** in **Java**. Questo progetto permette di trasmettere messaggi a più client contemporaneamente utilizzando la tecnologia multicast. 🔥

---

## ✨ Funzionalità
✅ Trasmissione di messaggi in tempo reale tramite **Multicast UDP**
✅ Supporto per più client connessi simultaneamente
✅ Invio di messaggi automatico ogni secondo dal server
✅ Ricezione dei messaggi da parte dei client in tempo reale
✅ Implementazione semplice ed efficace con **Java Sockets**

---

## ⚙️ Installazione e Utilizzo

### 📥 Clona il repository
```bash
git clone https://github.com/MrErmita/multicastOK.git
cd multicastOK
```

### 🚀 Avvio del Server
```bash
javac -d bin src/org/example/ServerMulticast.java
java -cp bin org.example.ServerMulticast
```

### 📡 Avvio del Client
```bash
javac -d bin src/org/example/MulticastClient.java
java -cp bin org.example.MulticastClient
```

---

## 🛠️ Tecnologie Utilizzate
- **Java** ☕
- **Multicast UDP** 📡
- **Socket Networking** 🌐
- **Multi-threading** 🧵

---

## 📡 Come Funziona
Il **ServerMulticast** invia automaticamente messaggi ogni secondo a tutti i client connessi al gruppo multicast specificato. I **client multicast** si uniscono al gruppo e ascoltano i messaggi trasmessi dal server.

Esempio di codice per l'invio multicast:
```java
DatagramPacket packet = new DatagramPacket(bufferOUT, bufferOUT.length, group, porta);
socket.send(packet);
```

Esempio di codice per la ricezione nei client:
```java
DatagramPacket packet = new DatagramPacket(bufferIN, bufferIN.length);
socket.receive(packet);
String received = new String(packet.getData(), 0, packet.getLength());
```

---

## 🚀 Contribuire
Se vuoi migliorare il progetto:
1. Fai un **fork** del repo 🍴
2. Crea un **branch** con la tua feature `git checkout -b nuova-feature`
3. **Commit** le modifiche `git commit -m 'Aggiunta nuova feature'`
4. Fai un **push** `git push origin nuova-feature`
5. Apri una **Pull Request** 🚀

---

## 📜 Licenza
Questo progetto è distribuito sotto licenza MIT. 📄

---

## 📬 Contatti
📧 Email: [alessio.bragetti@gmail.com](mailto:alessio.bragetti@gmail.com)
🐙 GitHub: [MrErmita](https://github.com/MrErmita)

💡 **Lascia una ⭐ se ti è piaciuto il progetto!**

