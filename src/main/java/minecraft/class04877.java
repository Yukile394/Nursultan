package minecraft;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class04877 {
   public static final class02875 N = class07448.N(class07078.yB);
   public static final MapCodec<class04877> y = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            Codec.BOOL.fieldOf("started").forGetter(var0x -> var0x.O),
            Codec.BOOL.fieldOf("active").forGetter(var0x -> var0x.J),
            Codec.LONG.fieldOf("ticks_active").forGetter(var0x -> var0x.Y),
            Codec.INT.fieldOf("raid_omen_level").forGetter(var0x -> var0x.I),
            Codec.INT.fieldOf("groups_spawned").forGetter(var0x -> var0x.o),
            Codec.INT.fieldOf("cooldown_ticks").forGetter(var0x -> var0x.V),
            Codec.INT.fieldOf("post_raid_ticks").forGetter(var0x -> var0x.K),
            Codec.FLOAT.fieldOf("total_health").forGetter(var0x -> var0x.g),
            Codec.INT.fieldOf("group_count").forGetter(var0x -> var0x.H),
            class04875.field_56440.fieldOf("status").forGetter(var0x -> var0x.c),
            class07209.field_25064.fieldOf("center").forGetter(var0x -> var0x.Q),
            class01487.y.fieldOf("heroes_of_the_village").forGetter(var0x -> var0x.k)
         )
         .apply(var0, class04877::new)
   );
   private static final int Z = 7;
   private static final int z = 2;
   private static final int U = 32;
   private static final int E = 48000;
   private static final int W = 5;
   private static final class00392 m = class00392.L("block.minecraft.ominous_banner");
   private static final String P = "event.minecraft.raid.raiders_remaining";
   public static final int L = 16;
   private static final int s = 40;
   private static final int T = 300;
   public static final int u = 2400;
   public static final int i = 600;
   private static final int b = 30;
   public static final int R = 5;
   private static final int j = 2;
   private static final class00392 v = class00392.L("event.minecraft.raid");
   private static final class00392 n = class00392.L("event.minecraft.raid.victory.full");
   private static final class00392 t = class00392.L("event.minecraft.raid.defeat.full");
   private static final int G = 48000;
   private static final int l = 96;
   public static final int M = 9216;
   public static final int B = 12544;
   private final Map<Integer, class04882> d = Maps.newHashMap();
   private final Map<Integer, Set<class04882>> w = Maps.newHashMap();
   private final Set<UUID> k = Sets.newHashSet();
   private long Y;
   private class07209 Q;
   private boolean O;
   private float g;
   private int I;
   private boolean J;
   private int o;
   private final class04774 q = new class04774(v, class06685.field_5784, class06702.field_5791);
   private int K;
   private int V;
   private final class06069 e = class06069.u();
   private final int H;
   private class04875 c;
   private int X;
   private Optional<class07209> a = Optional.empty();
   private boolean p;

   private boolean w() {
      return this.V == 0 && (this.o < this.H || this.d()) && this.P() == 0;
   }

   private void L(class04782 var1) {
      class01296.N(class01296.N(this.Q), 2)
         .filter(var1::method_20588)
         .map(class01296::U)
         .min(Comparator.comparingDouble(var1x -> var1x.method_10262(this.Q)))
         .ifPresent(this::N);
   }

   public boolean L() {
      return this.o > 0;
   }

   public void L(int var1) {
      this.d.remove(var1);
   }

   public float M() {
      return this.g;
   }

   public int P() {
      return this.w.values().stream().mapToInt(Set::size).sum();
   }

   public boolean T() {
      return this.J;
   }

   public class04877(class07209 var1, class07086 var2) {
      super();
      this.J = true;
      this.V = 300;
      this.q.N(0.0F);
      this.Q = var1;
      this.H = this.N(var2);
      this.c = class04875.field_19026;
   }

   private class04877(
      boolean var1, boolean var2, long var3, int var5, int var6, int var7, int var8, float var9, int var10, class04875 var11, class07209 var12, Set<UUID> var13
   ) {
      super();
      this.O = var1;
      this.J = var2;
      this.Y = var3;
      this.I = var5;
      this.o = var6;
      this.V = var7;
      this.K = var8;
      this.g = var9;
      this.Q = var12;
      this.H = var10;
      this.c = var11;
      this.k.addAll(var13);
   }

   public Set<class04882> B() {
      HashSet hashset = Sets.newHashSet();

      for (Set<class04882> set : this.w.values()) {
         hashset.addAll(set);
      }

      return hashset;
   }

   public boolean Z() {
      return this.O;
   }

   private void i(class04782 var1) {
      Iterator<Set<class04882>> iterator = this.w.values().iterator();
      HashSet hashset = Sets.newHashSet();

      while (iterator.hasNext()) {
         Set<class04882> set = iterator.next();

         for (class04882 class04882x : set) {
            class07209 class07209 = class04882x.method_24515();
            if (class04882x.method_31481() || class04882x.method_73183().method_27983() != var1.method_27983() || this.Q.method_10262(class07209) >= 12544.0) {
               hashset.add(class04882x);
            } else if (class04882x.field_6012 > 600) {
               if (var1.method_66347(class04882x.method_5667()) == null) {
                  hashset.add(class04882x);
               }

               if (!var1.method_19500(class07209) && class04882x.method_6131() > 2400) {
                  class04882x.y(class04882x.NI() + 1);
               }

               if (class04882x.NI() >= 30) {
                  hashset.add(class04882x);
               }
            }
         }
      }

      for (class04882 class04882x : hashset) {
         this.N(var1, class04882x, true);
         if (class04882x.Q()) {
            this.L(class04882x.NO());
         }
      }
   }

   public boolean i() {
      return this.c == class04875.field_19027;
   }

   public float b() {
      int ix = this.E();
      if (ix == 2) {
         return 0.1F;
      } else if (ix == 3) {
         return 0.25F;
      } else if (ix == 4) {
         return 0.5F;
      } else {
         return ix == 5 ? 0.75F : 0.0F;
      }
   }

   public class07209 s() {
      return this.Q;
   }

   private boolean n() {
      return this.G() ? !this.l() : !this.t();
   }

   private boolean l() {
      return this.z() > this.H;
   }

   private boolean d() {
      return this.t() && this.P() == 0 && this.G();
   }

   public float m() {
      float f = 0.0F;
      Iterator<Set<class04882>> iterator = this.w.values().iterator();

      while (iterator.hasNext()) {
         for (class04882 class04882 : iterator.next()) {
            f += class04882.method_6032();
         }
      }

      return f;
   }

   private boolean t() {
      return this.z() == this.H;
   }

   private Predicate<class04770> v() {
      return var1 -> {
         class07209 class07209 = var1.method_24515();
         return var1.method_5805() && var1.method_51469().method_19502(class07209) == this;
      };
   }

   public void j() {
      this.p = true;
   }

   public int U() {
      return 5;
   }

   public int z() {
      return this.o;
   }

   public boolean u() {
      return this.c == class04875.field_19029;
   }

   private Optional<class07209> u(class04782 var1) {
      class07209 class07209 = this.N(var1, 8);
      return class07209 != null ? Optional.of(class07209) : Optional.empty();
   }

   private void y(class04782 var1, class07209 var2) {
      boolean flag = false;
      int ix = this.o + 1;
      this.g = 0.0F;
      class07052 class07052 = var1.method_8404(var2);
      boolean flag1 = this.d();

      for (class04847 class04847 : class04847.field_16636) {
         int jx = this.N(class04847, ix, flag1) + this.N(class04847, this.e, ix, class07052, flag1);
         int kx = 0;

         for (int lx = 0; lx < jx; lx++) {
            class04882 class04882x = class04847.field_16629.N(var1, class06113.field_16467);
            if (class04882x == null) {
               break;
            }

            if (!flag && class04882x.v()) {
               class04882x.M(true);
               this.N(ix, class04882x);
               flag = true;
            }

            this.N(var1, ix, class04882x, var2, false);
            if (class04847.field_16629 == class07078.yB) {
               class04882 class04882x = null;
               if (ix == this.N(class07086.field_5802)) {
                  class04882x = class07078.yy.N(var1, class06113.field_16467);
               } else if (ix >= this.N(class07086.field_5807)) {
                  if (kx == 0) {
                     class04882x = class07078.x.N(var1, class06113.field_16467);
                  } else {
                     class04882x = class07078.yH.N(var1, class06113.field_16467);
                  }
               }

               kx++;
               if (class04882x != null) {
                  this.N(var1, ix, class04882x, var2, false);
                  class04882x.method_5725(var2, 0.0F, 0.0F);
                  class04882x.method_5873(class04882x, false, false);
               }
            }
         }
      }

      this.a = Optional.empty();
      this.o++;
      this.j();
      this.R(var1);
   }

   private void y(class04782 var1) {
      HashSet hashset = Sets.newHashSet(this.q.s());
      List<class04770> list = var1.method_18766(this.v());

      for (class04770 class04770x : list) {
         if (!hashset.contains(class04770x)) {
            this.q.N(class04770x);
         }
      }

      for (class04770 class04770x : hashset) {
         if (!list.contains(class04770x)) {
            this.q.y(class04770x);
         }
      }
   }

   @Nullable
   public class04882 y(int var1) {
      return this.d.get(var1);
   }

   public boolean y() {
      return this.L() && this.P() == 0 && this.V > 0;
   }

   public int E() {
      return this.I;
   }

   public void N(class07049 var1) {
      this.k.add(var1.method_5667());
   }

   private void N(CallbackInfo var1) {
      if (this.p) {
         this.q.N(class04995.N(this.m() / this.g, 0.0F, 1.0F));
         this.p = false;
      }
   }

   public boolean N() {
      return this.i() || this.R();
   }

   @Nullable
   private class07209 N(class04782 var1, int var2) {
      int ix = this.V / 20;
      float f = 0.22F * ix - 0.24F;
      class07218 class07218 = new class07218();
      float f1 = var1.field_9229.z() * (float) (Math.PI * 2);

      for (int i1 = 0; i1 < var2; i1++) {
         float f2 = f1 + (float) Math.PI * i1 / 8.0F;
         int jx = this.Q.method_10263() + class04995.y(class04995.P(f2) * 32.0F * f) + var1.field_9229.y(3) * class04995.y(f);
         int lx = this.Q.method_10260() + class04995.y(class04995.m(f2) * 32.0F * f) + var1.field_9229.y(3) * class04995.y(f);
         int kx = var1.method_8624(class07830.field_13202, jx, lx);
         if (class04995.N(kx - this.Q.method_10264()) <= 96) {
            class07218.N(jx, kx, lx);
            if (!var1.method_19500(class07218) || ix <= 7) {
               byte b0 = 10;
               if (var1.N(class07218.method_10263() - 10, class07218.method_10260() - 10, class07218.method_10263() + 10, class07218.method_10260() + 10)
                  && var1.method_37118(class07218)
                  && (
                     N.isSpawnPositionOk(var1, class07218, class07078.yB)
                        || var1.method_8320(class07218.method_10074()).N(class00869.is) && var1.method_8320(class07218).P()
                  )) {
                  return class07218;
               }
            }
         }
      }

      return null;
   }

   public void N(class04782 var1, int var2, class04882 var3, @Nullable class07209 var4, boolean var5) {
      if (this.N(var1, var2, var3)) {
         var3.N(this);
         var3.N(var2);
         var3.Z(true);
         var3.y(0);
         if (!var5 && var4 != null) {
            var3.method_5814(var4.method_10263() + 0.5, var4.method_10264() + 1.0, var4.method_10260() + 0.5);
            var3.N(var1, var1.method_8404(var4), class06113.field_16467, null);
            var3.N(var1, var2, false);
            var3.method_24830(true);
            var1.y(var3);
         }
      }
   }

   private boolean N(class04782 var1, int var2, class04882 var3) {
      return this.N(var1, var2, var3, true);
   }

   public boolean N(class04782 var1, int var2, class04882 var3, boolean var4) {
      this.w.computeIfAbsent(var2, var0 -> Sets.newHashSet());
      Set<class04882> set = this.w.get(var2);
      class04882 class04882x = null;

      for (class04882 class04882x : set) {
         if (class04882x.method_5667().equals(var3.method_5667())) {
            class04882x = class04882x;
            break;
         }
      }

      if (class04882x != null) {
         set.remove(class04882x);
         set.add(var3);
      }

      set.add(var3);
      if (var4) {
         this.g = this.g + var3.method_6032();
      }

      this.j();
      this.R(var1);
      return true;
   }

   private void N(class04782 var1, class07209 var2) {
      float f = 13.0F;
      byte b0 = 64;
      Collection<class04770> collection = this.q.s();
      long ix = this.e.B();

      for (class04770 class04770 : var1.method_18456()) {
         class06889 class06889x = class04770.method_73189();
         class06889 class06889x = class06889.y(var2);
         double d0 = Math.sqrt(
            (class06889x.M - class06889x.M) * (class06889x.M - class06889x.M) + (class06889x.Z - class06889x.Z) * (class06889x.Z - class06889x.Z)
         );
         double d1 = class06889x.M + 13.0 / d0 * (class06889x.M - class06889x.M);
         double d2 = class06889x.Z + 13.0 / d0 * (class06889x.Z - class06889x.Z);
         if (d0 <= 64.0 || collection.contains(class04770)) {
            class04770.field_13987.method_14364(new class08073(class04909.lc, class04911.field_15254, d1, class04770.method_23318(), d2, 64.0F, 1.0F, ix));
         }
      }
   }

   public void N(class04782 var1, class04882 var2, boolean var3) {
      Set<class04882> set = this.w.get(var2.NO());
      if (set != null && set.remove(var2)) {
         if (var3) {
            this.g = this.g - var2.method_6032();
         }

         var2.N(null);
         this.j();
         this.R(var1);
      }
   }

   public void N(class04782 var1) {
      this.N(null);
      if (!this.u()) {
         if (this.c == class04875.field_19026) {
            boolean flag = this.J;
            this.J = var1.E(this.Q);
            if (var1.y() == class07086.field_5801) {
               this.W();
               return;
            }

            if (flag != this.J) {
               this.q.u(this.J);
            }

            if (!this.J) {
               return;
            }

            if (!var1.method_19500(this.Q)) {
               this.L(var1);
            }

            if (!var1.method_19500(this.Q)) {
               if (this.o > 0) {
                  this.c = class04875.field_19028;
               } else {
                  this.W();
               }
            }

            this.Y++;
            if (this.Y >= 48000L) {
               this.W();
               return;
            }

            int ix = this.P();
            if (ix == 0 && this.n()) {
               if (this.V <= 0) {
                  if (this.V == 0 && this.o > 0) {
                     this.V = 300;
                     this.q.N(v);
                     return;
                  }
               } else {
                  boolean flag1 = this.a.isPresent();
                  boolean flag2 = !flag1 && this.V % 5 == 0;
                  if (flag1 && !var1.method_37118(this.a.get())) {
                     flag2 = true;
                  }

                  if (flag2) {
                     this.a = this.u(var1);
                  }

                  if (this.V == 300 || this.V % 20 == 0) {
                     this.y(var1);
                  }

                  this.V--;
                  this.q.N(class04995.N((300 - this.V) / 300.0F, 0.0F, 1.0F));
               }
            }

            if (this.Y % 20L == 0L) {
               this.y(var1);
               this.i(var1);
               if (ix > 0) {
                  if (ix <= 2) {
                     this.q.N(v.L().i(" - ").y(class00392.N("event.minecraft.raid.raiders_remaining", ix)));
                  } else {
                     this.q.N(v);
                  }
               } else {
                  this.q.N(v);
               }
            }

            if (class07529.f) {
               this.q
                  .N(
                     v.L()
                        .i(" wave: ")
                        .i(this.o + "")
                        .y(class05220.l)
                        .i("Raiders alive: ")
                        .i(this.P() + "")
                        .y(class05220.l)
                        .i(this.m() + "")
                        .i(" / ")
                        .i(this.g + "")
                        .i(" Is bonus? ")
                        .i((this.G() && this.l()) + "")
                        .i(" Status: ")
                        .i(this.c.method_15434())
                  );
            }

            boolean flag3 = false;
            int jx = 0;

            while (this.w()) {
               class07209 var6 = this.a.orElseGet(() -> this.N(var1, 20));
               if (var6 != null) {
                  this.O = true;
                  this.y(var1, var6);
                  if (!flag3) {
                     this.N(var1, var6);
                     flag3 = true;
                  }
               } else {
                  jx++;
               }

               if (jx > 5) {
                  this.W();
                  break;
               }
            }

            if (this.Z() && !this.n() && ix == 0) {
               if (this.K < 40) {
                  this.K++;
               } else {
                  this.c = class04875.field_19027;

                  for (UUID uuid : this.k) {
                     class07049 class07049 = var1.method_66347(uuid);
                     if (class07049 instanceof class07438 class07438 && !class07049.method_7325()) {
                        class07438.method_6092(new class07055(class07047.I, 48000, this.I - 1, false, false, true));
                        if (class07438 instanceof class04770 class04770) {
                           class04770.method_7281(class01235.NO);
                           class06912.K.N(class04770);
                        }
                     }
                  }
               }
            }

            this.R(var1);
         } else if (this.N()) {
            this.X++;
            if (this.X >= 600) {
               this.W();
               return;
            }

            if (this.X % 20 == 0) {
               this.y(var1);
               this.q.u(true);
               if (this.i()) {
                  this.q.N(0.0F);
                  this.q.N(n);
               } else {
                  this.q.N(t);
               }
            }
         }
      }
   }

   public static class06584 N(class02055<class00412> var0) {
      class06584 class06584 = new class06584(class06570.li);
      class02708 class02708 = new class02701()
         .N(var0, class04444.w, class06563.field_7955)
         .N(var0, class04444.R, class06563.field_7967)
         .N(var0, class04444.z, class06563.field_7944)
         .N(var0, class04444.g, class06563.field_7967)
         .N(var0, class04444.U, class06563.field_7963)
         .N(var0, class04444.Y, class06563.field_7967)
         .N(var0, class04444.d, class06563.field_7967)
         .N(var0, class04444.g, class06563.field_7963)
         .N();
      class06584.N(class02484.Nv, class02708);
      class06584.N(class02484.v, class08562.L.N(class02484.Nv, true));
      class06584.N(class02484.U, m);
      class06584.N(class02484.m, class06495.field_8907);
      return class06584;
   }

   private void N(class07209 var1) {
      this.Q = var1;
   }

   private int N(class04847 var1, int var2, boolean var3) {
      return var3 ? var1.field_16628[this.H] : var1.field_16628[var2];
   }

   private int N(class04847 var1, class06069 var2, int var3, class07052 var4, boolean var5) {
      class07086 class07086 = var4.N();
      boolean flag = class07086 == class07086.field_5805;
      boolean flag1 = class07086 == class07086.field_5802;
      int ix;
      switch (var1) {
         case field_16631:
         case field_16633:
            if (flag) {
               ix = var2.y(2);
            } else if (flag1) {
               ix = 1;
            } else {
               ix = 2;
            }
            break;
         case field_16634:
         default:
            return 0;
         case field_16635:
            if (flag || var3 <= 2 || var3 == 4) {
               return 0;
            }

            ix = 1;
            break;
         case field_16630:
            ix = !flag && var5 ? 1 : 0;
      }

      return ix > 0 ? var2.y(ix + 1) : 0;
   }

   public void N(int var1) {
      this.I = var1;
   }

   public int N(class07086 var1) {
      return switch (var1) {
         case field_5801 -> 0;
         case field_5805 -> 3;
         case field_5802 -> 5;
         case field_5807 -> 7;
      };
   }

   public void N(int var1, class04882 var2) {
      this.d.put(var1, var2);
      var2.method_5673(class07085.field_6169, N(var2.method_56673().L(class04227.NF)));
      var2.N(class07085.field_6169, 2.0F);
   }

   public boolean N(class04770 var1) {
      class07055 class07055 = var1.method_6112(class07047.q);
      if (class07055 == null) {
         return false;
      } else {
         this.I = this.I + class07055.i() + 1;
         this.I = class04995.N(this.I, 0, this.U());
         if (!this.L()) {
            var1.method_7281(class01235.NQ);
            class06912.V.N(var1);
         }

         return true;
      }
   }

   public void W() {
      this.J = false;
      this.q.z();
      this.c = class04875.field_19029;
   }

   private void R(class04782 var1) {
      var1.method_19495().method_80();
   }

   public boolean R() {
      return this.c == class04875.field_19028;
   }

   private boolean G() {
      return this.I > 1;
   }
}
