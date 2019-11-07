import scala.sys.process._ //{ProcessLogger, stderr, stdout}

class PythonDriver {
  def callPython(): Unit = {
    val result = "python C:\\Users\\lucas\\IdeaProjects\\Archotech\\src\\test.py" ! ProcessLogger(stdout append _, stderr append _)

    println(result)
    println("stdout: " + stdout)
    println("stderr: " + stderr)
  }

  def add(x: Int, y: Int): Int = x + y
  println(add(1, 2)) // 3

}
