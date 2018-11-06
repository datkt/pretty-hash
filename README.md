pretty-hash
===========

Port of @pfrazee's pretty-hash function to print ByteArray data as a hex string

## Installation

```sh
$ npm install @datkt/pretty-hash
```

## Usage

```kotlin
import datkt.prettyhash.prettyHash

fun main(args: Array<String>) {
  val bytes = bytesFrom(
    0xde, 0xad, 0xbe, 0xef,
    0xde, 0xad, 0xbe, 0xef
  )

  val string = prettyHash(bytes)
  println(string) // deadbeefdeadbeef
}
```

## konanc Config

Specify the following configuration in your modules `.kc` file for the
`konanc-config`.

```ini
repo[] = "@datkt/pretty-hash"
require[] = "pretty-hash"
library[] = "pretty-hash"
```

## API

### `prettyHash(bytes: Any? = null): String"`

Converts given input into a pretty hash string made of hex characters.

## Prerequisites

* [Kotlin/Native](https://github.com/JetBrains/kotlin-native) and the
  `konanc` command line program.

## See Also

* https://github.com/pfrazee/pretty-hash
* https://github.com/datkt/konanc-config

## License

MIT
