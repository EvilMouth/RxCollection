package com.zyhang.rxcollection

import io.reactivex.Single
import io.reactivex.SingleSource
import io.reactivex.functions.*

/**
 * ProjectName:RxCollection
 * Description:
 * Created by zyhang on 2017/10/30.下午2:43
 * Modify by:
 * Modify time:
 * Modify remark:
 */

object SingleCollection {

    fun <T1, T2> zip(source1: SingleSource<out T1>,
                     source2: SingleSource<out T2>): Single<Pair<T1, T2>> =
            Single.zip(source1, source2,
                    BiFunction { t1, t2 -> t1 to t2 })

    fun <T1, T2, T3> zip(source1: SingleSource<out T1>,
                         source2: SingleSource<out T2>,
                         source3: SingleSource<out T3>): Single<Triple<T1, T2, T3>> =
            Single.zip(source1, source2, source3,
                    Function3 { t1, t2, t3 -> Triple(t1, t2, t3) })

    fun <T1, T2, T3, T4> zip(source1: SingleSource<out T1>,
                             source2: SingleSource<out T2>,
                             source3: SingleSource<out T3>,
                             source4: SingleSource<out T4>): Single<Collection4<T1, T2, T3, T4>> =
            Single.zip(source1, source2, source3, source4,
                    Function4 { t1, t2, t3, t4 -> Collection4(t1, t2, t3, t4) })

    fun <T1, T2, T3, T4, T5> zip(source1: SingleSource<out T1>,
                                 source2: SingleSource<out T2>,
                                 source3: SingleSource<out T3>,
                                 source4: SingleSource<out T4>,
                                 source5: SingleSource<out T5>): Single<Collection5<T1, T2, T3, T4, T5>> =
            Single.zip(source1, source2, source3, source4, source5,
                    Function5 { t1, t2, t3, t4, t5 -> Collection5(t1, t2, t3, t4, t5) })

    fun <T1, T2, T3, T4, T5, T6> zip(source1: SingleSource<out T1>,
                                     source2: SingleSource<out T2>,
                                     source3: SingleSource<out T3>,
                                     source4: SingleSource<out T4>,
                                     source5: SingleSource<out T5>,
                                     source6: SingleSource<out T6>): Single<Collection6<T1, T2, T3, T4, T5, T6>> =
            Single.zip(source1, source2, source3, source4, source5, source6,
                    Function6 { t1, t2, t3, t4, t5, t6 -> Collection6(t1, t2, t3, t4, t5, t6) })

    fun <T1, T2, T3, T4, T5, T6, T7> zip(source1: SingleSource<out T1>,
                                         source2: SingleSource<out T2>,
                                         source3: SingleSource<out T3>,
                                         source4: SingleSource<out T4>,
                                         source5: SingleSource<out T5>,
                                         source6: SingleSource<out T6>,
                                         source7: SingleSource<out T7>): Single<Collection7<T1, T2, T3, T4, T5, T6, T7>> =
            Single.zip(source1, source2, source3, source4, source5, source6, source7,
                    Function7 { t1, t2, t3, t4, t5, t6, t7 -> Collection7(t1, t2, t3, t4, t5, t6, t7) })

    fun <T1, T2, T3, T4, T5, T6, T7, T8> zip(source1: SingleSource<out T1>,
                                             source2: SingleSource<out T2>,
                                             source3: SingleSource<out T3>,
                                             source4: SingleSource<out T4>,
                                             source5: SingleSource<out T5>,
                                             source6: SingleSource<out T6>,
                                             source7: SingleSource<out T7>,
                                             source8: SingleSource<out T8>): Single<Collection8<T1, T2, T3, T4, T5, T6, T7, T8>> =
            Single.zip(source1, source2, source3, source4, source5, source6, source7, source8,
                    Function8 { t1, t2, t3, t4, t5, t6, t7, t8 -> Collection8(t1, t2, t3, t4, t5, t6, t7, t8) })

    fun <T1, T2, T3, T4, T5, T6, T7, T8, T9> zip(source1: SingleSource<out T1>,
                                                 source2: SingleSource<out T2>,
                                                 source3: SingleSource<out T3>,
                                                 source4: SingleSource<out T4>,
                                                 source5: SingleSource<out T5>,
                                                 source6: SingleSource<out T6>,
                                                 source7: SingleSource<out T7>,
                                                 source8: SingleSource<out T8>,
                                                 source9: SingleSource<out T9>): Single<Collection9<T1, T2, T3, T4, T5, T6, T7, T8, T9>> =
            Single.zip(source1, source2, source3, source4, source5, source6, source7, source8, source9,
                    Function9 { t1, t2, t3, t4, t5, t6, t7, t8, t9 -> Collection9(t1, t2, t3, t4, t5, t6, t7, t8, t9) })
}

fun <T1, T2> Single<T1>.zipWith(other: SingleSource<T2>): Single<Pair<T1, T2>>
        = zipWith(other, BiFunction { t1, t2 -> t1 to t2 })

infix fun <A, B> SingleSource<A>.zip(that: SingleSource<B>): Single<Pair<A, B>> = SingleCollection.zip(this, that)
