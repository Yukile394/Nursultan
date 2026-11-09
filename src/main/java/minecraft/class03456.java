package minecraft;

class class03456 implements class03428 {
   private final int y;

   class03456(class03425 var1, int var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   @Override
   public class03428 N() {
      return new class03456(this.N, this.y + 1);
   }

   @Override
   public void N(class03457 var1, class03447<?> var2) {
      this.N.y.computeIfAbsent(new class03441(var1, this.y), var0 -> new class03444()).N(this.N.N, var2);
   }
}
