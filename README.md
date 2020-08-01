# ylem-ids

The `ylem-ids` project contains code for working with identifiers, such
as generating them via `LongIdGenerator` and encoding/decoding them using
`LongIdCodec`.

## Example

```java
// Generate identifiers
LongIdGenerator ids = new SimpleLongIdGenerator();
long id = ids.next();

// Encoding and decoding
LongIdCodec<String> codec = new Base62LongIdCodec();
String encoded = codec.encode(id);
long decoded = codec.decode(encoded);
```

## License

This project is licensed under the [Apache License 2.0](https://www.apache.org/licenses/LICENSE-2.0),
see the file `LICENSE` and `NOTICE` for details.
