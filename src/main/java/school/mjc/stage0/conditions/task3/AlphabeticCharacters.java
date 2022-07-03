package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        String result;
        if (!((character >= 'a' || character <= 'z') || (character >= 'A' || character <= 'Z'))){
            result = "wrong alphabet";
        } else if (character == 'a' || character == 'o' || character == 'e' || character == 'i' ||
                character == 'u' || character == 'a' || character == 'o' || character == 'e' ||
                character == 'i' || character == 'u'||character == 'A' || character == 'O' ||
                character == 'E' || character == 'I' || character == 'U') {
            result = "Vowel";
        } else {
            result = "Consonant";
        }

        System.out.println(result);
    }
}
