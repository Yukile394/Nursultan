package minecraft;

import com.google.common.collect.ContiguousSet;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.Lists;
import com.google.common.collect.Range;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class07856 {
   private static final Logger u = LogUtils.getLogger();
   private static final int i = 1200;
   private static final int R = 100;
   public static final int N = 20;
   private static final int M = 8;
   public static final int y = 9;
   private static final int B = 20;
   private static final int Z = 96;
   public static final int L = 128;
   private final Predicate<class07049> z;
   private final class04774 U = (class04774)new class04774(class00392.L("entity.minecraft.ender_dragon"), class06685.field_5788, class06702.field_5795)
      .y(true)
      .L(true);
   private final class04782 E;
   private final class07209 W;
   private final ObjectArrayList<Integer> m = new ObjectArrayList();
   private final class06649 P;
   private int s;
   private int T;
   private int b;
   private int j = 21;
   private boolean v;
   private boolean n;
   private boolean t = false;
   @Nullable
   private UUID G;
   private boolean l = true;
   @Nullable
   private class07209 d;
   @Nullable
   private class07855 w;
   private int k;
   @Nullable
   private List<class00676> Y;

   public void L() {
      this.U.u(!this.v);
      if (++this.j >= 20) {
         this.P();
         this.j = 0;
      }

      if (!this.U.s().isEmpty()) {
         this.E.method_14178().y(class01624.Z, new class07321(0, 0), 9);
         boolean flag = this.m();
         if (this.l && flag) {
            this.z();
            this.l = false;
         }

         if (this.w != null) {
            if (this.Y == null && flag) {
               this.w = null;
               this.M();
            }

            this.w.N(this.E, this, this.Y, this.k++, this.d);
         }

         if (!this.v) {
            if ((this.G == null || ++this.s >= 1200) && flag) {
               this.U();
               this.s = 0;
            }

            if (++this.b >= 100 && flag) {
               this.s();
               this.b = 0;
            }
         }
      } else {
         this.E.method_14178().L(class01624.Z, new class07321(0, 0), 9);
      }
   }

   public void M() {
      if (this.v && this.w == null) {
         class07209 class07209x = this.d;
         if (class07209x == null) {
            u.debug("Tried to respawn, but need to find the portal first.");
            class06653 class06653 = this.W();
            if (class06653 == null) {
               u.debug("Couldn't find a portal, so we made one.");
               this.N(true);
            } else {
               u.debug("Found the exit portal & saved its location for next time.");
            }

            class07209x = this.d;
         }

         ArrayList arraylist = Lists.newArrayList();
         class07209 class07209x = class07209x.method_10086(1);

         for (class07211 class07211 : class07221.field_11062) {
            List<class00676> list = this.E.N(class00676.class, new class00734(class07209x.method_10079(class07211, 2)));
            if (list.isEmpty()) {
               return;
            }

            arraylist.addAll(list);
         }

         u.debug("Found all crystals, respawning dragon.");
         this.N(arraylist);
      }
   }

   private void P() {
      HashSet hashset = Sets.newHashSet();

      for (class04770 class04770x : this.E.method_18766(this.z)) {
         this.U.N(class04770x);
         hashset.add(class04770x);
      }

      HashSet hashset1 = Sets.newHashSet(this.U.s());
      hashset1.removeAll(hashset);

      for (class04770 class04770 : hashset1) {
         this.U.y(class04770);
      }
   }

   private void T() {
      if (!this.m.isEmpty()) {
         int ix = (Integer)this.m.remove(this.m.size() - 1);
         int jx = class04995.N(96.0 * Math.cos(2.0 * (-Math.PI + (Math.PI / 20) * ix)));
         int kx = class04995.N(96.0 * Math.sin(2.0 * (-Math.PI + (Math.PI / 20) * ix)));
         this.N(new class07209(jx, 75, kx));
      }
   }

   public class07856(class04782 var1, long var2, class07826 var4) {
      this(var1, var2, var4, class07209.field_10980);
   }

   public class07856(class04782 var1, long var2, class07826 var4, class07209 var5) {
      super();
      this.E = var1;
      this.W = var5;
      this.z = class07042.N.and(class07042.N(var5.method_10263(), 128 + var5.method_10264(), var5.method_10260(), 192.0));
      this.l = var4.N();
      this.G = var4.i().orElse(null);
      this.v = var4.y();
      this.n = var4.L();
      if (var4.u()) {
         this.w = class07855.field_13097;
      }

      this.d = var4.R().orElse(null);
      this.m.addAll(var4.M().orElseGet(() -> {
         ObjectArrayList objectarraylist = new ObjectArrayList(ContiguousSet.create(Range.closedOpen(0, 20), DiscreteDomain.integers()));
         class07536.L(objectarraylist, class06069.y(var2));
         return objectarraylist;
      }));
      this.P = class06684.N()
         .N("       ", "       ", "       ", "   #   ", "       ", "       ", "       ")
         .N("       ", "       ", "       ", "   #   ", "       ", "       ", "       ")
         .N("       ", "       ", "       ", "   #   ", "       ", "       ", "       ")
         .N("  ###  ", " #   # ", "#     #", "#  #  #", "#     #", " #   # ", "  ###  ")
         .N("       ", "  ###  ", " ##### ", " ##### ", " ##### ", "  ###  ", "       ")
         .N('#', class06646.N(class06650.N(class00869.q)))
         .y();
      this.N(var1, var2, var4, var5, null);
   }

   public void B() {
      for (class01076 class01076 : class01058.N(this.E)) {
         for (class00676 class00676 : this.E.N(class00676.class, class01076.R())) {
            class00676.method_5684(false);
            class00676.N(null);
         }
      }
   }

   @Nullable
   public UUID Z() {
      return this.G;
   }

   public int i() {
      return this.T;
   }

   @Nullable
   private class00690 b() {
      this.E.method_8500(new class07209(this.W.method_10263(), 128 + this.W.method_10264(), this.W.method_10260()));
      class00690 class00690 = class07078.f.N(this.E, class06113.field_16467);
      if (class00690 != null) {
         class00690.N(this);
         class00690.N(this.W);
         class00690.W().N(class00702.N);
         class00690.method_5808(this.W.method_10263(), 128 + this.W.method_10264(), this.W.method_10260(), this.E.field_9229.z() * 360.0F, 0.0F);
         this.E.method_8649(class00690);
         this.G = class00690.method_5667();
      }

      return class00690;
   }

   private void s() {
      this.b = 0;
      this.T = 0;

      for (class01076 class01076 : class01058.N(this.E)) {
         this.T = this.T + this.E.N(class00676.class, class01076.R()).size();
      }

      u.debug("Found {} end crystals still alive", this.T);
   }

   private boolean m() {
      if (this.t) {
         return true;
      } else {
         class07321 class07321 = new class07321(this.W);

         for (int ix = -8 + class07321.B; ix <= 8 + class07321.B; ix++) {
            for (int jx = 8 + class07321.Z; jx <= 8 + class07321.Z; jx++) {
               class08050 class08050 = this.E.method_8402(ix, jx, class00549.m, false);
               if (!(class08050 instanceof class00570)) {
                  return false;
               }

               if (!((class00570)class08050).g().N(class04763.field_44856)) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   private void U() {
      List<? extends class00690> list = this.E.method_18776();
      if (list.isEmpty()) {
         u.debug("Haven't seen the dragon, respawning it");
         this.b();
      } else {
         u.debug("Haven't seen our dragon, but found another one to use.");
         this.G = list.get(0).method_5667();
      }
   }

   private void z() {
      u.info("Scanning for legacy world dragon fight...");
      boolean flag = this.E();
      if (flag) {
         u.info("Found that the dragon has been killed in this world already.");
         this.n = true;
      } else {
         u.info("Found that the dragon has not yet been killed in this world.");
         this.n = false;
         if (this.W() == null) {
            this.N(false);
         }
      }

      List<? extends class00690> list = this.E.method_18776();
      if (list.isEmpty()) {
         this.v = true;
      } else {
         class00690 class00690 = list.get(0);
         this.G = class00690.method_5667();
         u.info("Found that there's a dragon still alive ({})", class00690);
         this.v = false;
         if (!flag) {
            u.info("But we didn't have a portal, let's remove it.");
            class00690.method_31472();
            this.G = null;
         }
      }

      if (!this.n && this.v) {
         this.v = false;
      }
   }

   @Deprecated
   public void u() {
      this.m.clear();
   }

   public void y(class00690 var1) {
      if (var1.method_5667().equals(this.G)) {
         this.U.N(var1.method_6032() / var1.method_6063());
         this.s = 0;
         if (var1.method_16914()) {
            this.U.N(var1.method_5476());
         }
      }
   }

   public class07826 y() {
      return new class07826(this.l, this.v, this.n, false, Optional.ofNullable(this.G), Optional.ofNullable(this.d), Optional.of(this.m));
   }

   private boolean E() {
      for (int ix = -8; ix <= 8; ix++) {
         for (int jx = -8; jx <= 8; jx++) {
            Iterator<class00394> iterator = this.E.method_8497(ix, jx).o().values().iterator();

            while (iterator.hasNext()) {
               if (iterator.next() instanceof class07279) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   private void N(class04782 var1, long var2, class07826 var4, class07209 var5, CallbackInfo var6) {
      this.P.lithium$setRequiredBlock(class00869.q, 41);
   }

   private void N(List<class00676> var1) {
      if (this.v && this.w == null) {
         for (class06653 class06653 = this.W(); class06653 != null; class06653 = this.W()) {
            for (int ix = 0; ix < this.P.L(); ix++) {
               for (int jx = 0; jx < this.P.y(); jx++) {
                  for (int kx = 0; kx < this.P.N(); kx++) {
                     class06646 class06646 = class06653.N(ix, jx, kx);
                     if (class06646.N().N(class00869.q) || class06646.N().N(class00869.MW)) {
                        this.E.method_8501(class06646.u(), class00869.MP.W());
                     }
                  }
               }
            }
         }

         this.w = class07855.field_13097;
         this.k = 0;
         this.N(false);
         this.Y = var1;
      }
   }

   protected void N(class07855 var1) {
      if (this.w == null) {
         throw new IllegalStateException("Dragon respawn isn't in progress, can't skip ahead in the animation.");
      } else {
         this.k = 0;
         if (var1 == class07855.field_13099) {
            this.w = null;
            this.v = false;
            class00690 class00690 = this.b();
            if (class00690 != null) {
               for (class04770 class04770 : this.U.s()) {
                  class06912.P.N(class04770, class00690);
               }
            }
         } else {
            this.w = var1;
         }
      }
   }

   @Deprecated
   public void N() {
      this.t = true;
   }

   private void N(class07209 var1) {
      this.E.N(3000, var1, 0);
      this.E
         .method_30349()
         .method_46759(class04227.Nh)
         .flatMap(var0 -> var0.N(class03155.u))
         .ifPresent(var2 -> var2.N().N(this.E, this.E.method_14178().U(), class06069.u(), var1));
   }

   private void N(boolean var1) {
      class06403 class06403 = new class06403(var1);
      if (this.d == null) {
         this.d = this.E.N(class07830.field_13203, class06403.N(this.W)).method_10074();

         while (this.E.method_8320(this.d).N(class00869.q) && this.d.method_10264() > 63) {
            this.d = this.d.method_10074();
         }

         this.d = this.d.method_33096(Math.max(this.E.method_31607() + 1, this.d.method_10264()));
      }

      if (class06403.N(class06386.R, this.E, this.E.method_14178().U(), class06069.u(), this.d)) {
         int ix = class04995.R(4, 16);
         this.E.method_14178().L.N(new class07321(this.d), ix);
      }
   }

   public void N(class00676 var1, class07072 var2) {
      if (this.w != null && this.Y.contains(var1)) {
         u.debug("Aborting respawn sequence");
         this.w = null;
         this.k = 0;
         this.B();
         this.N(true);
      } else {
         this.s();
         class07049 class07049 = this.E.method_66347(this.G);
         if (class07049 instanceof class00690) {
            ((class00690)class07049).N(this.E, var1, var1.method_24515(), var2);
         }
      }
   }

   public void N(class00690 var1) {
      if (var1.method_5667().equals(this.G)) {
         this.U.N(0.0F);
         this.U.u(false);
         this.N(true);
         this.T();
         if (!this.n) {
            this.E.method_8501(this.E.N(class07830.field_13197, class06403.N(this.W)), class00869.Ms.W());
         }

         this.n = true;
         this.v = true;
      }
   }

   @Nullable
   private class06653 W() {
      class07321 class07321 = new class07321(this.W);

      for (int ix = -8 + class07321.B; ix <= 8 + class07321.B; ix++) {
         for (int jx = -8 + class07321.Z; jx <= 8 + class07321.Z; jx++) {
            class00570 class00570 = this.E.method_8497(ix, jx);

            for (class00394 class00394 : class00570.o().values()) {
               if (class00394 instanceof class07279) {
                  class06653 class06653x = this.P.N(this.E, class00394.d());
                  if (class06653x != null) {
                     class07209 class07209x = class06653x.N(3, 3, 3).u();
                     if (this.d == null) {
                        this.d = class07209x;
                     }

                     return class06653x;
                  }
               }
            }
         }
      }

      class07209 class07209 = class06403.N(this.W);
      int kx = this.E.N(class07830.field_13197, class07209).method_10264();

      for (int lx = kx; lx >= this.E.method_31607(); lx--) {
         class06653 class06653 = this.P.N(this.E, new class07209(class07209.method_10263(), lx, class07209.method_10260()));
         if (class06653 != null) {
            if (this.d == null) {
               this.d = class06653.N(3, 3, 3).u();
            }

            return class06653;
         }
      }

      return null;
   }

   public boolean R() {
      return this.n;
   }
}
