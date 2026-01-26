# Deployment Environment

## Aufgabe 1

- Development Environment -> Docker Compose/Vagrant: Services und Server können schnell und leicht deployed werden, ohne grossen Overhead. Ausserdem gibt es sehr gute Intergrationen in IDEs wie Visual Studio Code.
- Testing Environment -> Docker Compose: Die Testumgebung kann schnell wieder reproduziert werden durch das schnelle Hochfahren von Containern und ist ausserdem ideal geeignet für CI/CD Pipelines. Sie teilen zudem die Container mit dem Dev-Env, was das zusammenarbeiten erleichtert.
- Staging Environment -> Kubernetes: Kubernetes ermöglicht es das Staging-Environment so ähnlich wie möglich zum Produktions-Environment aufzustellen.Es können ebenfalls fehlschlagende Secrets oder miskonfigurierte Einstellungen behoben werden, bevor sie zum Prod-Env wechseln.
- Production Environment -> Kubernetes + Terraform: Terraform erstellt die Infrastruktur durch das Infrastructure-as-Code-Feature und Kubernetes orchestriert die verschiedenen Services und Applikationen. Durch die Cloud-Infrastruktur kann man von hoher Verfügbarkeit, Skalierung und Security ausgehen.


## Aufgabe 2

-> siehe docker-compose.yml & Dockerfiles

Wir haben uns für ein Test-Environment mit Docker Compose entschieden, da es für diesen Use-Case als effizienteste Variante bewiesen. Zudem kennen wir uns bereits mit Docker, bzw. Dockerfiles und docker-compose.yml-Files aus durch frühere Projekte im Betrieb.

