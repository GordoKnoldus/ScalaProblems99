class Problems {

  def last(list: List[Int]): Int = {
    if (list.isEmpty) {
      throw new Exception // List is empty
    } else list.last
  }

  def penultimate(list: List[Int]): Int = {
    if (list.size < 2) {
      throw new Exception // Too little elements in the list
    } else list.init.last
  }

  def nth(n: Int, list: List[Int]): Int = {
    if (n >= list.size || list.isEmpty) {
      throw new Exception // Out of bounds
    } else list.take(n).last
  }

  // nth(3, List(1, 1, 2, 3, 5, 8)) // 2
  // nth(5, List(1, 1, 2)) // Error
  // nth(0, List()) // Error

  def length(list: List[Int]): Int = {
    list.size
  }

  // length(List(1, 1, 2, 3, 5, 8)) // 6
  // length(List()) // 0

  def reverse(list: List[Int]): List[Int] = { // or just return list.reverse
    if (list.isEmpty) {
      list
    } else reverse(list.tail) :+ list.head
  }

  // reverse(List(1, 1, 2, 3, 5, 8)) // List(8, 5, 3, 2, 1, 1)
  // nreverse(List()) // List()

  def isPalindrome(list: List[Int]): Boolean = {
    list == list.reverse
  }

  // isPalindrome(List(1, 2, 3, 2, 1)) // true
  // isPalindrome(List(1, 2, 3, 2, 3)) // false
  // isPalindrome(List(1)) // true
  // isPalindrome(List()) // true

  def flatten(list: List[Any]): List[Any] = list flatMap {
    case innerList: List[Any] => flatten(innerList)
    case e: Any => List(e)
  }

  // flatten(List(List(1, 1), 2, List(3, List(5, 8)))) // List(1, 1, 2, 3, 5, 8)
  // flatten(List(List(1, 2))) // List(1, 2)
  // flatten(List(3, 4)) // List(3, 4)
  // flatten(List()) // List()
}
