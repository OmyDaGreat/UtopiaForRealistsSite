package xyz.malefic.staticsite.components.content

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun ComicPageContainer(content: @Composable () -> Unit) {
    Div(
        attrs = {
            style {
                property("padding", "2rem")
                property("background-image", "radial-gradient(circle at center, rgba(28, 28, 24, 0.12) 1px, transparent 1.5px)")
                property("background-size", "10px 10px")
            }
        },
    ) {
        Div(
            attrs = {
                style {
                    property("max-width", "1100px")
                    property("margin", "0 auto")
                    property("display", "grid")
                    property("gap", "1.5rem")
                }
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
) {
    ComicPageContainer {
        Div(
            attrs = {
                style {
                    property("background", "#ffffff")
                    property("border", "4px solid #1c1c18")
                    property("box-shadow", "6px 6px 0px 0px $accentColor")
                    property("padding", "2rem")
                }
            },
        ) {
            Div(
                attrs = {
                    style {
                        property("display", "inline-block")
                        property("background", accentColor)
                        property("color", "#ffffff")
                        property("border", "2px solid #1c1c18")
                        property("padding", "0.35rem 0.8rem")
                        property("font-family", "'Epilogue', sans-serif")
                        property("font-weight", "900")
                        property("text-transform", "uppercase")
                    }
                },
            ) { Text("Topic #$topicNumber") }

            H1(
                attrs = {
                    style {
                        property("margin", "1rem 0 0.5rem")
                        property("font-family", "'Epilogue', sans-serif")
                        property("font-size", "clamp(2rem, 6vw, 4.25rem)")
                        property("font-weight", "900")
                        property("line-height", "0.95")
                        property("letter-spacing", "-0.03em")
                        property("text-transform", "uppercase")
                    }
                },
            ) { Text(title) }

            P(
                attrs = {
                    style {
                        property("margin", "0")
                        property("font-size", "1.05rem")
                        property("font-weight", "800")
                        property("color", accentColor)
                        property("text-transform", "uppercase")
                        property("letter-spacing", "0.02em")
                    }
                },
            ) { Text(subtitle) }
        }

        Div(
            attrs = {
                style {
                    property("background", "#f6f3ec")
                    property("border", "4px solid #1c1c18")
                    property("box-shadow", "6px 6px 0px 0px #1c1c18")
                    property("padding", "1.5rem")
                }
            },
        ) {
            P(
                attrs = {
                    style {
                        property("margin", "0")
                        property("font-size", "1.08rem")
                        property("line-height", "1.7")
                        property("font-weight", "600")
                    }
                },
            ) { Text(summary) }
        }

        Div(
            attrs = {
                style {
                    property("display", "grid")
                    property("grid-template-columns", "repeat(auto-fit, minmax(220px, 1fr))")
                    property("gap", "1rem")
                }
            },
        ) {
            highlights.forEachIndexed { index, highlight ->
                Div(
                    attrs = {
                        style {
                            property("background", "#ffffff")
                            property("border", "4px solid #1c1c18")
                            property("box-shadow", "4px 4px 0px 0px $accentColor")
                            property("padding", "1rem")
                        }
                    },
                ) {
                    Div(
                        attrs = {
                            style {
                                property("font-family", "'Epilogue', sans-serif")
                                property("font-size", "0.85rem")
                                property("font-weight", "900")
                                property("text-transform", "uppercase")
                                property("margin-bottom", "0.5rem")
                                property("color", accentColor)
                            }
                        },
                    ) { Text("Key Point ${index + 1}") }
                    P(
                        attrs = {
                            style {
                                property("margin", "0")
                                property("font-size", "1rem")
                                property("line-height", "1.6")
                                property("font-weight", "500")
                            }
                        },
                    ) { Text(highlight) }
                }
            }
        }
    }
}
