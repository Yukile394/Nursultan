package minecraft;

import java.util.List;
import java.util.Optional;
import java.util.stream.LongStream;

public record class03936<T>(List<T> paletteEntries, Optional<LongStream> storage, int bitsPerEntry) {
   public static final int N = -1;

   public int L() {
      return this.bitsPerEntry;
   }

   public class03936(List<T> var1, Optional<LongStream> var2) {
      this(var1, var2, -1);
   }

   public class03936(List<T> paletteEntries, Optional<LongStream> storage, int bitsPerEntry) {
      this.paletteEntries = paletteEntries;
      this.storage = storage;
      this.bitsPerEntry = bitsPerEntry;
   }

   public Optional<LongStream> y() {
      return this.storage;
   }

   public List<T> N() {
      return this.paletteEntries;
   }
}
