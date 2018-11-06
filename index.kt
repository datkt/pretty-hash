package datkt.prettyhash

private val table = "0123456789abcdef".toCharArray()

private fun ByteArray.toHexString(): String {
  var output = CharArray(2 * this.size)
  for (i in this.indices) {
    val j = (this[i].toInt() and 0xff).toInt()
    output[2 * i] = table[j ushr 4]
    output[1 + 2 * i] = table[j and 0x0f]
  }
  return String(output)
}

fun prettyHash(bytes: Any? = null): String {
  if (null == bytes) {
    return ""
  }

  if (bytes is String) {
    if (bytes.length > 8) {
      return "${bytes.slice(0..6)}..${bytes.substring(bytes.length - 2)}"
    } else {
      return bytes
    }
  }

  if (bytes is ByteArray) {
    return bytes.toHexString()
  }

  return ""
}
