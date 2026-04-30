package xyz.malefic.staticsite.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.Page
import xyz.malefic.staticsite.components.content.TopicPage

@Page("/human-progress")
@Composable
fun HumanProgressPage() {
    TopicPage(
        topicNumber = 1,
        title = "Human Progress",
        subtitle = "Why optimism can be evidence-based",
        summary = "Bregman opens by showing that humanity has made huge gains in health, safety, and wealth over time. That progress is not an argument for complacency; it is proof that bold reform can work when societies choose to pursue it.",
        highlights =
            listOf(
                "Historical data shows fewer people live in extreme poverty than in prior centuries.",
                "Life expectancy and literacy gains demonstrate that social systems are redesignable.",
                "If earlier utopias became normal policy, today's ideas can move from fringe to mainstream.",
            ),
        accentColor = "#0041c8",
    )
}
