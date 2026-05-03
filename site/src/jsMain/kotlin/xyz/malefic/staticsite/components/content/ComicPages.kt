package xyz.malefic.staticsite.components.content

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text
import xyz.malefic.staticsite.styles.SiteStyles

data class TopicBigCallout(
    val label: String,
    val value: String,
    val detail: String,
)

enum class TopicLayoutVariant {
    SummaryThenHighlights,
    BigCalloutFirst,
    ImportantPointFirst,
}

@Composable
fun ComicPageContainer(content: @Composable () -> Unit) {
    Div(
        attrs = {
            SiteStyles.run { comicContainer() }
        },
    ) {
        Div(
            attrs = {
                SiteStyles.run { comicGrid() }
            },
        ) {
            content()
        }
    }
}

@Composable
fun TopicPage(
    topicNumber: Int,
    title: String,
    subtitle: String,
    summary: String,
    highlights: List<String>,
    accentColor: String,
    bigCallout: TopicBigCallout? = null,
    importantPoint: String? = null,
    quote: String? = null,
    layoutVariant: TopicLayoutVariant = TopicLayoutVariant.SummaryThenHighlights,
) {
    ComicPageContainer {
        Div(
            attrs = {
                SiteStyles.run { topicIntroCard(accentColor) }
            },
        ) {
            Div(
                attrs = {
                    SiteStyles.run { topicBadge(accentColor) }
                },
            ) { Text("Topic #$topicNumber") }

            H1(
                attrs = {
                    SiteStyles.run { topicHeading() }
                },
            ) { Text(title) }

            P(
                attrs = {
                    SiteStyles.run { topicSubtitle(accentColor) }
                },
            ) { Text(subtitle) }
        }

        when (layoutVariant) {
            TopicLayoutVariant.SummaryThenHighlights -> {
                SummaryCard(summary)
                BigCalloutCard(bigCallout, accentColor)
                ImportantPointCard(importantPoint, accentColor)
                QuoteCard(quote)
                HighlightsGrid(highlights, accentColor)
            }
            TopicLayoutVariant.BigCalloutFirst -> {
                BigCalloutCard(bigCallout, accentColor)
                SummaryCard(summary)
                QuoteCard(quote)
                HighlightsGrid(highlights, accentColor)
            }
            TopicLayoutVariant.ImportantPointFirst -> {
                ImportantPointCard(importantPoint, accentColor)
                SummaryCard(summary)
                BigCalloutCard(bigCallout, accentColor)
                QuoteCard(quote)
                HighlightsGrid(highlights, accentColor)
            }
        }
    }
}

@Composable
private fun SummaryCard(summary: String) {
    Div(
        attrs = {
            SiteStyles.run { topicSummaryCard() }
        },
    ) {
        P(
            attrs = {
                SiteStyles.run { topicSummaryText() }
            },
        ) { Text(summary) }
    }
}

@Composable
private fun BigCalloutCard(
    bigCallout: TopicBigCallout?,
    accentColor: String,
) {
    if (bigCallout == null) return

    Div(
        attrs = {
            SiteStyles.run { bigCalloutCard(accentColor) }
        },
    ) {
        Div(
            attrs = {
                SiteStyles.run { bigCalloutLabel(accentColor) }
            },
        ) { Text(bigCallout.label) }
        Div(
            attrs = {
                SiteStyles.run { bigCalloutValue() }
            },
        ) { Text(bigCallout.value) }
        P(
            attrs = {
                SiteStyles.run { bigCalloutDetail() }
            },
        ) { Text(bigCallout.detail) }
    }
}

@Composable
private fun ImportantPointCard(
    importantPoint: String?,
    accentColor: String,
) {
    if (importantPoint == null) return

    Div(
        attrs = {
            SiteStyles.run { importantPointCard(accentColor) }
        },
    ) {
        Div(
            attrs = {
                SiteStyles.run { importantPointLabel() }
            },
        ) { Text("Most Important Point") }
        P(
            attrs = {
                SiteStyles.run { importantPointText() }
            },
        ) { Text(importantPoint) }
    }
}

@Composable
private fun QuoteCard(quote: String?) {
    if (quote == null) return

    Div(
        attrs = {
            SiteStyles.run { quoteCard() }
        },
    ) {
        P(
            attrs = {
                SiteStyles.run { quoteText() }
            },
        ) { Text(quote) }
    }
}

@Composable
private fun HighlightsGrid(
    highlights: List<String>,
    accentColor: String,
) {
    Div(
        attrs = {
            SiteStyles.run { keyPointsGrid() }
        },
    ) {
        highlights.forEachIndexed { index, highlight ->
            Div(
                attrs = {
                    SiteStyles.run { keyPointCard(accentColor) }
                },
            ) {
                Div(
                    attrs = {
                        SiteStyles.run { keyPointLabel(accentColor) }
                    },
                ) { Text("Key Point ${index + 1}") }
                P(
                    attrs = {
                        SiteStyles.run { keyPointText() }
                    },
                ) { Text(highlight) }
            }
        }
    }
}
