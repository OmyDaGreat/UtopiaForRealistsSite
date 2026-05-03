package xyz.malefic.staticsite.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.Page
import xyz.malefic.staticsite.components.content.TopicBigCallout
import xyz.malefic.staticsite.components.content.TopicLayoutVariant
import xyz.malefic.staticsite.components.content.TopicPage

@Page("/useless-jobs")
@Composable
fun UselessJobsPage() {
    TopicPage(
        topicNumber = 5,
        title = "Useless Jobs",
        subtitle = "When employment drifts from social purpose",
        summary = "The extension contrasts value-creating work with value-shifting work. Essential roles like sanitation keep society running, while some high-paid sectors can extract or redistribute wealth without comparable public benefit.",
        highlights =
            listOf(
                "When sanitation workers strike, cities feel it immediately. When some rent-seeking sectors pause, everyday life may barely change.",
                "One estimate cited in the extension suggests each dollar earned by banks can destroy about 60 cents elsewhere in the economy.",
                "By contrast, each dollar earned by researchers can generate at least $5 in broader social value.",
                "Policy options include financial transaction taxes, progressive taxation, and education focused on socially useful capabilities.",
            ),
        accentColor = "#ba1a1a",
        bigCallout =
            TopicBigCallout(
                label = "Research Spillover",
                value = "$1 -> $5+",
                detail = "Estimated social value generated for each dollar earned by researchers.",
            ),
        importantPoint = "High salary is not proof of high social value. Compensation and contribution often diverge.",
        layoutVariant = TopicLayoutVariant.ImportantPointFirst,
    )
}
