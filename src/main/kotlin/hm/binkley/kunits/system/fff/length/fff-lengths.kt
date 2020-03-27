package hm.binkley.kunits.system.fff.length

import hm.binkley.kunits.Lengths
import hm.binkley.kunits.Measure
import hm.binkley.kunits.system.fff.FFF
import hm.binkley.math.finite.FiniteBigRational
import hm.binkley.math.finite.FiniteBigRational.Companion.ONE
import hm.binkley.math.finite.over

sealed class FffLengths<U : FffLengths<U>>(
    name: String,
    furlongs: FiniteBigRational
) : Lengths<FFF, U>(
    FFF, name, furlongs
)

object Furlongs : FffLengths<Furlongs>("furlong", ONE) {
    override fun new(value: FiniteBigRational) = Furlong(value)
    override fun format(value: FiniteBigRational) = "$value fur"
}

class Furlong(value: FiniteBigRational) :
    Measure<FFF, Furlongs>(Furlongs, value)

val Int.furlongs get() = (this over 1).furlongs
val FiniteBigRational.furlongs get() = Furlong(this)