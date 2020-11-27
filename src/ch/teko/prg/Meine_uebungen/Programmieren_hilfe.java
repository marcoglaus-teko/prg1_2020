package ch.teko.prg.Meine_uebungen;

// Hier steht in welchem Package diese Klasse steht bliblabluuuuuu
class Programmieren_hilfe               // Jede Klasse befginnt mit class Programm_Name (erster Buchstabe gross und keine leer Zeichen
{                                       // die Klasse beginnt mit der geschweiften Klammer {


    public static void main(String[] args){ //Die geschweifte Klammer muss immer öffnen und schliessen
        // public ist ein Modifier, so kann mann von anderen Klassen zu diesen Methoden zugreifen, sonst braucht es die Get und Set Methode
        // static, statisch un bedeutet das sie unabhängig ist von der Klasse in der sie steht
        // void es kennzeichnet das die gesamte Methode keinen rückgabewert besitzt
        // Name der Methode, Main
        // (String[] args) eine Art kommunikation zwischen der Konsole und Java, ohne diesen Zusatz ist es gar nicht möglich etwas aus der Konsole zu geben


        // Doppel // bedeutet das es ein Kommentar oder eine Notiz gibt welche beim Programm aber nicht angezeigt wird
        //Erinnerung, jede Zeile/Anweisung muss mit einem Semikolom ;;;; abgeschlossen werden
        /*ist ein Kommentar über zwei Zeilen setzt mann diese Zeichen
        damit der Text auf der zweiten Zeile weiter geht
         */


        // Primitive Datentypen

        boolean aussage = true;        // true oder false kann eingetragen werden
        System.out.println(aussage);   // Wert wird in der Konsole angezeigt
        char datentyp1 = 65535;        // Zahl von 0 bis 65535 =16 Bit
        byte datentyp2 = -127;         // Zahl von -128 bis 127 =8Bit
        short datentyp3 = 32767;       // Zahl von -32768 bis 32767 =16Bit
        int datentyp4 = 2147483647;    // Zahl von -2 hoch 31 bis 2 hoch 31 minus 1 = 32Bit
        long datentyp5 = -922337200;   // Zahl von -2 hoch 62 bis 2 hoch 63 minus 1 = 64Bit
        float datentyp6 = 123984600;   // Zahl von 140 hoch 50 bis 340 hoch 43, mit komma =32Bit
        double datentyp7 = 0004.542;   // Zahl mit komma stellen minus bis plus, komma muss mit punkt ... geschrieben werden =64Bit
        System.out.println(datentyp7); // Wert wird in der Konsole angezeigt


        // Andere Datentypen "Class" , das ist ein komplexer Datentyp
        // String sind Text Werte, der Wert benötigt am Anfang ein " und am Ende ein "

        String lebenslauf = "Ich heisse Fabian und wohne in Hochdorf. ich bin 34 Jahre alt";
        System.out.println(lebenslauf); // Wert wird in der Konsole angezeigt
        System.out.println(lebenslauf + " mit dem plus kann ich den Text erweitern"); //Dies nennt man verkettung


        // Rechnungen Arithmetische Operationo

        int number1 = 3 + 4;           // Die Rechnung wird als Ausdruck definiert welcher ein Ergebniss zurück gibt
        System.out.println(number1);   // Wert wird in der Konsole angezeigt
        int number2 = 5 - 8;
        System.out.println(number2);   // Wert wird in der Konsole angezeigt
        int number3 = 654 * 146;       // Multiplikations Rechnungen
        System.out.println(number3);   // Wert wird in der Konsole angezeigt
        int number4 = 654 / 146;       // Divisions Rechnungen
        System.out.println(number4);   // Wert wird in der Konsole angezeigt
        double number5 = 10.0 / 8.0;   // Bei der Division mit .XX angeben, sonst wird die Zahl gerundet
        System.out.println(number5);   // Wert wird in der Konsole angezeigt

        // Rechnungen Vergleichsoperationen

        if (5 > 4) {                    // Einfache wenn "if" Frage, wenn korrekt wird das folgende angezeigt
            System.out.println("Das ist korrekt");      //System.out muss zwischen { und } sein
        }
        int age = 16;                   // Als Variable wurde das Alter 16 eingetragen
        age = age + 2;                     // Die Variable kann einfach um ein Wert erweitert werden

        if (age >= 18) {                // if das Alter mer als 18 dann....
            System.out.println("Du darfst in den Club gehen");  // wird dieser Wert angegeben { und }
        } else {                        // Wenn nicht "esle/sonst" wird...
            System.out.println("Du kommst nicht in den Club");  // dieser Wert agegeben
        }

        //Variablen, sind Bezeichnungen für Datentypen
        {
            int hier_steht_die_Variable_mit_kleinem_Buchstabe_beginnen = 77;
            System.out.println(hier_steht_die_Variable_mit_kleinem_Buchstabe_beginnen);
        }

        // Aufbau einer Klasse - eine class beginnt immer mit einem grossen Buchstabe zb: Adresse


        // Attribute - Eigenschaften


        // Konstruktor - Konstruktionsplan für Objekt mit gleichen Eigenschaften & gleichem Verhalten


        // Methoden - Hier wird das Verhalten in Java definiert


    }
}


