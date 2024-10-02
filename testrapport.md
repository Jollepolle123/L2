# Testrapport

För att testa min kod har jag skrivit några tester som körs när man kör gradle build. Det jag testar först med testBrightnessAdjustment() är min adjustBrightness funktion genom att jämföra min bilds färger med bilden som jag fick tillbaks när jag kört adjustBrightness på den.    
Mitt andra test kollar så att min ImageEditor laddar in bilden korrekt, och det tredje testet är på ImageEditorn med, där den då testar så att det fungerar att spara ner en bild genom att först köra saveImage() och sedan kolla så att filen faktist finns.  
För att testa min resizeImage() funktion så kör jag den på en bild och kollar sedan om bilden jag får tillbaks har samma hjöd och bredd som jag satt att jag ville ha.  
Till sist så testar jag rotateImage() genom att kolla så att det jag inte får tillbaks är null, men för att faktist testa funktionen så att den verkligen roterar bilden kan jag spara ner bilden och sedan manuellt kolla på bilden.

![Picture of tests](images/test.png)


| Metod                 | Hur               | Resultat    |
| ----------------------|:-----------------:|-------------|
| BrightnessAdjustment()| Testfunktionen tar färgerna röd grön och blå från orginalbilden och jämför färgerna mot bilden som körts genom BrightnessAdjustment().         | Passed      |
| ImageLoading()	    | Jag skapar en ImageEditor med en bild och kör sedan getImage() och kollar så att den inte är null.                                             | Passed      |
| ImageSaving()         | Här skapar jag upp en ImageEditor med en bild och kör sedan saveImage() och kollar därefter om en ny fil verkligen skapades med det filnamnet. | Passed      |
| ImageResizing()	    | Här så kör jag metoden resizeImage() på en bild och sedan kollar jag så att både höjden och bredden är samma som jag satt att den skulle vara. | Passed      |
| ImageRotation()	    | Jag kör rotateImage() på en bild och kollar sedan så att bilden inte är null.                                                                  | Passed      |