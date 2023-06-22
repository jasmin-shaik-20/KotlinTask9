import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

suspend fun doSomething() {
    delay(1000)
    println("Suspended function executed")
}

fun main() {
    println("Before calling suspended function")
    // Call the suspended function from a coroutine
    runBlocking {
        doSomething()
    }
    println("After calling suspended function")
}
