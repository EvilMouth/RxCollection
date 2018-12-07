package com.zyhang.rxcollection

import io.reactivex.Flowable
import io.reactivex.annotations.CheckReturnValue
import io.reactivex.disposables.Disposable

/**
 * ProjectName:RxCollection
 * Description:
 * Created by zyhang on 2017/10/30.下午3:18
 * Modify by:
 * Modify time:
 * Modify remark:
 */

@CheckReturnValue
fun <T1 : Any, T2 : Any> Flowable<Pair<T1, T2>>.subscribeUnpack(
        onError: (Throwable) -> Unit = onErrorStub,
        onComplete: () -> Unit = onCompleteStub,
        onNext: (T1, T2) -> Unit = onNextStubPair
): Disposable = subscribe(onNext.asConsumer(), onError.asOnErrorConsumer(), onComplete.asOnCompleteAction())

@CheckReturnValue
fun <T1 : Any, T2 : Any, T3 : Any> Flowable<Triple<T1, T2, T3>>.subscribeUnpack(
        onError: (Throwable) -> Unit = onErrorStub,
        onComplete: () -> Unit = onCompleteStub,
        onNext: (T1, T2, T3) -> Unit = onNextStubTriple
): Disposable = subscribe(onNext.asConsumer(), onError.asOnErrorConsumer(), onComplete.asOnCompleteAction())

@CheckReturnValue
fun <T1 : Any, T2 : Any, T3 : Any, T4 : Any> Flowable<Collection4<T1, T2, T3, T4>>.subscribeUnpack(
        onError: (Throwable) -> Unit = onErrorStub,
        onComplete: () -> Unit = onCompleteStub,
        onNext: (T1, T2, T3, T4) -> Unit = onNextStubCol4
): Disposable = subscribe(onNext.asConsumer(), onError.asOnErrorConsumer(), onComplete.asOnCompleteAction())

@CheckReturnValue
fun <T1 : Any, T2 : Any, T3 : Any, T4 : Any, T5 : Any> Flowable<Collection5<T1, T2, T3, T4, T5>>.subscribeUnpack(
        onError: (Throwable) -> Unit = onErrorStub,
        onComplete: () -> Unit = onCompleteStub,
        onNext: (T1, T2, T3, T4, T5) -> Unit = onNextStubCol5
): Disposable = subscribe(onNext.asConsumer(), onError.asOnErrorConsumer(), onComplete.asOnCompleteAction())

@CheckReturnValue
fun <T1 : Any, T2 : Any, T3 : Any, T4 : Any, T5 : Any, T6 : Any> Flowable<Collection6<T1, T2, T3, T4, T5, T6>>.subscribeUnpack(
        onError: (Throwable) -> Unit = onErrorStub,
        onComplete: () -> Unit = onCompleteStub,
        onNext: (T1, T2, T3, T4, T5, T6) -> Unit = onNextStubCol6
): Disposable = subscribe(onNext.asConsumer(), onError.asOnErrorConsumer(), onComplete.asOnCompleteAction())

@CheckReturnValue
fun <T1 : Any, T2 : Any, T3 : Any, T4 : Any, T5 : Any, T6 : Any, T7 : Any> Flowable<Collection7<T1, T2, T3, T4, T5, T6, T7>>.subscribeUnpack(
        onError: (Throwable) -> Unit = onErrorStub,
        onComplete: () -> Unit = onCompleteStub,
        onNext: (T1, T2, T3, T4, T5, T6, T7) -> Unit = onNextStubCol7
): Disposable = subscribe(onNext.asConsumer(), onError.asOnErrorConsumer(), onComplete.asOnCompleteAction())

@CheckReturnValue
fun <T1 : Any, T2 : Any, T3 : Any, T4 : Any, T5 : Any, T6 : Any, T7 : Any, T8 : Any> Flowable<Collection8<T1, T2, T3, T4, T5, T6, T7, T8>>.subscribeUnpack(
        onError: (Throwable) -> Unit = onErrorStub,
        onComplete: () -> Unit = onCompleteStub,
        onNext: (T1, T2, T3, T4, T5, T6, T7, T8) -> Unit = onNextStubCol8
): Disposable = subscribe(onNext.asConsumer(), onError.asOnErrorConsumer(), onComplete.asOnCompleteAction())

@CheckReturnValue
fun <T1 : Any, T2 : Any, T3 : Any, T4 : Any, T5 : Any, T6 : Any, T7 : Any, T8 : Any, T9 : Any> Flowable<Collection9<T1, T2, T3, T4, T5, T6, T7, T8, T9>>.subscribeUnpack(
        onError: (Throwable) -> Unit = onErrorStub,
        onComplete: () -> Unit = onCompleteStub,
        onNext: (T1, T2, T3, T4, T5, T6, T7, T8, T9) -> Unit = onNextStubCol9
): Disposable = subscribe(onNext.asConsumer(), onError.asOnErrorConsumer(), onComplete.asOnCompleteAction())

