package minecraft;

import java.util.EnumMap;
import java.util.Map;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

public class class08510 implements class04673 {
   private static final Map<class01372, class08510> M = class07536.N_74(class01372.class, class08510::new);
   public static final class08510 N = N(class01372.field_23292);
   final class01372 y;
   final class01404 L;
   final Map<class07211, Matrix4fc> u = new EnumMap<>(class07211.class);
   final Map<class07211, Matrix4fc> i = new EnumMap<>(class07211.class);
   private final class08539 B = new class08539(this);

   private class08510(class01372 var1) {
      super();
      this.y = var1;
      if (var1 != class01372.field_23292) {
         this.L = new class01404(new Matrix4f(var1.y()));
      } else {
         this.L = class01404.N();
      }

      for (class07211 class07211 : class07211.values()) {
         Matrix4fc matrix4fc = class01414.N(this.L, class07211).L();
         this.u.put(class07211, matrix4fc);
         this.i.put(class07211, matrix4fc.invertAffine(new Matrix4f()));
      }
   }

   @Override
   public String toString() {
      return "simple[" + this.y.method_15434() + "]";
   }

   public class04673 N() {
      return this.B;
   }

   public static class08510 N(class01372 var0) {
      return M.get(var0);
   }

   @Override
   public class01404 method_3509() {
      return this.L;
   }
}
