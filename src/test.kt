
import java.io.PrintStream
import java.io.ByteArrayOutputStream
import kotlin.test.*

import org.junit.jupiter.api.Test

private val outContent = ByteArrayOutputStream()
private val errContent = ByteArrayOutputStream()
private val originalOut = System.out
private val originalErr = System.err


class animalTest(){

    @Test
    fun testFeeding() {
        val mysnake = Snake("hsss", 1)
        assertEquals("eats snake food", mysnake.eat())

        val mycat = Cat("dan", 13)
        assertEquals("вы покормили животное", mycat.feed())
        assertEquals("вы убрали за животным", mycat.clean())
        assertEquals("вы покормили животное", mycat.feed())
        assertEquals("ваше животное убежало", mycat.feed())
        assertEquals("вы не можете покормить убежавшее животное", mycat.feed())
    }


}


