package ru.airdead.uiengine.utility

import ru.airdead.uiengine.element.BeautifulRectangleElement
import ru.airdead.uiengine.element.ContextMenu
import ru.airdead.uiengine.element.RectangleElement
import ru.airdead.uiengine.element.TextElement
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

/**
 * Inline function to create and configure a [RectangleElement].
 *
 * @param setup The configuration block for the [RectangleElement].
 * @return The configured [RectangleElement].
 */
@OptIn(ExperimentalContracts::class)
inline fun rectangle(setup: RectangleElement.() -> Unit): RectangleElement {
    contract {
        callsInPlace(setup, InvocationKind.EXACTLY_ONCE)
    }
    return RectangleElement().also(setup)
}

/**
 * Inline function to create and configure a [BeautifulRectangleElement].
 *
 * @param setup The configuration block for the [BeautifulRectangleElement].
 * @return The configured [BeautifulRectangleElement].
 */
@OptIn(ExperimentalContracts::class)
inline fun beautifulRectangle(setup: BeautifulRectangleElement.() -> Unit): BeautifulRectangleElement {
    contract {
        callsInPlace(setup, InvocationKind.EXACTLY_ONCE)
    }
    return BeautifulRectangleElement().also(setup)
}

/**
 * Inline function to create and configure a [ContextMenu].
 *
 * @param setup The configuration block for the [ContextMenu].
 * @return The configured [ContextMenu].
 */
@OptIn(ExperimentalContracts::class)
inline fun menu(setup: ContextMenu.() -> Unit): ContextMenu {
    contract {
        callsInPlace(setup, InvocationKind.EXACTLY_ONCE)
    }
    return ContextMenu().also(setup)
}

/**
 * Inline function to create and configure a [TextElement].
 *
 * @param setup The configuration block for the [TextElement].
 * @return The configured [TextElement].
 */
@OptIn(ExperimentalContracts::class)
inline fun text(setup: TextElement.() -> Unit): TextElement {
    contract {
        callsInPlace(setup, InvocationKind.EXACTLY_ONCE)
    }
    return TextElement().also(setup)
}
