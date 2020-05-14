package hm.binkley.kunits.system.fff.mass

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class FffMassesTest {
    @Test
    fun `should convert`() {
        assertEquals(1.firkins.to(Firkins), 1L.firkins)
    }

    @Test
    fun `should pretty print`() {
        assertEquals("FFF firkin", "$Firkins")
        assertEquals("1 fir", "${1.firkins}")
    }
}
