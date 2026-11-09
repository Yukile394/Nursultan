package minecraft;

public record class00447(class00891 type, int occupantCount, int honeyLevel, boolean sedated) {
   public static final class02362<class04247, class00447> N = class02362.N(
      class02389.N(class04227.Z), class00447::N, class02389.B, class00447::y, class02389.B, class00447::L, class02389.y, class00447::u, class00447::new
   );

   public int L() {
      return this.honeyLevel;
   }

   public class00447(class00891 type, int occupantCount, int honeyLevel, boolean sedated) {
      super();
      this.type = type;
      this.occupantCount = occupantCount;
      this.honeyLevel = honeyLevel;
      this.sedated = sedated;
   }

   public boolean u() {
      return this.sedated;
   }

   public int y() {
      return this.occupantCount;
   }

   public static class00447 N(class04620 var0) {
      return new class00447(var0.w().i(), var0.R(), class04620.N(var0.w()), var0.M());
   }

   public class00891 N() {
      return this.type;
   }
}
