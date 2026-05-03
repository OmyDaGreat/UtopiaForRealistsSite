package xyz.malefic.staticsite.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.Page
import xyz.malefic.staticsite.components.content.TopicBigCallout
import xyz.malefic.staticsite.components.content.TopicLayoutVariant
import xyz.malefic.staticsite.components.content.TopicPage

@Page("/beyond-gdp")
@Composable
fun BeyondGdpPage() {
    TopicPage(
        topicNumber = 3,
        title = "Beyond GDP",
        subtitle = "Measuring what actually matters",
        summary = "GDP is useful, but it is not a moral scoreboard. The extension notes emphasize that growth can include both beneficial and harmful activity, so policy needs metrics that track outcomes people actually experience.",
        highlights =
            listOf(
                "GDP says little about whether growth came from productive investment, speculative churn, or social harm.",
                "A single aggregate number cannot capture inequality, housing stress, health security, and access to education.",
                "Policy should pair GDP with welfare-focused indicators so governments are accountable for quality of life, not only output volume.",
            ),
        accentColor = "#705d00",
        bigCallout =
            TopicBigCallout(
                label = "Core Warning",
                value = "1 Number != Reality",
                detail = "Economic progress is multi-dimensional; relying on GDP alone can hide social decline.",
            ),
        importantPoint = "The key question is not only 'Did output rise?' but 'What kind of growth happened, and for whom?'",
        layoutVariant = TopicLayoutVariant.SummaryThenHighlights,
    )
}
