import sys.process._

class Caller {
  def callPython(): Unit = {
    val result = "python C:\\Users\\lucas\\IdeaProjects\\Archotech\\src\\test.py" ! ProcessLogger(stdout append _, stderr append _)

    println(result)
    println("stdout: " + stdout)
    println("stderr: " + stderr)
  }
}

object Main extends App{
  println("Hello, World!")
  val caller = new Caller()
  caller.callPython()
}

