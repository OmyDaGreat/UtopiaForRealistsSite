package xyz.malefic.staticsite.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.Page
import xyz.malefic.staticsite.components.content.TopicBigCallout
import xyz.malefic.staticsite.components.content.TopicLayoutVariant
import xyz.malefic.staticsite.components.content.TopicPage

@Page("/leisure-time")
@Composable
fun LeisureTimePage() {
    TopicPage(
        topicNumber = 4,
        title = "Leisure Time",
        subtitle = "The case for a shorter work week",
        summary = "Shorter work schedules are not utopian fantasy. Historical examples in the extension show that productivity can hold up remarkably well when hours fall, while safety and quality of life often improve.",
        highlights =
            listOf(
                "At Kellogg's Battle Creek plant, a six-hour day enabled hiring around 300 more workers and cut accident rates by 41%.",
                "A temporary UK three-day workweek under Edward Heath produced only around a 6% output drop, far less than many expected.",
                "As unit production costs fall, paying six hours similarly to eight can be good business, not just social policy.",
            ),
        accentColor = "#0041c8",
        bigCallout =
            TopicBigCallout(
                label = "Factory Safety Impact",
                value = "-41%",
                detail = "Accident rate reduction at Kellogg after moving to shorter shifts.",
            ),
        importantPoint = "Diminishing returns means extra hours can add fatigue faster than value; smarter time design beats longer schedules.",
        quote = "When productivity rises, the reward can be more life, not just more labor.",
        layoutVariant = TopicLayoutVariant.BigCalloutFirst,
    )
}
