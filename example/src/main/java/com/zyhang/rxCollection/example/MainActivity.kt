package com.zyhang.rxCollection.example

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.zyhang.rxCollection.ObservableCollection
import com.zyhang.rxCollection.subscribeUnpack
import io.reactivex.Observable

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ObservableCollection.zip(
                Observable.just("1"),
                Observable.just("2F")
        )
                .subscribeUnpack { s1, s2 ->
                    System.out.println(s1)
                    System.out.println(s2)
                }
    }
}
