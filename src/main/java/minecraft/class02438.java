package minecraft;

import org.joml.Vector3f;

public class class02438 {
   public class02438() {
      super();
   }

   public static void N(class01421 var0, class01391 var1, class00494 var2, double var3, double var5, double var7, int var9, float var10) {
      class01423 class01423 = var0.L();
      var2.method_1104(
         (var10x, var12, var14, var16, var18, var20) -> {
            Vector3f vector3f = new Vector3f((float)(var16 - var10x), (float)(var18 - var12), (float)(var20 - var14)).normalize();
            var1.N(class01423, (float)(var10x + var3), (float)(var12 + var5), (float)(var14 + var7))
               .method_39415(var9)
               .y(class01423, vector3f)
               .method_75298(var10);
            var1.N(class01423, (float)(var16 + var3), (float)(var18 + var5), (float)(var20 + var7))
               .method_39415(var9)
               .y(class01423, vector3f)
               .method_75298(var10);
         }
      );
   }
}
