package hm.binkley.kunit.system.english

import hm.binkley.kunit.Lengths
import hm.binkley.kunit.Measure
import hm.binkley.kunit.System
import hm.binkley.kunit.system.english.length.Yards
import hm.binkley.kunit.system.fff.FFF
import hm.binkley.kunit.system.fff.length.Furlongs
import hm.binkley.math.finite.div

object English : System<English>("English")

fun <U : Lengths<English, U>, V : Lengths<FFF, V>> Measure<English, U>.into(
    other: V
) = Furlongs.new(this.to(Yards).value / 220).to(other)
