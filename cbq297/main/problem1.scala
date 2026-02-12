object problem1:
  def shuffle[A](l1: List[A], l2: List[A]): List[A] =
    (l1, l2) match
      case (Nil, Nil) => Nil
      case (x1 :: t1, Nil) => x1 :: shuffle(t1, Nil)
      case (Nil, x2 :: t2) => x2 :: shuffle(Nil, t2)
      case (x1 :: t1, x2 :: t2) => x1 :: x2 :: shuffle(t1, t2)







