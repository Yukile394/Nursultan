package minecraft;

import com.google.common.collect.Maps;
import java.util.Map;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class class01414 {
   private static final Map<class07211, class01404> N = Maps.newEnumMap(
      Map.of(
         class07211.field_11035,
         class01404.N(),
         class07211.field_11034,
         new class01404(null, new Quaternionf().rotateY((float) (Math.PI / 2)), null, null),
         class07211.field_11039,
         new class01404(null, new Quaternionf().rotateY((float) (-Math.PI / 2)), null, null),
         class07211.field_11043,
         new class01404(null, new Quaternionf().rotateY((float) Math.PI), null, null),
         class07211.field_11036,
         new class01404(null, new Quaternionf().rotateX((float) (-Math.PI / 2)), null, null),
         class07211.field_11033,
         new class01404(null, new Quaternionf().rotateX((float) (Math.PI / 2)), null, null)
      )
   );
   private static final Map<class07211, class01404> y = Maps.newEnumMap(class07536.N(N, class01404::y));

   public class01414() {
      super();
   }

   public static class01404 y(class01404 var0) {
      Matrix4f matrix4f = new Matrix4f().translation(-0.5F, -0.5F, -0.5F);
      matrix4f.mul(var0.L());
      matrix4f.translate(0.5F, 0.5F, 0.5F);
      return new class01404(matrix4f);
   }

   public static class01404 N(class01404 var0, class07211 var1) {
      if (class02054.N(var0.L())) {
         return var0;
      } else {
         class01404 class01404 = N.get(var1);
         class01404 = var0.N(class01404);
         Vector3f vector3f = class01404.L().transformDirection(new Vector3f(0.0F, 0.0F, 1.0F));
         class07211 class07211 = class07211.N(vector3f.x, vector3f.y, vector3f.z);
         return y.get(class07211).N(class01404);
      }
   }

   public static class01404 N(class01404 var0) {
      Matrix4f matrix4f = new Matrix4f().translation(0.5F, 0.5F, 0.5F);
      matrix4f.mul(var0.L());
      matrix4f.translate(-0.5F, -0.5F, -0.5F);
      return new class01404(matrix4f);
   }
}
