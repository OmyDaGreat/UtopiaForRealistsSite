package xyz.malefic.staticsite.styles

import org.jetbrains.compose.web.attributes.AttrsScope
import org.jetbrains.compose.web.css.StyleScope

object SiteStyles {
    private const val black = "#1c1c18"
    private const val white = "#ffffff"
    private const val paper = "#f6f3ec"
    private const val pageBackground = "#fcf9f2"
    private const val sidebarBackground = "#fcd400"
    private const val footerAccent = "#ba1a1a"
    private const val headingFont = "'Epilogue', sans-serif"
    private const val bodyFont = "'Work Sans', sans-serif"

    private fun StyleScope.panel(
        background: String,
        shadowColor: String,
        shadowOffset: String = "6px",
        padding: String,
        borderWidth: String = "4px",
    ) {
        property("background", background)
        property("border", "$borderWidth solid $black")
        property("box-shadow", "$shadowOffset $shadowOffset 0px 0px $shadowColor")
        property("padding", padding)
    }

    fun AttrsScope<*>.appContainer() {
        style {
            property("min-height", "100vh")
            property("background", pageBackground)
            property("font-family", bodyFont)
        }
    }

    fun AttrsScope<*>.leftSidebar() {
        style {
            property("position", "fixed")
            property("left", "0")
            property("top", "0")
            property("bottom", "0")
            property("width", "16rem")
            property("background", sidebarBackground)
            property("border-right", "4px solid $black")
            property("box-shadow", "8px 0px 0px 0px $black")
            property("z-index", "20")
            property("display", "flex")
            property("flex-direction", "column")
        }
    }

    fun AttrsScope<*>.sidebarHeader() {
        style {
            property("padding", "1.5rem")
            property("border-bottom", "2px solid rgba(28, 28, 24, 0.2)")
            property("font-family", headingFont)
            property("text-transform", "uppercase")
        }
    }

    fun AttrsScope<*>.sidebarTitle() {
        style {
            property("font-size", "1.25rem")
            property("font-weight", "900")
            property("letter-spacing", "-0.02em")
        }
    }

    fun AttrsScope<*>.sidebarSubtitle() {
        style {
            property("margin-top", "0.25rem")
            property("font-size", "0.75rem")
            property("font-weight", "700")
            property("opacity", "0.8")
        }
    }

    fun AttrsScope<*>.sidebarTopicsList() {
        style {
            property("padding", "0.75rem")
            property("overflow-y", "auto")
            property("display", "flex")
            property("flex-direction", "column")
            property("gap", "0.4rem")
        }
    }

    fun AttrsScope<*>.topicLinkItem(isActive: Boolean) {
        style {
            property("padding", "0.75rem")
            property("display", "block")
            property("text-decoration", "none")
            property("font-family", headingFont)
            property("text-transform", "uppercase")
            property("font-size", "0.8rem")
            property("font-weight", "800")
            property("color", black)
            if (isActive) {
                property("background", white)
                property("border", "2px solid $black")
                property("box-shadow", "4px 4px 0px 0px $black")
            } else {
                property("background", "transparent")
                property("border", "2px solid transparent")
            }
        }
    }

    fun AttrsScope<*>.mainColumn() {
        style {
            property("margin-left", "16rem")
            property("min-height", "100vh")
            property("display", "flex")
            property("flex-direction", "column")
        }
    }

    fun AttrsScope<*>.growToFill() {
        style {
            property("flex", "1")
        }
    }

    fun AttrsScope<*>.footer() {
        style {
            property("background", black)
            property("border-top", "4px solid $footerAccent")
            property("padding", "1.5rem")
            property("text-align", "center")
            property("font-family", headingFont)
            property("font-weight", "900")
            property("font-style", "italic")
            property("letter-spacing", "0.12em")
            property("text-transform", "uppercase")
            property("color", white)
        }
    }

    fun AttrsScope<*>.comicContainer() {
        style {
            property("padding", "2rem")
            property("background-image", "radial-gradient(circle at center, rgba(28, 28, 24, 0.12) 1px, transparent 1.5px)")
            property("background-size", "10px 10px")
        }
    }

    fun AttrsScope<*>.comicGrid() {
        style {
            property("max-width", "1100px")
            property("margin", "0 auto")
            property("display", "grid")
            property("gap", "1.5rem")
        }
    }

    fun AttrsScope<*>.topicIntroCard(accentColor: String) {
        style {
            panel(background = white, shadowColor = accentColor, padding = "2rem")
        }
    }

    fun AttrsScope<*>.topicBadge(accentColor: String) {
        style {
            property("display", "inline-block")
            property("background", accentColor)
            property("color", white)
            property("border", "2px solid $black")
            property("padding", "0.35rem 0.8rem")
            property("font-family", headingFont)
            property("font-weight", "900")
            property("text-transform", "uppercase")
        }
    }

    fun AttrsScope<*>.topicHeading() {
        style {
            property("margin", "1rem 0 0.5rem")
            property("font-family", headingFont)
            property("font-size", "clamp(2rem, 6vw, 4.25rem)")
            property("font-weight", "900")
            property("line-height", "0.95")
            property("letter-spacing", "-0.03em")
            property("text-transform", "uppercase")
        }
    }

    fun AttrsScope<*>.topicSubtitle(accentColor: String) {
        style {
            property("margin", "0")
            property("font-size", "1.05rem")
            property("font-weight", "800")
            property("color", accentColor)
            property("text-transform", "uppercase")
            property("letter-spacing", "0.02em")
        }
    }

    fun AttrsScope<*>.topicSummaryCard() {
        style {
            panel(background = paper, shadowColor = black, padding = "1.5rem")
        }
    }

