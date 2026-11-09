package minecraft;

public interface class05247 {
   default float y() {
      return 1.0F;
   }

   static class05247 N(float var0) {
      return () -> var0;
   }

   default float N(boolean var1) {
      return this.getAdvance() + (var1 ? this.N() : 0.0F);
   }

   default float N() {
      return 1.0F;
   }

   float getAdvance();
}
