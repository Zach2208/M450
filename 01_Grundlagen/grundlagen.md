# Übungen

## Aufgabe 1
### Welche Formen von Tests kennen Sie aus der Informatik? Arbeiten Sie zu zweit und erläutern Sie mind. drei Beispiele, die Sie aus der Praxis kennen.
Unit-Testing
Integration-Testing
End-to-End-Testing
### Wie werden die Tests durchgeführt?
Bei Unit-Testing wird über das Testen von den kleinsten Gruppen von Code (Units), z.B. Funktionen zu testen gesprochen.
Bei Integrations-Tests wird das Zusammenspiel von zwei Komponenten getestet, um zu sehen, ob die Kommunikation von zwei unabhängigen Komponenten funktioniert.
End-to-End Testing beinhaltet das Testen der gesamten Applikation vom Beginn bis zum Ende. Es erlaubt hoch-detaillierte Testfälle zu schreiben und die Testfläche abzudecken.

## Aufgabe 2

### Nennen Sie ein Beispiel eines SW-Fehlers und eines SW-Mangels.
Software-Fehler: Das Login einer E-Commerce Webseite funktioniert nicht. 
Software-Mangel: Das User-Interface einer Webseite ist schwer, jedoch möglich zu bedienen.
### Nennen Sie ein Beispiel für einen hohen Schaden bei einem SW-Fehler.
Ein Cyberattack auf eine Firma verursacht Schäden in Höhe von zwei Millionen Dollar durch das unsichere Speichern von Passwörtern. Sie wurden als Plaintext in der Datenbank gespeichert, was das Auslesen durch SQL-Injection ermöglichte.
## Aufgabe 3
Testtreiber.java

## Aufgabe 3 Bonus
Die Reihenfolge des If-Blocks ist verkehrt herum: Der Preis wird nie auf die 5 Extras berücksichtigen, da die Bedingung für 3=> bereits erfüllt wird bei 5 Extras. Die beiden If-Checks müssten den Platz wechseln, damit der Code richtig funktioniert.