import org.junit.Assert.assertEquals
import org.junit.Test

class Actividad11Test {

    private val actividad11 = Actividad11()

    @Test
    fun listSizeTestCorrect(){
        val list = listOf('a', 'b', 'c', 'd', 'e')
        val result = actividad11.listSize(list)
        val expected = 5


        assertEquals(result,expected)
    }

    @Test
    fun listSizeTestIncorrect(){
        val list = listOf('a', 'b', 'c', 'd', 'e')
        val result = actividad11.listSize(list)
        val expected = 2


        assertEquals(result,expected)
    }

    @Test
    fun countElemsListTestCorrect(){
        val list = listOf('a', 'b', 'b', 'c', 'd', 'e')
        val result = actividad11.countElemsList(list, 'b')
        val expected = 2

        assertEquals(result,expected)
    }

    @Test
    fun countElemsListTestIncorrect(){
        val list = listOf('a', 'a', 'b', 'c', 'd', 'e')
        val result = actividad11.countElemsList(list, 'b')
        val expected = 2

        assertEquals(result,expected)
    }

    @Test
    fun firstLastElemsEqualTestCorrect(){
        val list = listOf('a', 'b', 'c', 'd', 'e', 'e', 'a')
        val result = actividad11.firstLastElemsEqual(list)

        assertEquals(result,true)
    }

    @Test
    fun firstLastElemsEqualTestIncorrect(){
        val list = listOf('a', 'b', 'c', 'd', 'e')
        val result = actividad11.firstLastElemsEqual(list)

        assertEquals(result,true)
    }

    @Test
    fun firstLastElemsEqualTestIncorrectEmptyList(){
        val list = listOf<Char>()
        val result = actividad11.firstLastElemsEqual(list)

        assertEquals(result,true)
    }
}