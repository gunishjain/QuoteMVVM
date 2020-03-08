package com.example.quotemvvm.data

class FakeDatabase private constructor() {
    companion object {
        @Volatile private var instance: FakeDatabase?=null
        fun getInstance() =
            instance ?: synchronized(lock = this) {
                 instance ?: FakeDatabase().also { instance=it }
        }

    }
}