package minecraft;

import org.joml.Matrix4f;

public enum class00312 {
   field_54953(class03337.N, (var0, var1) -> var0.scale(1.0F - var1 / 4096.0F)),
   field_54954(class03337.L, (var0, var1) -> var0.translate(0.0F, 0.0F, var1 / 512.0F));

   private final class03337 field_54955;
   private final class00284 field_54956;

   private class00312(class03337 var3, class00284 var4) {
      this.field_54955 = var3;
      this.field_54956 = var4;
   }

   public void N(Matrix4f var1, float var2) {
      this.field_54956.apply(var1, var2);
   }

   public class03337 N() {
      return this.field_54955;
   }
}
