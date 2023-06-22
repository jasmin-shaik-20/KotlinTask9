import kotlinx.coroutines.*

fun main() {
    println("Before coroutine")

    val job = CoroutineScope(Dispatchers.Default).launch {
        delay(1000)
        println("Inside coroutine")
    }
    println("After coroutine")
    runBlocking {
        job.join() // Wait for the coroutine to complete
    }



}

