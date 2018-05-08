package com.zyhang.rxCollection

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

        ObservableCollection.zip(
                Observable.just("1"),
                Observable.just(2),
                Observable.just(3L),
                Observable.just(4F)
        )
                .doOnNext {
                    it.unpack { s, i, l, fl ->
                        println(s)
                        println(i)
                        println(l)
                        println(fl)
                    }
                }
                .subscribeUnpack { s, i, l, fl ->
                    println(s)
                    println(i)
                    println(l)
                    println(fl)
                }

        Observable.just("1")
                .zipWith(Observable.just(2F))
                .subscribeUnpack { s, fl ->
                    println(s)
                    println(fl)
                }
    }
}