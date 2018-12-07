package com.zyhang.rxcollection

import io.reactivex.Flowable
import io.reactivex.functions.*
import org.reactivestreams.Publisher

/**
 * ProjectName:RxCollection
 * Description:
 * Created by zyhang on 2017/10/30.下午3:11
 * Modify by:
 * Modify time:
 * Modify remark:
 */

object FlowableCollection {

    fun <T1, T2> combineLatest(source1: Publisher<out T1>,
                               source2: Publisher<out T2>): Flowable<Pair<T1, T2>> =
            Flowable.combineLatest(source1, source2,
                    BiFunction { t1, t2 -> t1 to t2 })

    fun <T1, T2, T3> combineLatest(source1: Publisher<out T1>,
                                   source2: Publisher<out T2>,
                                   source3: Publisher<out T3>): Flowable<Triple<T1, T2, T3>> =
            Flowable.combineLatest(source1, source2, source3,
                    Function3 { t1, t2, t3 -> Triple(t1, t2, t3) })

    fun <T1, T2, T3, T4> combineLatest(source1: Publisher<out T1>,
                                       source2: Publisher<out T2>,
                                       source3: Publisher<out T3>,
                                       source4: Publisher<out T4>): Flowable<Collection4<T1, T2, T3, T4>> =
            Flowable.combineLatest(source1, source2, source3, source4,
                    Function4 { t1, t2, t3, t4 -> Collection4(t1, t2, t3, t4) })

    fun <T1, T2, T3, T4, T5> combineLatest(source1: Publisher<out T1>,
                                           source2: Publisher<out T2>,
                                           source3: Publisher<out T3>,
                                           source4: Publisher<out T4>,
                                           source5: Publisher<out T5>): Flowable<Collection5<T1, T2, T3, T4, T5>> =
            Flowable.combineLatest(source1, source2, source3, source4, source5,
                    Function5 { t1, t2, t3, t4, t5 -> Collection5(t1, t2, t3, t4, t5) })

    fun <T1, T2, T3, T4, T5, T6> combineLatest(source1: Publisher<out T1>,
                                               source2: Publisher<out T2>,
                                               source3: Publisher<out T3>,
                                               source4: Publisher<out T4>,
                                               source5: Publisher<out T5>,
                                               source6: Publisher<out T6>): Flowable<Collection6<T1, T2, T3, T4, T5, T6>> =
            Flowable.combineLatest(source1, source2, source3, source4, source5, source6,
                    Function6 { t1, t2, t3, t4, t5, t6 -> Collection6(t1, t2, t3, t4, t5, t6) })

    fun <T1, T2, T3, T4, T5, T6, T7> combineLatest(source1: Publisher<out T1>,
                                                   source2: Publisher<out T2>,
                                                   source3: Publisher<out T3>,
                                                   source4: Publisher<out T4>,
                                                   source5: Publisher<out T5>,
                                                   source6: Publisher<out T6>,
                                                   source7: Publisher<out T7>): Flowable<Collection7<T1, T2, T3, T4, T5, T6, T7>> =
            Flowable.combineLatest(source1, source2, source3, source4, source5, source6, source7,
                    Function7 { t1, t2, t3, t4, t5, t6, t7 -> Collection7(t1, t2, t3, t4, t5, t6, t7) })

    fun <T1, T2, T3, T4, T5, T6, T7, T8> combineLatest(source1: Publisher<out T1>,
                                                       source2: Publisher<out T2>,
                                                       source3: Publisher<out T3>,
                                                       source4: Publisher<out T4>,
                                                       source5: Publisher<out T5>,
                                                       source6: Publisher<out T6>,
                                                       source7: Publisher<out T7>,
                                                       source8: Publisher<out T8>): Flowable<Collection8<T1, T2, T3, T4, T5, T6, T7, T8>> =
            Flowable.combineLatest(source1, source2, source3, source4, source5, source6, source7, source8,
                    Function8 { t1, t2, t3, t4, t5, t6, t7, t8 -> Collection8(t1, t2, t3, t4, t5, t6, t7, t8) })

    fun <T1, T2, T3, T4, T5, T6, T7, T8, T9> combineLatest(source1: Publisher<out T1>,
                                                           source2: Publisher<out T2>,
                                                           source3: Publisher<out T3>,
                                                           source4: Publisher<out T4>,
                                                           source5: Publisher<out T5>,
                                                           source6: Publisher<out T6>,
                                                           source7: Publisher<out T7>,
                                                           source8: Publisher<out T8>,
                                                           source9: Publisher<out T9>): Flowable<Collection9<T1, T2, T3, T4, T5, T6, T7, T8, T9>> =
            Flowable.combineLatest(source1, source2, source3, source4, source5, source6, source7, source8, source9,
                    Function9 { t1, t2, t3, t4, t5, t6, t7, t8, t9 -> Collection9(t1, t2, t3, t4, t5, t6, t7, t8, t9) })

    ////////////////////////////////////////////////////////////////////////////////////////////////

    fun <T1, T2> zip(source1: Publisher<out T1>,
                     source2: Publisher<out T2>): Flowable<Pair<T1, T2>> =
            Flowable.zip(source1, source2,
                    BiFunction { t1, t2 -> t1 to t2 })

    fun <T1, T2, T3> zip(source1: Publisher<out T1>,
                         source2: Publisher<out T2>,
                         source3: Publisher<out T3>): Flowable<Triple<T1, T2, T3>> =
            Flowable.zip(source1, source2, source3,
                    Function3 { t1, t2, t3 -> Triple(t1, t2, t3) })

