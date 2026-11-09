package minecraft;

import com.google.common.collect.Lists;
import com.google.common.util.concurrent.RateLimiter;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import org.apache.commons.lang3.StringUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05685 extends class05407 {
   static final class01894 N = class01894.y("icon/info");
   static final class01894 y = class01894.y("icon/new_realm");
   static final class01894 L = class01894.y("realm_status/expired");
   static final class01894 u = class01894.y("realm_status/expires_soon");
   static final class01894 i = class01894.y("realm_status/open");
   static final class01894 R = class01894.y("realm_status/closed");
   private static final class01894 e = class01894.y("icon/invite");
   private static final class01894 H = class01894.y("icon/news");
   public static final class01894 M = class01894.y("hud/heart/hardcore_full");
   static final Logger B = LogUtils.getLogger();
   private static final class01894 c = class01894.y("textures/gui/realms/no_realms.png");
   private static final class00392 X = class00392.L("menu.online");
   private static final class00392 a = class00392.L("mco.selectServer.loading");
   static final class00392 Z = class00392.L("mco.selectServer.uninitialized");
   static final class00392 z = class00392.L("mco.selectServer.expiredList");
   private static final class00392 p = class00392.L("mco.selectServer.expiredRenew");
   static final class00392 U = class00392.L("mco.selectServer.expiredTrial");
   private static final class00392 F = class00392.L("mco.selectServer.play");
   private static final class00392 A = class00392.L("mco.selectServer.leave");
   private static final class00392 f = class00392.L("mco.selectServer.configure");
   static final class00392 E = class00392.L("mco.selectServer.expired");
   static final class00392 W = class00392.L("mco.selectServer.expires.soon");
   static final class00392 m = class00392.L("mco.selectServer.expires.day");
   static final class00392 P = class00392.L("mco.selectServer.open");
   static final class00392 s = class00392.L("mco.selectServer.closed");
   static final class00392 T = class00392.N("gui.narrate.button", Z);
   private static final class00392 C = class00392.L("mco.selectServer.noRealms");
   private static final class00392 S = class00392.L("mco.invites.nopending");
   private static final class00392 x = class00392.L("mco.invites.pending");
   private static final class00392 D = class00392.L("mco.compatibility.incompatible.popup.title");
   private static final class00392 h = class00392.L("mco.compatibility.incompatible.releaseType.popup.message");
   private static final int r = 100;
   private static final int NN = 3;
   private static final int Ny = 4;
   private static final int NL = 308;
   private static final int Nu = 5;
   private static final int Ni = 44;
   private static final int NR = 11;
   private static final int NM = 40;
   private static final int NB = 20;
   private static final boolean NZ = !class07529.y().comp_4031();
   private static boolean Nz = NZ;
   private final CompletableFuture<class01852> NU = class01888.N();
   private class03374 NE;
   private final Set<UUID> NW = new HashSet<>();
   private static boolean Nm;
   private final RateLimiter NP;
   private final class05096 Ns;
   private class05362 NT;
   private class05362 Nb;
   private class05362 Nj;
   private class05362 Nv;
   private class05362 Nn;
   class05682 b;
   class03410 j;
   List<class04981> v = List.of();
   class04966 n = new class04966(Map.of());
   private volatile boolean Nt;
   @Nullable
   private volatile String NG;
   final List<class03576> t = new ArrayList<>();
   private class05362 Nl;
   private class05139 Nd;
   private class05139 Nw;
   private class05102 Nk;
   @Nullable
   private class03686 NY;

   public static void L() {
      class06202.Nq().Nd().u.N();
   }

   private boolean L(class04981 var1) {
      return N(var1) && var1.R != class04961.field_19435;
   }

   private class03695 L(class05102 var1) {
      class02060 class02060 = new class02060().L(4);
      class02080 class02080 = class02060.u(3);
      if (var1 == class05102.field_45225) {
         class02080.N(this.NT);
         class02080.N(this.Nv);
         class02080.N(this.Nj);
         class02080.N(this.Nn);
      }

      class02080.N(this.Nl);
      class02080.N(this.Nb);
      return class02060;
   }

   private void M(@Nullable class04981 var1) {
      if (var1 != null && !this.field_22787.y(var1.B)) {
         class05216 class05216 = class00392.L("mco.configure.world.leave.question.line1");
         this.field_22787.N(class02252.N(this, class05216, var2x -> this.B(var1)));
      }
   }

   private void P() {
      new Thread(() -> {
         List<class04970> list = class05109.N();
         class05111 class05111 = class05111.N();
         class04971 class04971 = new class04971(list, this.s());

         try {
            class05111.N(class04971);
         } catch (Throwable throwable) {
            B.warn("Could not send ping result to Realms: ", throwable);
         }
      }).start();
   }

   @Nullable
   private class04981 T() {
      class01202 class01202 = this.b.method_25334();
      return class01202 instanceof class05698 ? ((class05698)class01202).N() : null;
   }

   public class05685(class05096 var1) {
      super(X);
      this.Ns = var1;
      this.NP = RateLimiter.create(0.016666668F);
   }

   private void B(class04981 var1) {
      new class05680(this, "Realms-leave-server", var1).start();
      this.field_22787.N(this);
   }

   private class03695 Z() {
      byte b0 = 90;
      class01885 class01885x = class01885.i().N(4);
      class01885x.L().i();
      class01885x.N(this.Nd);
      class01885x.N(this.Nw);
      class01885 class01885x = class01885.i();
      class01885x.L().i();
      class01885x.N(class02057.N(90));
      class01885x.N(U(), class02072::y);
      class01885x.N(new class02077(90, 44)).N(class01885x, class02072::L);
      return class01885x;
   }

   private boolean Z(class04981 var1) {
      return N(var1) && !var1.U;
   }

   private void i(@Nullable class04981 var1) {
      if (var1 != null) {
         String sx = class03597.N(var1.L, this.field_22787.Ny().y(), var1.E);
         this.field_22787.N(new class01321(var2x -> {
            if (var2x) {
               class07536.m().N(sx);
            } else {
               this.field_22787.N(this);
            }
         }, sx, true));
      }
   }

   public void i() {
      this.b.method_25313(null);
      u();
   }

   private void b() {
      this.field_22787.N(new class01891(this, this.Nt));
   }

   private List<Long> s() {
      ArrayList arraylist = Lists.newArrayList();

      for (class04981 class04981 : this.j) {
         if (this.Z(class04981)) {
            arraylist.add(class04981.y);
         }
      }

      return arraylist;
   }

   private void m() {
      this.b.N(this);
      this.R();
      this.y();
   }

   public static void u() {
      class06202.Nq().Nd().L.N();
   }

   private boolean u(class04981 var1) {
      return !N(var1);
   }

   private class03686 y(class05102 var1) {
      class03686 class03686 = new class03686(this);
      class03686.y(44);
      class03686.N(this.Z());
      class03695 class03695 = this.L(var1);
      class03695.N();
      class03686.N(class03695.method_25364() + 22);
      class03686.y(class03695);
      switch (var1) {
         case field_45223:
            class03686.L(new class01860(this.field_22793, a));
            break;
         case field_45224:
            class03686.L(this.E());
            break;
         case field_45225:
            class03686.L(this.b);
      }

      return class03686;
   }

   private static void y(class04981 var0, class05096 var1) {
      class05216 class05216xxxx = class00392.L("mco.compatibility.upgrade.title").y(-171);
      class05216 class05216x = class00392.L("mco.compatibility.upgrade");
      class05216 class05216xx = class00392.y(var0.G).y(-171);
      class05216 class05216xxx = class00392.y(class07529.y().comp_4025()).y(-171);
      class05216 class05216xxxx = N(var0)
         ? class00392.N("mco.compatibility.upgrade.description", class05216xx, class05216xxx)
         : class00392.N("mco.compatibility.upgrade.friend.description", class05216xx, class05216xxx);
      N(var0, var1, class05216xxxx, class05216xxxx, class05216x);
   }

   private boolean y(class04981 var1) {
      return var1.U && N(var1);
   }

   void y() {
      class04981 class04981 = this.T();
      boolean flag = class04981 != null;
      this.Nl.field_22763 = this.Nk != class05102.field_45223;
      this.NT.field_22763 = flag && class04981.M();
      if (!this.NT.field_22763 && flag && class04981.R == class04961.field_19433) {
         this.NT.method_47400(class04141.N(class04981.N));
      }

      this.Nj.field_22763 = flag && this.y(class04981);
      this.Nn.field_22763 = flag && this.u(class04981);
      this.Nv.field_22763 = flag && this.L(class04981);
   }

   private class01885 E() {
      class01885 class01885 = class01885.u().N(8);
      class01885.L().y();
      class01885.N(class03608.N(130, 64, c, 130, 64));
      class01885.N(class02091.N(C, this.field_22793).N(308).N(false).N(class02086.field_62118).N());
      return class01885;
   }

   public static boolean N() {
      return NZ && Nz;
   }

   private void N(class05102 var1) {
      if (this.Nk != var1) {
         if (this.NY != null) {
            this.NY.method_48206(var1x -> this.method_37066(var1x));
         }

         this.NY = this.y(var1);
         this.Nk = var1;
         this.NY.method_48206(var1x -> {
            class06478 class06478 = this.method_37063(var1x);
         });
         this.method_48640();
      }
   }

   public static class00392 N(int var0, boolean var1) {
      return (class00392)(var1 ? class00392.L("gameMode.hardcore").y(-65536) : class07282.N(var0).L());
   }

   public static class00392 N(String var0, int var1) {
      return (class00392)(StringUtils.isBlank(var0) ? class05220.N : class00392.y(var0).y(var1));
   }

   public static class00392 N(String var0, boolean var1) {
      return N(var0, var1 ? -8355712 : -2142128);
   }

   private static void N(class04981 var0, class05096 var1, class00392 var2, class00392 var3, class00392 var4) {
      class06202.Nq().N(new class03754(var1, var2).N(var3).N(var4, var2x -> {
         class06202.Nq().N(new class04708(var1, new class04693(var1, var0)));
         u();
      }).N(class05220.i, class03723::method_25419).N());
   }

   private void N(class01054 var1, String var2, int var3) {
      var1.i().pushMatrix();
      var1.i().translate(this.field_22789 / 2 - 25, 20.0F);
      var1.i().rotate((float) (-Math.PI / 9));
      var1.i().scale(1.5F, 1.5F);
      var1.y(this.field_22793, var2, 0, 0, var3);
      var1.i().popMatrix();
   }

   static boolean N(class04981 var0) {
      return class06202.Nq().y(var0.B);
   }

   private static <T> void N(class05723<T> var0, Consumer<T> var1) {
      class06202 class06202 = class06202.Nq();
      CompletableFuture.supplyAsync(() -> {
         try {
            return var0.request(class05111.N(class06202));
         } catch (class05097 class05097) {
            throw new RuntimeException(class05097);
         }
      }).thenAcceptAsync(var1, class06202).exceptionally(var0x -> {
         B.error("Failed to execute call to Realms Service", var0x);
         return null;
      });
   }

   void N(Collection<class03576> var1) {
      ArrayList arraylist = new ArrayList(var1.size());

      for (class03576 class03576 : var1) {
         if (!class03576.N() && !this.NW.contains(class03576.L())) {
            arraylist.add(class03576.L());
         }
      }

      if (!arraylist.isEmpty()) {
         N(var1x -> {
            var1x.N(arraylist);
            return null;
         }, var2x -> this.NW.addAll(arraylist));
      }
   }

   private class03374 N(class03400 var1) {
      class03374 class03374 = var1.N.N();
      class03374.N(var1.L, var1x -> {
         this.j.N(var1x.N());
         this.v = var1x.y();
         this.m();
         boolean flag = false;

         for (class04981 class04981 : this.j) {
            if (this.Z(class04981)) {
               flag = true;
            }
         }

         if (!Nm && flag) {
            Nm = true;
            this.P();
         }
      });
      N(class05111::i, var1x -> {
         this.t.clear();
         this.t.addAll(var1x);

         for (class03576 class03576 : var1x) {
            if (class03576 instanceof class03580) {
               class03723 class03723 = ((class03580)class03576).N(this, this::N);
               if (class03723 != null) {
                  this.field_22787.N(class03723);
                  this.N(List.of(class03576));
                  break;
               }
            }
         }

         if (!this.t.isEmpty() && this.Nk != class05102.field_45223) {
            this.m();
         }
      });
      class03374.N(var1.u, var1x -> {
         this.Nd.N(var1x);
         this.Nd.method_47400(var1x == 0 ? class04141.N(S) : class04141.N(x));
         if (var1x > 0 && this.NP.tryAcquire(1)) {
            this.field_22787.NT().u(class00392.N("mco.configure.world.invite.narration", var1x));
         }
      });
      class03374.N(var1.i, var1x -> this.Nt = var1x);
      class03374.N(var1.M, var1x -> this.n = var1x);
      class03374.N(var1.R, var2x -> {
         var1.B.N(var2x);
         this.NG = var1.B.y();
         this.Nw.N(var1.B.N() ? Integer.MAX_VALUE : 0);
      });
      return class03374;
   }

   void N(UUID var1) {
      N(var1x -> {
         var1x.y(List.of(var1));
         return null;
      }, var2 -> {
         this.t.removeIf(var1xx -> var1xx.y() && var1.equals(var1xx.L()));
         this.m();
      });
   }

   public static void N(@Nullable class04981 var0, class05096 var1) {
      N(var0, var1, false);
   }

   public static void N(@Nullable class04981 var0, class05096 var1, boolean var2) {
      if (var0 != null) {
         if (!N() || var2 || var0.z()) {
            class06202.Nq().N(new class04708(var1, new class04693(var1, var0)));
            return;
         }

         switch (var0.l) {
            case field_46701:
               class06202.Nq().N(new class04708(var1, new class04693(var1, var0)));
               break;
            case field_46697:
               N(var0, var1, class00392.L("mco.compatibility.unverifiable.title").y(-171), class00392.L("mco.compatibility.unverifiable.message"), class05220.z);
               break;
            case field_46699:
               N(
                  var0,
                  var1,
                  class00392.L("selectWorld.backupQuestion.downgrade").y(-2142128),
                  class00392.N("mco.compatibility.downgrade.description", class00392.y(var0.G).y(-171), class00392.y(class07529.y().comp_4025()).y(-171)),
                  class00392.L("mco.compatibility.downgrade")
               );
               break;
            case field_46700:
               y(var0, var1);
               break;
            case field_46698:
               class06202.Nq()
                  .N(
                     new class03754(var1, D)
                        .N(
                           class00392.N(
                              "mco.compatibility.incompatible.series.popup.message",
                              class00392.y(var0.G).y(-171),
                              class00392.y(class07529.y().comp_4025()).y(-171)
                           )
                        )
                        .N(class05220.U, class03723::method_25419)
                        .N()
                  );
               break;
            case field_51817:
               class06202.Nq().N(new class03754(var1, D).N(h).N(class05220.U, class03723::method_25419).N());
         }
      }
   }

   @Override
   public void method_25426() {
      this.j = new class03410(this.field_22787);
      this.b = new class05682(this);
      class05216 class05216x = class00392.L("mco.invites.title");
      this.Nd = new class05139(class05216x, e, var2x -> this.field_22787.N(new class04729(this, class05216x)), null);
      class05216 class05216x = class00392.L("mco.news");
      this.Nw = new class05139(class05216x, H, var1x -> {
         String sx = this.NG;
         if (sx != null) {
            class01321.N(this, sx);
            if (this.Nw.y() != 0) {
               class04717 class04717 = class04714.y();
               class04717.y = false;
               class04714.y(class04717);
               this.Nw.N(0);
            }
         }
      }, class05216x);
      this.NT = class05362.method_46430(F, var1x -> N(this.T(), this)).N(100).N();
      this.Nv = class05362.method_46430(f, var1x -> this.R(this.T())).N(100).N();
      this.Nj = class05362.method_46430(p, var1x -> this.i(this.T())).N(100).N();
      this.Nn = class05362.method_46430(A, var1x -> this.M(this.T())).N(100).N();
      this.Nl = class05362.method_46430(class00392.L("mco.selectServer.purchase"), var1x -> this.b()).y(100, 20).N();
      this.Nb = class05362.method_46430(class05220.U, var1x -> this.method_25419()).N(100).N();
      if (class05111.N == class05104.field_19587) {
         this.method_37063(class06366.N(class00392.y("Snapshot"), class00392.y("Release"), Nz).N(5, 5, 100, 20, class00392.y("Realm"), (var1x, var2x) -> {
            Nz = var2x;
            this.v = List.of();
            this.W();
         }));
      }

      this.N(class05102.field_45223);
      this.y();
      this.NU.thenAcceptAsync(var1x -> {
         class05096 class05096 = var1x.N(this.Ns);
         if (class05096 == null) {
            this.NE = this.N(this.field_22787.Nd());
         } else {
            this.field_22787.N(class05096);
         }
      }, this.field_44944);
   }

   @Override
   public void method_48640() {
      if (this.NY != null) {
         this.b.method_57712(this.field_22789, this.NY);
         this.NY.N();
      }
   }

   @Override
   public void method_25393() {
      super.method_25393();
      if (this.NE != null) {
         this.NE.y();
      }
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      if (N()) {
         var1.y(this.field_22793, "Minecraft " + class07529.y().comp_4025(), 2, this.field_22790 - 10, -1);
      }

      if (this.Nt && this.Nl.field_22763) {
         class01891.N(var1, this.Nl);
      }

      switch (class05111.N) {
         case field_19587:
            this.N(var1, "STAGE!", -256);
            break;
         case field_19588:
            this.N(var1, "LOCAL!", -8388737);
      }
   }

   @Override
   public void method_25419() {
      this.field_22787.N(this.Ns);
   }

   private void W() {
      Iterator<class03416<?>> iterator = this.field_22787.Nd().N().iterator();

      while (iterator.hasNext()) {
         iterator.next().N();
      }
   }

   private void R() {
      if (this.j.N() && this.v.isEmpty() && this.t.isEmpty()) {
         this.N(class05102.field_45224);
      } else {
         this.N(class05102.field_45225);
      }
   }

   private void R(@Nullable class04981 var1) {
      if (var1 != null && this.field_22787.y(var1.B)) {
         this.field_22787.N(new class05092(this, var1.y));
      }
   }

   @Override
   public class00392 method_25435() {
      return (class00392)(switch (this.Nk) {
         case field_45223 -> class05220.N(super.method_25435(), a);
         case field_45224 -> class05220.N(super.method_25435(), C);
         case field_45225 -> super.method_25435();
      });
   }
}
