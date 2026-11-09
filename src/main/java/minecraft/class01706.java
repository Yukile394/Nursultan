package minecraft;

import org.joml.Vector3fc;

public record class01706(class01699[] vertices, Vector3fc normal) {

   public class01706(class01699[] var1, float var2, float var3, float var4, float var5, float var6, float var7, boolean var8, class07211 var9) {
      this(var1, (var8 ? N(var9) : var9).m());
      float f = 0.0F / var6;
      float f1 = 0.0F / var7;
      var1[0] = var1[0].N(var4 / var6 - f, var3 / var7 + f1);
      var1[1] = var1[1].N(var2 / var6 + f, var3 / var7 + f1);
      var1[2] = var1[2].N(var2 / var6 + f, var5 / var7 - f1);
      var1[3] = var1[3].N(var4 / var6 - f, var5 / var7 - f1);
      if (var8) {
         int i = var1.length;

         for (int j = 0; j < i / 2; j++) {
            class01699 class01699 = var1[j];
            var1[j] = var1[i - 1 - j];
            var1[i - 1 - j] = class01699;
         }
      }
   }

   public class01706(class01699[] vertices, Vector3fc normal) {
      super();
      this.vertices = vertices;
      this.normal = normal;
   }

   public Vector3fc y() {
      return this.normal;
   }

   public class01699[] N() {
      return this.vertices;
   }

   private static class07211 N(class07211 var0) {
      return var0.z() == class07185.field_11048 ? var0.b() : var0;
   }
}
