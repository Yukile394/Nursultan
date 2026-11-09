package minecraft;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;

public class class05132 extends class05407 {
   private static final class00392 N = class00392.L("mco.selectServer.create");
   private static final class00392 y = class00392.L("mco.configure.world.name");
   private static final class00392 L = class00392.L("mco.configure.world.description");
   private static final int u = 10;
   private static final int i = 210;
   private final class05685 R;
   private final class03686 M = new class03686(this);
   private class04927 B;
   private class04927 Z;
   private final Runnable z;

   public class05132(class05685 var1, class04981 var2, boolean var3) {
      super(N);
      this.R = var1;
      this.z = () -> this.N(var2, var3);
   }

   private void y(class04981 var1) {
      class04734 class04734 = new class04734(var1.y, this.B.method_1882(), this.Z.method_1882());
      class04736 class04736 = class04736.N(this, var1, class04734, () -> this.field_22787.execute(() -> {
         class05685.u();
         this.field_22787.N(this.R);
      }));
      this.field_22787.N(class04736);
   }

   private void N(class04981 var1, boolean var2) {
      if (!var1.Z() && var2) {
         AtomicBoolean atomicboolean = new AtomicBoolean();
         this.field_22787.N(new class01304(() -> {
            atomicboolean.set(true);
            this.R.i();
            this.field_22787.N(this.R);
         }, class00392.L("mco.upload.preparing"), class00392.i()));
         CompletableFuture.<class04981>supplyAsync(() -> N(var1), class07536.B()).thenAcceptAsync(var2x -> {
            if (!atomicboolean.get()) {
               this.y(var2x);
            }
         }, this.field_22787).exceptionallyAsync(var1x -> {
            this.R.i();
            Throwable throwable = var1x.getCause();
            Object object;
            if (throwable instanceof class05097) {
               object = ((class05097)throwable).N.y();
            } else {
               object = class00392.L("mco.errorMessage.initialize.failed");
            }

            this.field_22787.N(new class04702((class00392)object, this.R));
            return null;
         }, this.field_22787);
      } else {
         this.y(var1);
      }
   }

   private static class04981 N(class04981 var0) {
      class05111 class05111 = class05111.N();

      try {
         return class05111.N(Long.valueOf(var0.y));
      } catch (class05097 class05097) {
         throw new RuntimeException(class05097);
      }
   }

   @Override
   public void method_25426() {
      this.M.N(this.field_22785, this.field_22793);
      class01885 class01885x = this.M.L(class01885.u()).N(10);
      class05362 class05362 = class05362.method_46430(class05220.z, var1x -> this.z.run()).N();
      class05362.field_22763 = false;
      this.B = new class04927(this.field_22793, 210, 20, y);
      this.B.method_1863(var1x -> class05362.field_22763 = !class05018.B(var1x));
      this.Z = new class04927(this.field_22793, 210, 20, L);
      class01885x.N(class03725.N(this.field_22793, this.B, y));
      class01885x.N(class03725.N(this.field_22793, this.Z, L));
      class01885 class01885x = this.M.y(class01885.i().N(10));
      class01885x.N(class05362);
      class01885x.N(class05362.method_46430(class05220.U, var1x -> this.method_25419()).N());
      this.M.method_48206(var1x -> {
         class06478 class06478 = this.method_37063(var1x);
      });
      this.method_48640();
   }

   @Override
   protected void method_56131() {
      this.method_48265(this.B);
   }

   @Override
   public void method_48640() {
      this.M.N();
   }

   @Override
   public void method_25419() {
      this.field_22787.N(this.R);
   }
}
