package minecraft;

record class04746(class06889 position, float yaw, float pitch) {
   public float L() {
      return this.pitch;
   }

   class04746(class06889 position, float yaw, float pitch) {
      this.position = position;
      this.yaw = yaw;
      this.pitch = pitch;
   }

   public float y() {
      return this.yaw;
   }

   private static float N(class06889 var0, class07209 var1) {
      class06889 class06889 = class06889.L(var1).u(var0).u();
      return (float)class04995.i(class04995.u(class06889.Z, class06889.M) * 180.0F / (float)Math.PI - 90.0);
   }

   public static class04746 N(class06889 var0, class07209 var1, float var2) {
      return new class04746(var0, N(var0, var1), var2);
   }

   public class06889 N() {
      return this.position;
   }
}
