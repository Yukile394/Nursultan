package minecraft;

import Nursultan.class10303;
import Nursultan.class10304;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public final class class04084 {
   public final class01818 N;
   private final class02055<class05056> y;
   private final class03866 L;
   private final class03222 u;
   private final class03019 i;
   private final class01818 R;
   private final class01818 M;
   private final Map<class05946<class05056>, class05041> B;
   private final Map<class01894, class01818> Z;

   public class03019 L() {
      return this.i;
   }

   private class04084(class05943 var1, class02055<class05056> var2, long var3) {
      super();
      this.N = var1.u().N(var3).L();
      this.y = var2;
      this.R = this.N.N(class01894.y("aquifer")).L();
      this.M = this.N.N(class01894.y("ore")).L();
      this.B = new ConcurrentHashMap<>();
      this.Z = new ConcurrentHashMap<>();
      this.i = new class03019(this, var1.M(), var1.E(), this.N);
      boolean flag = var1.m();
      this.L = var1.Z().N(new class10304(this, var3, flag));
      class10303 class10303 = new class10303(this);
      this.u = new class03222(
         this.L.i().N(class10303),
         this.L.R().N(class10303),
         this.L.M().N(class10303),
         this.L.B().N(class10303),
         this.L.Z().N(class10303),
         this.L.z().N(class10303),
         var1.U()
      );
      this.N(var1, var2, var3, null);
   }

   public class01818 i() {
      return this.M;
   }

   public class01818 u() {
      return this.R;
   }

   public class03222 y() {
      return this.u;
   }

   private void N(class05943 var1, class02055 var2, long var3, CallbackInfo var5) {
      this.u.fabric_setSeed(var3);
   }

   public static class04084 N(class05943 var0, class02055<class05056> var1, long var2) {
      return new class04084(var0, var1, var2);
   }

   public class05041 N(class05946<class05056> var1) {
      return this.B.computeIfAbsent(var1, var2 -> class03008.N(this.y, this.N, var1));
   }

   public class01818 N(class01894 var1) {
      return this.Z.computeIfAbsent(var1, var2 -> this.N.N(var1).L());
   }

   public class03866 N() {
      return this.L;
   }

   public static class04084 N(class02063 var0, class05946<class05943> var1, long var2) {
      return N(var0.L(class04227.yE).y(var1).N(), var0.L(class04227.yW), var2);
   }
}
