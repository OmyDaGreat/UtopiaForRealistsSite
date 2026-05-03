package xyz.malefic.staticsite.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.Page
import xyz.malefic.staticsite.components.content.TopicBigCallout
import xyz.malefic.staticsite.components.content.TopicLayoutVariant
import xyz.malefic.staticsite.components.content.TopicPage

@Page("/human-progress")
@Composable
fun HumanProgressPage() {
    TopicPage(
        topicNumber = 1,
        title = "Human Progress",
        subtitle = "Why optimism can be evidence-based",
        summary = "For most of human history, almost everyone lived in deprivation, but the last two centuries changed the trend at unprecedented scale. Bregman's argument is not that progress is finished, but that historical improvement proves systems can be redesigned and dramatically improved.",
        highlights =
            listOf(
                "In 1820, about 84% of people lived in extreme poverty; by 1981 that fell to 44%, and today it is under 10%.",
                "The speed of this shift matters: billions moved from chronic insecurity toward longer, healthier, and safer lives.",
                "Past progress is evidence for future reform. If previous breakthroughs became normal policy, current 'impossible' ideas can too.",
            ),
        accentColor = "#0041c8",
        bigCallout =
            TopicBigCallout(
                label = "Extreme Poverty Drop",
                value = "84% -> <10%",
                detail = "The share of people in extreme poverty collapsed from 1820 to today, showing that large-scale social change is possible.",
            ),
        importantPoint = "Progress is real, but it is not automatic. It happened because people changed institutions, rights, and public policy.",
        quote = "Our lives got better because we redesigned society, not because history runs on autopilot.",
        layoutVariant = TopicLayoutVariant.BigCalloutFirst,
    )
}
