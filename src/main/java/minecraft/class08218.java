package minecraft;

record class08218(class05946<class04513> normal, class05946<class04513> ominous) {

   private class08218(class05946<class04513> normal, class05946<class04513> ominous) {
      this.normal = normal;
      this.ominous = ominous;
   }

   public class05946<class04513> y() {
      return this.ominous;
   }

   public class05946<class04513> N() {
      return this.normal;
   }

   public static class08218 N(String var0) {
      return new class08218(class08221.N(var0 + "/normal"), class08221.N(var0 + "/ominous"));
   }
}
