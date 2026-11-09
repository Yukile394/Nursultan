package minecraft;

import Nursultan.class11910;
import Nursultan.class11921;
import java.net.URI;
import java.nio.file.Path;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class05364 extends class05096 {
   private static final class00392 N = class00392.L("gui.toMenu");
   private static final class00392 y = class00392.L("gui.toTitle");
   private static final class00392 L = class00392.L("gui.report_to_server");
   private static final class00392 u = class00392.L("gui.open_report_dir");
   private final class05096 i;
   private final class02570 R;
   private final class00392 M;
   private final class01885 B = class01885.u();

   public class05364(class05096 var1, class00392 var2, class02570 var3, class00392 var4) {
      super(var2);
      this.i = var1;
      this.R = var3;
      this.M = var4;
   }

   public class05364(class05096 var1, class00392 var2, class02570 var3) {
      this(var1, var2, var3, N);
   }

   public class05364(class05096 var1, class00392 var2, class00392 var3, class00392 var4) {
      this(var1, var2, new class02570(var3), var4);
   }

   public class05364(class05096 var1, class00392 var2, class00392 var3) {
      this(var1, var2, new class02570(var3));
   }

   private void N(CallbackInfo var1) {
      class04568 class04568 = (class04568)class11910.N_6;
      if (class04568 != null && class04568.y != null && this.field_22787.yM()) {
         this.B.N(class05362.method_46430(class11921.N("reconnect-button"), var2x -> {
            class03420 class03420 = class03420.N(class04568.y);
            var2x.field_22763 = false;
            class05763.N(null, this.field_22787, class03420, class04568, true, null);
         }).N(200).N());
      }
   }

   @Override
   public void method_25426() {
      this.B.L().y().N(10);
      this.B.N(new class02071(this.field_22785, this.field_22793));
      this.B.N(new class04230(this.R.N(), this.field_22793).N(this.field_22789 - 50).N(true));
      this.B.L().N(2);
      this.R.L().ifPresent(var1x -> this.B.N(class05362.method_46430(L, class01321.y(this, var1x, false)).N(200).N()));
      this.R.y().ifPresent(var1x -> this.B.N(class05362.method_46430(u, var1xx -> class07536.m().N(var1x.getParent())).N(200).N()));
      class05362 class05362;
      if (this.field_22787.yM()) {
         class05362 = class05362.method_46430(this.M, var1x -> this.field_22787.N(this.i)).N(200).N();
      } else {
         class05362 = class05362.method_46430(y, var1x -> this.field_22787.N(new class04705())).N(200).N();
      }

      this.B.N(class05362);
      this.N(null);
      this.B.N();
      this.B.method_48206(this::method_37063);
      this.method_48640();
   }

   @Override
   public boolean method_25422() {
      return false;
   }

   @Override
   public void method_48640() {
      class02077.N(this.B, this.method_48202());
   }

   @Override
   public class00392 method_25435() {
      return class05220.N(this.field_22785, this.R.N());
   }
}
