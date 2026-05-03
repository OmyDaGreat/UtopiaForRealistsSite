package xyz.malefic.staticsite.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.Page
import xyz.malefic.staticsite.components.content.TopicBigCallout
import xyz.malefic.staticsite.components.content.TopicLayoutVariant
import xyz.malefic.staticsite.components.content.TopicPage

@Page("/open-borders")
@Composable
fun OpenBordersPage() {
    TopicPage(
        topicNumber = 6,
        title = "Open Borders",
        subtitle = "Freedom of movement as shared prosperity",
        summary = "Open borders reframes migration as an anti-poverty and growth policy at global scale. The extension data highlights that labor mobility could unlock wealth that is currently trapped behind geography and legal barriers.",
        highlights =
            listOf(
                "Across multiple studies, projected gains in gross world product from freer migration range roughly from 67% to 147%.",
                "At the upper end, that implies a world economy approaching twice today's size simply by allowing talent to move.",
                "This is not only an efficiency issue; border restrictions also shape who gets access to safety, wages, and dignity.",
            ),
        accentColor = "#705d00",
        bigCallout =
            TopicBigCallout(
                label = "Estimated Global Output Gain",
                value = "+67% to +147%",
                detail = "Range reported by studies modeling larger labor mobility across borders.",
            ),
        importantPoint = "One of the largest anti-poverty tools may be letting people move to where their work is most productive.",
        quote = "Open borders could make the whole world vastly richer.",
        layoutVariant = TopicLayoutVariant.BigCalloutFirst,
    )
}
