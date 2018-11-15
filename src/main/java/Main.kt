import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.http.ContentType
import io.ktor.response.respondText
import io.ktor.routing.get
import io.ktor.routing.routing

fun Application.main(){

    routing{
        get("/mock") {
            val data = """
                {
                    "data": "mock"
                }
            """.trimIndent()
            call.respondText(data, ContentType.Application.Json)
        }
    }
}