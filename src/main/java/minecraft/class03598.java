package minecraft;

import java.util.List;

public record class03598(List<class03590> chunkBiomeData) implements class00381<class07280> {
   public static final class02362<class00667, class03598> N = class00381.N(class03598::N, class03598::new);
   private static final int L = 2097152;

   private class03598(class00667 var1) {
      this(var1.N_16(class03590::new));
   }

   public class03598(List<class03590> chunkBiomeData) {
      this.chunkBiomeData = chunkBiomeData;
   }

   public List<class03590> N() {
      return this.chunkBiomeData;
   }

   private void N(class00667 var1) {
      var1.N_12(this.chunkBiomeData, (var0, var1x) -> var1x.N(var0));
   }

   public void method_65081(class07280 var1) {
      var1.N(this);
   }

   public static class03598 N(List<class00570> var0) {
      return new class03598(var0.stream().map(class03590::new).toList());
   }

   @Override
   public class02897<class03598> method_65080() {
      return class04248.P;
   }
}
