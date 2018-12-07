package com.zyhang.rxcollection

import io.reactivex.Observable
import io.reactivex.ObservableSource
import io.reactivex.functions.*

/**
 * ProjectName:RxCollection
 * Description:
 * Created by zyhang on 2017/10/30.下午2:26
 * Modify by:
 * Modify time:
 * Modify remark:
 */

object ObservableCollection {

    fun <T1, T2> combineLatest(source1: ObservableSource<out T1>,
                               source2: ObservableSource<out T2>): Observable<Pair<T1, T2>> =
            Observable.combineLatest(source1, source2,
                    BiFunction { t1, t2 -> t1 to t2 })

    fun <T1, T2, T3> combineLatest(source1: ObservableSource<out T1>,
                                   source2: ObservableSource<out T2>,
                                   source3: ObservableSource<out T3>): Observable<Triple<T1, T2, T3>> =
            Observable.combineLatest(source1, source2, source3,
                    Function3 { t1, t2, t3 -> Triple(t1, t2, t3) })

    fun <T1, T2, T3, T4> combineLatest(source1: ObservableSource<out T1>,
                                       source2: ObservableSource<out T2>,
                                       source3: ObservableSource<out T3>,
                                       source4: ObservableSource<out T4>): Observable<Collection4<T1, T2, T3, T4>> =
            Observable.combineLatest(source1, source2, source3, source4,
                    Function4 { t1, t2, t3, t4 -> Collection4(t1, t2, t3, t4) })

    fun <T1, T2, T3, T4, T5> combineLatest(source1: ObservableSource<out T1>,
                                           source2: ObservableSource<out T2>,
                                           source3: ObservableSource<out T3>,
                                           source4: ObservableSource<out T4>,
                                           source5: ObservableSource<out T5>): Observable<Collection5<T1, T2, T3, T4, T5>> =
            Observable.combineLatest(source1, source2, source3, source4, source5,
                    Function5 { t1, t2, t3, t4, t5 -> Collection5(t1, t2, t3, t4, t5) })

    fun <T1, T2, T3, T4, T5, T6> combineLatest(source1: ObservableSource<out T1>,
                                               source2: ObservableSource<out T2>,
                                               source3: ObservableSource<out T3>,
                                               source4: ObservableSource<out T4>,
                                               source5: ObservableSource<out T5>,
                                               source6: ObservableSource<out T6>): Observable<Collection6<T1, T2, T3, T4, T5, T6>> =
            Observable.combineLatest(source1, source2, source3, source4, source5, source6,
                    Function6 { t1, t2, t3, t4, t5, t6 -> Collection6(t1, t2, t3, t4, t5, t6) })

    fun <T1, T2, T3, T4, T5, T6, T7> combineLatest(source1: ObservableSource<out T1>,
                                                   source2: ObservableSource<out T2>,
                                                   source3: ObservableSource<out T3>,
                                                   source4: ObservableSource<out T4>,
                                                   source5: ObservableSource<out T5>,
                                                   source6: ObservableSource<out T6>,
                                                   source7: ObservableSource<out T7>): Observable<Collection7<T1, T2, T3, T4, T5, T6, T7>> =
            Observable.combineLatest(source1, source2, source3, source4, source5, source6, source7,
                    Function7 { t1, t2, t3, t4, t5, t6, t7 -> Collection7(t1, t2, t3, t4, t5, t6, t7) })

    fun <T1, T2, T3, T4, T5, T6, T7, T8> combineLatest(source1: ObservableSource<out T1>,
                                                       source2: ObservableSource<out T2>,
                                                       source3: ObservableSource<out T3>,
                                                       source4: ObservableSource<out T4>,
                                                       source5: ObservableSource<out T5>,
                                                       source6: ObservableSource<out T6>,
                                                       source7: ObservableSource<out T7>,
                                                       source8: ObservableSource<out T8>): Observable<Collection8<T1, T2, T3, T4, T5, T6, T7, T8>> =
            Observable.combineLatest(source1, source2, source3, source4, source5, source6, source7, source8,
                    Function8 { t1, t2, t3, t4, t5, t6, t7, t8 -> Collection8(t1, t2, t3, t4, t5, t6, t7, t8) })

    fun <T1, T2, T3, T4, T5, T6, T7, T8, T9> combineLatest(source1: ObservableSource<out T1>,
                                                           source2: ObservableSource<out T2>,
                                                           source3: ObservableSource<out T3>,
                                                           source4: ObservableSource<out T4>,
                                                           source5: ObservableSource<out T5>,
                                                           source6: ObservableSource<out T6>,
                                                           source7: ObservableSource<out T7>,
                                                           source8: ObservableSource<out T8>,
                                                           source9: ObservableSource<out T9>): Observable<Collection9<T1, T2, T3, T4, T5, T6, T7, T8, T9>> =
            Observable.combineLatest(source1, source2, source3, source4, source5, source6, source7, source8, source9,
                    Function9 { t1, t2, t3, t4, t5, t6, t7, t8, t9 -> Collection9(t1, t2, t3, t4, t5, t6, t7, t8, t9) })

    ////////////////////////////////////////////////////////////////////////////////////////////////

    fun <T1, T2> zip(source1: ObservableSource<out T1>,
                     source2: ObservableSource<out T2>): Observable<Pair<T1, T2>> =
            Observable.zip(source1, source2,
                    BiFunction { t1, t2 -> t1 to t2 })

    fun <T1, T2, T3> zip(source1: ObservableSource<out T1>,
                         source2: ObservableSource<out T2>,
                         source3: ObservableSource<out T3>): Observable<Triple<T1, T2, T3>> =
            Observable.zip(source1, source2, source3,
                    Function3 { t1, t2, t3 -> Triple(t1, t2, t3) })

