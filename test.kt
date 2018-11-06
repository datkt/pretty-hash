import datkt.prettyhash.prettyHash
import datkt.bytes.bytesFrom
import datkt.tape.test

fun main(args: Array<String>) {
  test("prettyHash(bytes: Any? = null): String") { t ->
    val bytes = bytesFrom(
      0xde, 0xad, 0xbe, 0xef,
      0xde, 0xad, 0xbe, 0xef,
      0xdd
    )

    val string = prettyHash(bytes)
    t.equal(prettyHash(), "")
    t.equal(prettyHash(null), "")
    t.equal(prettyHash(true), "")
    t.equal(prettyHash(1234), "")
    t.equal(string, "deadbeefdeadbeefdd")
    t.equal(prettyHash(string), "deadbee..dd")
    t.end()
  }

  datkt.tape.collect()
}
