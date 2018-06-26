package model

import de.htwg.se.tankcommander.model.gridComponent.gridBaseImpl.Cell
import org.scalatest.{FlatSpec, Matchers}


class CellTest extends FlatSpec with Matchers {
  "Cell" should "initialise correctly" in {
    val cell = new Cell(1, 0)
    assert(cell.y === 0)
    assert(cell.x === 1)
    assert(cell.cobstacle === None)
    assert(cell.containsThisTank === None)

  }
}
