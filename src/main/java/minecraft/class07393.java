package minecraft;

import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class class07393 {
   private final class06605 N;
   private final class07409 y;
   private final class07388 L;
   private final class07396 u;
   private final class07380 i;
   private final class07426 R;
   private final class07381 M;
   private final class07398 B;
   private final class00440 Z;

   public class07396 L() {
      return this.u;
   }

   public class07398 M() {
      return this.B;
   }

   public class07393(
      class06605 var1, class07409 var2, class07388 var3, class07396 var4, class07380 var5, class07426 var6, class07381 var7, class07398 var8, class00440 var9
   ) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
      this.i = var5;
      this.R = var6;
      this.M = var7;
      this.B = var8;
      this.Z = var9;
   }

   public class06605 B() {
      return this.N;
   }

   public class07426 i() {
      return this.R;
   }

   public class07380 u() {
      return this.i;
   }

   public class07388 y() {
      return this.L;
   }

   public CompletableFuture<Void> N(Runnable var1) {
      return this.Z.N(var1);
   }

   public <V> CompletableFuture<V> N(Supplier<V> var1) {
      return this.Z.N(var1);
   }

   public static class07393 N(class05623 var0) {
      class07932 class07932 = new class07932();
      class00430 class00430 = new class00430(var0, class07932);
      class00462 class00462 = new class00462(var0, class07932);
      class00459 class00459 = new class00459(var0, class07932);
      class00443 class00443 = new class00443(var0, class07932);
      class00451 class00451 = new class00451(var0, class07932);
      class00470 class00470 = new class00470(var0, class07932);
      class00463 class00463 = new class00463(var0, class07932);
      class00468 class00468 = new class00468(var0);
      return new class07393(var0.Nt(), class00430, class00462, class00459, class00443, class00451, class00470, class00463, class00468);
   }

   public class07409 N() {
      return this.y;
   }

   public class07381 R() {
      return this.M;
   }
}
