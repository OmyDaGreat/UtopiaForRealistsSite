package xyz.malefic.staticsite.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.Page
import xyz.malefic.staticsite.components.content.TopicPage

@Page("/beyond-gdp")
@Composable
fun BeyondGdpPage() {
    TopicPage(
        topicNumber = 3,
        title = "Beyond GDP",
        subtitle = "Measuring what actually matters",
        summary = "GDP counts market activity but misses social value, unpaid care, and quality of life. Bregman argues that public policy should target direct outcomes such as health, housing stability, and reduced poverty rather than growth for its own sake.",
        highlights =
            listOf(
                "A rising GDP can coexist with worsening inequality and insecurity.",
                "Public goals are clearer when metrics track human welfare directly.",
                "Better indicators make governments accountable for lived outcomes.",
            ),
        accentColor = "#705d00",
    )
}
