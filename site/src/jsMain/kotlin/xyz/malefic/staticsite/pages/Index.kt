package xyz.malefic.staticsite.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.Page
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text
import xyz.malefic.staticsite.components.content.ComicPageContainer

@Page
@Composable
fun HomePage() {
    ComicPageContainer {
        Div(
            attrs = {
                style {
                    property("background", "#ffffff")
                    property("border", "4px solid #1c1c18")
                    property("box-shadow", "6px 6px 0px 0px #0041c8")
                    property("padding", "2rem")
                }
            },
        ) {
            Div(
                attrs = {
                    style {
                        property("display", "inline-block")
                        property("background", "#ba1a1a")
                        property("color", "#ffffff")
                        property("border", "2px solid #1c1c18")
                        property("padding", "0.35rem 0.8rem")
                        property("font-family", "'Epilogue', sans-serif")
                        property("font-weight", "900")
                        property("text-transform", "uppercase")
                    }
                },
            ) { Text("Introduction") }

            H1(
                attrs = {
                    style {
                        property("margin", "1rem 0")
                        property("font-family", "'Epilogue', sans-serif")
                        property("font-size", "clamp(2.3rem, 8vw, 5rem)")
                        property("line-height", "0.95")
                        property("font-weight", "900")
                        property("letter-spacing", "-0.04em")
                        property("text-transform", "uppercase")
                        property("color", "#0041c8")
                        property("text-shadow", "3px 3px 0px #1c1c18")
                    }
                },
            ) { Text("Utopia for Realists") }

            P(
                attrs = {
                    style {
                        property("margin", "0")
                        property("font-size", "1.08rem")
                        property("line-height", "1.75")
                        property("font-weight", "600")
                        property("padding", "1rem")
                        property("border", "4px solid #1c1c18")
                        property("border-left", "6px solid #0041c8")
                        property("background", "#f6f3ec")
                        property("box-shadow", "4px 4px 0px 0px #1c1c18")
                    }
                },
            ) {
                Text("Rutger Bregman's book argues that rich societies can guarantee dignity for everyone. Instead of treating poverty and insecurity as personal failures, he reframes them as design flaws in the rules we choose to live under.")
            }
        }

        Div(
            attrs = {
                style {
                    property("display", "grid")
                    property("grid-template-columns", "repeat(auto-fit, minmax(280px, 1fr))")
                    property("gap", "1rem")
                }
            },
        ) {
            Div(
                attrs = {
                    style {
                        property("background", "#fff8d6")
                        property("border", "4px solid #1c1c18")
                        property("box-shadow", "6px 6px 0px 0px #705d00")
                        property("padding", "1.25rem")
                    }
                },
            ) {
                Div(
                    attrs = {
                        style {
                            property("font-family", "'Epilogue', sans-serif")
                            property("font-size", "0.9rem")
                            property("font-weight", "900")
                            property("text-transform", "uppercase")
                            property("margin-bottom", "0.75rem")
                        }
                    },
                ) { Text("Book Summary") }
                P(
                    attrs = {
                        style {
                            property("margin", "0")
                            property("line-height", "1.7")
                            property("font-weight", "600")
                        }
                    },
                ) {
                    Text("The book's three flagship ideas are Universal Basic Income, a dramatically shorter work week, and open borders. Its core claim is that yesterday's impossible dream often becomes tomorrow's common-sense reform.")
                }
            }

            Div(
                attrs = {
                    style {
                        property("background", "#e3e6ff")
                        property("border", "4px solid #1c1c18")
                        property("box-shadow", "6px 6px 0px 0px #0041c8")
                        property("padding", "1.25rem")
                    }
                },
            ) {
                Div(
                    attrs = {
                        style {
                            property("font-family", "'Epilogue', sans-serif")
                            property("font-size", "0.9rem")
                            property("font-weight", "900")
                            property("text-transform", "uppercase")
                            property("margin-bottom", "0.75rem")
                        }
                    },
                ) { Text("About the Author") }
                P(
                    attrs = {
                        style {
                            property("margin", "0")
                            property("line-height", "1.7")
                            property("font-weight", "600")
                        }
                    },
                ) {
                    Text("Rutger Bregman is a Dutch historian and public thinker known for pairing policy optimism with historical evidence. He argues that political imagination is practical power: what we dare to propose shapes what becomes possible.")
                }
            }
        }
    }
}
