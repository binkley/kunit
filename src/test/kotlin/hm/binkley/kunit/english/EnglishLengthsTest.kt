package hm.binkley.kunit.english

import hm.binkley.math.finite.over
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class EnglishLengthsTest {
    @Test
    fun `should convert`() {
        assertEquals(1.poppyseeds.to(Poppyseeds), 1.poppyseeds)
        assertEquals(1.poppyseeds.to(Barleycorns), (1 over 4).barleycorns)
        assertEquals(1.poppyseeds.to(Inches), (1 over 12).inches)
        assertEquals(1.poppyseeds.to(Sticks), (1 over 24).sticks)
        assertEquals(1.poppyseeds.to(Hands), (1 over 48).hands)
        assertEquals(1.poppyseeds.to(Feet), (1 over 144).feet)
        assertEquals(1.poppyseeds.to(Yards), (1 over 432).yards)
        assertEquals(1.poppyseeds.to(Fathoms), (1 over 864).fathoms)

        assertEquals(1.barleycorns.to(Poppyseeds), 4.poppyseeds)
        assertEquals(1.barleycorns.to(Barleycorns), 1.barleycorns)
        assertEquals(1.barleycorns.to(Inches), (1 over 3).inches)
        assertEquals(1.barleycorns.to(Sticks), (1 over 6).sticks)
        assertEquals(1.barleycorns.to(Hands), (1 over 12).hands)
        assertEquals(1.barleycorns.to(Feet), (1 over 36).feet)
        assertEquals(1.barleycorns.to(Yards), (1 over 108).yards)
        assertEquals(1.barleycorns.to(Fathoms), (1 over 216).fathoms)

        assertEquals(1.inches.to(Poppyseeds), 12.poppyseeds)
        assertEquals(1.inches.to(Barleycorns), 3.barleycorns)
        assertEquals(1.inches.to(Inches), 1.inches)
        assertEquals(1.inches.to(Sticks), (1 over 2).sticks)
        assertEquals(1.inches.to(Hands), (1 over 4).hands)
        assertEquals(1.inches.to(Feet), (1 over 12).feet)
        assertEquals(1.inches.to(Yards), (1 over 36).yards)
        assertEquals(1.inches.to(Fathoms), (1 over 72).fathoms)

        assertEquals(1.sticks.to(Poppyseeds), 24.poppyseeds)
        assertEquals(1.sticks.to(Barleycorns), 6.barleycorns)
        assertEquals(1.sticks.to(Inches), 2.inches)
        assertEquals(1.sticks.to(Sticks), 1.sticks)
        assertEquals(1.sticks.to(Hands), (1 over 2).hands)
        assertEquals(1.sticks.to(Feet), (1 over 6).feet)
        assertEquals(1.sticks.to(Yards), (1 over 18).yards)
        assertEquals(1.sticks.to(Fathoms), (1 over 36).fathoms)

        assertEquals(1.hands.to(Poppyseeds), 48.poppyseeds)
        assertEquals(1.hands.to(Barleycorns), 12.barleycorns)
        assertEquals(1.hands.to(Inches), 4.inches)
        assertEquals(1.hands.to(Sticks), 2.sticks)
        assertEquals(1.hands.to(Hands), 1.hands)
        assertEquals(1.hands.to(Feet), (1 over 3).feet)
        assertEquals(1.hands.to(Yards), (1 over 9).yards)
        assertEquals(1.hands.to(Fathoms), (1 over 18).fathoms)

        assertEquals(1.feet.to(Poppyseeds), 144.poppyseeds)
        assertEquals(1.feet.to(Barleycorns), 36.barleycorns)
        assertEquals(1.feet.to(Inches), 12.inches)
        assertEquals(1.feet.to(Sticks), 6.sticks)
        assertEquals(1.feet.to(Hands), 3.hands)
        assertEquals(1.feet.to(Feet), 1.feet)
        assertEquals(1.feet.to(Yards), (1 over 3).yards)
        assertEquals(1.feet.to(Fathoms), (1 over 6).fathoms)

        assertEquals(1.yards.to(Poppyseeds), 432.poppyseeds)
        assertEquals(1.yards.to(Barleycorns), 108.barleycorns)
        assertEquals(1.yards.to(Inches), 36.inches)
        assertEquals(1.yards.to(Sticks), 18.sticks)
        assertEquals(1.yards.to(Hands), 9.hands)
        assertEquals(1.yards.to(Feet), 3.feet)
        assertEquals(1.yards.to(Yards), 1.yards)
        assertEquals(1.yards.to(Fathoms), (1 over 2).fathoms)

        assertEquals(1.fathoms.to(Poppyseeds), 864.poppyseeds)
        assertEquals(1.fathoms.to(Barleycorns), 216.barleycorns)
        assertEquals(1.fathoms.to(Inches), 72.inches)
        assertEquals(1.fathoms.to(Sticks), 36.sticks)
        assertEquals(1.fathoms.to(Hands), 18.hands)
        assertEquals(1.fathoms.to(Feet), 6.feet)
        assertEquals(1.fathoms.to(Yards), 2.yards)
        assertEquals(1.fathoms.to(Fathoms), 1.fathoms)
    }

    @Test
    fun `should add`() {
        assertEquals(3.poppyseeds + 4.inches, 51.poppyseeds)
    }

    @Test
    fun `should subtract`() {
        assertEquals(3.poppyseeds - 4.inches, (-45).poppyseeds)
    }
}