package hm.binkley.kunit.system.fff

import hm.binkley.kunit.Lengths
import hm.binkley.kunit.Measure
import hm.binkley.kunit.System
import hm.binkley.kunit.system.english.English
import hm.binkley.kunit.system.english.length.Yards
import hm.binkley.kunit.system.fff.length.Furlongs
import hm.binkley.math.finite.times

object FFF : System<FFF>("FFF")

fun <U : Lengths<FFF, U>, V : Lengths<English, V>> Measure<FFF, U>.into(
    other: V
) = Yards.new(to(Furlongs).value * 220).to(other)