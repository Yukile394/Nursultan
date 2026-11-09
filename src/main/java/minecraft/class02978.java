package minecraft;

import com.google.common.collect.ImmutableMap;

public class class02978 extends class05765<class07079> {
   private final class02142 N;
   private final float y;
   private final float L;
   private final float u;

   public class02978(class02142 var1, float var2, float var3, float var4) {
      super(ImmutableMap.of(class05378.P, class05367.field_18457, class05378.F, class05367.field_18457));
      if (var3 > var4) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + var3 + " > " + var4);
      } else {
         this.N = var1;
         this.y = var2;
         this.L = var3;
         this.u = var4 - var3;
      }
   }

   protected void u(class04782 var1, class07079 var2, long var3) {
      class06069 class06069 = var2.method_59922();
      float f = class04995.N(class06069.z() * this.u + this.L, -90.0F, 90.0F);
      float f1 = class04995.R(var2.method_36454() + 2.0F * class06069.z() * this.y - this.y);
      class06889 class06889 = class06889.N(f, f1);
      var2.method_18868().N(class05378.P, new class05744(var2.method_33571().i(class06889)));
      var2.method_18868().N(class05378.F, this.N.N(class06069));
   }
}
