package xyz.malefic.staticsite.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.Page
import xyz.malefic.staticsite.components.content.TopicPage

@Page("/open-borders")
@Composable
fun OpenBordersPage() {
    TopicPage(
        topicNumber = 6,
        title = "Open Borders",
        subtitle = "Freedom of movement as shared prosperity",
        summary = "Bregman argues that migration barriers lock people out of opportunity by birthplace. Looser borders would improve global productivity and human welfare by allowing workers to move where their labor and ambitions can flourish.",
        highlights =
            listOf(
                "Where someone is born determines opportunity more than effort alone.",
                "Labor mobility can generate major gains for both migrants and host economies.",
                "Border policy is an ethical question as much as an economic one.",
            ),
        accentColor = "#705d00",
    )
}
