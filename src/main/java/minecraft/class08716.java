package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Set;

public record class08716(class06889 position, class06889 deltaMovement, float yRot, float xRot) {
   public static final class02362<class00667, class08716> N = class02362.N(
      class06889.y, class08716::N, class06889.y, class08716::y, class02389.E, class08716::L, class02389.E, class08716::u, class08716::new
   );

   public float L() {
      return this.yRot;
   }

   public class08716(class06889 position, class06889 deltaMovement, float yRot, float xRot) {
      this.position = position;
      this.deltaMovement = deltaMovement;
      this.yRot = yRot;
      this.xRot = xRot;
   }

   public float u() {
      return this.xRot;
   }

   public class06889 y() {
      return this.deltaMovement;
   }

   public class08716 N(float var1, float var2) {
      return new class08716(this.N(), this.y(), var1, var2);
   }

   public static class08716 N(class07049 var0) {
      return var0.method_66245()
         ? new class08716(var0.method_66233().method_66265(), var0.method_60478(), var0.method_66233().method_66268(), var0.method_66233().method_66269())
         : new class08716(var0.method_73189(), var0.method_60478(), var0.method_36454(), var0.method_36455());
   }

   private static float N(float var0, float var1, float var2) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_4) ? var0 : class04995.N(var0, var1, var2);
   }

   public static class08716 N(class08716 var0, class08716 var1, Set<class06681> var2) {
      double d0 = var2.contains(class06681.field_12400) ? var0.position.M : 0.0;
      double d1 = var2.contains(class06681.field_12398) ? var0.position.B : 0.0;
      double d2 = var2.contains(class06681.field_12403) ? var0.position.Z : 0.0;
      float f = var2.contains(class06681.field_12401) ? var0.yRot : 0.0F;
      float f1 = var2.contains(class06681.field_12397) ? var0.xRot : 0.0F;
      class06889 class06889xx = new class06889(d0 + var1.position.M, d1 + var1.position.B, d2 + var1.position.Z);
      float f2 = f + var1.yRot;
      float f3 = N(f1 + var1.xRot, -90.0F, 90.0F);
      class06889 class06889x = var0.deltaMovement;
      if (var2.contains(class06681.field_54093)) {
         float f4 = var0.yRot - f2;
         float f5 = var0.xRot - f3;
         class06889x = class06889x.N((float)Math.toRadians(f5));
         class06889x = class06889x.y((float)Math.toRadians(f4));
      }

      class06889 class06889xx = new class06889(
         N(class06889x.M, var1.deltaMovement.M, var2, class06681.field_54090),
         N(class06889x.B, var1.deltaMovement.B, var2, class06681.field_54091),
         N(class06889x.Z, var1.deltaMovement.Z, var2, class06681.field_54092)
      );
      return new class08716(class06889xx, class06889xx, f2, f3);
   }

   public static class08716 N(class01032 var0) {
      return new class08716(var0.L(), var0.u(), var0.i(), var0.R());
   }

   public class06889 N() {
      return this.position;
   }

   private static double N(double var0, double var2, Set<class06681> var4, class06681 var5) {
      return var4.contains(var5) ? var0 + var2 : var2;
   }
}
