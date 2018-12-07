package com.zyhang.rxcollection

import java.io.Serializable

/**
 * ProjectName:RxCollection
 * Description:
 * Created by zyhang on 2017/10/30.下午2:22
 * Modify by:
 * Modify time:
 * Modify remark:
 */

//data class Collection<out T1>(
//        val t1: T1) : Serializable {
//    fun unpack(onNext: (T1) -> Unit) {
//        onNext(t1)
//    }
//
//    override fun toString() = "($t1)"
//}
//
//data class BiCollection<out T1, out T2>(
//        val t1: T1,
//        val t2: T2) : Serializable {
//    fun unpack(onNext: (T1, T2) -> Unit) {
//        onNext(t1, t2)
//    }
//
//    override fun toString() = "($t1, $t2)"
//}
//
//data class Collection3<out T1, out T2, out T3>(
//        val t1: T1,
//        val t2: T2,
//        val t3: T3) : Serializable {
//    fun unpack(onNext: (T1, T2, T3) -> Unit) {
//        onNext(t1, t2, t3)
//    }
//
//    override fun toString() = "($t1, $t2, $t3)"
//}

/**
 * support Pair.unpack { first, second ->
 *
 *                  }
 * @see Pair
 */
fun <T1, T2> Pair<T1, T2>.unpack(onNext: (T1, T2) -> Unit) {
    onNext(first, second)
}

/**
 * support Triple.unpack { first, second, third ->
 *
 *                  }
 * @see Triple
 */
fun <T1, T2, T3> Triple<T1, T2, T3>.unpack(onNext: (T1, T2, T3) -> Unit) {
    onNext(first, second, third)
}

data class Collection4<out T1, out T2, out T3, out T4>(
        val t1: T1,
        val t2: T2,
        val t3: T3,
        val t4: T4) : Serializable {
    fun unpack(onNext: (T1, T2, T3, T4) -> Unit) {
        onNext(t1, t2, t3, t4)
    }

    override fun toString() = "($t1, $t2, $t3, $t4)"
}

data class Collection5<out T1, out T2, out T3, out T4, out T5>(
        val t1: T1,
        val t2: T2,
        val t3: T3,
        val t4: T4,
        val t5: T5) : Serializable {
    fun unpack(onNext: (T1, T2, T3, T4, T5) -> Unit) {
        onNext(t1, t2, t3, t4, t5)
    }

    override fun toString() = "($t1, $t2, $t3, $t4, $t5)"
}

data class Collection6<out T1, out T2, out T3, out T4, out T5, out T6>(
        val t1: T1,
        val t2: T2,
        val t3: T3,
        val t4: T4,
        val t5: T5,
        val t6: T6) : Serializable {
    fun unpack(onNext: (T1, T2, T3, T4, T5, T6) -> Unit) {
        onNext(t1, t2, t3, t4, t5, t6)
    }

    override fun toString() = "($t1, $t2, $t3, $t4, $t5, $t6)"
}

data class Collection7<out T1, out T2, out T3, out T4, out T5, out T6, out T7>(
        val t1: T1,
        val t2: T2,
        val t3: T3,
        val t4: T4,
        val t5: T5,
        val t6: T6,
        val t7: T7) : Serializable {
    fun unpack(onNext: (T1, T2, T3, T4, T5, T6, T7) -> Unit) {
        onNext(t1, t2, t3, t4, t5, t6, t7)
    }

    override fun toString() = "($t1, $t2, $t3, $t4, $t5, $t6, $t7)"
}

data class Collection8<out T1, out T2, out T3, out T4, out T5, out T6, out T7, out T8>(
        val t1: T1,
        val t2: T2,
        val t3: T3,
        val t4: T4,
        val t5: T5,
        val t6: T6,
        val t7: T7,
        val t8: T8) : Serializable {
    fun unpack(onNext: (T1, T2, T3, T4, T5, T6, T7, T8) -> Unit) {
        onNext(t1, t2, t3, t4, t5, t6, t7, t8)
    }

    override fun toString() = "($t1, $t2, $t3, $t4, $t5, $t6, $t7, $t8)"
}

data class Collection9<out T1, out T2, out T3, out T4, out T5, out T6, out T7, out T8, out T9>(
        val t1: T1,
        val t2: T2,
        val t3: T3,
        val t4: T4,
        val t5: T5,
        val t6: T6,
        val t7: T7,
        val t8: T8,
        val t9: T9) : Serializable {
    fun unpack(onNext: (T1, T2, T3, T4, T5, T6, T7, T8, T9) -> Unit) {
        onNext(t1, t2, t3, t4, t5, t6, t7, t8, t9)
    }

    override fun toString() = "($t1, $t2, $t3, $t4, $t5, $t6, $t7, $t8, $t9)"
}

//fun <T> Collection<T>.toList(): List<T> = listOf(t1)
//fun <T> BiCollection<T, T>.toList(): List<T> = listOf(t1, t2)
//fun <T> Collection3<T, T, T>.toList(): List<T> = listOf(t1, t2, t3)
fun <T> Collection4<T, T, T, T>.toList(): List<T> = listOf(t1, t2, t3, t4)
fun <T> Collection5<T, T, T, T, T>.toList(): List<T> = listOf(t1, t2, t3, t4, t5)
fun <T> Collection6<T, T, T, T, T, T>.toList(): List<T> = listOf(t1, t2, t3, t4, t5, t6)
fun <T> Collection7<T, T, T, T, T, T, T>.toList(): List<T> = listOf(t1, t2, t3, t4, t5, t6, t7)
fun <T> Collection8<T, T, T, T, T, T, T, T>.toList(): List<T> = listOf(t1, t2, t3, t4, t5, t6, t7, t8)
fun <T> Collection9<T, T, T, T, T, T, T, T, T>.toList(): List<T> = listOf(t1, t2, t3, t4, t5, t6, t7, t8, t9)