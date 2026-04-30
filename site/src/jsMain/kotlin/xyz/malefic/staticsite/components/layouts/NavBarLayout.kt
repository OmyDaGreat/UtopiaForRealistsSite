package xyz.malefic.staticsite.components.layouts

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.layout.Layout
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.navigation.Link
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text

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
            style {
                property("min-height", "100vh")
                property("background", "#fcf9f2")
                property("font-family", "'Work Sans', sans-serif")
            }
        },
    ) {
        Div(
            attrs = {
                style {
                    property("position", "fixed")
                    property("left", "0")
                    property("top", "0")
                    property("bottom", "0")
                    property("width", "16rem")
                    property("background", "#fcd400")
                    property("border-right", "4px solid #1c1c18")
                    property("box-shadow", "8px 0px 0px 0px #1c1c18")
                    property("z-index", "20")
                    property("display", "flex")
                    property("flex-direction", "column")
                }
            },
        ) {
            Div(
                attrs = {
                    style {
                        property("padding", "1.5rem")
                        property("border-bottom", "2px solid rgba(28, 28, 24, 0.2)")
                        property("font-family", "'Epilogue', sans-serif")
                        property("text-transform", "uppercase")
                    }
                },
            ) {
                Div(
                    attrs = {
                        style {
                            property("font-size", "1.25rem")
                            property("font-weight", "900")
                            property("letter-spacing", "-0.02em")
                        }
                    },
                ) { Text("Topics List") }
                Div(
                    attrs = {
                        style {
                            property("margin-top", "0.25rem")
                            property("font-size", "0.75rem")
                            property("font-weight", "700")
                            property("opacity", "0.8")
                        }
                    },
                ) { Text("Utopia for Realists") }
            }

            Div(
                attrs = {
                    style {
                        property("padding", "0.75rem")
                        property("overflow-y", "auto")
                        property("display", "flex")
                        property("flex-direction", "column")
                        property("gap", "0.4rem")
                    }
                },
            ) {
                topicNavItems.forEach { item ->
                    val isActive = currentRoute == item.route
                    Link(path = item.route) {
                        Div(
                            attrs = {
                                style {
                                    property("padding", "0.75rem")
                                    property("display", "block")
                                    property("text-decoration", "none")
                                    property("font-family", "'Epilogue', sans-serif")
                                    property("text-transform", "uppercase")
                                    property("font-size", "0.8rem")
                                    property("font-weight", "800")
                                    property("color", "#1c1c18")
                                    if (isActive) {
                                        property("background", "#ffffff")
                                        property("border", "2px solid #1c1c18")
                                        property("box-shadow", "4px 4px 0px 0px #1c1c18")
                                    } else {
                                        property("background", "transparent")
                                        property("border", "2px solid transparent")
                                    }
                                }
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
                style {
                    property("margin-left", "16rem")
                    property("min-height", "100vh")
                    property("display", "flex")
                    property("flex-direction", "column")
                }
            },
        ) {
            Div(
                attrs = {
                    style {
                        property("flex", "1")
                    }
                },
            ) { content() }

            Div(
                attrs = {
                    style {
                        property("background", "#1c1c18")
                        property("border-top", "4px solid #ba1a1a")
                        property("padding", "1.5rem")
                        property("text-align", "center")
                        property("font-family", "'Epilogue', sans-serif")
                        property("font-weight", "900")
                        property("font-style", "italic")
                        property("letter-spacing", "0.12em")
                        property("text-transform", "uppercase")
                        property("color", "#ffffff")
                    }
                },
            ) {
                Text("Made by Om Gupta")
            }
        }
    }
}
