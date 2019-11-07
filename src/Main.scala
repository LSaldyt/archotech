
object Main extends App{
  println("Running basic genetic algorithm")
  val genotype = new Genotype()
  genotype.show()
  genotype.add(new Gene(0))
  genotype.show()
}

