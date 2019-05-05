package tests;


    fun countVowels(str : String): Int{
        var count = 0
        var VOWELS = "aeiou"
        var stringFormatat = str.toLowerCase()

        for(letter in stringFormatat){
            if(letter in VOWELS){
                count++
            }
        }
        return count;
    }

    fun countConsonantes(str : String): Int{
        var count = 0
        var CONSONANTS = "qwrtypsdfghjklçzxcvbnm"
        var stringFormatat = str.toLowerCase()

        for (letter in stringFormatat){
            if (letter in CONSONANTS) {
                count++
            }
        }
        return count
    }

