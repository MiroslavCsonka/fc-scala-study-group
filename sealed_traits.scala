sealed trait LivingBeing
class Human extends LivingBeing
class Dog extends LivingBeing

def say(who: LivingBeing): String = who match {
  case _: Human => "Hi"
  case _: Dog => "Bark"
}

println(say(new Dog))

