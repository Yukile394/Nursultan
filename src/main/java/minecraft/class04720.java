package minecraft;

import com.mojang.logging.LogUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class04720 extends class05407 {
   private static final Logger L = LogUtils.getLogger();
   public static final class00392 N = class00392.L("mco.upload.select.world.title");
   private static final class00392 u = class00392.L("selectWorld.unable_to_load");
   @Nullable
   private final class04734 i;
   private final class04736 R;
   private final long M;
   private final int B;
   private final class03686 Z = new class03686(this, 8 + 9 + 8 + 20 + 4, 33);
   @Nullable
   protected class04927 y;
   @Nullable
   private class05231 z;
   @Nullable
   private class05362 U;

   public class04720(@Nullable class04734 var1, long var2, int var4, class04736 var5) {
      super(N);
      this.i = var1;
      this.R = var5;
      this.M = var2;
      this.B = var4;
   }

   private void N(class05944 var1) {
      this.field_22787.N(new class04733(this.i, this.M, this.B, this.R, var1.z()));
   }

   private void N(@Nullable class06434 var1) {
      if (this.z != null && this.U != null) {
         this.U.field_22763 = this.z.method_25334() != null;
      }
   }

   @Override
   public void method_25426() {
      class01885 class01885x = this.Z.N(class01885.u().N(4));
      class01885x.L().y();
      class01885x.N(new class02071(this.field_22785, this.field_22793));
      this.y = class01885x.N(new class04927(this.field_22793, this.field_22789 / 2 - 100, 22, 200, 20, this.y, class00392.L("selectWorld.search")));
      this.y.method_1863(var1x -> {
         if (this.z != null) {
            this.z.N(var1x);
         }
      });

      try {
         this.z = this.Z
            .L(new class05190(this.field_22787, this).N(this.field_22789).y(this.Z.u()).N(this.y.method_1882()).N(this.z).N().N(this::N).y(this::N).y());
      } catch (Exception exception) {
         L.error("Couldn't load level list", exception);
         this.field_22787.N(new class04702(u, class00392.N(exception.getMessage()), this.R));
         return;
      }

      class01885 class01885x = this.Z.y(class01885.i().N(8));
      class01885x.L().y();
      this.U = class01885x.N(class05362.method_46430(class00392.L("mco.upload.button.name"), var1x -> this.z.L().ifPresent(this::N)).N());
      class01885x.N(class05362.method_46430(class05220.U, var1x -> this.method_25419()).N());
      this.N(null);
      this.Z.method_48206(var1x -> {
         class06478 class06478 = this.method_37063(var1x);
      });
      this.method_48640();
   }

   @Override
   protected void method_56131() {
      this.method_48265(this.y);
   }

   @Override
   public void method_48640() {
      if (this.z != null) {
         this.z.method_57712(this.field_22789, this.Z);
      }

      this.Z.N();
   }

   @Override
   public void method_25419() {
      this.field_22787.N(this.R);
   }

   @Override
   public class00392 method_25435() {
      return class05220.N(this.method_25440(), this.z());
   }
}
