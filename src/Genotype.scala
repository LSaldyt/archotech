import scala.collection.immutable.Vector;

class Genotype(var genes : Vector[Gene] = Vector()){
  def add(gene : Gene): Unit = {
    genes = genes.+:(gene)
  }

  def show(): Unit = {
    println(genes)
  }
}
