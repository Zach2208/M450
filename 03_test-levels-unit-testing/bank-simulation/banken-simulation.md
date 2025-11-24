# Banken Simulation

Die Bankensimulation besteht aus wenigen Klassen, die zusammen ein einfaches Banksystem darstellen.

---

## 1. Bank
- Verwaltet alle Konten in einer Map.
- Erstellt neue Konten (`SavingsAccount`, `PromoYouthSavingsAccount`, `SalaryAccount`).
- Führt Einzahlungen und Auszahlungen aus.
- Gibt Kontostände und alle Konten aus.

Beziehung: **Bank → mehrere Accounts**

---

## 2. Account (Basisklasse)
- Oberklasse für alle Kontotypen.
- Enthält:
  - Kontonummer (`id`)
  - Saldo (`balance`)
  - Liste aller Buchungen (`Booking`)
- Methoden:
  - `deposit(...)`
  - `withdraw(...)`
  - `canTransact(...)` (wird in Unterklassen angepasst)

Beziehung: **Account → viele Bookings**

---

## 3. Kontotypen
### SavingsAccount
- Normales Sparkonto.
- Kein negativer Saldo erlaubt.

### PromoYouthSavingsAccount
- Spezielles Jugendkonto.
- Erbt von `SavingsAccount`.

### SalaryAccount
- Lohnkonto mit **Kreditlimite** (Überzug erlaubt).

---

## 4. Booking
- Repräsentiert eine Transaktion (Einzahlung oder Auszahlung).
- Enthält Betrag + Datum.
- Wird vom Account erstellt und gespeichert.

---

## 5. BankUtils
- Formatierung von Beträgen und Daten.

---

## 6. Main
- Startpunkt des Programms.
- Demonstriert Erstellen von Konten und Ausführen von Transaktionen.

---

## Kurze Zusammenfassung der Beziehungen
- **Bank** verwaltet **Accounts**
- Jeder **Account** hat mehrere **Bookings**
- Kontotypen erben von **Account**
- **BankUtils** hilft beim Formatieren
