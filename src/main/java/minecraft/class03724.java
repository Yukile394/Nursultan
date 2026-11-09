package minecraft;

import java.util.UUID;
import java.util.function.Supplier;

public class class03724 extends class03709<class03750> {
   private static final int m = 85;
   private static final int P = 178;
   private static final class00392 s = class00392.L("gui.abuseReport.skin.title");
   private class03943 T;
   private class05362 b;

   public class03724(class05096 var1, class03409 var2, class03744 var3) {
      this(var1, var2, new class03750(var3, var2.N().y()));
   }

   public class03724(class05096 var1, class03409 var2, UUID var3, Supplier<class01631> var4) {
      this(var1, var2, new class03750(var3, var4, var2.N().y()));
   }

   private class03724(class05096 var1, class03409 var2, class03750 var3) {
      super(s, var1, var2, var3);
   }

   @Override
   protected void y() {
      class03380 class03380 = this.E.Z();
      if (class03380 != null) {
         this.b.method_25355(class03380.y());
      } else {
         this.b.method_25355(L);
      }

      super.y();
   }

   @Override
   protected void N() {
      class01885 class01885x = this.U.N(class01885.i().N(8));
      class01885x.L().i();
      class01885x.N(new class03756(85, 120, this.field_22787.yt(), this.E.i().N()));
      class01885 class01885x = class01885x.N(class01885.u().N(8));
      this.b = class05362.method_46430(L, var1x -> this.field_22787.N(new class03418(this, this.E.Z(), class03752.field_46065, var1xx -> {
         this.E.N(var1xx);
         this.y();
      }))).N(178).N();
      class01885x.N(class03725.N(this.field_22793, this.b, y));
      this.T = this.N(178, 72, var1x -> {
         this.E.N(var1x);
         this.y();
      });
      class01885x.N(class03725.N(this.field_22793, this.T, u, var0 -> var0.i(12)));
   }

   @Override
   public boolean method_25406(class06613 var1) {
      return super.method_25406(var1) ? true : this.T.method_25406(var1);
   }
}
