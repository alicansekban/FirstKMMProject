package com.alican.firstkmmproject

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform