package minecraft;

import org.joml.Quaternionf;
import org.joml.Vector3f;

@FunctionalInterface
public interface class02058 {
   class02058 N = var0 -> new Quaternionf().rotationX(-var0);
   class02058 y = var0 -> new Quaternionf().rotationX(var0);
   class02058 L = var0 -> new Quaternionf().rotationY(-var0);
   class02058 u = var0 -> new Quaternionf().rotationY(var0);
   class02058 i = var0 -> new Quaternionf().rotationZ(-var0);
   class02058 R = var0 -> new Quaternionf().rotationZ(var0);

   Quaternionf rotation(float var1);

   static class02058 N(Vector3f var0) {
      return var1 -> new Quaternionf().rotationAxis(var1, var0);
   }

   default Quaternionf N(float var1) {
      return this.rotation(var1 * (float) (Math.PI / 180.0));
   }
}
