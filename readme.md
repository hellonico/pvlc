
```java
import net.hellonico.pvlc.*;

pvlcLibrary vlc;

void setup() {
  vlc = new pvlcLibrary(this);
  vlc.play(dataPath("sample.mp3"));
}
```