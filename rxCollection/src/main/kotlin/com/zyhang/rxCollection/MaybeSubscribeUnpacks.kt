package com.zyhang.rxCollection

import io.reactivex.Maybe
import io.reactivex.disposables.Disposable

/**
 * ProjectName:RxCollection
 * Description:
 * Created by zyhang on 2017/10/30.下午3:23
 * Modify by:
 * Modify time:
 * Modify remark:
 */

fun <T1 : Any, T2 : Any> Maybe<BiCollection<T1, T2>>.subscribeUnpack(onError: (Throwable) -> Unit = onErrorStub,
                                                                     onComplete: () -> Unit = onCompleteStub,
                                                                     onNext: (T1, T2) -> Unit)
        : Disposable = subscribe({ it.unpack(onNext) }, onError, onComplete)

fun <T1 : Any, T2 : Any, T3 : Any> Maybe<Collection3<T1, T2, T3>>.subscribeUnpack(onError: (Throwable) -> Unit = onErrorStub,
                                                                                  onComplete: () -> Unit = onCompleteStub,
                                                                                  onNext: (T1, T2, T3) -> Unit)
        : Disposable = subscribe({ it.unpack(onNext) }, onError, onComplete)

fun <T1 : Any, T2 : Any, T3 : Any, T4 : Any> Maybe<Collection4<T1, T2, T3, T4>>.subscribeUnpack(onError: (Throwable) -> Unit = onErrorStub,
                                                                                                onComplete: () -> Unit = onCompleteStub,
                                                                                                onNext: (T1, T2, T3, T4) -> Unit)
        : Disposable = subscribe({ it.unpack(onNext) }, onError, onComplete)

fun <T1 : Any, T2 : Any, T3 : Any, T4 : Any, T5 : Any> Maybe<Collection5<T1, T2, T3, T4, T5>>.subscribeUnpack(onError: (Throwable) -> Unit = onErrorStub,
                                                                                                              onComplete: () -> Unit = onCompleteStub,
                                                                                                              onNext: (T1, T2, T3, T4, T5) -> Unit)
        : Disposable = subscribe({ it.unpack(onNext) }, onError, onComplete)

fun <T1 : Any, T2 : Any, T3 : Any, T4 : Any, T5 : Any, T6 : Any> Maybe<Collection6<T1, T2, T3, T4, T5, T6>>.subscribeUnpack(onError: (Throwable) -> Unit = onErrorStub,
                                                                                                                            onComplete: () -> Unit = onCompleteStub,
                                                                                                                            onNext: (T1, T2, T3, T4, T5, T6) -> Unit)
        : Disposable = subscribe({ it.unpack(onNext) }, onError, onComplete)

fun <T1 : Any, T2 : Any, T3 : Any, T4 : Any, T5 : Any, T6 : Any, T7 : Any> Maybe<Collection7<T1, T2, T3, T4, T5, T6, T7>>.subscribeUnpack(onError: (Throwable) -> Unit = onErrorStub,
                                                                                                                                          onComplete: () -> Unit = onCompleteStub,
                                                                                                                                          onNext: (T1, T2, T3, T4, T5, T6, T7) -> Unit)
        : Disposable = subscribe({ it.unpack(onNext) }, onError, onComplete)

fun <T1 : Any, T2 : Any, T3 : Any, T4 : Any, T5 : Any, T6 : Any, T7 : Any, T8 : Any> Maybe<Collection8<T1, T2, T3, T4, T5, T6, T7, T8>>.subscribeUnpack(onError: (Throwable) -> Unit = onErrorStub,
                                                                                                                                                        onComplete: () -> Unit = onCompleteStub,
                                                                                                                                                        onNext: (T1, T2, T3, T4, T5, T6, T7, T8) -> Unit)
        : Disposable = subscribe({ it.unpack(onNext) }, onError, onComplete)

fun <T1 : Any, T2 : Any, T3 : Any, T4 : Any, T5 : Any, T6 : Any, T7 : Any, T8 : Any, T9 : Any> Maybe<Collection9<T1, T2, T3, T4, T5, T6, T7, T8, T9>>.subscribeUnpack(onError: (Throwable) -> Unit = onErrorStub,
                                                                                                                                                                      onComplete: () -> Unit = onCompleteStub,
                                                                                                                                                                      onNext: (T1, T2, T3, T4, T5, T6, T7, T8, T9) -> Unit)
        : Disposable = subscribe({ it.unpack(onNext) }, onError, onComplete)