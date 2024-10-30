# Reflektion

Jag tyckte först det var rätt så mycket och ha alla funktioner i ImageEditor men efter en stund kändes det krångligare än att ha så många olika klasser.  
En grej jag inte håller med boken om är att man inte ska ha förkortningar på namn utan att man alltid ska vara så tydlig som möjligt. Detta kan jag hålla med om till viss del såklart men tycker att det är lite överdrivet att ALLA variabler ska vara så då det enligt mig blir för långa namn som ska upprepas många gånger vilket kan resultera att koden blir för kladdig. Ett exempel på detta är mina variabler r, g och b som jag själv kan tycka att man borde förstå står för red, green och blue speciellt när jag håller på med bild redigering.  
En grej jag kan hålla med om från boken är DRY Do not Repeat Yourself som jag försökte hålla mig till så bra som möjligt men när det kom till att lägga till adjustColor() funktionen så är den väldigt lik adjustBrightness() bara att jag multiplicerar alla färger med olika värden istället för samma, detta skulle jag absolut kunnat göra en gemensam funktion för men då jag hade lite ont om tid och inte tyckte det var hela världen så fick det bli så.  
Att man ska skriva funktioner som "Do One Thing" är absolut väldigt viktigt för att kunna förstå koden men jag tycker även att det kan bli lite jobbigt om man gör alldeles för många funktioner, då funktionen bara ska "göra en grej" blir det ju svårt att säga vad en grej är då man kan behöva flera steg för att göra en grej men jag tycker att mina funktioner gör en grej var rätt så bra.

## Namngivning

| Namn och förklaring                   | Reflektion och regler från Clean Code |
|---------------------------------------|:-------------------------------------:|
| **ImageRotator** Namn på klass        | **Avoid Disinformation** Namnet är väldigt tydligt att klassen används för att rotera bilder och inget annat. |
| **adjustBrightness** Namn på funktion | **Use Pronouncable Names** Namnet går att uttala och det är inga dumma förkortningar vilket gör det lätt att diskutera funktionen med andra. |
| **r** Namn på variabel                | **Don’t Be Cute** namnet kanske inte är sött men det är dåligt då kanske inte alla vet vad r står för i rgb men då jag antog att dem flesta skulle göra det så valde jag denna förkortningen. Samma gäller de 2 variablerna under. |
| **g** Namn på variabel                | **Use Intention-Revealing Names** Då g bara står för green så är det kanske inte det lättaste att förstå vad jag ska göra med den och skulle kanske därför kallat den för något som beskriver mer vad jag använder den till som är att sätta den nya justerade färgen i ett Color objekt. |
| **b** Namn på variabel                | **Add Meaningfull Context** Något jag även skulle kunnat gjort var att ge kontext i namnet som gör att andra förstår att r, g och b tillsammans används för att bilda en färg. |



## Funktioner


| Namn               | Antal rader | Reflektion                            |
|--------------------|-------------|:-------------------------------------:|
| adjustBrightness() | 11 | **Do one thing** Denna metoden gör i stort sätt en sak då den justerar ljusstyrkan på bilden men den använder sig av ganska många steg för att göra det så man kanske skulle kunna dela upp den och ha en till funktion som räknar ut vilka rgb värden all pixlar ska ha. |
| rotateImage()      | 9  | **Have no side effects** Denna funktionen tar in en BufferedImage (image) och en Double (rotation), image används bara till att hämta information ifrån som höjd, bredd och filtyp och även sedan för att rita upp den nya bilden. rotation variablen används till att räkna ut vinklen i radianer istället och båda lämnas då oförändrade av funktionen. |
| resizeImage()      | 6  | **Use Descriptive Names** Jag tycker namnet på funktionen är beskrivande då det den gör är att ändrar storlek på bilden, men även variablerna innuti funktionen. Några av dem är width och height som används för bredden och höjden som man ska ha på bilden men även bufferedImage och resizedImage där bufferedImage är en subklass som beskriver en bild med en buffer av bild data och resizedImage är bilden efter den har blivit resizad. |
| saveImage()        | 1  | **Small!** Denna funktionen är simpel och kort då allt den gör är att spara ner bilden som just nu är satt. |
| getImage()         | 1  | **Function Arguments** Funktionen kräver inga argument vilket gör den till en niladic |

