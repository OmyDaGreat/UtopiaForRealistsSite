package xyz.malefic.staticsite.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.Page
import xyz.malefic.staticsite.components.content.TopicPage

@Page("/leisure-time")
@Composable
fun LeisureTimePage() {
    TopicPage(
        topicNumber = 4,
        title = "Leisure Time",
        subtitle = "The case for a shorter work week",
        summary = "Working hours have fallen dramatically across modern history, but that trend stalled. Bregman revives the 15-hour week as a realistic continuation of productivity gains that should translate into more freedom, not just more output.",
        highlights =
            listOf(
                "Higher productivity makes time redistribution economically feasible.",
                "Long-hour cultures create burnout, not necessarily better value.",
                "More free time improves family life, health, and civic participation.",
            ),
        accentColor = "#0041c8",
    )
}
