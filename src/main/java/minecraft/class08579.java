package minecraft;

public record class08579(class07209 pos, class01001 level, class00611 environmentAttributes, class03556<class00780> biome) {
   public class00611 L() {
      return this.environmentAttributes;
   }

   public class08579(class07209 pos, class01001 level, class00611 environmentAttributes, class03556<class00780> biome) {
      super();
      this.pos = pos;
      this.level = level;
      this.environmentAttributes = environmentAttributes;
      this.biome = biome;
   }

   public class03556<class00780> u() {
      return this.biome;
   }

   public class01001 y() {
      return this.level;
   }

   public static class08579 N(class01001 var0, class07209 var1) {
      class03556<class00780> class03556 = var0.i(var1);
      return new class08579(var1, var0, var0.method_75598(), class03556);
   }

   public class07209 N() {
      return this.pos;
   }
}
