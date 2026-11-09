package minecraft;

import org.joml.Vector3f;
import org.joml.Vector3fc;

public class class04339 {
   public static final class04342 N = (var0, var1, var2, var3, var4, var5) -> {
      Vector3fc vector3fc = var2[var3].L();
      Vector3fc vector3fc1 = var2[var4].y();
      return vector3fc.lerp(vector3fc1, var1, var0).mul(var5);
   };
   public static final class04342 y = (var0, var1, var2, var3, var4, var5) -> {
      Vector3fc vector3fc = var2[Math.max(0, var3 - 1)].L();
      Vector3fc vector3fc1 = var2[var3].L();
      Vector3fc vector3fc2 = var2[var4].L();
      Vector3fc vector3fc3 = var2[Math.min(var2.length - 1, var4 + 1)].L();
      var0.set(
         class04995.N(var1, vector3fc.x(), vector3fc1.x(), vector3fc2.x(), vector3fc3.x()) * var5,
         class04995.N(var1, vector3fc.y(), vector3fc1.y(), vector3fc2.y(), vector3fc3.y()) * var5,
         class04995.N(var1, vector3fc.z(), vector3fc1.z(), vector3fc2.z(), vector3fc3.z()) * var5
      );
      return var0;
   };

   public class04339() {
      super();
   }
}
