package ru.airdead.uiengine.utility

/**
 * Class representing a 2D vector.
 *
 * @property x The x-coordinate of the vector.
 * @property y The y-coordinate of the vector.
 */
open class V2(
    open var x: Double = 0.0,
    open var y: Double = 0.0
)

/**
 * Class representing a 3D vector, extending [V2].
 *
 * @property z The z-coordinate of the vector.
 */
open class V3(
    x: Double = 0.0,
    y: Double = 0.0,
    open var z: Double = 0.0
) : V2(x, y)

/**
 * Class representing a rotation.
 *
 * @property degrees The degrees of rotation.
 */
open class Rotation(
    open var degrees: Float = 0.0f
)
