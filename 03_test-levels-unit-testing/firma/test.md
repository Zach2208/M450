# **Aufgabe 1 – Was wird wie in unserer Firma getestet**

### **Was testen wir und wie?**

* Wir arbeiten **mit Elastic (Elasticsearch + Kibana)**.
* Es wird mit **Systemtest-Data-Files** und **Logfiles** gearbeitet, um Detection Rules zu testen.
* Entwickler testen Code selbst

### **Mit welchen Test Levels hatten wir zu tun?**

* **Unit Tests** – kleine Code-Komponenten
* **Integration Tests** – Zusammenspiel von Modulen
* **System Tests** – komplette Log-Pipelines in Elastic

### **Wann werden Tests ausgeführt?**

* Bei jedem **PR** (CI)
* Bei Rule-Änderungen
* 2 Mal pro Tag

### **Haben wir dedizierte QA-Teams?**

* Nein

### **Testing Life Cycle**

1. Anforderungen verstehen
2. Testfall-Planung
3. Testdaten vorbereiten
4. Unit/Integration/Systemtests ausführen
5. Fehler melden
6. Fix + Retest
7. Regression Tests
8. Release

---

# **Aufgabe 2 – Begriffe einordnen**

### **Testing Approach**

Die grundsätzliche Strategie:

* z.B. risk-based, automation-first, exploratory

### **Testing Levels**

Hierarchie der Testebenen:

* Unit
* Integration
* System
* Acceptance

### **Testing Types / Techniques / Tactics**

* **Types:** Functional, Non-Functional, Security, Performance
* **Techniques:** Blackbox, Whitebox, Boundary Tests, Equivalence Partitioning
* **Tactics:** konkrete Methoden (TDD, Fuzzing, Logging-based Testing)

### **Abhängigkeiten**

* **Testing Approach** bestimmt **wie** getestet wird
* Dieser Approach beeinflusst:

  * welche **Testing Levels** wichtiger sind
  * welche **Types/Techniken** eingesetzt werden
* Tools wie **Elastic** definieren, welche Testarten sinnvoll sind (z.B. Log-basierte Systemtests)
