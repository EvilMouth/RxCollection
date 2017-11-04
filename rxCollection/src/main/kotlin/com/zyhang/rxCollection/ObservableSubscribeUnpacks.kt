package com.zyhang.rxCollection

import io.reactivex.Observable
import io.reactivex.disposables.Disposable

/**
 * ProjectName:RxCollection
 * Description:
 * Created by zyhang on 2017/10/30.下午2:24
 * Modify by:
 * Modify time:
 * Modify remark:
 */

fun <T1 : Any, T2 : Any> Observable<Pair<T1, T2>>.subscribeUnpack(onError: (Throwable) -> Unit = onErrorStub,
                                                                  onComplete: () -> Unit = onCompleteStub,
                                                                  onSubscribe: (Disposable) -> Unit = onSubscribeStub,
                                                                  onNext: (T1, T2) -> Unit)
        : Disposable = subscribe({ it.unpack(onNext) }, onError, onComplete, onSubscribe)

fun <T1 : Any, T2 : Any, T3 : Any> Observable<Triple<T1, T2, T3>>.subscribeUnpack(onError: (Throwable) -> Unit = onErrorStub,
                                                                                  onComplete: () -> Unit = onCompleteStub,
                                                                                  onSubscribe: (Disposable) -> Unit = onSubscribeStub,
                                                                                  onNext: (T1, T2, T3) -> Unit)
        : Disposable = subscribe({ it.unpack(onNext) }, onError, onComplete, onSubscribe)

fun <T1 : Any, T2 : Any, T3 : Any, T4 : Any> Observable<Collection4<T1, T2, T3, T4>>.subscribeUnpack(onError: (Throwable) -> Unit = onErrorStub,
                                                                                                     onComplete: () -> Unit = onCompleteStub,
                                                                                                     onSubscribe: (Disposable) -> Unit = onSubscribeStub,
                                                                                                     onNext: (T1, T2, T3, T4) -> Unit)
        : Disposable = subscribe({ it.unpack(onNext) }, onError, onComplete, onSubscribe)

fun <T1 : Any, T2 : Any, T3 : Any, T4 : Any, T5 : Any> Observable<Collection5<T1, T2, T3, T4, T5>>.subscribeUnpack(onError: (Throwable) -> Unit = onErrorStub,
                                                                                                                   onComplete: () -> Unit = onCompleteStub,
                                                                                                                   onSubscribe: (Disposable) -> Unit = onSubscribeStub,
                                                                                                                   onNext: (T1, T2, T3, T4, T5) -> Unit)
        : Disposable = subscribe({ it.unpack(onNext) }, onError, onComplete, onSubscribe)

fun <T1 : Any, T2 : Any, T3 : Any, T4 : Any, T5 : Any, T6 : Any> Observable<Collection6<T1, T2, T3, T4, T5, T6>>.subscribeUnpack(onError: (Throwable) -> Unit = onErrorStub,
                                                                                                                                 onComplete: () -> Unit = onCompleteStub,
                                                                                                                                 onSubscribe: (Disposable) -> Unit = onSubscribeStub,
                                                                                                                                 onNext: (T1, T2, T3, T4, T5, T6) -> Unit)
        : Disposable = subscribe({ it.unpack(onNext) }, onError, onComplete, onSubscribe)

fun <T1 : Any, T2 : Any, T3 : Any, T4 : Any, T5 : Any, T6 : Any, T7 : Any> Observable<Collection7<T1, T2, T3, T4, T5, T6, T7>>.subscribeUnpack(onError: (Throwable) -> Unit = onErrorStub,
                                                                                                                                               onComplete: () -> Unit = onCompleteStub,
                                                                                                                                               onSubscribe: (Disposable) -> Unit = onSubscribeStub,
                                                                                                                                               onNext: (T1, T2, T3, T4, T5, T6, T7) -> Unit)
        : Disposable = subscribe({ it.unpack(onNext) }, onError, onComplete, onSubscribe)

fun <T1 : Any, T2 : Any, T3 : Any, T4 : Any, T5 : Any, T6 : Any, T7 : Any, T8 : Any> Observable<Collection8<T1, T2, T3, T4, T5, T6, T7, T8>>.subscribeUnpack(onError: (Throwable) -> Unit = onErrorStub,
                                                                                                                                                             onComplete: () -> Unit = onCompleteStub,
                                                                                                                                                             onSubscribe: (Disposable) -> Unit = onSubscribeStub,
                                                                                                                                                             onNext: (T1, T2, T3, T4, T5, T6, T7, T8) -> Unit)
        : Disposable = subscribe({ it.unpack(onNext) }, onError, onComplete, onSubscribe)

fun <T1 : Any, T2 : Any, T3 : Any, T4 : Any, T5 : Any, T6 : Any, T7 : Any, T8 : Any, T9 : Any> Observable<Collection9<T1, T2, T3, T4, T5, T6, T7, T8, T9>>.subscribeUnpack(onError: (Throwable) -> Unit = onErrorStub,
                                                                                                                                                                           onComplete: () -> Unit = onCompleteStub,
                                                                                                                                                                           onSubscribe: (Disposable) -> Unit = onSubscribeStub,
                                                                                                                                                                           onNext: (T1, T2, T3, T4, T5, T6, T7, T8, T9) -> Unit)
        : Disposable = subscribe({ it.unpack(onNext) }, onError, onComplete, onSubscribe)