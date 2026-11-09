package minecraft;

import java.util.Optional;
import org.joml.Vector3f;

class class07152 extends class07442 {
   public class07152(class07144 var1, class07079 var2) {
      super(var2);
      this.N = var1;
   }

   @Override
   protected Optional<Float> B() {
      return Optional.of(0.0F);
   }

   @Override
   protected Optional<Float> Z() {
      class07211 class07211 = this.N.E().b();
      Vector3f vector3f = class07211.y().transform(new Vector3f(class07144.u));
      class00753 class00753 = class07211.E();
      Vector3f vector3f1 = new Vector3f(class00753.method_10263(), class00753.method_10264(), class00753.method_10260());
      vector3f1.cross(vector3f);
      double d0 = this.R - this.y.method_23317();
      double d1 = this.M - this.y.method_23320();
      double d2 = this.B - this.y.method_23321();
      Vector3f vector3f2 = new Vector3f((float)d0, (float)d1, (float)d2);
      float f = vector3f1.dot(vector3f2);
      float f1 = vector3f.dot(vector3f2);
      return !(Math.abs(f) > 1.0E-5F) && !(Math.abs(f1) > 1.0E-5F)
         ? Optional.empty()
         : Optional.of((float)(class04995.u((double)(-f), (double)f1) * 180.0F / (float)Math.PI));
   }

   @Override
   protected void y() {
   }
}