    fun AttrsScope<*>.topicSummaryText() {
        style {
            property("margin", "0")
            property("font-size", "1.08rem")
            property("line-height", "1.7")
            property("font-weight", "600")
        }
    }

    fun AttrsScope<*>.keyPointsGrid() {
        style {
            property("display", "grid")
            property("grid-template-columns", "repeat(auto-fit, minmax(220px, 1fr))")
            property("gap", "1rem")
        }
    }

    fun AttrsScope<*>.keyPointCard(accentColor: String) {
        style {
            panel(background = white, shadowColor = accentColor, shadowOffset = "4px", padding = "1rem")
        }
    }

    fun AttrsScope<*>.keyPointLabel(accentColor: String) {
        style {
            property("font-family", headingFont)
            property("font-size", "0.85rem")
            property("font-weight", "900")
            property("text-transform", "uppercase")
            property("margin-bottom", "0.5rem")
            property("color", accentColor)
        }
    }

    fun AttrsScope<*>.keyPointText() {
        style {
            property("margin", "0")
            property("font-size", "1rem")
            property("line-height", "1.6")
            property("font-weight", "500")
        }
    }

    fun AttrsScope<*>.bigCalloutCard(accentColor: String) {
        style {
            panel(background = white, shadowColor = accentColor, padding = "1.5rem")
            property("text-align", "center")
        }
    }

    fun AttrsScope<*>.bigCalloutLabel(accentColor: String) {
        style {
            property("font-family", headingFont)
            property("font-weight", "900")
            property("font-size", "0.8rem")
            property("text-transform", "uppercase")
            property("letter-spacing", "0.08em")
            property("color", accentColor)
        }
    }

    fun AttrsScope<*>.bigCalloutValue() {
        style {
            property("margin", "0.35rem 0")
            property("font-family", headingFont)
            property("font-size", "clamp(2.6rem, 14vw, 6rem)")
            property("line-height", "0.9")
            property("font-weight", "900")
            property("letter-spacing", "-0.04em")
            property("text-transform", "uppercase")
            property("color", black)
        }
    }

    fun AttrsScope<*>.bigCalloutDetail() {
        style {
            property("margin", "0")
            property("font-size", "1rem")
            property("line-height", "1.7")
            property("font-weight", "600")
        }
    }

    fun AttrsScope<*>.importantPointCard(accentColor: String) {
        style {
            panel(background = "#fff5f5", shadowColor = accentColor, padding = "1.25rem")
            property("border-left", "10px solid $accentColor")
        }
    }

    fun AttrsScope<*>.importantPointLabel() {
        style {
            property("font-family", headingFont)
            property("font-size", "0.82rem")
            property("font-weight", "900")
            property("text-transform", "uppercase")
            property("letter-spacing", "0.08em")
            property("margin-bottom", "0.5rem")
        }
    }

    fun AttrsScope<*>.importantPointText() {
        style {
            property("margin", "0")
            property("font-size", "1.15rem")
            property("line-height", "1.6")
            property("font-weight", "700")
        }
    }

    fun AttrsScope<*>.quoteCard() {
        style {
            panel(background = "#e9f0ff", shadowColor = "#0041c8", shadowOffset = "4px", padding = "1rem 1.25rem")
        }
    }

    fun AttrsScope<*>.quoteText() {
        style {
            property("margin", "0")
            property("font-family", headingFont)
            property("font-size", "1.15rem")
            property("line-height", "1.5")
            property("font-weight", "800")
            property("letter-spacing", "-0.01em")
        }
    }

    fun AttrsScope<*>.homeHeroCard() {
        style {
            panel(background = white, shadowColor = "#0041c8", padding = "2rem")
        }
    }

    fun AttrsScope<*>.homeIntroTag() {
        style {
            property("display", "inline-block")
            property("background", footerAccent)
            property("color", white)
            property("border", "2px solid $black")
            property("padding", "0.35rem 0.8rem")
            property("font-family", headingFont)
            property("font-weight", "900")
            property("text-transform", "uppercase")
        }
    }

    fun AttrsScope<*>.homeHeroTitle() {
        style {
            property("margin", "1rem 0")
            property("font-family", headingFont)
            property("font-size", "clamp(2.3rem, 8vw, 5rem)")
            property("line-height", "0.95")
            property("font-weight", "900")
            property("letter-spacing", "-0.04em")
            property("text-transform", "uppercase")
            property("color", "#0041c8")
            property("text-shadow", "3px 3px 0px $black")
        }
    }

    fun AttrsScope<*>.homeHeroDescription() {
        style {
            property("margin", "0")
            property("font-size", "1.08rem")
            property("line-height", "1.75")
            property("font-weight", "600")
            property("padding", "1rem")
            property("border", "4px solid $black")
            property("border-left", "6px solid #0041c8")
            property("background", paper)
            property("box-shadow", "4px 4px 0px 0px $black")
        }
    }

    fun AttrsScope<*>.homeInfoGrid() {
        style {
            property("display", "grid")
            property("grid-template-columns", "repeat(auto-fit, minmax(280px, 1fr))")
            property("gap", "1rem")
        }
    }

    fun AttrsScope<*>.homeInfoCard(
        background: String,
        shadowColor: String,
    ) {
        style {
            panel(background = background, shadowColor = shadowColor, padding = "1.25rem")
        }
    }

    fun AttrsScope<*>.homeInfoTitle() {
        style {
            property("font-family", headingFont)
            property("font-size", "0.9rem")
            property("font-weight", "900")
            property("text-transform", "uppercase")
            property("margin-bottom", "0.75rem")
        }
    }

    fun AttrsScope<*>.homeInfoBody() {
        style {
            property("margin", "0")
            property("line-height", "1.7")
            property("font-weight", "600")
        }
    }
}
