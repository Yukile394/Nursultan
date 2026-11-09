package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.function.UnaryOperator;

public final class class01263 {
   public static final class02362<class00667, class01263> N = class02362.N(
      class01261.B, var0 -> var0.L, class01261.B, var0 -> var0.u, class01261.B, var0 -> var0.i, class01261.B, var0 -> var0.R, class01263::new
   );
   public static final MapCodec<class01263> y = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class01261.u.forGetter(var0x -> var0x.L),
            class01261.i.forGetter(var0x -> var0x.u),
            class01261.R.forGetter(var0x -> var0x.i),
            class01261.M.forGetter(var0x -> var0x.R)
         )
         .apply(var0, class01263::new)
   );
   private class01261 L;
   private class01261 u;
   private class01261 i;
   private class01261 R;

   public boolean L(class01015 var1) {
      return this.N(var1).y();
   }

   public class01263() {
      this(class01261.L, class01261.L, class01261.L, class01261.L);
   }

   private class01263(class01261 var1, class01261 var2, class01261 var3, class01261 var4) {
      super();
      this.L = var1;
      this.u = var2;
      this.i = var3;
      this.R = var4;
   }

   public void y(class01015 var1, boolean var2) {
      this.N(var1, var1x -> var1x.y(var2));
   }

   public boolean y(class01015 var1) {
      return this.N(var1).N();
   }

   public class01261 N(class01015 var1) {
      return switch (var1) {
         case field_25763 -> this.L;
         case field_25764 -> this.u;
         case field_25765 -> this.i;
         case field_25766 -> this.R;
      };
   }

   public void N(class01015 var1, boolean var2) {
      this.N(var1, var1x -> var1x.N(var2));
   }

   public class01263 N() {
      return new class01263(this.L, this.u, this.i, this.R);
   }

   public void N(class01263 var1) {
      this.L = var1.L;
      this.u = var1.u;
      this.i = var1.i;
      this.R = var1.R;
   }

   private void N(class01015 var1, UnaryOperator<class01261> var2) {
      switch (var1) {
         case field_25763:
            this.L = var2.apply(this.L);
            break;
         case field_25764:
            this.u = var2.apply(this.u);
            break;
         case field_25765:
            this.i = var2.apply(this.i);
            break;
         case field_25766:
            this.R = var2.apply(this.R);
      }
   }
}
