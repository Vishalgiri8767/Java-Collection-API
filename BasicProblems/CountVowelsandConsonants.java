package BasicProblems;
class CountResult {
    int vowels;
    int consonants;
    CountResult (int vowels, int consonants){
        this.vowels = vowels;
        this.consonants = consonants;
    }
};
public class CountVowelsandConsonants {
    public static CountResult count(String str) {

     //   str.toLowerCase();
        str = str.replace(" ", "");
        int vowel = 0;
        int consonant = 0;
        for (char i: str.toLowerCase().toCharArray()) {
            if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u')
                vowel++;
            else
                consonant++;
        };

        return new CountResult(vowel, consonant);
    }

    public static void main(String[] args) {
        String input = "Saai Giri";
        CountResult result = count(input);
        System.out.println("number of vowels: "+result.vowels);
        System.out.println("number of consonants: "+result.consonants);
    };
}