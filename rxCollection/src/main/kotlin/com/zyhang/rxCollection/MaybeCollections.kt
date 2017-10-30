package com.zyhang.rxCollection

import io.reactivex.Maybe
import io.reactivex.MaybeSource
import io.reactivex.functions.*

/**
 * ProjectName:RxCollection
 * Description:
 * Created by zyhang on 2017/10/30.下午3:21
 * Modify by:
 * Modify time:
 * Modify remark:
 */

object MaybeCollection {

    fun <T1, T2> zip(source1: MaybeSource<out T1>,
                     source2: MaybeSource<out T2>): Maybe<BiCollection<T1, T2>> =
            Maybe.zip(source1, source2,
                    BiFunction { t1, t2 -> BiCollection(t1, t2) })

    fun <T1, T2, T3> zip(source1: MaybeSource<out T1>,
                         source2: MaybeSource<out T2>,
                         source3: MaybeSource<out T3>): Maybe<Collection3<T1, T2, T3>> =
            Maybe.zip(source1, source2, source3,
                    Function3 { t1, t2, t3 -> Collection3(t1, t2, t3) })

    fun <T1, T2, T3, T4> zip(source1: MaybeSource<out T1>,
                             source2: MaybeSource<out T2>,
                             source3: MaybeSource<out T3>,
                             source4: MaybeSource<out T4>): Maybe<Collection4<T1, T2, T3, T4>> =
            Maybe.zip(source1, source2, source3, source4,
                    Function4 { t1, t2, t3, t4 -> Collection4(t1, t2, t3, t4) })

    fun <T1, T2, T3, T4, T5> zip(source1: MaybeSource<out T1>,
                                 source2: MaybeSource<out T2>,
                                 source3: MaybeSource<out T3>,
                                 source4: MaybeSource<out T4>,
                                 source5: MaybeSource<out T5>): Maybe<Collection5<T1, T2, T3, T4, T5>> =
            Maybe.zip(source1, source2, source3, source4, source5,
                    Function5 { t1, t2, t3, t4, t5 -> Collection5(t1, t2, t3, t4, t5) })

    fun <T1, T2, T3, T4, T5, T6> zip(source1: MaybeSource<out T1>,
                                     source2: MaybeSource<out T2>,
                                     source3: MaybeSource<out T3>,
                                     source4: MaybeSource<out T4>,
                                     source5: MaybeSource<out T5>,
                                     source6: MaybeSource<out T6>): Maybe<Collection6<T1, T2, T3, T4, T5, T6>> =
            Maybe.zip(source1, source2, source3, source4, source5, source6,
                    Function6 { t1, t2, t3, t4, t5, t6 -> Collection6(t1, t2, t3, t4, t5, t6) })

    fun <T1, T2, T3, T4, T5, T6, T7> zip(source1: MaybeSource<out T1>,
                                         source2: MaybeSource<out T2>,
                                         source3: MaybeSource<out T3>,
                                         source4: MaybeSource<out T4>,
                                         source5: MaybeSource<out T5>,
                                         source6: MaybeSource<out T6>,
                                         source7: MaybeSource<out T7>): Maybe<Collection7<T1, T2, T3, T4, T5, T6, T7>> =
            Maybe.zip(source1, source2, source3, source4, source5, source6, source7,
                    Function7 { t1, t2, t3, t4, t5, t6, t7 -> Collection7(t1, t2, t3, t4, t5, t6, t7) })

    fun <T1, T2, T3, T4, T5, T6, T7, T8> zip(source1: MaybeSource<out T1>,
                                             source2: MaybeSource<out T2>,
                                             source3: MaybeSource<out T3>,
                                             source4: MaybeSource<out T4>,
                                             source5: MaybeSource<out T5>,
                                             source6: MaybeSource<out T6>,
                                             source7: MaybeSource<out T7>,
                                             source8: MaybeSource<out T8>): Maybe<Collection8<T1, T2, T3, T4, T5, T6, T7, T8>> =
            Maybe.zip(source1, source2, source3, source4, source5, source6, source7, source8,
                    Function8 { t1, t2, t3, t4, t5, t6, t7, t8 -> Collection8(t1, t2, t3, t4, t5, t6, t7, t8) })

    fun <T1, T2, T3, T4, T5, T6, T7, T8, T9> zip(source1: MaybeSource<out T1>,
                                                 source2: MaybeSource<out T2>,
                                                 source3: MaybeSource<out T3>,
                                                 source4: MaybeSource<out T4>,
                                                 source5: MaybeSource<out T5>,
                                                 source6: MaybeSource<out T6>,
                                                 source7: MaybeSource<out T7>,
                                                 source8: MaybeSource<out T8>,
                                                 source9: MaybeSource<out T9>): Maybe<Collection9<T1, T2, T3, T4, T5, T6, T7, T8, T9>> =
            Maybe.zip(source1, source2, source3, source4, source5, source6, source7, source8, source9,
                    Function9 { t1, t2, t3, t4, t5, t6, t7, t8, t9 -> Collection9(t1, t2, t3, t4, t5, t6, t7, t8, t9) })
}

fun <T1, T2> Maybe<T1>.zipWith(other: MaybeSource<out T2>): Maybe<BiCollection<T1, T2>>
        = zipWith(other, BiFunction { t1, t2 -> BiCollection(t1, t2) })