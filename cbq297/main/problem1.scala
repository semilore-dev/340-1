object problem1:
  def shuffle[A](l1: List[A], l2: List[A]): List[A] =
    (l1, l2) match
      case (Nil, Nil) => Nil
      case (x1 :: t1, Nil) => x1 :: shuffle(t1, Nil)
      case (Nil, x2 :: t2) => x2 :: shuffle(Nil, t2)
      case (x1 :: t1, x2 :: t2) => x1 :: x2 :: shuffle(t1, t2)


  def split[A](lst: List[A], n: Int): List[List[A]] =
    if n <= 0 then
      List(Nil, lst)
    else
      lst match
        case Nil => List(Nil, Nil)
        case x :: xs =>
          val result: List[List[A]] = split(xs, n - 1)
          result match
            case first :: second :: Nil => List(x :: first, second)
            case _ => List(Nil, Nil)