    fun <T1, T2, T3, T4> zip(source1: ObservableSource<out T1>,
                             source2: ObservableSource<out T2>,
                             source3: ObservableSource<out T3>,
                             source4: ObservableSource<out T4>): Observable<Collection4<T1, T2, T3, T4>> =
            Observable.zip(source1, source2, source3, source4,
                    Function4 { t1, t2, t3, t4 -> Collection4(t1, t2, t3, t4) })

    fun <T1, T2, T3, T4, T5> zip(source1: ObservableSource<out T1>,
                                 source2: ObservableSource<out T2>,
                                 source3: ObservableSource<out T3>,
                                 source4: ObservableSource<out T4>,
                                 source5: ObservableSource<out T5>): Observable<Collection5<T1, T2, T3, T4, T5>> =
            Observable.zip(source1, source2, source3, source4, source5,
                    Function5 { t1, t2, t3, t4, t5 -> Collection5(t1, t2, t3, t4, t5) })

    fun <T1, T2, T3, T4, T5, T6> zip(source1: ObservableSource<out T1>,
                                     source2: ObservableSource<out T2>,
                                     source3: ObservableSource<out T3>,
                                     source4: ObservableSource<out T4>,
                                     source5: ObservableSource<out T5>,
                                     source6: ObservableSource<out T6>): Observable<Collection6<T1, T2, T3, T4, T5, T6>> =
            Observable.zip(source1, source2, source3, source4, source5, source6,
                    Function6 { t1, t2, t3, t4, t5, t6 -> Collection6(t1, t2, t3, t4, t5, t6) })

    fun <T1, T2, T3, T4, T5, T6, T7> zip(source1: ObservableSource<out T1>,
                                         source2: ObservableSource<out T2>,
                                         source3: ObservableSource<out T3>,
                                         source4: ObservableSource<out T4>,
                                         source5: ObservableSource<out T5>,
                                         source6: ObservableSource<out T6>,
                                         source7: ObservableSource<out T7>): Observable<Collection7<T1, T2, T3, T4, T5, T6, T7>> =
            Observable.zip(source1, source2, source3, source4, source5, source6, source7,
                    Function7 { t1, t2, t3, t4, t5, t6, t7 -> Collection7(t1, t2, t3, t4, t5, t6, t7) })

    fun <T1, T2, T3, T4, T5, T6, T7, T8> zip(source1: ObservableSource<out T1>,
                                             source2: ObservableSource<out T2>,
                                             source3: ObservableSource<out T3>,
                                             source4: ObservableSource<out T4>,
                                             source5: ObservableSource<out T5>,
                                             source6: ObservableSource<out T6>,
                                             source7: ObservableSource<out T7>,
                                             source8: ObservableSource<out T8>): Observable<Collection8<T1, T2, T3, T4, T5, T6, T7, T8>> =
            Observable.zip(source1, source2, source3, source4, source5, source6, source7, source8,
                    Function8 { t1, t2, t3, t4, t5, t6, t7, t8 -> Collection8(t1, t2, t3, t4, t5, t6, t7, t8) })

    fun <T1, T2, T3, T4, T5, T6, T7, T8, T9> zip(source1: ObservableSource<out T1>,
                                                 source2: ObservableSource<out T2>,
                                                 source3: ObservableSource<out T3>,
                                                 source4: ObservableSource<out T4>,
                                                 source5: ObservableSource<out T5>,
                                                 source6: ObservableSource<out T6>,
                                                 source7: ObservableSource<out T7>,
                                                 source8: ObservableSource<out T8>,
                                                 source9: ObservableSource<out T9>): Observable<Collection9<T1, T2, T3, T4, T5, T6, T7, T8, T9>> =
            Observable.zip(source1, source2, source3, source4, source5, source6, source7, source8, source9,
                    Function9 { t1, t2, t3, t4, t5, t6, t7, t8, t9 -> Collection9(t1, t2, t3, t4, t5, t6, t7, t8, t9) })
}

fun <T1, T2> Observable<T1>.withLatestFrom(other: ObservableSource<out T2>): Observable<Pair<T1, T2>>
        = withLatestFrom(other, BiFunction { t1, t2 -> t1 to t2 })

fun <T1, T2, T3> Observable<T1>.withLatestFrom(o1: ObservableSource<T2>,
                                               o2: ObservableSource<T3>): Observable<Triple<T1, T2, T3>>
        = withLatestFrom(o1, o2, Function3 { t1, t2, t3 -> Triple(t1, t2, t3) })

fun <T1, T2, T3, T4> Observable<T1>.withLatestFrom(o1: ObservableSource<T2>,
                                                   o2: ObservableSource<T3>,
                                                   o3: ObservableSource<T4>): Observable<Collection4<T1, T2, T3, T4>>
        = withLatestFrom(o1, o2, o3, Function4 { t1, t2, t3, t4 -> Collection4(t1, t2, t3, t4) })

fun <T1, T2, T3, T4, T5> Observable<T1>.withLatestFrom(o1: ObservableSource<T2>,
                                                       o2: ObservableSource<T3>,
                                                       o3: ObservableSource<T4>,
                                                       o4: ObservableSource<T5>): Observable<Collection5<T1, T2, T3, T4, T5>>
        = withLatestFrom(o1, o2, o3, o4, Function5 { t1, t2, t3, t4, t5 -> Collection5(t1, t2, t3, t4, t5) })

fun <T1, T2> Observable<T1>.zipWith(other: ObservableSource<out T2>): Observable<Pair<T1, T2>>
        = zipWith(other, BiFunction { t1, t2 -> t1 to t2 })

infix fun <A, B> ObservableSource<A>.zip(that: ObservableSource<B>): Observable<Pair<A, B>> = ObservableCollection.zip(this, that)
