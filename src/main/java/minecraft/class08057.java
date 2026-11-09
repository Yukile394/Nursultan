package minecraft;

import Nursultan.class10869;
import Nursultan.class10871;
import com.google.common.collect.Lists;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.serialization.Codec;
import java.util.Iterator;
import java.util.List;
import net.caffeinemc.mods.lithium.common.world.listeners.WorldBorderListenerOnce;
import net.caffeinemc.mods.lithium.common.world.listeners.WorldBorderPositionListenerMulti;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class08057 extends class06555 {
   public static final double N = 5.999997E7F;
   public static final double y = 2.9999984E7;
   public static final Codec<class08057> L = class08074.y.xmap(class08057::new, class08074::new);
   public static final class08413<class08057> u = new class08413<>("world_border", class08057::new, L, class05715.field_62507);
   private final class08074 W;
   private boolean m;
   private final List<class08055> P;
   double i;
   double R;
   int M;
   int B;
   double Z;
   double z;
   public int U;
   class08067 E;
   private final WorldBorderPositionListenerMulti s = new WorldBorderPositionListenerMulti();

   public void L(double var1) {
      this.i = var1;
      this.method_80();
      Iterator<class08055> iterator = this.E().iterator();

      while (iterator.hasNext()) {
         iterator.next().method_11929(this, var1);
      }
   }

   public class06889 L(double var1, double var3, double var5) {
      return new class06889(class04995.N(var1, this.L(), this.i() - 1.0E-5F), var3, class04995.N(var5, this.u(), this.R() - 1.0E-5F));
   }

   public double L(float var1) {
      return this.E.y(var1);
   }

   public double L() {
      return this.N(0.0F);
   }

   public class06889 L(class06889 var1) {
      return this.L(var1.M, var1.B, var1.Z);
   }

   public void L(int var1) {
      this.B = var1;
      this.method_80();
      Iterator<class08055> iterator = this.E().iterator();

      while (iterator.hasNext()) {
         iterator.next().method_11933(this, var1);
      }
   }

   public void L(double var1, double var3) {
      this.Z = var1;
      this.z = var3;
      this.E.M();
      this.method_80();
      Iterator<class08055> iterator = this.E().iterator();

      while (iterator.hasNext()) {
         iterator.next().method_11930(this, var1, var3);
      }
   }

   public double M() {
      return this.Z;
   }

   public double P() {
      return this.i;
   }

   public int T() {
      return this.M;
   }

   public class08057() {
      this(class08074.N);
      this.N(null);
   }

   public class08057(class08074 var1) {
      super();
      this.P = Lists.newArrayList();
      this.i = 0.2;
      this.R = 5.0;
      this.M = 15;
      this.B = 5;
      this.U = 29999984;
      this.E = new class10869(this, 5.999997E7F);
      this.W = var1;
   }

   public double B() {
      return this.z;
   }

   public double Z() {
      return this.E.N();
   }

   public double i() {
      return this.L(0.0F);
   }

   public int b() {
      return this.B;
   }

   public double s() {
      return this.E.y();
   }

   public double m() {
      return this.R;
   }

   public void j() {
      class08067 class08067 = this.E;
      this.E = this.N(class08067, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 1, "[net.minecraft.class_2784$class_2785]");
         return ((class08067)var0[0]).B();
      });
   }

   public double U() {
      return this.E.u();
   }

   public long z() {
      return this.E.L();
   }

   public double u(float var1) {
      return this.E.u(var1);
   }

   public double u() {
      return this.y(0.0F);
   }

   public void y(int var1) {
      this.M = var1;
      this.method_80();
      Iterator<class08055> iterator = this.E().iterator();

      while (iterator.hasNext()) {
         iterator.next().method_11932(this, var1);
      }
   }

   public class07209 y(class07209 var1) {
      return this.y(var1.method_10263(), var1.method_10264(), var1.method_10260());
   }

   public void y(class08055 var1) {
      this.P.remove(var1);
   }

   public void y(double var1) {
      this.R = var1;
      this.method_80();
      Iterator<class08055> iterator = this.E().iterator();

      while (iterator.hasNext()) {
         iterator.next().method_11935(this, var1);
      }
   }

   public double y(float var1) {
      return this.E.L(var1);
   }

   public class07209 y(double var1, double var3, double var5) {
      return class07209.method_49638(this.L(var1, var3, var5));
   }

   public class08072 y() {
      return this.E.i();
   }

   public double y(double var1, double var3) {
      double d0 = var3 - this.u();
      double d1 = this.R() - var3;
      double d2 = var1 - this.L();
      double d3 = this.i() - var1;
      double d4 = Math.min(d2, d3);
      d4 = Math.min(d4, d0);
      return Math.min(d4, d1);
   }

   public class07209 y(class06889 var1) {
      return this.y(var1.N(), var1.y(), var1.L());
   }

   protected List<class08055> E() {
      return Lists.newArrayList(this.P);
   }

   public boolean N(class00734 var1) {
      return this.N(var1.N, var1.L, var1.u - 1.0E-5F, var1.R - 1.0E-5F);
   }

   public boolean N(class07321 var1) {
      return this.N(var1.i(), var1.R()) && this.N(var1.M(), var1.B());
   }

   private void N(CallbackInfo var1) {
      this.N(this.s);
   }

   private void N(class08055 var1, CallbackInfo var2) {
      if (var1 instanceof WorldBorderListenerOnce worldborderlisteneronce) {
         var2.cancel();
         this.s.add(worldborderlisteneronce);
      }
   }

   public class08067 N(class08067 var1, Operation var2) {
      class08067 class08067x = this.E;
      class08067 class08067x = (class08067)var2.call(new Object[]{var1});
      if (class08067x != class08067x) {
         this.s.onAreaReplaced(this);
      }

      return class08067x;
   }

   public boolean N(class07209 var1) {
      return this.N(var1.method_10263(), var1.method_10260());
   }

   public void N(long var1) {
      if (!this.m) {
         this.L(this.W.N(), this.W.y());
         this.L(this.W.L());
         this.y(this.W.u());
         this.L(this.W.i());
         this.y(this.W.R());
         if (this.W.B() > 0L) {
            this.N(this.W.M(), this.W.Z(), this.W.B(), var1);
         } else {
            this.N(this.W.M());
         }

         this.m = true;
      }
   }

   public boolean N(class06889 var1) {
      return this.N(var1.M, var1.Z);
   }

   public void N(double var1) {
      this.E = new class10869(this, var1);
      this.method_80();
      Iterator<class08055> iterator = this.E().iterator();

      while (iterator.hasNext()) {
         iterator.next().method_11934(this, var1);
      }
   }

   public boolean N(double var1, double var3) {
      return this.N(var1, var3, 0.0);
   }

   public boolean N(double var1, double var3, double var5) {
      return var1 >= this.L() - var5 && var1 < this.i() + var5 && var3 >= this.u() - var5 && var3 < this.R() + var5;
   }

   public double N(float var1) {
      return this.E.N(var1);
   }

   public boolean N(class07049 var1, class00734 var2) {
      double d0 = Math.max(class04995.N(var2.y(), var2.u()), 1.0);
      return this.N(var1) < d0 * 2.0 && this.N(var1.method_23317(), var1.method_23321(), d0);
   }

   public class00494 N() {
      return this.E.Z();
   }

   public void N(int var1) {
      this.U = var1;
      this.E.R();
   }

   private boolean N(double var1, double var3, double var5, double var7) {
      return this.N(var1, var3) && this.N(var5, var7);
   }

   public void N(class08055 var1) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         this.P.add(var1);
      }
   }

   public double N(class07049 var1) {
      return this.y(var1.method_23317(), var1.method_23321());
   }

   public void N(double var1, double var3, long var5, long var7) {
      this.E = (class08067)(var1 == var3 ? new class10869(this, var3) : new class10871(this, var1, var3, var5, var7));
      this.method_80();
      Iterator<class08055> iterator = this.E().iterator();

      while (iterator.hasNext()) {
         iterator.next().method_11931(this, var1, var3, var5, var7);
      }
   }

   public int W() {
      return this.U;
   }

   public double R() {
      return this.u(0.0F);
   }
}
