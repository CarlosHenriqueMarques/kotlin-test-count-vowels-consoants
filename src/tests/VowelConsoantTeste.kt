package tests;

import org.junit.Assert;
import org.junit.Test;


class VowelConsoantTeste{


    @Test fun countVowels(){
        Assert.assertEquals(2, countVowels("Teste"))
    }

        @Test fun countConsonantes(){
            Assert.assertEquals(21, countConsonantes("Geralmente uma frase possui mais consoantes!"));
        }

        @Test fun countVowelsAndConsonantes(){
            val phrase = "Estou gostando muito de aprender Kotlin"
            Assert.assertEquals(15,countVowels(phrase))
            Assert.assertEquals(19,countConsonantes(phrase))
        }

        @Test fun notVowelsAndConsonants(){
            Assert.assertEquals("Error", isNotVowelsAndConsonantes("^^!"))
        }


}
