package com.github.nscala_time

/**
 * The marker trait that this type is for 'pimp my library' pattern.
 */
trait PimpedType[T] {
  val underlying: T
}
