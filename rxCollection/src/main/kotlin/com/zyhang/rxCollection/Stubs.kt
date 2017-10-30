package com.zyhang.rxCollection

import io.reactivex.disposables.Disposable
import io.reactivex.exceptions.OnErrorNotImplementedException
import io.reactivex.plugins.RxJavaPlugins

/**
 * ProjectName:RxCollection
 * Description:
 * Created by zyhang on 2017/10/30.下午2:42
 * Modify by:
 * Modify time:
 * Modify remark:
 */

internal val onErrorStub: (Throwable) -> Unit = { RxJavaPlugins.onError(OnErrorNotImplementedException(it)) }
internal val onCompleteStub: () -> Unit = {}
internal val onSubscribeStub: (Disposable) -> Unit = {}