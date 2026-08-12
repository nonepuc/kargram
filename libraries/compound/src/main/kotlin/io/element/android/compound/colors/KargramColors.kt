/*
 * Copyright (c) 2025 Element Creations Ltd.
 * Copyright 2022-2025 New Vector Ltd.
 *
 * SPDX-License-Identifier: AGPL-3.0-only OR LicenseRef-Element-Commercial.
 * Please see LICENSE files in the repository root for full details.
 */

package io.element.android.compound.colors

import androidx.compose.ui.graphics.Color
import io.element.android.compound.tokens.generated.SemanticColors
import io.element.android.compound.tokens.generated.compoundColorsDark
import io.element.android.compound.tokens.generated.compoundColorsLight

/**
 * Kargram's violet accent.
 *
 * Compound's own tokens under `tokens/generated/` are marked DO_NOT_MODIFY because they are
 * generated from the Compound design tokens, so the brand colour is applied here instead, as
 * a copy of the generated palettes. Everything reaches these through `ElementTheme`, which
 * means previews are recoloured too.
 *
 * Only the *accent* roles are replaced. Compound reuses the same green ramp for accent and for
 * success, and a success state that is not green reads as a bug, so `bgSuccess*`,
 * `borderSuccess*`, `iconSuccessPrimary`, `textActionSuccess` and `textSuccessPrimary` keep the
 * original palette.
 *
 * The ramp mirrors the lightness structure of the green one it replaces - the numbers are
 * positions on that ramp, not arbitrary shades - so contrast behaviour carries over: 900 is the
 * primary accent (~5:1 against the canvas in both themes), 1000/1100 are the hover and press
 * states, 200-500 are the tints, and the alpha values are overlays.
 */
private object KargramAccentLight {
    val alpha100 = Color(0x087c4dff)
    val alpha200 = Color(0x0f7c4dff)
    val alpha300 = Color(0x1c7c4dff)
    val alpha400 = Color(0x3b7c4dff)
    val alpha500 = Color(0x697c4dff)

    val purple200 = Color(0xfff5f2ff)
    val purple400 = Color(0xffdcd2fd)
    val purple500 = Color(0xffc2b1fb)
    val purple700 = Color(0xff9a6dff)
    val purple800 = Color(0xff7f4df5)
    val purple900 = Color(0xff6c3fe8)
    val purple1000 = Color(0xff5b31cc)
    val purple1100 = Color(0xff4b26ab)
}

/**
 * The dark ramp runs the other way: 200-500 are near-black tints of the hue and 900-1100 are the
 * legible ones. Compound's dark "alpha" greens are opaque too, so these are as well.
 */
private object KargramAccentDark {
    val alpha100 = Color(0xff17092b)
    val alpha200 = Color(0xff190a2e)
    val alpha300 = Color(0xff1d0c35)
    val alpha400 = Color(0xff251043)
    val alpha500 = Color(0xff33165c)

    val purple200 = Color(0xff150b2e)
    val purple400 = Color(0xff1e1042)
    val purple500 = Color(0xff2a1759)
    val purple700 = Color(0xff3d2280)
    val purple800 = Color(0xff5533ab)
    val purple900 = Color(0xff8b6df0)
    val purple1000 = Color(0xffa184f5)
    val purple1100 = Color(0xffb79bfa)
}

val kargramColorsLight: SemanticColors = compoundColorsLight.copy(
    bgAccentHovered = KargramAccentLight.purple1000,
    bgAccentPressed = KargramAccentLight.purple1100,
    bgAccentRest = KargramAccentLight.purple900,
    bgAccentSelected = KargramAccentLight.alpha300,
    bgAccentSubtle = KargramAccentLight.purple200,
    bgBadgeAccent = KargramAccentLight.purple400,
    borderAccentPrimary = KargramAccentLight.purple900,
    borderAccentSubtle = KargramAccentLight.purple700,
    iconAccentPrimary = KargramAccentLight.purple900,
    iconAccentTertiary = KargramAccentLight.purple800,
    textActionAccent = KargramAccentLight.purple900,
    textBadgeAccent = KargramAccentLight.purple1100,
    gradientActionStop1 = KargramAccentLight.purple500,
    gradientActionStop2 = KargramAccentLight.purple700,
    gradientActionStop3 = KargramAccentLight.purple900,
    gradientActionStop4 = KargramAccentLight.purple1100,
    gradientSubtleStop1 = KargramAccentLight.alpha500,
    gradientSubtleStop2 = KargramAccentLight.alpha400,
    gradientSubtleStop3 = KargramAccentLight.alpha300,
    gradientSubtleStop4 = KargramAccentLight.alpha200,
    gradientSubtleStop5 = KargramAccentLight.alpha100,
)

val kargramColorsDark: SemanticColors = compoundColorsDark.copy(
    bgAccentHovered = KargramAccentDark.purple1000,
    bgAccentPressed = KargramAccentDark.purple1100,
    bgAccentRest = KargramAccentDark.purple900,
    bgAccentSelected = KargramAccentDark.alpha300,
    bgAccentSubtle = KargramAccentDark.purple200,
    bgBadgeAccent = KargramAccentDark.purple400,
    borderAccentPrimary = KargramAccentDark.purple900,
    borderAccentSubtle = KargramAccentDark.purple700,
    iconAccentPrimary = KargramAccentDark.purple900,
    iconAccentTertiary = KargramAccentDark.purple800,
    textActionAccent = KargramAccentDark.purple900,
    textBadgeAccent = KargramAccentDark.purple1100,
    // The dark gradient runs from the darkest stop to the lightest, the opposite of light.
    gradientActionStop1 = KargramAccentDark.purple1100,
    gradientActionStop2 = KargramAccentDark.purple900,
    gradientActionStop3 = KargramAccentDark.purple700,
    gradientActionStop4 = KargramAccentDark.purple500,
    gradientSubtleStop1 = KargramAccentDark.alpha500,
    gradientSubtleStop2 = KargramAccentDark.alpha400,
    gradientSubtleStop3 = KargramAccentDark.alpha300,
    gradientSubtleStop4 = KargramAccentDark.alpha200,
    gradientSubtleStop5 = KargramAccentDark.alpha100,
)
