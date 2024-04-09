package metoder;

public class Encryption {
    // Metod för att kryptera ett meddelande med hjälp av en given nyckel
    public static String encryptMessage(String message, int key) {
        // Skapa en StringBuilder för att bygga det krypterade meddelandet
        StringBuilder encryptedMessage = new StringBuilder();

        // Loopa igenom varje tecken i meddelandet
        for (int i = 0; i < message.length(); i++) {
            // Hämta det aktuella tecknet
            char currentChar = message.charAt(i);
            // Kontrollera om tecknet är en bokstav
            if (Character.isLetter(currentChar)) {
                // Flytta tecknet framåt i teckentabellen med hjälp av nyckeln
                char encryptedChar = (char) (currentChar + key);
                // Om det flyttade tecknet överskrider gränsen för bokstäver (A-Z eller a-z),
                // cirkulera runt teckentabellen genom att subtrahera eller addera 26
                if ((Character.isUpperCase(currentChar) && encryptedChar > 'Z') ||
                    (Character.isLowerCase(currentChar) && encryptedChar > 'z')) {
                    encryptedChar = (char) (currentChar - (26 - key));
                }
                // Lägg till det krypterade tecknet till det krypterade meddelandet
                encryptedMessage.append(encryptedChar);
            } else {
                // Om tecknet inte är en bokstav, lägg till det oförändrat till det krypterade meddelandet
                encryptedMessage.append(currentChar);
            }
        }
        // Returnera det krypterade meddelandet som en sträng
        return encryptedMessage.toString();
    }

    public static void main(String[] args) {
        // Testa krypteringsmetoden
        String message = "du har klarat uppgiften";
        int key = 9;
        String encryptedMessage = encryptMessage(message, key);
        System.out.println("Krypterat meddelande: " + encryptedMessage);
    }
}