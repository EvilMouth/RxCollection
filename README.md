# RxCollection
[![Apache 2.0 License](https://img.shields.io/badge/license-Apache%202.0-blue.svg?style=flat)](http://www.apache.org/licenses/LICENSE-2.0.html)
[ ![Download](https://api.bintray.com/packages/zyhang/maven/rxCollection/images/download.svg) ](https://bintray.com/zyhang/maven/rxCollection/_latestVersion)

省去`rxjava`中`Observable.zip()`最后一个烦人的`zipper`参数

### Installation
```groovy
implementation 'com.zyhang:rxcollection:<latest-version>'
```

### Example
```kotlin
ObservableCollection.zip(
                Observable.just("1"),
                Observable.just(2),
                Observable.just(3L),
                Observable.just(4F)
        )
                .doOnNext {
                    it.unpack { s, i, l, fl ->
                        println(s)
                        println(i)
                        println(l)
                        println(fl)
                    }
                }
                .subscribeUnpack { s, i, l, fl ->
                    println(s)
                    println(i)
                    println(l)
                    println(fl)
                }
```

or 

```kotlin
Observable.just("1")
                .zipWith(Observable.just(2F))
                .subscribeUnpack { s, fl ->
                    println(s)
                    println(fl)
                }
```