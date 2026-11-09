package minecraft;

import Nursultan.class10515;
import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;

public class class05470 extends class05096 {
   public static final class00392 N = class00392.L("gui.socialInteractions.title");
   private static final class01894 M = class01894.y("social_interactions/background");
   private static final class01894 B = class01894.y("icon/search");
   private static final class00392 Z = class00392.L("gui.socialInteractions.tab_all");
   private static final class00392 z = class00392.L("gui.socialInteractions.tab_hidden");
   private static final class00392 U = class00392.L("gui.socialInteractions.tab_blocked");
   private static final class00392 E = Z.y().N(class06541.field_1073);
   private static final class00392 W = z.y().N(class06541.field_1073);
   private static final class00392 m = U.y().N(class06541.field_1073);
   private static final class00392 P = class00392.L("gui.socialInteractions.search_hint").L(class04927.field_62466);
   public static final class00392 y = class00392.L("gui.socialInteractions.search_empty").N(class06541.field_1080);
   private static final class00392 s = class00392.L("gui.socialInteractions.empty_hidden").N(class06541.field_1080);
   private static final class00392 T = class00392.L("gui.socialInteractions.empty_blocked").N(class06541.field_1080);
   private static final class00392 b = class00392.L("gui.socialInteractions.blocking_hint");
   private static final int j = 8;
   private static final int v = 236;
   private static final int n = 16;
   private static final int t = 64;
   public static final int L = 72;
   public static final int u = 88;
   private static final int G = 238;
   private static final int l = 20;
   private static final int d = 36;
   private final class03686 w = new class03686(this);
   @Nullable
   private final class05096 k;
   @Nullable
   public class05480 i;
   public class04927 R;
   private String Y = "";
   private class05451 Q = class05451.field_26890;
   private class05362 O;
   private class05362 g;
   private class05362 I;
   private class05362 J;
   @Nullable
   private class00392 o;
   private int q;

   private int L() {
      return (this.field_22789 - 238) / 2;
   }

   public class05470() {
      this(null);
   }

   public class05470(@Nullable class05096 var1) {
      super(N);
      this.k = var1;
      this.N(class06202.Nq());
   }

   private int y() {
      return 80 + this.N() - 8;
   }

   public void N(UUID var1) {
      this.i.N(var1);
   }

   public void N(class03458 var1) {
      this.i.N(var1, this.Q);
   }

   private void N(String var1) {
      var1 = var1.toLowerCase(Locale.ROOT);
      if (!var1.equals(this.Y)) {
         this.i.N(var1);
         this.Y = var1;
         this.N(this.Q);
      }
   }

   private void N(class06202 var1) {
      int ix = var1.NE().Z().size();
      if (this.q != ix) {
         String sx = "";
         class04568 class04568 = var1.yN();
         if (var1.q()) {
            sx = var1.Na().x();
         } else if (class04568 != null) {
            sx = class04568.N;
         }

         if (ix > 1) {
            this.o = class00392.N("gui.socialInteractions.server_label.multiple", sx, ix);
         } else {
            this.o = class00392.N("gui.socialInteractions.server_label.single", sx, ix);
         }

         this.q = ix;
      }
   }

   private int N() {
      return Math.max(52, this.field_22790 - 128 - 16);
   }

   private void N(class05451 var1) {
      this.Q = var1;
      this.O.method_25355(Z);
      this.g.method_25355(z);
      this.I.method_25355(U);
      boolean flag = false;
      switch (var1) {
         case field_26890:
            this.O.method_25355(E);
            Collection<UUID> collection = ((class01683)((class04453)this.field_22787.T_4).y_0).z();
            this.i.N(collection, this.i.method_44387(), true);
            break;
         case field_26891:
            this.g.method_25355(W);
            Set<UUID> set1 = this.field_22787.yv().L();
            flag = set1.isEmpty();
            this.i.N(set1, this.i.method_44387(), false);
            break;
         case field_26921:
            this.I.method_25355(m);
            class05463 var3 = this.field_22787.yv();
            Set set = ((class01683)((class04453)this.field_22787.T_4).y_0).z().stream().filter(var3::i).collect(Collectors.toSet());
            flag = set.isEmpty();
            this.i.N(set, this.i.method_44387(), false);
      }

      class05153 class05153 = this.field_22787.NT();
      if (!this.R.method_1882().isEmpty() && this.i.y() && !this.R.method_25370()) {
         class05153.u(y);
      } else if (flag) {
         if (var1 == class05451.field_26891) {
            class05153.u(s);
         } else if (var1 == class05451.field_26921) {
            class05153.u(T);
         }
      }
   }

