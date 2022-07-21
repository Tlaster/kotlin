// TARGET_BACKEND: JVM_IR
// FULL_JDK
// WITH_STDLIB

// MODULE: lib
// FILE: MyEnum.kt
enum class MyEnum {
    Nope, OK
}

// MODULE: caller(lib)
// !LANGUAGE: +EnumEntries
// FILE: Box.kt
@OptIn(ExperimentalStdlibApi::class)
fun box(): String {
    val e = MyEnum.entries
    return e[0].toString()
}
