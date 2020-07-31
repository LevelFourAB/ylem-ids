# ylem-ids

The `ylem-ids` project contains code for working with identifiers, such
as generating them via `LongIdGenerator` and encoding/decoding them using
`LongIdCodec`.

```java
// Generate identifiers
LongIdGenerator ids = new SimpleLongIdGenerator();
long id = ids.next();

// Encoding and decoding
LongIdCodec<String> codec = new Base62LongIdCodec();
String encoded = codec.encode(id);
long decoded = codec.decode(encoded);
```
