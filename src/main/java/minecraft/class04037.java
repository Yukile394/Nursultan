package minecraft;

public record class04037(long seedLo, long seedHi) {
   public long L() {
      return this.seedHi;
   }

   public class04037(long seedLo, long seedHi) {
      super();
      this.seedLo = seedLo;
      this.seedHi = seedHi;
   }

   public long y() {
      return this.seedLo;
   }

   public class04037 N(class04037 var1) {
      return this.N(var1.seedLo, var1.seedHi);
   }

   public class04037 N(long var1, long var3) {
      return new class04037(this.seedLo ^ var1, this.seedHi ^ var3);
   }

   public class04037 N() {
      return new class04037(class04043.N(this.seedLo), class04043.N(this.seedHi));
   }
}
