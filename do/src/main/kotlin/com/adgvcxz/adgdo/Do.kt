package com.adgvcxz.adgdo

/**
 * zhaowei
 * Created by zhaowei on 2017/4/30.
 */

fun <T> T.with(block: (T) -> Unit) {
    block(this)
}

fun <T> T.then(block: (T) -> Unit): T {
    block(this)
    return this
}