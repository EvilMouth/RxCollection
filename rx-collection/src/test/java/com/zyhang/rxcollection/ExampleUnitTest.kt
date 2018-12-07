package com.zyhang.rxcollection

import io.reactivex.Observable
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
class ExampleUnitTest {
    @Test
    @Throws(Exception::class)
    fun addition_isCorrect() {
        assertEquals(4, (2 + 2).toLong())

        val o1 = Observable.just(1)
        val o2 = Observable.just("2")
        val o3 = Observable.just(3L)
        val o4 = Observable.just(4F)

        ObservableCollection.zip(o1, o2, o3, o4)
                .doOnNext {
                    it.unpack { i, s, l, fl ->
                        println(i)
                        println(s)
                        println(l)
                        println(fl)
                    }
                }.subscribeUnpack()

        println()

        o1.zipWith(o2).subscribeUnpack { s, fl ->
            println(s)
            println(fl)
        }

        println()

        (o3 zip o4).subscribeUnpack { l, fl ->
            println(l)
            println(fl)
        }
    }
}
