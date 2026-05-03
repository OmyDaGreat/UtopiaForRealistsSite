package xyz.malefic.staticsite.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.Page
import xyz.malefic.staticsite.components.content.TopicBigCallout
import xyz.malefic.staticsite.components.content.TopicLayoutVariant
import xyz.malefic.staticsite.components.content.TopicPage

@Page("/radical-ideas")
@Composable
fun RadicalIdeasPage() {
    TopicPage(
        topicNumber = 7,
        title = "Radical Ideas",
        subtitle = "Shifting the Overton Window",
        summary = "Big social shifts often start with ideas that sound unrealistic. The extension points to opinion research showing that people do not update beliefs in neat, gradual steps; change often requires direct friction with uncomfortable facts and visible dissent.",
        highlights =
            listOf(
                "James Kuklinski's findings challenge the fantasy that reasoned debate alone changes minds; disagreement pressure can matter more.",
                "Asch-style conformity studies show group pressure is powerful, but also that one dissenting voice can break consensus effects.",
                "Ambitious proposals expand the policy imagination and can become tomorrow's practical baseline.",
            ),
        accentColor = "#0041c8",
        bigCallout =
            TopicBigCallout(
                label = "Opinion Shift Trigger",
                value = "1 Dissenting Voice",
                detail = "A single person refusing false consensus can materially increase truth-telling by others.",
            ),
        importantPoint = "Treat radical ideas as strategic tools: they move what counts as realistic before laws ever change.",
        quote = "Keep building castles in the sky - political reality often catches up later.",
        layoutVariant = TopicLayoutVariant.ImportantPointFirst,
    )
}
