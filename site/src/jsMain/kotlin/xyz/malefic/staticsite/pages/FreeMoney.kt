package xyz.malefic.staticsite.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.Page
import xyz.malefic.staticsite.components.content.TopicBigCallout
import xyz.malefic.staticsite.components.content.TopicLayoutVariant
import xyz.malefic.staticsite.components.content.TopicPage

@Page("/free-money")
@Composable
fun FreeMoneyPage() {
    TopicPage(
        topicNumber = 2,
        title = "Free Money",
        subtitle = "Universal Basic Income as social venture capital",
        summary = "The extension evidence stresses a simple point: poverty is often a cash shortage, not a character flaw. Cash transfer programs and basic income experiments repeatedly show that unconditional support improves stability, health, and long-term opportunity.",
        highlights =
            listOf(
                "GiveDirectly cash grants were linked in one MIT study to a 38% lasting income increase and a 58% rise in homeownership or livestock ownership.",
                "The same evidence linked cash to 42% fewer days that children went hungry, directly improving household well-being.",
                "Across trials, unconditional cash is associated with lower crime, malnutrition, and truancy while improving school performance and gender outcomes.",
                "Major North American experiments, including Mincome and US income guarantee pilots, suggest guaranteed income is practical at scale.",
            ),
        accentColor = "#ba1a1a",
        bigCallout =
            TopicBigCallout(
                label = "MIT-Linked Result",
                value = "+38%",
                detail = "Lasting income gains observed in households receiving direct cash transfers.",
            ),
        importantPoint = "Poor people usually know exactly what they need; giving them cash respects agency and often outperforms paternalistic programs.",
        quote = "The big reason poor people are poor is because they do not have enough money.",
        layoutVariant = TopicLayoutVariant.ImportantPointFirst,
    )
}
