import org.scalatest.funsuite.AnyFunSuite

class ProblemsTest extends AnyFunSuite with TestingValues {

  // last
  test("last(List(1, 1, 2, 3, 5, 8)) should return 8") {
    assert(problems.last(List(1, 1, 2, 3, 5, 8)) == 8)
  }
  test("last(List(3)) should return 3") {
    assert(problems.last(List(3))  == 3)
  }
  test("last(List()) should throw an error") {
    assertThrows[Exception] {
      problems.last(List())
    }
  }

  // penultimate
  test("penultimate(List(1, 1, 2, 3, 5, 8)) should return 5") {
    assert(problems.penultimate(List(1, 1, 2, 3, 5, 8)) == 5)
  }
  test("penultimate(List(2)) should throw an error") {
    assertThrows[Exception] {
      problems.penultimate(List(2))
    }
  }
  test("penultimate(List()) should throw an error") {
    assertThrows[Exception] {
      problems.penultimate(List())
    }
  }

  // nth

}
