# README

Med hjälp av denna modulen så kan du redigera bilder även om du bara vill ändra storleken på dem eller om du vill göra flera saker som att ändra ljusstyrka eller rotera bilden.

## Features

### Resizing

Klassen ImageResizer används för att ändra storlek på bilder. Parametrarna är: bilden som du vill redigera, nya bredden på bilden i pixlar, nya höjden på bilden i pixlar.

            ImageResizer resizer = new ImageResizer();
            BufferedImage resizedImage = resizer.resizeImage(editor.getImage(), 600, 600);
            editor.setImage(resizedImage);
            editor.saveImage("png", "images/hardy1.png");

Här är ett exempel på hur bilden ser ut efter denna koden:

![Picture of tests](images/hardy1.png)

### Rotation

ImageRotator används för att rotera bilder. Parametrarna är: bilden som du vill redigera, antalet grader du vill rotera bilden med (positiva tal roterar bilden åt höger och negativa tal åt vänster).

            ImageRotator rotator = new ImageRotator();
            BufferedImage rotatedImage = rotator.rotateImage(editor.getImage(), 45);
            editor.setImage(rotatedImage);
            editor.saveImage("png", "images/hardy2.png");

Här är ett exempel på hur bilden ser ut efter denna koden:

![Picture of tests](images/hardy2.png)

### Brightness

 Parametrarna är: bilden som du vill redigera, hur mycket du vill multiplicera bildens ljusstyrka med (som float) där 1 då är bildens standard ljusstyrka.

            ImageBrightnessAdjuster brightnessAdjuster = new ImageBrightnessAdjuster();
            BufferedImage brightenedImage = brightnessAdjuster.adjustBrightness(editor.getImage(), 1.4f);
            editor.setImage(brightenedImage);
            editor.saveImage("png", "images/hardy3.png");

Här är ett exempel på hur bilden ser ut efter denna koden:

![Picture of tests](images/hardy3.png)

### Color filters

 Parametrarna är: bilden som du vill redigera, hur mycket du vill multiplicera bildens röda färg med (som float) där 1 då är bildens standard färg, hur mycket du vill multiplicera bildens gröna färg med (som float) där 1 då är bildens standard färg, hur mycket du vill multiplicera bildens blåa färg med (som float) där 1 då är bildens standard färg. Kodexemplet under tar då bort all grön färg ur bilden.

            ImageColorFilter colorFilter = new ImageColorFilter();
            BufferedImage filteredImage = colorFilter.adjustColor(editor.getImage(), 1f, 0f, 1f);
            editor.setImage(filteredImage);
            editor.saveImage("png", "images/hardy4.png");

Här är ett exempel på hur bilden ser ut efter denna koden:

![Picture of tests](images/hardy4.png)

### Invert colors

 Parametrarna är: bilden som du vill redigera.

            NegativeColorConverter colorConverter = new NegativeColorConverter();
            BufferedImage convertedImage = colorConverter.convertColors(editor.getImage());
            editor.setImage(convertedImage);
            editor.saveImage("png", "images/hardy5.png");

Här är ett exempel på hur bilden ser ut efter denna koden:

![Picture of tests](images/hardy5.png)

### Grey scale

 Parametrarna är: bilden som du vill redigera.

            GrayScaleImage grayScaler = new GrayScaleImage();
            BufferedImage grayImage = grayScaler.grayScale(editor.getImage());
            editor.setImage(grayImage);
            editor.saveImage("png", "images/hardy6.png");

Här är ett exempel på hur bilden ser ut efter denna koden:

![Picture of tests](images/hardy6.png)

### Color saturation

 Parametrarna är: bilden som du vill redigera, hur mycket "mättnad" du vill ha i bilden mellan 0-100.

            ColorSaturator colorSaturator = new ColorSaturator();
            BufferedImage saturatedImage = colorSaturator.saturateImage(editor.getImage(), 60);
            editor.setImage(saturatedImage);
            editor.saveImage("png", "images/hardy7.png");

Här är ett exempel på hur bilden ser ut efter denna koden:

![Picture of tests](images/hardy7.png)

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

## Exempel

Exempel på hur du kan implementera detta i din egen kod hittar du i [Example.java](https://github.com/Jollepolle123/L2/blob/main/app/src/main/java/org/example/app/Example.java).  
Jag har även exemplerna på hur bilderna ser ut när man kör min exempel kod och dem ligger i mappen [app/images](https://github.com/Jollepolle123/L2/tree/main/app/images).