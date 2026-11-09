package minecraft;

import java.util.Comparator;

public record class04319(long totalCount, long totalSize) {
   static final Comparator<class04319> L = Comparator.comparing(class04319::L).thenComparing(class04319::y).reversed();

   public long L() {
      return this.totalSize;
   }

   public class04319(long totalCount, long totalSize) {
      this.totalCount = totalCount;
      this.totalSize = totalSize;
   }

   public long y() {
      return this.totalCount;
   }

   class04319 N(class04319 var1) {
      return new class04319(this.totalCount + var1.totalCount, this.totalSize + var1.totalSize);
   }

   public float N() {
      return (float)this.totalSize / (float)this.totalCount;
   }
}
