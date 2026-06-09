# Hello Spring Boot - publiczny hosting

## Dane zespołu

- Nazwa zespołu: Andrii Umanets
- Numer indeksu: 76865
- Nazwa aplikacji: `hello-springboot-andrii-76865`

## Krótki opis aplikacji

Projekt zawiera minimalną aplikację backendową napisaną w Java + Spring Boot.
Aplikacja ma stronę główną HTML oraz dwa endpointy REST, które zwracają odpowiedź JSON.
Celem projektu jest pokazanie, że aplikację można uruchomić lokalnie oraz opublikować w internecie.

## Technologie

- Java 17
- Spring Boot 3
- Maven
- REST API
- HTML + CSS

## Endpointy

Po uruchomieniu lokalnym aplikacja działa pod adresem:

```text
http://localhost:8080
```

Dostępne endpointy:

```text
GET /
GET /hello
GET /api/test
```

Przykładowa odpowiedź z `/hello`:

```json
{
  "message": "Hello from Spring Boot",
  "team": "Andrii Umanets",
  "indexes": ["76865"],
  "status": "public endpoint works"
}
```

## Instrukcja uruchomienia lokalnego

1. Zainstalować Java 17.
2. Zainstalować Maven.
3. Otworzyć folder projektu w terminalu.
4. Uruchomić komendę:

```bash
mvn spring-boot:run
```

5. Otworzyć w przeglądarce:

```text
http://localhost:8080
```

## Budowanie pliku JAR

Aby zbudować aplikację do pliku `.jar`, należy użyć komendy:

```bash
mvn clean package
```

Plik wynikowy będzie w folderze:

```text
target/hello-springboot-andrii-76865-1.0.0.jar
```

Uruchomienie zbudowanego pliku:

```bash
java -jar target/hello-springboot-andrii-76865-1.0.0.jar
```

## Publiczny deployment

Aplikacja jest przygotowana do hostingu publicznego. W pliku `application.properties` ustawiono:

```properties
server.port=${PORT:8080}
```

Dzięki temu hosting może sam przekazać numer portu przez zmienną środowiskową `PORT`.

## Platformy sprawdzone przez zespół

### 1. Azure App Service

Azure App Service to dobra platforma do wdrożenia aplikacji Spring Boot, ale konfiguracja może być trudniejsza dla początkujących. Trzeba utworzyć usługę App Service, wskazać środowisko Java oraz przesłać aplikację przez GitHub lub plik JAR.

Plusy:
- profesjonalna platforma chmurowa,
- dobra dokumentacja,
- możliwość pracy z aplikacjami Java.

Minusy:
- więcej ustawień,
- czasem wymaga podania karty płatniczej,
- na początku może być mniej wygodna.

### 2. AWS Elastic Beanstalk

AWS Elastic Beanstalk pozwala uruchamiać aplikacje Java, ale wymaga większej liczby kroków niż prostsze platformy. Trzeba przygotować środowisko, region, konfigurację aplikacji i przesłać plik `.jar`.

Plusy:
- bardzo popularna platforma w pracy zawodowej,
- obsługuje Java i Spring Boot,
- można łatwo skalować aplikację.

Minusy:
- dużo opcji konfiguracyjnych,
- trudniejszy start dla osób początkujących,
- trzeba uważać na koszty.

### 3. Railway

Railway jest prostszy do szybkiego pokazania projektu. Można połączyć repozytorium GitHub i uruchomić aplikację automatycznie. Dla małego projektu Spring Boot jest to wygodne rozwiązanie.

Plusy:
- proste połączenie z GitHub,
- szybki deployment,
- wygodne logi.

Minusy:
- darmowe limity mogą się zmieniać,
- trzeba poprawnie ustawić komendę startową.

### 4. Render

Render jest również wygodny do prostego deploymentu. Można utworzyć Web Service, połączyć GitHub i wskazać komendy budowania oraz startu.

Przykładowe komendy:

```bash
Build command: mvn clean package
Start command: java -jar target/hello-springboot-andrii-76865-1.0.0.jar
```

Plusy:
- prosta konfiguracja,
- publiczny link do aplikacji,
- dobre rozwiązanie do projektów edukacyjnych.

Minusy:
- darmowa aplikacja może zasypiać,
- pierwszy start może trwać dłużej.

### 5. Fly.io

Fly.io pozwala uruchamiać aplikacje w kontenerach. Jest to ciekawe rozwiązanie, ale wymaga zrozumienia Dockera lub konfiguracji deploymentu przez CLI.

Plusy:
- nowoczesna platforma,
- dobre rozwiązanie dla aplikacji kontenerowych,
- publiczny adres URL.

Minusy:
- trudniejsze dla początkujących,
- może wymagać Dockera,
- więcej pracy z terminalem.

## Krótkie porównanie platform

Najłatwiejsze platformy do tego zadania to Railway oraz Render, ponieważ mają prostą integrację z GitHub i szybko generują publiczny adres URL.
Azure App Service i AWS Elastic Beanstalk są bardziej profesjonalne, ale wymagają więcej konfiguracji.
Fly.io jest ciekawy, ale może być trudniejszy, jeśli zespół nie zna Dockera.

## Co się udało

- Utworzono minimalną aplikację Spring Boot.
- Dodano publiczne endpointy REST.
- Dodano prostą stronę HTML.
- Przygotowano aplikację do uruchomienia lokalnego.
- Przygotowano projekt do publicznego deploymentu.
- Przygotowano opis platform hostingowych.

## Co się nie udało / problemy

Największą trudnością może być konfiguracja hostingu oraz ustawienie właściwej komendy startowej. W przypadku darmowych platform problemem może być też usypianie aplikacji albo wymaganie dodania karty płatniczej.

## Wnioski

Do małego projektu Spring Boot najlepsze na start wydają się Render albo Railway. Są prostsze niż AWS i Azure, a jednocześnie pozwalają szybko uzyskać publiczny URL. AWS i Azure są dobrym wyborem do większych, profesjonalnych projektów, ale na początek wymagają więcej nauki.
