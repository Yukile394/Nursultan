package minecraft;

import com.mojang.logging.LogUtils;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.FormatStyle;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

class class04700 extends class03286 implements class00061 {
   private static final Logger y = LogUtils.getLogger();
   private static final int L = 200;
   private static final int u = 2;
   private static final int i = 6;
   static final class00392 N = class00392.L("mco.configure.world.subscription.tab");
   private static final class00392 R = class00392.L("mco.configure.world.subscription.start");
   private static final class00392 M = class00392.L("mco.configure.world.subscription.timeleft");
   private static final class00392 B = class00392.L("mco.configure.world.subscription.recurring.daysleft");
   private static final class00392 z = class00392.L("mco.configure.world.subscription.expired").N(class06541.field_1080);
   private static final class00392 U = class00392.L("mco.configure.world.subscription.less_than_a_day").N(class06541.field_1080);
   private static final class00392 E = class00392.L("mco.configure.world.subscription.unknown");
   private static final class00392 W = class00392.L("mco.configure.world.subscription.recurring.info");
   private final class05092 m;
   private final class06202 P;
   private final class05362 s;
   private final class02091 T;
   private final class02071 b;
   private final class02071 j;
   private final class02071 v;
   private class04981 n;
   private class00392 t = E;
   private class00392 G = E;
   @Nullable
   private class04959 l;

   @Override
   public class00392 method_71245() {
      return class05220.y(N, R, this.G, M, this.t);
   }

   class04700(class05092 var1, class06202 var2, class04981 var3) {
      super(N);
      this.m = var1;
      this.P = var2;
      this.n = var3;
      class02080 class02080 = this.Z.y(6).u(1);
      class01590 class01590 = var1.method_64506();
      class02080.N(new class02071(200, 9, R, class01590));
      this.b = class02080.N(new class02071(200, 9, this.G, class01590));
      class02080.N(class02057.y(2));
      this.j = class02080.N(new class02071(200, 9, M, class01590));
      this.v = class02080.N(new class02071(200, 9, this.t, class01590));
      class02080.N(class02057.y(2));
      class02080.N(
         class05362.method_46430(class00392.L("mco.configure.world.subscription.extend"), var3x -> class01321.N(var1, class03597.N(var3.L, var2.Ny().y())))
            .N(0, 0, 200, 20)
            .N()
      );
      class02080.N(class02057.y(2));
      this.s = class02080.N(
         class05362.method_46430(
               class00392.L("mco.configure.world.delete.button"),
               var3x -> var2.N(class02252.y(var1, class00392.L("mco.configure.world.delete.question.line1"), var1xx -> this.N()))
            )
            .N(0, 0, 200, 20)
            .N()
      );
      class02080.N(class02057.y(2));
      this.T = class02080.N(class02091.N(class00392.i(), class01590).N(200).N(), class02072.Z().y());
      this.T.N(false);
      this.N(var3);
   }

   private void N(long var1) {
      class05111 class05111 = class05111.N();

      try {
         class04944 class04944 = class05111.M(var1);
         this.t = this.N(class04944.y());
         this.G = N(class04944.N());
         this.l = class04944.L();
      } catch (class05097 class05097) {
         y.error("Couldn't get subscription", class05097);
         this.P.N(this.m.N(class05097));
      }
   }

   private class00392 N(int var1) {
      if (var1 < 0 && this.n.U) {
         return z;
      } else if (var1 <= 1) {
         return U;
      } else {
         int ix = var1 / 30;
         int jx = var1 % 30;
         boolean flag = ix > 0;
         boolean flag1 = jx > 0;
         if (flag && flag1) {
            return class00392.N("mco.configure.world.subscription.remaining.months.days", ix, jx).N(class06541.field_1080);
         } else if (flag) {
            return class00392.N("mco.configure.world.subscription.remaining.months", ix).N(class06541.field_1080);
         } else {
            return flag1 ? class00392.N("mco.configure.world.subscription.remaining.days", jx).N(class06541.field_1080) : class00392.i();
         }
      }
   }

   @Override
   public void N(class04981 var1) {
      this.n = var1;
      this.N(var1.y);
      this.b.method_25355(this.G);
      if (this.l == class04959.field_19443) {
         this.j.method_25355(M);
      } else if (this.l == class04959.field_19444) {
         this.j.method_25355(B);
      }

      this.v.method_25355(this.t);
      boolean flag = class05685.N() && var1.t != null;
      this.s.field_22763 = var1.U;
      if (flag) {
         this.T.method_25355(class00392.N("mco.snapshot.subscription.info", var1.t));
      } else {
         this.T.method_25355(W);
      }

      this.Z.N();
   }

   private void N() {
      class04601.N(var1 -> var1.Z(this.n.y), class04601.N(this.m::N, "Couldn't delete world")).thenRunAsync(() -> this.P.N(this.m.L()), this.P);
      this.P.N(this.m);
   }

   private static class00392 N(Instant var0) {
      return class00392.y(ZonedDateTime.ofInstant(var0, ZoneId.systemDefault()).format(class07536.N(FormatStyle.MEDIUM))).N(class06541.field_1080);
   }
}
