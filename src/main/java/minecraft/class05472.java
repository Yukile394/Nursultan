package minecraft;

import Nursultan.class10514;
import Nursultan.class10516;
import Nursultan.class10517;
import com.google.common.collect.ImmutableList;
import de.maxhenkel.voicechat.gui.widgets.ImageButton;
import de.maxhenkel.voicechat.voice.client.ClientManager;
import de.maxhenkel.voicechat.voice.common.PlayerState;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class05472 extends class05729<class05472> {
   private static final class01894 R = class01894.y("icon/draft_report");
   private static final Duration M = Duration.ofMillis(500L);
   private static final class01883 B = new class01883(
      class01894.y("social_interactions/report_button"),
      class01894.y("social_interactions/report_button_disabled"),
      class01894.y("social_interactions/report_button_highlighted")
   );
   private static final class01883 Z = new class01883(
      class01894.y("social_interactions/mute_button"), class01894.y("social_interactions/mute_button_highlighted")
   );
   private static final class01883 z = new class01883(
      class01894.y("social_interactions/unmute_button"), class01894.y("social_interactions/unmute_button_highlighted")
   );
   private final class06202 U;
   private final List<class06478> E;
   private final UUID W;
   private final String m;
   private final Supplier<class01631> P;
   private boolean s;
   private boolean T;
   private final boolean b;
   private boolean j;
   private final boolean v;
   @Nullable
   @org.jspecify.annotations.Nullable
   private class05362 n;
   @org.jspecify.annotations.Nullable
   private class05362 t;
   @Nullable
   @org.jspecify.annotations.Nullable
   private class05362 G;
   private float l;
   private static final class00392 d = class00392.L("gui.socialInteractions.status_hidden").N(class06541.field_1056);
   private static final class00392 w = class00392.L("gui.socialInteractions.status_blocked").N(class06541.field_1056);
   private static final class00392 k = class00392.L("gui.socialInteractions.status_offline").N(class06541.field_1056);
   private static final class00392 Y = class00392.L("gui.socialInteractions.status_hidden_offline").N(class06541.field_1056);
   private static final class00392 Q = class00392.L("gui.socialInteractions.status_blocked_offline").N(class06541.field_1056);
   private static final class00392 O = class00392.L("gui.socialInteractions.tooltip.report.disabled");
   private static final class00392 g = class00392.L("gui.socialInteractions.tooltip.hide");
   private static final class00392 I = class00392.L("gui.socialInteractions.tooltip.show");
   private static final class00392 J = class00392.L("gui.socialInteractions.tooltip.report");
   private static final int o = 24;
   private static final int q = 4;
   public static final int N = class02566.y(190, 0, 0, 0);
   private static final int K = 20;
   public static final int y = class02566.y(255, 74, 74, 74);
   public static final int L = class02566.y(255, 48, 48, 48);
   public static final int u = class02566.y(255, 255, 255, 255);
   public static final int i = class02566.y(140, 255, 255, 255);
   private static final class01894 V = class01894.N("voicechat", "icons/invite_button");
   private static final Duration e = Duration.ofMillis(500L);
   private ImageButton H;
   private boolean c;

   public Supplier<class01631> L() {
      return this.P;
   }

   private void L(boolean var1) {
      this.t.field_22764 = var1;
      this.n.field_22764 = !var1;
      this.E.set(0, var1 ? this.t : this.n);
   }

   public class05472(class06202 var1, class05470 var2, UUID var3, String var4, Supplier<class01631> var5, boolean var6) {
      super();
      this.U = var1;
      this.W = var3;
      this.m = var4;
      this.P = var5;
      class03409 class03409 = var1.R();
      this.b = class03409.N().N();
      this.v = var6;
      this.N(class03409);
      class05216 class05216x = class00392.N("gui.socialInteractions.narration.hide", var4);
      class05216 class05216x = class00392.N("gui.socialInteractions.narration.show", var4);
      class05463 class05463 = var1.yv();
      boolean flag = var1.b().N(var1.q());
      boolean flag1 = !((class04453)var1.T_4).method_5667().equals(var3);
      if (!class07529.Nu && (!flag1 || !flag || class05463.i(var3))) {
         this.E = ImmutableList.of();
      } else {
         this.G = new class10517(
            this,
            0,
            0,
            20,
            20,
            B,
            var4x -> class03409.N(var1, var2, () -> var1.N(new class03749(var2, class03409, this)), false),
            class00392.L("gui.socialInteractions.report")
         );
         this.G.field_22763 = this.b;
         this.G.method_47400(this.Z());
         this.G.method_47402(M);
         this.n = new class10514(this, 0, 0, 20, 20, Z, var4x -> {
            class05463.N(var3);
            this.N(true, class00392.N("gui.socialInteractions.hidden_in_chat", var4));
         }, class00392.L("gui.socialInteractions.hide"));
         this.n.method_47400(class04141.N(g, class05216x));
         this.n.method_47402(M);
         this.t = new class10516(this, 0, 0, 20, 20, z, var4x -> {
            class05463.y(var3);
            this.N(false, class00392.N("gui.socialInteractions.shown_in_chat", var4));
         }, class00392.L("gui.socialInteractions.show"));
         this.t.method_47400(class04141.N(I, class05216x));
         this.t.method_47402(M);
         this.E = new ArrayList<>();
         this.E.add(this.n);
         this.E.add(this.G);
         this.L(class05463.u(this.W));
      }

      this.N(var1, var2, var3, var4, var5, var6, null);
   }

   private class04141 Z() {
      return !this.b ? class04141.N(O) : class04141.N(J, class00392.N("gui.socialInteractions.narration.report", this.m));
   }

   public boolean i() {
      return this.T;
   }

   private boolean U() {
      PlayerState playerstate = ClientManager.getPlayerStateManager().getState(this.W);
      return playerstate == null ? false : !playerstate.hasGroup();
   }

   private class00392 z() {
      boolean flag = this.U.yv().u(this.W);
      boolean flag1 = this.U.yv().i(this.W);
      if (flag1 && this.s) {
         return Q;
      } else if (flag && this.s) {
         return Y;
      } else if (flag1) {
         return w;
      } else if (flag) {
         return d;
      } else {
         return this.s ? k : class05220.N;
      }
   }

   public boolean u() {
      return this.s;
   }

   public void y(boolean var1) {
      this.T = var1;
   }

   public UUID y() {
      return this.W;
   }

   private void N(class06202 var1, class05470 var2, UUID var3, String var4, Supplier var5, boolean var6, CallbackInfo var7) {
      if (this.E instanceof ArrayList) {
         this.H = new ImageButton(0, 0, V, var2x -> {
            ((class01683)((class04453)var1.T_4).y_0).u("voicechat invite %s".formatted(this.m));
            this.c = true;
         });
         this.H.method_47400(class04141.N(class00392.N("message.voicechat.invite_player", this.m)));
         this.H.method_47402(e);
         this.E.add(this.H);
      }
   }

   private void N(class01054 var1, int var2, int var3, boolean var4, float var5, CallbackInfo var6) {
      if (this.H != null && this.n != null && this.G != null) {
         if (ClientManager.getPlayerStateManager().getGroupID() == null || !this.U()) {
            this.H.field_22764 = false;
            return;
         }

         this.H.field_22764 = true;
         this.H.field_22763 = !this.c;
         this.H
            .y(
               this.method_73380() + (this.method_73387() - this.n.method_25368() - 4 - this.G.method_25368() - 4) - this.H.method_25368() - 4,
               this.method_73382() + (this.method_73384() - this.H.method_25364()) / 2
            );
         this.H.method_25394(var1, var2, var3, var5);
      }
   }

   public void N(class03409 var1) {
      this.j = var1.N(this.W);
   }

   public String N() {
      return this.m;
   }

   public void N(boolean var1) {
      this.s = var1;
   }

   public class05216 N(class05216 var1) {
      class00392 class00392 = this.z();
      return class00392 == class05220.N ? class00392.y(this.m).i(", ").y(var1) : class00392.y(this.m).i(", ").y(class00392).i(", ").y(var1);
   }

   private void N(boolean var1, class00392 var2) {
      this.L(var1);
      ((class01056)this.U.i_6).i().N(var2);
      this.U.NT().u(var2);
   }

   @Override
   public List<? extends class04654> method_25396() {
      return this.E;
   }

   public boolean R() {
      return this.v;
   }

   @Override
   public List<? extends class03434> method_37025() {
      return this.E;
   }

   @Override
   public void method_25343(class01054 var1, int var2, int var3, boolean var4, float var5) {
      int ix = this.method_73380() + 4;
      int jx = this.method_73382() + (this.method_73384() - 24) / 2;
      int kx = ix + 24 + 4;
      class00392 class00392 = this.z();
      int lx;
      if (class00392 == class05220.N) {
         var1.N(this.method_73380(), this.method_73382(), this.method_73389(), this.method_73386(), y);
         lx = this.method_73382() + (this.method_73384() - 9) / 2;
      } else {
         var1.N(this.method_73380(), this.method_73382(), this.method_73389(), this.method_73386(), L);
         lx = this.method_73382() + (this.method_73384() - (9 + 9)) / 2;
         var1.y((class01590)this.U.i_3, class00392, kx, lx + 12, i);
      }

      class03933.N(var1, this.P.get(), ix, jx, 24);
      var1.y((class01590)this.U.i_3, this.m, kx, lx, u);
      if (this.s) {
         var1.N(ix, jx, ix + 24, jx + 24, N);
      }

      if (this.n != null && this.t != null && this.G != null) {
         float f = this.l;
         this.n.method_46421(this.method_73380() + (this.method_73387() - this.n.method_25368() - 4) - 20 - 4);
         this.n.method_46419(this.method_73382() + (this.method_73384() - this.n.method_25364()) / 2);
         this.n.method_25394(var1, var2, var3, var5);
         this.t.method_46421(this.method_73380() + (this.method_73387() - this.t.method_25368() - 4) - 20 - 4);
         this.t.method_46419(this.method_73382() + (this.method_73384() - this.t.method_25364()) / 2);
         class05362 class05362 = this.t;
         this.N(var1, var2, var3, var4, var5, null);
         class05362.method_25394(var1, var2, var3, var5);
         this.G.method_46421(this.method_73380() + (this.method_73387() - this.t.method_25368() - 4));
         this.G.method_46419(this.method_73382() + (this.method_73384() - this.t.method_25364()) / 2);
         this.G.method_25394(var1, var2, var3, var5);
         if (f == this.l) {
            this.l = 0.0F;
         }
      }

      if (this.j && this.G != null) {
         var1.N(class08394.Na, R, this.G.method_46426() + 5, this.G.method_46427() + 1, 15, 15);
      }
   }
}
