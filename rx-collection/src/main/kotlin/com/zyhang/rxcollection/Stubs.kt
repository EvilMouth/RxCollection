package com.zyhang.rxcollection

import io.reactivex.functions.Action
import io.reactivex.functions.Consumer
import io.reactivex.internal.functions.Functions

/**
 * ProjectName:RxCollection
 * Description:
 * Created by zyhang on 2017/10/30.下午2:42
 * Modify by:
 * Modify time:
 * Modify remark:
 */

internal val onNextStubPair: (Any, Any) -> Unit = { _, _ -> }
internal val onNextStubTriple: (Any, Any, Any) -> Unit = { _, _, _ -> }
internal val onNextStubCol4: (Any, Any, Any, Any) -> Unit = { _, _, _, _ -> }
internal val onNextStubCol5: (Any, Any, Any, Any, Any) -> Unit = { _, _, _, _, _ -> }
internal val onNextStubCol6: (Any, Any, Any, Any, Any, Any) -> Unit = { _, _, _, _, _, _ -> }
internal val onNextStubCol7: (Any, Any, Any, Any, Any, Any, Any) -> Unit = { _, _, _, _, _, _, _ -> }
internal val onNextStubCol8: (Any, Any, Any, Any, Any, Any, Any, Any) -> Unit = { _, _, _, _, _, _, _, _ -> }
internal val onNextStubCol9: (Any, Any, Any, Any, Any, Any, Any, Any, Any) -> Unit = { _, _, _, _, _, _, _, _, _ -> }
internal val onErrorStub: (Throwable) -> Unit = {}
internal val onCompleteStub: () -> Unit = {}

internal fun <T1 : Any, T2 : Any> ((T1, T2) -> Unit).asConsumer(): Consumer<Pair<T1, T2>> {
    return if (this === onNextStubPair) Functions.emptyConsumer() else Consumer { it.unpack(this) }
}

internal fun <T1 : Any, T2 : Any, T3 : Any> ((T1, T2, T3) -> Unit).asConsumer(): Consumer<Triple<T1, T2, T3>> {
    return if (this === onNextStubTriple) Functions.emptyConsumer() else Consumer { it.unpack(this) }
}

internal fun <T1 : Any, T2 : Any, T3 : Any, T4 : Any> ((T1, T2, T3, T4) -> Unit).asConsumer(): Consumer<Collection4<T1, T2, T3, T4>> {
    return if (this === onNextStubCol4) Functions.emptyConsumer() else Consumer { it.unpack(this) }
}

internal fun <T1 : Any, T2 : Any, T3 : Any, T4 : Any, T5 : Any> ((T1, T2, T3, T4, T5) -> Unit).asConsumer(): Consumer<Collection5<T1, T2, T3, T4, T5>> {
    return if (this === onNextStubCol5) Functions.emptyConsumer() else Consumer { it.unpack(this) }
}

internal fun <T1 : Any, T2 : Any, T3 : Any, T4 : Any, T5 : Any, T6 : Any> ((T1, T2, T3, T4, T5, T6) -> Unit).asConsumer(): Consumer<Collection6<T1, T2, T3, T4, T5, T6>> {
    return if (this === onNextStubCol6) Functions.emptyConsumer() else Consumer { it.unpack(this) }
}

internal fun <T1 : Any, T2 : Any, T3 : Any, T4 : Any, T5 : Any, T6 : Any, T7 : Any> ((T1, T2, T3, T4, T5, T6, T7) -> Unit).asConsumer(): Consumer<Collection7<T1, T2, T3, T4, T5, T6, T7>> {
    return if (this === onNextStubCol7) Functions.emptyConsumer() else Consumer { it.unpack(this) }
}

internal fun <T1 : Any, T2 : Any, T3 : Any, T4 : Any, T5 : Any, T6 : Any, T7 : Any, T8 : Any> ((T1, T2, T3, T4, T5, T6, T7, T8) -> Unit).asConsumer(): Consumer<Collection8<T1, T2, T3, T4, T5, T6, T7, T8>> {
    return if (this === onNextStubCol8) Functions.emptyConsumer() else Consumer { it.unpack(this) }
}

internal fun <T1 : Any, T2 : Any, T3 : Any, T4 : Any, T5 : Any, T6 : Any, T7 : Any, T8 : Any, T9 : Any> ((T1, T2, T3, T4, T5, T6, T7, T8, T9) -> Unit).asConsumer(): Consumer<Collection9<T1, T2, T3, T4, T5, T6, T7, T8, T9>> {
    return if (this === onNextStubCol9) Functions.emptyConsumer() else Consumer { it.unpack(this) }
}

internal fun ((Throwable) -> Unit).asOnErrorConsumer(): Consumer<Throwable> {
    return if (this === onErrorStub) Functions.ON_ERROR_MISSING else Consumer(this)
}

internal fun (() -> Unit).asOnCompleteAction(): Action {
    return if (this === onCompleteStub) Functions.EMPTY_ACTION else Action(this)
}
