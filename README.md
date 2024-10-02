# README

Med hjälp av denna modulen så kan du redigera bilder även om du bara vill ändra storleken på dem eller om du vill göra flera saker som att ändra ljusstyrka eller rotera bilden.

## Användning

Till och börja med så behövs de klasserna som du vill använda importeras så om du exempelvis bara ska använda dig av ImageEditorn och ImageBrightnessAdjuster så görs det med:

    import app.ImageEditor;
    import app.ImageBrightnessAdjuster;

För att använda en bild så skickar du filvägen till bilden i parametern till ImageEditor när du skapar den och därifrån kan du sedan använda dig av alla andra funktioner.

För att ändra storlek på en bild så får du skapa en ImageResizer som du kan köra resizeImage() på där du som parametrar skickar in din bild (ImageEditor.getImage()), bredden och sedan höjden som du vill att bilden ska vara.

För att ändra ljusstyrka så använder du dig av ImageBrightnessAdjuster som du kör adjustBrightness() på där du som parametrar skickar in din bild (ImageEditor.getImage()) och sedan en float på hur stark ljusstyrkan ska multipliceras med. > 1 ökar ljusstyrkan och < 1 minskar den.

Om du vill göra ett eget filter på bilden så använder du dig av ImageColorFilter och kör adjustColor() på din bild där du skickar in parametrarna bilden du vill ändra (ImageEditor.getImage()) och sedan 3 Floats som justerar den röda, gröna och blåa färgen på bilden. Så om du exempelvis bara vill ha en bild med ett rött filter skickar du in (bilden, 1, 0, 0) då den första är Röd den andra är Grön och den tredje Blå.

Om du vill rotera bilden så använder du dig av ImageRotator och kör rotateImage() på den och som parametrar skickar du in din bild (ImageEditor.getImage()) och sedan antalet grader bilden ska roteras med som en int. När du skickar in ett positivt tal så roteras bilden åt höger och om du skickar in ett negativt tal så roteras den åt vänster.

För att sätta en ny bild antingen den du nyss redigerat genom att rotera eller liknande eller om du vill använda dig av en helt ny bild så använder du ImageEditor.setImage() där filvägen till bilden skickas in som parameter.

När du sedan ska spara bilden du redigerat så använder du dig av ImageEditor.saveImage() där du i parametern skickar med vilken typ av bild du vill spara (jpg, png, mm) och filvägen till den nya bilden.

### Exempel

Exempel på hur du kan implementera detta i din egen kod hittar du i [Example.java](https://github.com/Jollepolle123/L2/blob/main/app/src/main/java/org/example/app/Example.java).  
Jag har även exemplerna på hur bilderna ser ut när man kör min exempel kod och dem ligger i mappen [app/images](https://github.com/Jollepolle123/L2/tree/main/app/images).