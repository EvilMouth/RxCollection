# RxCollection
[![Apache 2.0 License](https://img.shields.io/badge/license-Apache%202.0-blue.svg?style=flat)](http://www.apache.org/licenses/LICENSE-2.0.html)
[ ![Download](https://api.bintray.com/packages/zyhang/maven/rxCollection/images/download.svg) ](https://bintray.com/zyhang/maven/rxCollection/_latestVersion)
[![API](https://img.shields.io/badge/API-15%2B-blue.svg?style=flat)](https://developer.android.com/about/versions/android-4.0.3)
[![Author](https://img.shields.io/badge/Author-zyhang-red.svg?style=flat)](https://www.zyhang.com/)

省去`rxjava`中`Observable.zip()`最后一个烦人的`zipper`参数

### Example

以前使用Observable.zip()时

```kotlin
class Bean(val t1: Int, val t2: String)

Observable.zip(
    Observable.just(1),
    Observable.just("2"),
    BiFunction<Int, String, Bean> { t1, t2 ->
        Bean(t1, t2)
    }
).subscribe { bean ->
    Int t1 = bean.t1
    String t2 = bean.t2
    // ...
}
```

现在可以直接删掉zipper和bean

```kotlin
val o1 = Observable.just(1)
val o2 = Observable.just("2")
val o3 = Observable.just(3L)
val o4 = Observable.just(4F)

ObservableCollection.zip(o1, o2, o3, o4)
        .doOnNext {
            it.unpack { i, s, l, fl ->
                println(i)
                println(s)
                println(l)
                println(fl)
            }
        }.subscribeUnpack()
```

or

```kotlin
o1.zipWith(o2).subscribeUnpack { s, fl ->
    println(s)
    println(fl)
}
```

更有黑魔法

```kotlin
(o3 zip o4).subscribeUnpack { l, fl ->
    println(l)
    println(fl)
}
```

### Installation

```groovy
implementation 'com.zyhang:rxcollection:<latest-version>'
```
