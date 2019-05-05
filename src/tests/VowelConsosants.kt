package tests;

var CONSONANTS = "qwrtypsdfghjklçzxcvbnm"
var VOWELS = "aeiou"
    fun countVowels(str : String): Int{
        var count = 0

        for(letter in str.toLowerCase()){
            if(letter in VOWELS){
                count++
            }
        }
        return count;
    }

    fun countConsonantes(str : String): Int{
        var count = 0

        for (letter in str.toLowerCase()){
            if (letter in CONSONANTS) {
                count++
            }
        }
        return count
    }

    fun isNotVowelsAndConsonantes(str: String): String{
        var retorno = "Sucess"
        for(letter in str.toLowerCase()){
            if ((letter !in  CONSONANTS) && (letter !in VOWELS)) {
                retorno = "Error"
            }
        }
        return retorno
    }



