---
name: Silver Age Action
colors:
  surface: '#fcf9f2'
  surface-dim: '#dcdad3'
  surface-bright: '#fcf9f2'
  surface-container-lowest: '#ffffff'
  surface-container-low: '#f6f3ec'
  surface-container: '#f1eee7'
  surface-container-high: '#ebe8e1'
  surface-container-highest: '#e5e2db'
  on-surface: '#1c1c18'
  on-surface-variant: '#434656'
  inverse-surface: '#31312c'
  inverse-on-surface: '#f3f0e9'
  outline: '#737688'
  outline-variant: '#c3c5d9'
  surface-tint: '#004dea'
  primary: '#0041c8'
  on-primary: '#ffffff'
  primary-container: '#0055ff'
  on-primary-container: '#e3e6ff'
  inverse-primary: '#b6c4ff'
  secondary: '#705d00'
  on-secondary: '#ffffff'
  secondary-container: '#fcd400'
  on-secondary-container: '#6e5c00'
  tertiary: '#a40100'
  on-tertiary: '#ffffff'
  tertiary-container: '#d20000'
  on-tertiary-container: '#ffe1dc'
  error: '#ba1a1a'
  on-error: '#ffffff'
  error-container: '#ffdad6'
  on-error-container: '#93000a'
  primary-fixed: '#dce1ff'
  primary-fixed-dim: '#b6c4ff'
  on-primary-fixed: '#001551'
  on-primary-fixed-variant: '#0039b3'
  secondary-fixed: '#ffe16d'
  secondary-fixed-dim: '#e9c400'
  on-secondary-fixed: '#221b00'
  on-secondary-fixed-variant: '#544600'
  tertiary-fixed: '#ffdad4'
  tertiary-fixed-dim: '#ffb4a8'
  on-tertiary-fixed: '#410000'
  on-tertiary-fixed-variant: '#930100'
  background: '#fcf9f2'
  on-background: '#1c1c18'
  surface-variant: '#e5e2db'
typography:
  headline-xl:
    fontFamily: Epilogue
    fontSize: 48px
    fontWeight: '900'
    lineHeight: '1.1'
    letterSpacing: -0.04em
  headline-lg:
    fontFamily: Epilogue
    fontSize: 32px
    fontWeight: '800'
    lineHeight: '1.2'
    letterSpacing: -0.02em
  headline-md:
    fontFamily: Epilogue
    fontSize: 24px
    fontWeight: '800'
    lineHeight: '1.2'
  body-lg:
    fontFamily: Work Sans
    fontSize: 18px
    fontWeight: '400'
    lineHeight: '1.6'
  body-md:
    fontFamily: Work Sans
    fontSize: 16px
    fontWeight: '400'
    lineHeight: '1.5'
  label-bold:
    fontFamily: Work Sans
    fontSize: 14px
    fontWeight: '700'
    lineHeight: '1.2'
spacing:
  unit: 4px
  gutter: 24px
  margin: 32px
  container-max: 1280px
---

## Brand & Style

This design system captures the heroic energy and tactile nostalgia of 1960s comic books. It is built for high-impact storytelling, utilizing a **Bold / High-Contrast** aesthetic that prioritizes visual momentum and clear hierarchies. The target audience seeks a playful yet structured interface that feels handmade and energetic.

The style leans into **Illustrative Brutalism**, characterized by heavy linework, mechanical printing artifacts (halftones), and physical metaphors like speech bubbles. The emotional response is one of excitement, reliability, and "larger-than-life" importance, as if every interaction is a frame in a grander narrative.

## Colors

The palette is derived from the limited CMYK ink sets of mid-century printing.
- **Vibrant Comic Blue (Primary):** Used for primary actions, links, and hero headers.
- **Bright Canary Yellow (Secondary):** Reserved for highlight states, warnings, and attention-grabbing background bursts.
- **Action Red (Tertiary):** Used for destructive actions, critical alerts, and "Kapow!" bursts.
- **Newsprint (Neutral):** An off-white background (#F4F1EA) that simulates aged paper, reducing eye strain compared to pure white.
- **Ink Black:** A deep, slightly warm black (#1A1A1A) used for all outlines and body text to maintain high legibility.

## Typography

This design system utilizes **Epilogue** for display headings to mimic the hand-lettered, blocky weight of comic titles. All headlines should be set with tight letter spacing and, where appropriate, a slight 2-degree italic tilt to suggest motion.

**Work Sans** serves as the body typeface, offering a clean, utilitarian contrast that ensures readability across long-form content. Its neutral, slightly wider proportions evoke the mechanical typesetting used in comic indices and credits.

## Layout & Spacing

The layout follows a **Fixed Grid** model inspired by comic book panels. Content is housed in 12 columns with generous 24px gutters. 

- **Panel Logic:** Containers should behave like comic panels, using hard black borders.
- **Offset Layouts:** Occasionally break the grid with elements that "spill" over the margins (e.g., an image or a "Kapow!" burst) to create a sense of action.
- **Rhythm:** Use a 4px baseline grid to ensure all elements—especially those with heavy borders—align perfectly to a structured system.

## Elevation & Depth

Depth is not conveyed through shadows or blurs, but through **Hard-Edged Stacking** and **Bold Borders**.

- **Black Outlines:** Every interactive or distinct container must have a 3px to 4px solid black border.
- **Hard Shadows:** Use a "Block Shadow" technique—a solid, non-blurred offset of Action Red or Comic Blue (typically 4px down and 4px right) to lift elements off the page.
- **Halftone Overlays:** Use a secondary layer of "Ben-Day" dots (halftone pattern) on background surfaces to indicate a lower depth tier or to add texture to secondary panels.

## Shapes

The shape language is primarily **Sharp (0px)** to reflect the cut-paper aesthetic of comic frames. 

- **Exceptions:** Speech bubbles for quotes use a "Hand-Drawn" look with slightly irregular, high-border-weight rounded corners (approx. 16px) and a triangular "tail" pointing to the source.
- **Action Bursts:** Statistics and key highlights should be housed in multi-pointed starburst shapes ("Kapow!" style) with jagged, irregular edges.

## Components

- **Buttons:** Rectangular with 4px black borders. On hover, the button should shift 2px down and 2px right, aligning with a solid black offset shadow to create a tactile "click" feel.
- **Cards:** Styled as comic panels. Headers should have a solid background color (Blue or Red) with white uppercase text, separated from the card body by a 4px black line.
- **Speech Bubbles:** Use for testimonials or quotes. Background is pure white with a 3px black outline.
- **Kapow! Badges:** Used for "New," "Sale," or "Important Statistic." These are jagged starburst shapes in Action Red or Canary Yellow.
- **Input Fields:** Thick black bottom-border only (like a signature line) or full 3px box. Use a light cyan halftone pattern for the focus state background.
- **Progress Bars:** Segmented blocks rather than a smooth fill, evocative of "Power Meters."