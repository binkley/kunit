package hm.binkley.kunits.system.fff.length

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

internal class FffLengthsTest {
    @Test
    fun `should convert`() {
        1.furlongs.to(Furlongs) shouldBe 1L.furlongs
    }

    @Test
    fun `should pretty print`() {
        "$Furlongs" shouldBe "FFF furlong"
        "${1.furlongs}" shouldBe "1 fur"
    }
}
