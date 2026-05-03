package xyz.malefic.staticsite.pages

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.core.Page
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text
import xyz.malefic.staticsite.components.content.ComicPageContainer
import xyz.malefic.staticsite.styles.SiteStyles

@Page
@Composable
fun HomePage() {
    ComicPageContainer {
        Div(
            attrs = {
                SiteStyles.run { homeHeroCard() }
            },
        ) {
            Div(
                attrs = {
                    SiteStyles.run { homeIntroTag() }
                },
            ) { Text("Introduction") }

            H1(
                attrs = {
                    SiteStyles.run { homeHeroTitle() }
                },
            ) { Text("Utopia for Realists") }

            P(
                attrs = {
                    SiteStyles.run { homeHeroDescription() }
                },
            ) {
                Text(
                    "Rutger Bregman's book argues that rich societies can guarantee dignity for everyone. Instead of treating poverty and insecurity as personal failures, he reframes them as design flaws in the rules we choose to live under.",
                )
            }
        }

        Div(
            attrs = {
                SiteStyles.run { homeInfoGrid() }
            },
        ) {
            Div(
                attrs = {
                    SiteStyles.run { homeInfoCard(background = "#fff8d6", shadowColor = "#705d00") }
                },
            ) {
                Div(
                    attrs = {
                        SiteStyles.run { homeInfoTitle() }
                    },
                ) { Text("Book Summary") }
                P(
                    attrs = {
                        SiteStyles.run { homeInfoBody() }
                    },
                ) {
                    Text(
                        "The book's three flagship ideas are Universal Basic Income, a dramatically shorter work week, and open borders. Its core claim is that yesterday's impossible dream often becomes tomorrow's common-sense reform.",
                    )
                }
            }

            Div(
                attrs = {
                    SiteStyles.run { homeInfoCard(background = "#e3e6ff", shadowColor = "#0041c8") }
                },
            ) {
                Div(
                    attrs = {
                        SiteStyles.run { homeInfoTitle() }
                    },
                ) { Text("About the Author") }
                P(
                    attrs = {
                        SiteStyles.run { homeInfoBody() }
                    },
                ) {
                    Text(
                        "Rutger Bregman is a Dutch historian and public thinker known for pairing policy optimism with historical evidence. He argues that political imagination is practical power: what we dare to propose shapes what becomes possible.",
                    )
                }
            }
        }
    }
}