@CheckReturnValue
fun <T1 : Any, T2 : Any> Flowable<Pair<T1, T2>>.blockingSubscribeUnpack(
        onError: (Throwable) -> Unit = onErrorStub,
        onComplete: () -> Unit = onCompleteStub,
        onNext: (T1, T2) -> Unit = onNextStubPair
) = blockingSubscribe(onNext.asConsumer(), onError.asOnErrorConsumer(), onComplete.asOnCompleteAction())

@CheckReturnValue
fun <T1 : Any, T2 : Any, T3 : Any> Flowable<Triple<T1, T2, T3>>.blockingSubscribeUnpack(
        onError: (Throwable) -> Unit = onErrorStub,
        onComplete: () -> Unit = onCompleteStub,
        onNext: (T1, T2, T3) -> Unit = onNextStubTriple
) = blockingSubscribe(onNext.asConsumer(), onError.asOnErrorConsumer(), onComplete.asOnCompleteAction())

@CheckReturnValue
fun <T1 : Any, T2 : Any, T3 : Any, T4 : Any> Flowable<Collection4<T1, T2, T3, T4>>.blockingSubscribeUnpack(
        onError: (Throwable) -> Unit = onErrorStub,
        onComplete: () -> Unit = onCompleteStub,
        onNext: (T1, T2, T3, T4) -> Unit = onNextStubCol4
) = blockingSubscribe(onNext.asConsumer(), onError.asOnErrorConsumer(), onComplete.asOnCompleteAction())

@CheckReturnValue
fun <T1 : Any, T2 : Any, T3 : Any, T4 : Any, T5 : Any> Flowable<Collection5<T1, T2, T3, T4, T5>>.blockingSubscribeUnpack(
        onError: (Throwable) -> Unit = onErrorStub,
        onComplete: () -> Unit = onCompleteStub,
        onNext: (T1, T2, T3, T4, T5) -> Unit = onNextStubCol5
) = blockingSubscribe(onNext.asConsumer(), onError.asOnErrorConsumer(), onComplete.asOnCompleteAction())

@CheckReturnValue
fun <T1 : Any, T2 : Any, T3 : Any, T4 : Any, T5 : Any, T6 : Any> Flowable<Collection6<T1, T2, T3, T4, T5, T6>>.blockingSubscribeUnpack(
        onError: (Throwable) -> Unit = onErrorStub,
        onComplete: () -> Unit = onCompleteStub,
        onNext: (T1, T2, T3, T4, T5, T6) -> Unit = onNextStubCol6
) = blockingSubscribe(onNext.asConsumer(), onError.asOnErrorConsumer(), onComplete.asOnCompleteAction())

@CheckReturnValue
fun <T1 : Any, T2 : Any, T3 : Any, T4 : Any, T5 : Any, T6 : Any, T7 : Any> Flowable<Collection7<T1, T2, T3, T4, T5, T6, T7>>.blockingSubscribeUnpack(
        onError: (Throwable) -> Unit = onErrorStub,
        onComplete: () -> Unit = onCompleteStub,
        onNext: (T1, T2, T3, T4, T5, T6, T7) -> Unit = onNextStubCol7
) = blockingSubscribe(onNext.asConsumer(), onError.asOnErrorConsumer(), onComplete.asOnCompleteAction())

@CheckReturnValue
fun <T1 : Any, T2 : Any, T3 : Any, T4 : Any, T5 : Any, T6 : Any, T7 : Any, T8 : Any> Flowable<Collection8<T1, T2, T3, T4, T5, T6, T7, T8>>.blockingSubscribeUnpack(
        onError: (Throwable) -> Unit = onErrorStub,
        onComplete: () -> Unit = onCompleteStub,
        onNext: (T1, T2, T3, T4, T5, T6, T7, T8) -> Unit = onNextStubCol8
) = blockingSubscribe(onNext.asConsumer(), onError.asOnErrorConsumer(), onComplete.asOnCompleteAction())

@CheckReturnValue
fun <T1 : Any, T2 : Any, T3 : Any, T4 : Any, T5 : Any, T6 : Any, T7 : Any, T8 : Any, T9 : Any> Flowable<Collection9<T1, T2, T3, T4, T5, T6, T7, T8, T9>>.blockingSubscribeUnpack(
        onError: (Throwable) -> Unit = onErrorStub,
        onComplete: () -> Unit = onCompleteStub,
        onNext: (T1, T2, T3, T4, T5, T6, T7, T8, T9) -> Unit = onNextStubCol9
) = blockingSubscribe(onNext.asConsumer(), onError.asOnErrorConsumer(), onComplete.asOnCompleteAction())
