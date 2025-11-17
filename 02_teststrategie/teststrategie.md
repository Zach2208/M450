## Übung 1

### Abstrakte Testfälle – Rabattberechnung

| ID  | Vorbedingung / Eingabe (Kaufpreis)    | Erwarteter Rabatt          | Bemerkung / Äquivalenzklasse              |
|-----|---------------------------------------|----------------------------|-------------------------------------------|
| A1  | 0 < Preis < 15'000                    | Rabatt = 0 %               | Klasse: „unter 15'000“                    |
| A2  | 15'000 ≤ Preis ≤ 20'000               | Rabatt = 5 %               | Klasse: „15'000 bis 20'000 inkl. Grenzen“ |
| A3  | 20'000 < Preis < 25'000               | Rabatt = 7 %               | Klasse: „über 20'000, unter 25'000“       |
| A4  | Preis ≥ 25'000                        | Rabatt = 8.5 %             | Klasse: „25'000 und mehr“                 |


### Konkrete Testfälle – Rabattberechnung

| ID  | Kaufpreis (CHF) | Erwarteter Rabatt | Begründung                                  |
|-----|-----------------|-------------------|---------------------------------------------|
| C1  | 10'000          | 0 %               | Typischer Wert in Klasse A1 (< 15'000)      |
| C2  | 14'999          | 0 %               | Oberer Grenzwert knapp unter 15'000         |
| C3  | 15'000          | 5 %               | Untere Grenze der 5%-Klasse                 |
| C4  | 20'000          | 5 %               | Obere Grenze der 5%-Klasse                  |
| C5  | 20'001          | 7 %               | Untere Grenze der 7%-Klasse                 |
| C6  | 24'999          | 7 %               | Oberer Grenzwert knapp unter 25'000         |
| C7  | 25'000          | 8.5 %             | Untere Grenze der 8.5%-Klasse               |
| C8  | -100            | Fehlermeldung     | Ungültiger negativer Preis                  |
| C9  | "abc"           | Fehlermeldung     | Nicht-numerischer Wert                      |

## Übung 2

### Black-Box-Testfälle – Autovermietung

| ID  | Beschreibung                                                                                           | Erwartetes Resultat                                                                                              | Effektives Resultat          | Status | Mögliche Ursache (bei Fehler)                          |
|-----|--------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------|------------------------------|--------|--------------------------------------------------------|
| T1  | Suche nach Fahrzeugen mit gültigen Daten (Ort, Abholdatum < Rückgabedatum, Uhrzeiten sinnvoll)        | Trefferliste mit verfügbaren Fahrzeugen wird angezeigt, inkl. Preis und Fahrzeugdetails                         | Noch nicht getestet          | Offen  | –                                                      |
| T2  | Suche mit ungültigem Zeitraum (Rückgabedatum vor Abholdatum)                                          | Deutliche Fehlermeldung, kein Suchresultat. Benutzer bleibt auf der Suchseite.                                  | Noch nicht getestet          | Offen  | Validierung der Datumsfelder fehlt/defekt              |
| T3  | Vollständige Buchung mit bereits registriertem Benutzer (Login → Fahrzeug wählen → Daten bestätigen)   | Buchung wird bestätigt, Reservierungsnummer angezeigt, Bestätigungs-E-Mail wird an den Benutzer gesendet        | Noch nicht getestet          | Offen  | Fehler im Buchungs-Workflow oder E-Mail-Versand       |
| T4  | Bezahlung mit gültiger Kreditkarte                                                                    | Zahlung wird akzeptiert, keine Fehlermeldung, Buchung wechselt in Status „bestätigt“                            | Noch nicht getestet          | Offen  | Schnittstelle zum Payment-Provider schlägt fehl        |
| T5  | Preis-/Kostenanzeige: Gesamtkosten entsprechen Tagespreis × Anzahl Tage + Gebühren (z.B. Versicherung) | Anzeige der Gesamtkosten ist korrekt und stimmt mit den im Detail aufgeführten Einzelpreisen/Fee-Positionen überein | Noch nicht getestet          | Offen  | Falsche Berechnungslogik im Backend oder Rundungsfehler |
