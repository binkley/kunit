package hm.binkley.kunits.system.fff.mass

import hm.binkley.kunits.Masses
import hm.binkley.kunits.Measure
import hm.binkley.kunits.system.fff.FFF
import hm.binkley.math.finite.FiniteBigRational
import hm.binkley.math.finite.FiniteBigRational.Companion.ONE
import hm.binkley.math.finite.over

sealed class FffMasses<U : FffMasses<U>>(
    name: String,
    firkins: FiniteBigRational
) : Masses<FFF, U>(FFF, name, firkins)

object Firkins : FffMasses<Firkins>("firkin", ONE) {
    override fun new(value: FiniteBigRational) = Firkin(value)
    override fun format(value: FiniteBigRational) = "$value fir"
}

class Firkin(value: FiniteBigRational) : Measure<FFF, Firkins>(Firkins, value)

val Int.firkins get() = (this over 1).firkins
val FiniteBigRational.firkins get() = Firkin(this)