    fun <T1, T2, T3, T4> zip(source1: Publisher<out T1>,
                             source2: Publisher<out T2>,
                             source3: Publisher<out T3>,
                             source4: Publisher<out T4>): Flowable<Collection4<T1, T2, T3, T4>> =
            Flowable.zip(source1, source2, source3, source4,
                    Function4 { t1, t2, t3, t4 -> Collection4(t1, t2, t3, t4) })

    fun <T1, T2, T3, T4, T5> zip(source1: Publisher<out T1>,
                                 source2: Publisher<out T2>,
                                 source3: Publisher<out T3>,
                                 source4: Publisher<out T4>,
                                 source5: Publisher<out T5>): Flowable<Collection5<T1, T2, T3, T4, T5>> =
            Flowable.zip(source1, source2, source3, source4, source5,
                    Function5 { t1, t2, t3, t4, t5 -> Collection5(t1, t2, t3, t4, t5) })

    fun <T1, T2, T3, T4, T5, T6> zip(source1: Publisher<out T1>,
                                     source2: Publisher<out T2>,
                                     source3: Publisher<out T3>,
                                     source4: Publisher<out T4>,
                                     source5: Publisher<out T5>,
                                     source6: Publisher<out T6>): Flowable<Collection6<T1, T2, T3, T4, T5, T6>> =
            Flowable.zip(source1, source2, source3, source4, source5, source6,
                    Function6 { t1, t2, t3, t4, t5, t6 -> Collection6(t1, t2, t3, t4, t5, t6) })

    fun <T1, T2, T3, T4, T5, T6, T7> zip(source1: Publisher<out T1>,
                                         source2: Publisher<out T2>,
                                         source3: Publisher<out T3>,
                                         source4: Publisher<out T4>,
                                         source5: Publisher<out T5>,
                                         source6: Publisher<out T6>,
                                         source7: Publisher<out T7>): Flowable<Collection7<T1, T2, T3, T4, T5, T6, T7>> =
            Flowable.zip(source1, source2, source3, source4, source5, source6, source7,
                    Function7 { t1, t2, t3, t4, t5, t6, t7 -> Collection7(t1, t2, t3, t4, t5, t6, t7) })

    fun <T1, T2, T3, T4, T5, T6, T7, T8> zip(source1: Publisher<out T1>,
                                             source2: Publisher<out T2>,
                                             source3: Publisher<out T3>,
                                             source4: Publisher<out T4>,
                                             source5: Publisher<out T5>,
                                             source6: Publisher<out T6>,
                                             source7: Publisher<out T7>,
                                             source8: Publisher<out T8>): Flowable<Collection8<T1, T2, T3, T4, T5, T6, T7, T8>> =
            Flowable.zip(source1, source2, source3, source4, source5, source6, source7, source8,
                    Function8 { t1, t2, t3, t4, t5, t6, t7, t8 -> Collection8(t1, t2, t3, t4, t5, t6, t7, t8) })

    fun <T1, T2, T3, T4, T5, T6, T7, T8, T9> zip(source1: Publisher<out T1>,
                                                 source2: Publisher<out T2>,
                                                 source3: Publisher<out T3>,
                                                 source4: Publisher<out T4>,
                                                 source5: Publisher<out T5>,
                                                 source6: Publisher<out T6>,
                                                 source7: Publisher<out T7>,
                                                 source8: Publisher<out T8>,
                                                 source9: Publisher<out T9>): Flowable<Collection9<T1, T2, T3, T4, T5, T6, T7, T8, T9>> =
            Flowable.zip(source1, source2, source3, source4, source5, source6, source7, source8, source9,
                    Function9 { t1, t2, t3, t4, t5, t6, t7, t8, t9 -> Collection9(t1, t2, t3, t4, t5, t6, t7, t8, t9) })
}

fun <T1, T2> Flowable<T1>.withLatestFrom(other: Publisher<out T2>): Flowable<Pair<T1, T2>>
        = withLatestFrom(other, BiFunction { t1, t2 -> t1 to t2 })

fun <T1, T2, T3> Flowable<T1>.withLatestFrom(o1: Publisher<T2>,
                                             o2: Publisher<T3>): Flowable<Triple<T1, T2, T3>>
        = withLatestFrom(o1, o2, Function3 { t1, t2, t3 -> Triple(t1, t2, t3) })

fun <T1, T2, T3, T4> Flowable<T1>.withLatestFrom(o1: Publisher<T2>,
                                                 o2: Publisher<T3>,
                                                 o3: Publisher<T4>): Flowable<Collection4<T1, T2, T3, T4>>
        = withLatestFrom(o1, o2, o3, Function4 { t1, t2, t3, t4 -> Collection4(t1, t2, t3, t4) })

fun <T1, T2, T3, T4, T5> Flowable<T1>.withLatestFrom(o1: Publisher<T2>,
                                                     o2: Publisher<T3>,
                                                     o3: Publisher<T4>,
                                                     o4: Publisher<T5>): Flowable<Collection5<T1, T2, T3, T4, T5>>
        = withLatestFrom(o1, o2, o3, o4, Function5 { t1, t2, t3, t4, t5 -> Collection5(t1, t2, t3, t4, t5) })

fun <T1, T2> Flowable<T1>.zipWith(other: Publisher<out T2>): Flowable<Pair<T1, T2>>
        = zipWith(other, BiFunction { t1, t2 -> t1 to t2 })