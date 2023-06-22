import kotlinx.coroutines.*

suspend fun main()
{
    GlobalScope.launch {
        delay(500L)
        println("Task from GlobalScope")
    }

    runBlocking {
        launch {
            delay(1000L)
            println("Task from runBlocking")
        }
    }


    coroutineScope {
        launch {
            delay(1500L)
            println("Task from coroutineScope")
        }
    }
}