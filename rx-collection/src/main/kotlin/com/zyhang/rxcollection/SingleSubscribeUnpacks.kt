package com.zyhang.rxcollection

import io.reactivex.Single
import io.reactivex.annotations.CheckReturnValue
import io.reactivex.disposables.Disposable

/**
 * ProjectName:RxCollection
 * Description:
 * Created by zyhang on 2017/10/30.下午2:49
 * Modify by:
 * Modify time:
 * Modify remark:
 */

@CheckReturnValue
fun <T1 : Any, T2 : Any> Single<Pair<T1, T2>>.subscribeUnpack(onError: (Throwable) -> Unit = onErrorStub,
                                                              onSuccess: (T1, T2) -> Unit)
        : Disposable = subscribe({ it.unpack(onSuccess) }, onError)

@CheckReturnValue
fun <T1 : Any, T2 : Any, T3 : Any> Single<Triple<T1, T2, T3>>.subscribeUnpack(onError: (Throwable) -> Unit = onErrorStub,
                                                                              onSuccess: (T1, T2, T3) -> Unit)
        : Disposable = subscribe({ it.unpack(onSuccess) }, onError)

@CheckReturnValue
fun <T1 : Any, T2 : Any, T3 : Any, T4 : Any> Single<Collection4<T1, T2, T3, T4>>.subscribeUnpack(onError: (Throwable) -> Unit = onErrorStub,
                                                                                                 onSuccess: (T1, T2, T3, T4) -> Unit)
        : Disposable = subscribe({ it.unpack(onSuccess) }, onError)

@CheckReturnValue
fun <T1 : Any, T2 : Any, T3 : Any, T4 : Any, T5 : Any> Single<Collection5<T1, T2, T3, T4, T5>>.subscribeUnpack(onError: (Throwable) -> Unit = onErrorStub,
                                                                                                               onSuccess: (T1, T2, T3, T4, T5) -> Unit)
        : Disposable = subscribe({ it.unpack(onSuccess) }, onError)

@CheckReturnValue
fun <T1 : Any, T2 : Any, T3 : Any, T4 : Any, T5 : Any, T6 : Any> Single<Collection6<T1, T2, T3, T4, T5, T6>>.subscribeUnpack(onError: (Throwable) -> Unit = onErrorStub,
                                                                                                                             onSuccess: (T1, T2, T3, T4, T5, T6) -> Unit)
        : Disposable = subscribe({ it.unpack(onSuccess) }, onError)

@CheckReturnValue
fun <T1 : Any, T2 : Any, T3 : Any, T4 : Any, T5 : Any, T6 : Any, T7 : Any> Single<Collection7<T1, T2, T3, T4, T5, T6, T7>>.subscribeUnpack(onError: (Throwable) -> Unit = onErrorStub,
                                                                                                                                           onSuccess: (T1, T2, T3, T4, T5, T6, T7) -> Unit)
        : Disposable = subscribe({ it.unpack(onSuccess) }, onError)

@CheckReturnValue
fun <T1 : Any, T2 : Any, T3 : Any, T4 : Any, T5 : Any, T6 : Any, T7 : Any, T8 : Any> Single<Collection8<T1, T2, T3, T4, T5, T6, T7, T8>>.subscribeUnpack(onError: (Throwable) -> Unit = onErrorStub,
                                                                                                                                                         onSuccess: (T1, T2, T3, T4, T5, T6, T7, T8) -> Unit)
        : Disposable = subscribe({ it.unpack(onSuccess) }, onError)

@CheckReturnValue
fun <T1 : Any, T2 : Any, T3 : Any, T4 : Any, T5 : Any, T6 : Any, T7 : Any, T8 : Any, T9 : Any> Single<Collection9<T1, T2, T3, T4, T5, T6, T7, T8, T9>>.subscribeUnpack(onError: (Throwable) -> Unit = onErrorStub,
                                                                                                                                                                       onSuccess: (T1, T2, T3, T4, T5, T6, T7, T8, T9) -> Unit)
        : Disposable = subscribe({ it.unpack(onSuccess) }, onError)