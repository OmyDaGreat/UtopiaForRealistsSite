package xyz.malefic.staticsite.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.Page
import xyz.malefic.staticsite.components.content.TopicPage

@Page("/radical-ideas")
@Composable
fun RadicalIdeasPage() {
    TopicPage(
        topicNumber = 7,
        title = "Radical Ideas",
        subtitle = "Shifting the Overton Window",
        summary = "The final topic makes a strategic claim: societies need ambitious ideas in public debate to expand what feels politically possible. Utopian proposals are not escapism; they are tools for moving realistic policy boundaries.",
        highlights =
            listOf(
                "Ideas once mocked as unrealistic can become mainstream within a generation.",
                "Political imagination shapes the menu of future policy options.",
                "Bold proposals can anchor negotiations and raise baseline expectations.",
            ),
        accentColor = "#0041c8",
    )
}
