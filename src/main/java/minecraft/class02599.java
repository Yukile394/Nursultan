package minecraft;

public interface class02599 {
   void y(Throwable var1, class02277 var2, class07321 var3);

   default void N(class07321 var1, class07321 var2, class02277 var3) {
      this.N(N(var1, var2), var3, var2);
   }

   static class07878 N(class07321 var0, class07321 var1) {
      class07080 class07080 = class07080.N(
         new IllegalStateException("Retrieved chunk position " + var0 + " does not match requested " + var1), "Chunk found in invalid location"
      );
      class07080.N("Misplaced Chunk").N("Stored Position", var0::toString);
      return new class07878(class07080);
   }

   void N(Throwable var1, class02277 var2, class07321 var3);
}
