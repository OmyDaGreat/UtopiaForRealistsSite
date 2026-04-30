package xyz.malefic.staticsite.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.Page
import xyz.malefic.staticsite.components.content.TopicPage

@Page("/useless-jobs")
@Composable
fun UselessJobsPage() {
    TopicPage(
        topicNumber = 5,
        title = "Useless Jobs",
        subtitle = "When employment drifts from social purpose",
        summary = "Many modern roles feel disconnected from meaningful contribution. Bregman uses this tension to question why survival is tied so tightly to paid employment, especially when automation and efficiency can produce abundance with less labor.",
        highlights =
            listOf(
                "A job can be formal and full-time yet still feel socially empty.",
                "Status systems often reward bureaucracy over real utility.",
                "Decoupling income from employment opens space for meaningful work.",
            ),
        accentColor = "#ba1a1a",
    )
}
