package ru.skillbranch.devintensive.extensions

fun String.truncate(endSymbol: Int = 16) : String =  this.substring(0, endSymbol).trim()+"..."