   @Override
   public void method_25426() {
      this.w.N(N, this.field_22793);
      this.i = new class05480(this, this.field_22787, this.field_22789, this.y() - 88, 88, 36);
      int ix = this.i.method_25322() / 3;
      int jx = this.i.method_25342();
      int kx = this.i.method_31383();
      this.O = this.method_37063(class05362.method_46430(Z, var1x -> this.N(class05451.field_26890)).N(jx, 45, ix, 20).N());
      this.g = this.method_37063(class05362.method_46430(z, var1x -> this.N(class05451.field_26891)).N((jx + kx - ix) / 2 + 1, 45, ix, 20).N());
      this.I = this.method_37063(class05362.method_46430(U, var1x -> this.N(class05451.field_26921)).N(kx - ix + 1, 45, ix, 20).N());
      String sx = this.R != null ? this.R.method_1882() : "";
      this.R = this.method_37063(new class10515(this, this.field_22793, this.L() + 28, 74, 200, 15, P));
      this.R.method_1880(16);
      this.R.method_1862(true);
      this.R.method_1868(-1);
      this.R.method_1852(sx);
      this.R.method_47404(P);
      this.R.method_1863(this::N);
      this.J = this.method_37063(class05362.method_46430(b, class01321.y(this, class03597.P)).N(this.field_22789 / 2 - 100, 64 + this.N(), 200, 20).N());
      this.method_25429(this.i);
      this.N(this.Q);
      this.w.y(class05362.method_46430(class05220.u, var1x -> this.method_25419()).N(200).N());
      this.w.method_48206(var1x -> {
         class06478 class06478 = this.method_37063(var1x);
      });
      this.method_48640();
   }

   @Override
   public void method_49589() {
      if (this.i != null) {
         this.i.L();
      }
   }

   @Override
   protected void method_56131() {
      this.method_48265(this.R);
   }

   @Override
   public boolean method_25404(class06601 var1) {
      if (!this.R.method_25370() && ((class05630)this.field_22787.i_7).V.N(var1)) {
         this.method_25419();
         return true;
      } else {
         return super.method_25404(var1);
      }
   }

   @Override
   public void method_48640() {
      this.w.N();
      this.i.method_57714(this.field_22789, this.y() - 88, 88);
      this.R.y(this.L() + 28, 74);
      int ix = this.i.method_25342();
      int jx = this.i.method_31383();
      int kx = this.i.method_25322() / 3;
      this.O.y(ix, 45);
      this.g.y((ix + jx - kx) / 2 + 1, 45);
      this.I.y(jx - kx + 1, 45);
      this.J.y(this.field_22789 / 2 - 100, 64 + this.N());
   }

   @Override
   public void method_25420(class01054 var1, int var2, int var3, float var4) {
      super.method_25420(var1, var2, var3, var4);
      int ix = this.L() + 3;
      var1.N(class08394.Na, M, ix, 64, 236, this.N() + 16);
      var1.N(class08394.Na, B, ix + 10, 76, 12, 12);
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      this.N(this.field_22787);
      if (this.o != null) {
         var1.y((class01590)this.field_22787.i_3, this.o, this.L() + 8, 35, -1);
      }

      if (!this.i.y()) {
         this.i.method_25394(var1, var2, var3, var4);
      } else if (!this.R.method_1882().isEmpty()) {
         var1.N((class01590)this.field_22787.i_3, y, this.field_22789 / 2, (72 + this.y()) / 2, -1);
      } else if (this.Q == class05451.field_26891) {
         var1.N((class01590)this.field_22787.i_3, s, this.field_22789 / 2, (72 + this.y()) / 2, -1);
      } else if (this.Q == class05451.field_26921) {
         var1.N((class01590)this.field_22787.i_3, T, this.field_22789 / 2, (72 + this.y()) / 2, -1);
      }

      this.J.field_22764 = this.Q == class05451.field_26921;
   }

   @Override
   public void method_25419() {
      this.field_22787.N(this.k);
   }

   @Override
   public boolean method_25421() {
      return false;
   }

   @Override
   public class00392 method_25435() {
      return (class00392)(this.o != null ? class05220.N(super.method_25435(), this.o) : super.method_25435());
   }
}
