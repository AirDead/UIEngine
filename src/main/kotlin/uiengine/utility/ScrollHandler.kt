package ru.airdead.uiengine.utility

import ru.airdead.uiengine.element.AbstractElement

/**
 * Data class representing the context of a scroll event.
 *
 * @property hoveredElement The element that is hovered during the scroll event.
 * @property amount The amount of scroll.
 */
data class ScrollContext(val hoveredElement: AbstractElement?, val amount: Double)

/**
 * Type alias for a handler function that processes scroll context.
 */
typealias ScrollHandler = ScrollContext.() -> Unit
