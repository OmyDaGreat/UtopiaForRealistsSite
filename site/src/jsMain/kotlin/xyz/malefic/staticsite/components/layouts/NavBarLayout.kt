package xyz.malefic.staticsite.components.layouts

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.layout.Layout
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.navigation.Link
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text
import xyz.malefic.staticsite.styles.SiteStyles

private data class TopicNavItem(
    val label: String,
    val route: String,
)

private val topicNavItems =
    listOf(
        TopicNavItem("Intro", "/"),
        TopicNavItem("Human Progress (Ch. 1)", "/human-progress"),
        TopicNavItem("Free Money (Ch. 2-4)", "/free-money"),
        TopicNavItem("Beyond GDP (Ch. 5)", "/beyond-gdp"),
        TopicNavItem("Leisure Time (Ch. 6)", "/leisure-time"),
        TopicNavItem("Useless Jobs (Ch. 7-8)", "/useless-jobs"),
        TopicNavItem("Open Borders (Ch. 9)", "/open-borders"),
        TopicNavItem("Radical Ideas (Ch. 10)", "/radical-ideas"),
    )

@Layout
@Composable
fun NavBarLayout(content: @Composable () -> Unit) {
    val currentRoute = rememberPageContext().route.path.let { if (it.isBlank()) "/" else it }

    Div(
        attrs = {
            SiteStyles.run { appContainer() }
        },
    ) {
        Div(
            attrs = {
                SiteStyles.run { leftSidebar() }
            },
        ) {
            Div(
                attrs = {
                    SiteStyles.run { sidebarHeader() }
                },
            ) {
                Div(
                    attrs = {
                        SiteStyles.run { sidebarTitle() }
                    },
                ) { Text("Topics List") }
                Div(
                    attrs = {
                        SiteStyles.run { sidebarSubtitle() }
                    },
                ) { Text("Utopia for Realists") }
            }

            Div(
                attrs = {
                    SiteStyles.run { sidebarTopicsList() }
                },
            ) {
                topicNavItems.forEach { item ->
                    val isActive = currentRoute == item.route
                    Link(path = item.route) {
                        Div(
                            attrs = {
                                SiteStyles.run { topicLinkItem(isActive) }
                            },
                        ) {
                            Text(item.label)
                        }
                    }
                }
            }
        }

        Div(
            attrs = {
                SiteStyles.run { mainColumn() }
            },
        ) {
            Div(
                attrs = {
                    SiteStyles.run { growToFill() }
                },
            ) { content() }

            Div(
                attrs = {
                    SiteStyles.run { footer() }
                },
            ) {
                Text("Made by Om Gupta")
            }
        }
    }
}
