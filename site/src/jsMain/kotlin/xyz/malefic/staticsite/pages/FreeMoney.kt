package xyz.malefic.staticsite.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.Page
import xyz.malefic.staticsite.components.content.TopicPage

@Page("/free-money")
@Composable
fun FreeMoneyPage() {
    TopicPage(
        topicNumber = 2,
        title = "Free Money",
        subtitle = "Universal Basic Income as social venture capital",
        summary = "Universal Basic Income gives people unconditional financial security. Instead of forcing people through punitive bureaucracy, UBI creates a floor that allows workers, students, and caregivers to make better long-term choices.",
        highlights =
            listOf(
                "Cash transfers reduce stress and improve decision quality under scarcity.",
                "Removing benefit cliffs means people can work more without losing support.",
                "Security increases entrepreneurship because failure is less catastrophic.",
            ),
        accentColor = "#ba1a1a",
    )
}
