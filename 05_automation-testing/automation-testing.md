# automation-testing Postman
## Verwendetes Tool

**Postman**

Genutzte Funktionen:

* Collections (GET & POST Requests)
* Collection Runner
* Mehrfache Iterationen zur Simulation von Traffic
* Tests (Status-Code-Validierung)
* Laufzeit- und Response-Time-Auswertung

---

## Testaufbau

**Backend:** Spring Boot REST API
**Port:** `8081`

### Endpunkte

* `GET /students`
* `POST /students`

### Requests

* **GET**: Abruf aller Studenten
* **POST**: Erstellen eines neuen Studenten (JSON Body)

### Testkonfiguration (Postman Runner)

* Iterationen: **50**
* Requests pro Iteration: **2** (GET + POST)
* Total Requests: **100**

---

## Testergebnisse

**Gesamtlaufzeit:** 9.236 Sekunden
**Durchschnittliche Response-Zeit:** 8 ms
**Fehler:** 0
**Erfolgreiche Tests:** 100 / 100

### Detailauswertung

* Alle **GET** Requests lieferten Status **200 OK**
* Alle **POST** Requests waren erfolgreich (Status **200 OK**)
* Keine Timeouts oder Verbindungsprobleme
* Sehr konstante und niedrige Antwortzeiten (6–9 ms)

---

## Fazit

Das Backend hielt dem simulierten Traffic problemlos stand.

* Die REST-API reagierte stabil unter Last
* Keine Fehler oder Ausfälle bei gleichzeitigen Requests
* Sehr gute Performance bei In-Memory-Datenbank (H2)

Postman eignet sich gut für:

* Funktionale API-Tests
* Einfache Lasttests
* Schnelle Validierung von REST-Endpunkten

Für grössere oder realistischere Lasttests wäre ein spezialisiertes Tool wie **JMeter** oder **Gatling** empfehlenswert, für diese Aufgabe war Postman jedoch ausreichend.
