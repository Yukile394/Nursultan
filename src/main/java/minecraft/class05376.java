package minecraft;

import com.google.common.collect.ImmutableMap;

public class class05376 extends class02149 {
   private static final ImmutableMap<class07078<?>, Float> N = ImmutableMap.builder()
      .put(class07078.X, 8.0F)
      .put(class07078.x, 12.0F)
      .put(class07078.Nb, 8.0F)
      .put(class07078.Nj, 12.0F)
      .put(class07078.yy, 15.0F)
      .put(class07078.yB, 12.0F)
      .put(class07078.yV, 8.0F)
      .put(class07078.yH, 10.0F)
      .put(class07078.yS, 10.0F)
      .put(class07078.yx, 8.0F)
      .put(class07078.yr, 8.0F)
      .build();

   public class05376() {
      super();
   }

   @Override
   protected boolean u(class04782 var1, class07438 var2, class07438 var3) {
      return this.y(var3) && this.N(var2, var3);
   }

   @Override
   protected class05378<class07438> y() {
      return class05378.Y;
   }

   private boolean y(class07438 var1) {
      return N.containsKey(var1.method_5864());
   }

   private boolean N(class07438 var1, class07438 var2) {
      float f = (Float)N.get(var2.method_5864());
      return var2.method_5858(var1) <= f * f;
   }
}
