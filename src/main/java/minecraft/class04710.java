package minecraft;

import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

class class04710 extends class03286 implements class00061 {
   static final Logger N = LogUtils.getLogger();
   static final class00392 y = class00392.L("mco.configure.world.players.title");
   static final class00392 L = class00392.L("mco.question");
   private static final int z = 8;
   final class05092 u;
   final class06202 i;
   final class01590 R;
   class04981 M;
   final class04738 B;

   @Override
   public void method_48611(class03255 var1) {
      this.B.method_57714(this.u.field_22789, this.N(), this.u.N.L());
      super.method_48611(var1);
   }

   class04710(class05092 var1, class06202 var2, class04981 var3) {
      super(y);
      this.u = var1;
      this.i = var2;
      this.R = var1.method_64506();
      this.M = var3;
      class02080 class02080 = this.Z.L(8).u(1);
      this.B = class02080.N(new class04738(this, var1.field_22789, this.N()), class02072.Z().u().y());
      class02080.N(
         class05362.method_46430(class00392.L("mco.configure.world.buttons.invite"), var3x -> var2.N(new class04725(var1, var3))).N(), class02072.Z().R().y()
      );
      this.N(var3);
   }

   public int N() {
      return this.u.N() - 20 - 16;
   }

   @Override
   public void N(class04981 var1) {
      this.M = var1;
      this.B.N(var1);
   }
}
