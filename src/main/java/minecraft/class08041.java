package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiPredicate;
import net.fabricmc.fabric.impl.content.registry.VillagerInteractionRegistriesImpl;
import net.fabricmc.fabric.mixin.content.registry.VillagerAccessor;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class08041 extends class06171 implements class01329, class05645, VillagerAccessor {
   private static final Logger B = LogUtils.getLogger();
   private static final class02131<class05666> Z = class03289.N(class08041.class, class02154.v);
   public static final int N = 12;
   public static Map<class06581, Integer> y = ImmutableMap.of(class06570.bu, 4, class06570.Gj, 1, class06570.Gb, 1, class06570.lw, 1);
   private static final int X = 2;
   private static final int a = 10;
   private static final int p = 1200;
   private static final int F = 24000;
   private static final int A = 10;
   private static final int f = 5;
   private static final long C = 24000L;
   public static final float L = 0.5F;
   private static final int S = 0;
   private static final byte x = 0;
   private static final int D = 0;
   private static final int h = 0;
   private static final int r = 0;
   private static final boolean NN = false;
   private int Ny;
   private boolean NL;
   @Nullable
   private class08036 NE;
   private boolean NW;
   private int Nm = 0;
   private final class05774 NP = new class05774();
   private long Ns;
   private long NT = 0L;
   private int Nb = 0;
   private long Nj = 0L;
   private int Nv = 0;
   private long Nn;
   private boolean Nt = false;
   private static final ImmutableList<class05378<?>> NG = ImmutableList.of(
      class05378.y,
      class05378.L,
      class05378.u,
      class05378.i,
      class05378.M,
      class05378.B,
      class05378.Z,
      class05378.z,
      class05378.U,
      class05378.E,
      class05378.H,
      class05378.yN,
      new class05378[]{
         class05378.m,
         class05378.P,
         class05378.b,
         class05378.j,
         class05378.n,
         class05378.G,
         class05378.l,
         class05378.d,
         class05378.w,
         class05378.Y,
         class05378.R,
         class05378.O,
         class05378.g,
         class05378.I,
         class05378.q,
         class05378.K,
         class05378.V,
         class05378.J
      }
   );
   private static final ImmutableList<class05340<? extends class05355<? super class08041>>> Nl = ImmutableList.of(
      class05340.L, class05340.u, class05340.y, class05340.i, class05340.R, class05340.M, class05340.B, class05340.Z, class05340.z
   );
   public static final Map<class05378<class06289>, BiPredicate<class08041, class03556<class05369>>> u = ImmutableMap.of(
      class05378.y,
      (BiPredicate<class08041, class03556>)(var0, var1) -> var1.N(class03927.m),
      class05378.L,
      (BiPredicate<class08041, class03556>)(var0, var1) -> var0.t().y().N().y().test(var1),
      class05378.u,
      (BiPredicate<class08041, class03556>)(var0, var1) -> class05672.N.test(var1),
      class05378.i,
      (BiPredicate<class08041, class03556>)(var0, var1) -> var1.N(class03927.P)
   );

   public boolean w() {
      return this.NX() >= 24;
   }

   public void L(class04782 var1) {
      class01289<class08041> class01289 = this.method_18868();
      class01289.y(var1, this);
      super.fields_12212a028292fd3c078969e3ee4c71d9e8_1 = class01289.B();
      this.N(this.method_18868());
   }

   private void L(class07049 var1) {
      if (this.method_73183() instanceof class04782 class04782) {
         Optional<class04051> optional = super.fields_12212a028292fd3c078969e3ee4c71d9e8_1.L(class05378.B);
         if (!optional.isEmpty()) {
            optional.get().y(class01329.class::isInstance).forEach(var2x -> class04782.method_19496(class05354.u, var1, (class01329)var2x));
         }
      }
   }

   private boolean No() {
      return this.Nv == 0 || this.Nv < 2 && this.method_73183().N() > this.Nj + 2400L;
   }

   @Override
   protected void M() {
      super.M();
      if (this.method_73183() instanceof class04782) {
         this.L((class04782)this.method_73183());
      }
   }

   public boolean Q() {
      return this.n().N_60(var0 -> var0.N(class01226.LB));
   }

   @Override
   protected void method_66649(class02666 var1) {
      this.method_66650(var1, class02484.NQ);
      super.method_66649(var1);
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(Z, G());
   }

   @Override
   public void method_5773() {
      super.method_5773();
      if (this.I() > 0) {
         this.M(this.I() - 1);
      }

      this.Na();
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("VillagerData", class05666.L, this.t());
      var1.N("FoodLevel", (byte)this.Nm);
      var1.N("Gossips", class05774.N, this.NP);
      var1.N("Xp", this.Nb);
      var1.N("LastRestock", this.Nj);
      var1.N("LastGossipDecay", this.NT);
      var1.N("RestocksToday", this.Nv);
      if (this.Nt) {
         var1.N("AssignProfessionWhenSpawned", true);
      }
   }

   @Nullable
   @Override
   public <T> T method_58694(class02477<? extends T> var1) {
      return var1 == class02484.NQ ? method_66651(var1, this.t().N()) : super.method_58694(var1);
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.field_6011.N(Z, var1.<class05666>N("VillagerData", class05666.L).orElseGet(class08041::G));
      this.Nm = var1.N("FoodLevel", (byte)0);
      this.NP.L();
      var1.<class05774>N("Gossips", class05774.N).ifPresent(this.NP::N);
      this.Nb = var1.N("Xp", 0);
      this.Nj = var1.N("LastRestock", 0L);
      this.NT = var1.N("LastGossipDecay", 0L);
      if (this.method_73183() instanceof class04782) {
         this.L((class04782)this.method_73183());
      }

      this.Nv = var1.N("RestocksToday", 0);
      this.Nt = var1.N("AssignProfessionWhenSpawned", false);
   }

   @Override
   public void method_5800(class04782 var1, class00672 var2) {
      if (var1.y() != class07086.field_5801) {
         B.info("Villager {} was struck by lightning {}.", this, var2);
         if (this.N(class07078.yp, class08234.N(this, false, false), var2x -> {
            var2x.N(var1, var1.method_8404(var2x.method_24515()), class06113.field_16468, null);
            var2x.NW();
            this.NV();
         }) == null) {
            super.method_5800(var1, var2);
         }
      } else {
         super.method_5800(var1, var2);
      }
   }

   @Override
   public void method_5711(byte var1) {
      if (var1 == 12) {
         this.N(class07107.f);
      } else if (var1 == 13) {
         this.N(class07107.N);
      } else if (var1 == 14) {
         this.N(class07107.F);
      } else if (var1 == 42) {
         this.N(class07107.NT);
      } else {
         super.method_5711(var1);
      }
   }

   @Override
   protected class00392 method_23315() {
      return this.t().y().N().N();
   }

   public class08041(class07078<? extends class08041> var1, class07299 var2) {
      this(var1, var2, class05660.L);
   }

   public class08041(class07078<? extends class08041> var1, class07299 var2, class03556<class05660> var3) {
      super(var1, var2);
      this.f().y(true);
      this.f().N(true);
      this.f().N(48.0F);
      this.L(true);
      this.N(this.t().N(var3).y(var2.method_30349(), class05672.y));
   }

   public class08041(class07078<? extends class08041> var1, class07299 var2, class05946<class05660> var3) {
      this(var1, var2, var2.method_30349().i(var3));
   }

   private void B(int var1) {
      this.Nm -= var1;
   }

   public static class05300 B() {
      return class07079.H().N(class05298.l, 0.5);
   }

   @Override
   protected void i(class04782 var1) {
      class05666 class05666 = this.t();
      class05946<class05672> class05946 = class05666.y().i().orElse(null);
      if (class05946 != null) {
         Int2ObjectMap<class05663[]> int2objectmap;
         if (this.method_73183().method_45162().y(class03794.y)) {
            Int2ObjectMap<class05663[]> int2objectmap1 = class05649.L.get(class05946);
            int2objectmap = int2objectmap1 != null ? int2objectmap1 : class05649.N.get(class05946);
         } else {
            int2objectmap = class05649.N.get(class05946);
         }

         if (int2objectmap != null && !int2objectmap.isEmpty()) {
            class05663[] aclass05663 = (class05663[])int2objectmap.get(class05666.L());
            if (aclass05663 != null) {
               class07316 class07316 = this.y();
               this.N(var1, class07316, aclass05663, 2);
               if (class07529.NR && class05666.L() < int2objectmap.size()) {
                  this.R(var1);
               }
            }
         }
      }
   }

   private void i(class08036 var1) {
      this.R(var1);
      this.N(var1);
      this.N(var1, this.method_5476(), this.t().L());
   }

   @Nullable
   @Override
   protected class04891 s() {
      if (this.method_6113()) {
         return null;
      } else {
         return this.o() ? class04909.gs : class04909.gU;
      }
   }

   @Override
   public void l() {
      this.method_56078(this.t().y().N().R());
   }

   public void d() {
      this.NH();
      this.B(12);
   }

   @Override
   public boolean m() {
      return true;
   }

   @Override
   public class05666 t() {
      return this.field_6011.N(Z);
   }

   @Override
   public void v() {
      this.NK();
      Iterator<class07324> iterator = this.y().iterator();

      while (iterator.hasNext()) {
         iterator.next().z();
      }

      this.NI();
      this.Nj = this.method_73183().N();
      this.Nv++;
   }

   @Override
   public boolean q() {
      return this.Nm + this.NX() >= 12 && !this.method_6113() && this.K() == 0;
   }

   @Override
   public int u() {
      return this.Nb;
   }

   public boolean u(class04782 var1) {
      long i = this.Nj + 12000L;
      long j = this.method_73183().N();
      boolean flag = j > i;
      long k = var1.method_75003();
      flag |= this.Nn > 0L && k > this.Nn;
      this.Nn = k;
      if (flag) {
         this.Nj = j;
         this.Np();
      }

      return this.No() && this.NJ();
   }

   public int u(class08036 var1) {
      return this.NP.N(var1.method_5667(), var0 -> true);
   }

   public void y(int var1) {
      this.Nb = var1;
   }

   private boolean y(long var1) {
      return super.fields_12212a028292fd3c078969e3ee4c71d9e8_1.L(class05378.q).filter(var2 -> var1 - var2 < 24000L).isPresent();
   }

   public void y(class07316 var1) {
      this.R = var1;
   }

   @Override
   public boolean y(class04782 var1, class06584 var2) {
      class06581 class06581 = var2.B();
      class03530<class06581> class03530 = class01226.LZ;
      return (this.N(var2, class03530, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 2, "[net.minecraft.class_1799, net.minecraft.class_6862]");
         return ((class06584)var0[0]).N((class03530<class06581>)var0[1]);
      }) || this.t().y().N().u().contains(class06581)) && this.n().L(var2);
   }

   @Override
   protected void y(class07324 var1) {
      int i = 3 + this.field_5974.y(4);
      this.Nb = this.Nb + var1.T();
      this.NE = this.N();
      if (this.Nc()) {
         this.Ny = 40;
         this.NL = true;
         i += 5;
      }

      if (var1.n()) {
         this.method_73183().method_8649(new class07057(this.method_73183(), this.method_23317(), this.method_23318() + 0.5, this.method_23321(), i));
      }
   }

   public boolean E() {
      return this.Nt;
   }

   @Override
   public void N(class05354 var1, class07049 var2) {
      if (var1 == class05354.N) {
         this.NP.N(var2.method_5667(), class05346.field_18427, 20);
         this.NP.N(var2.method_5667(), class05346.field_18426, 25);
      } else if (var1 == class05354.i) {
         this.NP.N(var2.method_5667(), class05346.field_18428, 2);
      } else if (var1 == class05354.L) {
         this.NP.N(var2.method_5667(), class05346.field_18425, 25);
      } else if (var1 == class05354.u) {
         this.NP.N(var2.method_5667(), class05346.field_18424, 25);
      }
   }

   public void N(class04782 var1, class08041 var2, long var3) {
      if ((var3 < this.Ns || var3 >= this.Ns + 1200L) && (var3 < var2.Ns || var3 >= var2.Ns + 1200L)) {
         this.NP.N(var2.NP, this.field_5974, 10);
         this.Ns = var3;
         var2.Ns = var3;
         this.N(var1, var3, 5);
      }
   }

   public void N(class04782 var1, long var2, int var4) {
      if (this.N(var2)) {
         class00734 class00734 = this.method_5829().L(10.0, 10.0, 10.0);
         List<class08041> list = var1.N(class08041.class, class00734);
         if (list.stream().filter(var2x -> var2x.N(var2)).limit(5L).toList().size() >= var4) {
            if (!class04011.N(class07078.Nn, class06113.field_16471, var1, this.method_24515(), 10, 8, 6, class04000.N, false).isEmpty()) {
               list.forEach(class05708::y);
            }
         }
      }
   }

   public boolean N(long var1) {
      return !this.y(this.method_73183().N()) ? false : !super.fields_12212a028292fd3c078969e3ee4c71d9e8_1.N(class05378.J);
   }

   private boolean N(class06584 var1, class03530 var2, Operation var3) {
      return VillagerInteractionRegistriesImpl.getCollectableRegistry().contains(var1.B()) || (Boolean)var3.call(new Object[]{var1, var2});
   }

   public void N(class05774 var1) {
      this.NP.N(var1);
   }

   private void N(class01289<class08041> var1) {
      class03556<class05672> class03556 = this.t().y();
      if (this.method_6109()) {
         var1.N(class00608.A);
         var1.N(class05359.u, class05772.N(0.5F));
      } else {
         var1.N(class00608.F);
         var1.N(class05359.L, class05772.y(class03556, 0.5F), ImmutableSet.of(Pair.of(class05378.L, class05367.field_18456)));
      }

      var1.N(class05359.N, class05772.N(class03556, 0.5F));
      var1.N(class05359.R, class05772.u(class03556, 0.5F), ImmutableSet.of(Pair.of(class05378.i, class05367.field_18456)));
      var1.N(class05359.i, class05772.L(class03556, 0.5F));
      var1.N(class05359.y, class05772.i(class03556, 0.5F));
      var1.N(class05359.M, class05772.R(class03556, 0.5F));
      var1.N(class05359.Z, class05772.M(class03556, 0.5F));
      var1.N(class05359.B, class05772.B(class03556, 0.5F));
      var1.N(class05359.z, class05772.Z(class03556, 0.5F));
      var1.N(ImmutableSet.of(class05359.N));
      var1.y(class05359.y);
      var1.N(class05359.y);
      var1.N(this.method_73183().method_75728(), this.method_73183().N(), this.method_73189());
   }

   @Nullable
   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      if (var3 == class06113.field_16466) {
         this.N(this.t().y(var1.method_30349(), class05672.y));
      }

      if (var3 == class06113.field_16462 || var3 == class06113.field_16465 || class06113.N(var3) || var3 == class06113.field_16470) {
         this.N(this.t().N(var1.method_30349(), class05660.N(var1.i(this.method_24515()))));
      }

      if (var3 == class06113.field_16474) {
         this.Nt = true;
      }

      return super.N(var1, var2, var3, var4);
   }

   @Override
   public class07082 N(class08036 var1, class07050 var2) {
      if (var1.method_5998(var2).N(class06570.tW) || !this.method_5805() || this.o() || this.method_6113()) {
         return super.N(var1, var2);
      } else if (this.method_6109()) {
         this.NO();
         return class07082.N;
      } else {
         if (!this.method_73183().method_8608()) {
            boolean flag = this.y().isEmpty();
            if (var2 == class07050.field_5808) {
               if (flag) {
                  this.NO();
               }

               var1.method_7281(class01235.C);
            }

            if (flag) {
               return class07082.L;
            }

            this.i(var1);
         }

         return class07082.N;
      }
   }

   @Override
   public void N(class05666 var1) {
      if (!this.t().y().equals(var1.y())) {
         this.R = null;
      }

      this.field_6011.N(Z, var1);
   }

   public void N(class05378<class06289> var1) {
      if (this.method_73183() instanceof class04782) {
         class02796 class02796 = ((class04782)this.method_73183()).method_8503();
         super.fields_12212a028292fd3c078969e3ee4c71d9e8_1.<class06289>L(var1).ifPresent(var3 -> {
            class04782 class04782 = class02796.N(var3.N());
            if (class04782 != null) {
               class05368 class05368 = class04782.method_19494();
               Optional<class03556<class05369>> optional = class05368.L(var3.y());
               BiPredicate<class08041, class03556<class05369>> bipredicate = u.get(var1);
               if (optional.isPresent() && bipredicate.test(this, optional.get())) {
                  class05368.y(var3.y());
                  class04782.method_74535().y(var3.y());
               }
            }
         });
      }
   }

   @Override
   public void N(@Nullable class08036 var1) {
      boolean flag = this.N() != null && var1 == null;
      super.N(var1);
      if (flag) {
         this.W();
      }
   }

   @Override
   public boolean N(double var1) {
      return false;
   }

   @Override
   protected void N(class04782 var1) {
      class04643 class04643 = class08700.N();
      class04643.N("villagerBrain");
      this.method_18868().N(var1, this);
      class04643.L();
      if (this.Nt) {
         this.Nt = false;
      }

      if (!this.o() && this.Ny > 0) {
         this.Ny--;
         if (this.Ny <= 0) {
            if (this.NL) {
               this.R(var1);
               this.NL = false;
            }

            this.method_6092(new class07055(class07047.z, 200, 0));
         }
      }

      if (this.NE != null) {
         var1.method_19496(class05354.i, this.NE, this);
         var1.method_8421(this, (byte)14);
         this.NE = null;
      }

      if (!this.Nt() && this.field_5974.y(100) == 0) {
         class04877 class04877 = var1.method_19502(this.method_24515());
         if (class04877 != null && class04877.T() && !class04877.N()) {
            var1.method_8421(this, (byte)42);
         }
      }

      if (this.t().y().N(class05672.y) && this.o()) {
         this.W();
      }

      super.N(var1);
   }

   @Nullable
   public class08041 y(class04782 var1, class07077 var2) {
      double d0 = this.field_5974.U();
      class03556<class05660> class03556;
      if (d0 < 0.5) {
         class03556 = var1.method_30349().i(class05660.N(var1.i(this.method_24515())));
      } else if (d0 < 0.75) {
         class03556 = this.t().N();
      } else {
         class03556 = ((class08041)var2).t().N();
      }

      class08041 class08041 = new class08041(class07078.ye, var1, class03556);
      class08041.N(var1, var1.method_8404(class08041.method_24515()), class06113.field_16466, null);
      return class08041;
   }

   @Override
   protected void N(class04782 var1, class00717 var2) {
      class04391.N(var1, this, this, var2);
   }

   @Override
   protected void W() {
      super.W();
      this.Ng();
   }

   private void R(class08036 var1) {
      int i = this.u(var1);
      if (i != 0) {
         for (class07324 class07324x : this.y()) {
            class07324x.N(-class04995.y(i * class07324x.s()));
         }
      }

      if (var1.method_6059(class07047.I)) {
         class07055 class07055 = var1.method_6112(class07047.I);
         int k = class07055.i();

         for (class07324 class07324 : this.y()) {
            int j = (int)Math.floor((0.3 + 0.0625 * k) * class07324.N().c());
            class07324.N(-Math.max(j, 1));
         }
      }
   }

   private void R(class04782 var1) {
      this.N(this.t().N(this.t().L() + 1));
      this.i(var1);
   }

   public class05774 O() {
      return this.NP;
   }

   public static class05666 G() {
      return new class05666(class04206.l.y(class05660.L), class04206.d.y(class05672.y), 1);
   }

   public boolean Y() {
      return this.NX() < 12;
   }

   private void NO() {
      this.M(40);
      if (!this.method_73183().method_8608()) {
         this.method_56078(class04909.gP);
      }
   }

   @Override
   protected <T> boolean method_66654(class02477<T> var1, T var2) {
      if (var1 == class02484.NQ) {
         class03556<class05660> class03556 = method_66651(class02484.NQ, var2);
         this.N(this.t().N(class03556));
         return true;
      } else {
         return super.method_66654(var1, var2);
      }
   }

   private void NK() {
      Iterator<class07324> iterator = this.y().iterator();

      while (iterator.hasNext()) {
         iterator.next().M();
      }
   }

   private void NH() {
      if (this.Ne() && this.NX() != 0) {
         for (int i = 0; i < this.n().method_5439(); i++) {
            class06584 class06584 = this.n().method_5438(i);
            if (!class06584.R()) {
               Integer integer = y.get(class06584.B());
               if (integer != null) {
                  for (int j = class06584.c(); j > 0; j--) {
                     this.Nm = this.Nm + integer;
                     this.n().method_5434(i, 1);
                     if (!this.Ne()) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   private boolean Nc() {
      int i = this.t().L();
      return class05666.u(i) && this.Nb >= class05666.L(i);
   }

   private void Np() {
      this.Nq();
      this.Nv = 0;
   }

   private boolean Ne() {
      return this.Nm < 12;
   }

   private int NX() {
      class07075 class07075 = this.n();
      return y.entrySet().stream().mapToInt(var1x -> class07075.N_61(var1x.getKey()) * var1x.getValue()).sum();
   }

   private void Ng() {
      if (!this.method_73183().method_8608()) {
         Iterator<class07324> iterator = this.y().iterator();

         while (iterator.hasNext()) {
            iterator.next().m();
         }
      }
   }

   private boolean NJ() {
      Iterator<class07324> iterator = this.y().iterator();

      while (iterator.hasNext()) {
         if (iterator.next().v()) {
            return true;
         }
      }

      return false;
   }

   private void NI() {
      class07316 class07316 = this.y();
      class08036 class08036 = this.N();
      if (class08036 != null && !class07316.isEmpty()) {
         class08036.method_17354(((class07482)class08036.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).b, class07316, this.t().L(), this.u(), this.i(), this.m());
      }
   }

   private void NV() {
      this.N(class05378.y);
      this.N(class05378.L);
      this.N(class05378.u);
      this.N(class05378.i);
   }

   private void Nq() {
      int i = 2 - this.Nv;
      if (i > 0) {
         Iterator<class07324> iterator = this.y().iterator();

         while (iterator.hasNext()) {
            iterator.next().z();
         }
      }

      for (int j = 0; j < i; j++) {
         this.NK();
      }

      this.NI();
   }

   private void Na() {
      long i = this.method_73183().N();
      if (this.NT == 0L) {
         this.NT = i;
      } else if (i >= this.NT + 24000L) {
         this.NP.y();
         this.NT = i;
      }
   }

   @Override
   public class05781<class08041> method_28306() {
      return class01289.N(NG, Nl);
   }

   @Override
   public class04891 method_6002() {
      return class04909.gW;
   }

   @Override
   public class01289<class08041> method_18868() {
      return (class01289<class08041>)super.method_18868();
   }

   @Override
   public void method_18403(class07209 var1) {
      super.method_18403(var1);
      super.fields_12212a028292fd3c078969e3ee4c71d9e8_1.N(class05378.q, this.method_73183().N());
      super.fields_12212a028292fd3c078969e3ee4c71d9e8_1.y(class05378.m);
      super.fields_12212a028292fd3c078969e3ee4c71d9e8_1.y(class05378.I);
   }

   @Override
   public void method_6015(@Nullable class07438 var1) {
      if (var1 != null && this.method_73183() instanceof class04782) {
         ((class04782)this.method_73183()).method_19496(class05354.L, var1, this);
         if (this.method_5805() && var1 instanceof class08036) {
            this.method_73183().method_8421(this, (byte)13);
         }
      }

      super.method_6015(var1);
   }

   @Override
   public void method_6078(class07072 var1) {
      B.info("Villager {} died, message: '{}'", this, var1.N(this).getString());
      class07049 class07049 = var1.u();
      if (class07049 != null) {
         this.L(class07049);
      }

      this.NV();
      super.method_6078(var1);
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.gm;
   }

   @Override
   public void method_18400() {
      super.method_18400();
      super.fields_12212a028292fd3c078969e3ee4c71d9e8_1.N(class05378.K, this.method_73183().N());
   }

   @Override
   public class01289<?> method_18867(Dynamic<?> var1) {
      class01289<class08041> class01289 = this.method_28306().N(var1);
      this.N(class01289);
      return class01289;
   }
}
