package minecraft;

import Nursultan.class10748;
import com.google.common.collect.Maps;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import net.caffeinemc.mods.lithium.common.entity.NavigatingEntity;
import net.caffeinemc.mods.lithium.common.world.ServerWorldExtended;
import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents.MobConversion;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class07079 extends class07438 implements class01956, class02607, class02665, NavigatingEntity {
   private static final class02131<Byte> N = class03289.N(class07079.class, class02154.N);
   private static final int y = 1;
   private static final int L = 2;
   private static final int u = 4;
   protected static final int j = 1;
   private static final class00753 i = new class00753(1, 0, 1);
   private static final List<class07085> R = List.of(class07085.field_6169, class07085.field_6174, class07085.field_6172, class07085.field_6166);
   public static final float v = 0.15F;
   public static final float n = 0.1087F;
   public static final float t = 3.0F;
   public static final float G = 0.55F;
   public static final float l = 0.5F;
   public static final float d = 0.25F;
   public static final int w = 2;
   private static final double B = Math.sqrt(2.04F) - 0.6F;
   private static final boolean Z = false;
   private static final boolean W = false;
   private static final boolean T = false;
   private static final boolean b = false;
   protected static final class01894 k = class01894.y("random_spawn_bonus");
   public static final String Y = "drop_chances";
   public static final String Q = "LeftHanded";
   public static final String O = "CanPickUpLoot";
   public static final String g = "NoAI";
   public int I;
   protected int J;
   protected class07442 o;
   protected class07458 q;
   protected class07440 K;
   private final class07472 c;
   protected class07623 V;
   protected final class07467 e;
   protected final class07467 H;
   @Nullable
   private class07438 X;
   private final class07626 a;
   private class08342 p = class08342.u;
   private boolean F = false;
   private boolean A = false;
   private final Map<class04425, Float> f = Maps.newEnumMap(class04425.class);
   private Optional<class05946<class05074>> C = Optional.empty();
   private long S;
   @Nullable
   private class02592 x;
   private class07209 D = class07209.field_10980;
   private int h = -1;
   private class07623 r;

   private class04162 L(class04782 var1) {
      return new class04160(var1).N(class06551.B, this.method_73189()).N(class06551.N, this).N(class06925.Z);
   }

   public boolean L(class07438 var1) {
      class06543 class06543 = this.method_76694().method_58694(class02484.I);
      double d0;
      double d1;
      if (class06543 == null) {
         d0 = B;
         d1 = 0.0;
      } else {
         d0 = class06543.y(this);
         d1 = class06543.N((class07049)this);
      }

      class00734 class00734 = var1.method_53510();
      return this.y(d0).L(class00734) && (d1 <= 0.0 || !this.y(d1).L(class00734));
   }

   public boolean L(class06584 var1) {
      return true;
   }

   public void L(boolean var1) {
      this.F = var1;
   }

   public boolean L(class07209 var1) {
      return this.h == -1 ? true : this.D.method_10262(var1) < this.h * this.h;
   }

   public boolean L(class08036 var1) {
      return !this.method_5782();
   }

   private boolean L(class06584 var1, class06584 var2, class07085 var3) {
      class03530<class06581> class03530 = this.NL();
      if (class03530 != null) {
         if (var2.N(class03530) && !var1.N(class03530)) {
            return false;
         }

         if (!var2.N(class03530) && var1.N(class03530)) {
            return true;
         }
      }

      double d0 = this.N(var1, class05298.u, var3);
      double d1 = this.N(var2, class05298.u, var3);
      return d0 != d1 ? d0 > d1 : this.N_68(var1, var2);
   }

   public void L(float var1) {
      super.fields_7212a028292fd3c078969e3ee4c71d9e8_0 = var1;
   }

   private boolean L(class07085 var1) {
      return this.method_6084(var1) && this.method_63623(this.method_6118(var1), var1);
   }

   public void Nd() {
      this.N(var0 -> true);
      this.method_18868().M();
   }

   public boolean Nl() {
      return (this.field_6011.N(N) & 4) != 0;
   }

   public boolean NP() {
      return this.L(this.method_24515());
   }

   public void X() {
   }

   @Nullable
   @Override
   public class07438 T() {
      return this.X;
   }

   @Override
   public int method_5850() {
      if (this.T() == null) {
         return this.method_56993(0.0F);
      } else {
         int ix = (int)(this.method_6032() - this.method_6063() * 0.33F);
         ix -= (3 - this.method_73183().y().N()) * 4;
         if (ix < 0) {
            ix = 0;
         }

         return this.method_56993(ix);
      }
   }

   @Override
   public boolean method_6034() {
      return super.method_6034() && !this.Nt();
   }

   @Nullable
   @Override
   public class06584 method_31480() {
      class06530 class06530 = class06530.N(this.method_5864());
      return class06530 == null ? null : new class06584(class06530);
   }

   @Override
   public final Optional<class05946<class05074>> method_5991() {
      return this.C.isPresent() ? this.C : super.method_5991();
   }

   @Override
   public void method_5982() {
      if (this.method_73183().y() == class07086.field_5801 && !this.method_5864().b()) {
         this.method_31472();
      } else if (!this.Nm() && !this.Nu()) {
         class08036 class08036 = this.method_73183().N(this, -1.0);
         if (class08036 != null) {
            double d0 = class08036.method_5858(this);
            int ix = this.method_5864().i().i();
            int jx = ix * ix;
            if (d0 > jx && this.N(d0)) {
               this.method_31472();
            }

            int kx = this.method_5864().i().R();
            int lx = kx * kx;
            if (super.fields_6212a028292fd3c078969e3ee4c71d9e8_2 > 600 && this.field_5974.y(800) == 0 && d0 > lx && this.N(d0)) {
               this.method_31472();
            } else if (d0 < lx) {
               super.fields_6212a028292fd3c078969e3ee4c71d9e8_2 = 0;
            }
         }
      } else {
         super.fields_6212a028292fd3c078969e3ee4c71d9e8_2 = 0;
      }
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(N, (byte)0);
   }

   @Override
   public void method_5670() {
      super.method_5670();
      class04643 class04643 = class08700.N();
      class04643.N("mobBaseTick");
      if (this.method_5805() && this.field_5974.y(1000) < this.I++) {
         this.W();
         this.D();
      }

      class04643.L();
   }

   @Override
   public void method_5773() {
      super.method_5773();
      if (!this.method_73183().method_8608() && this.field_6012 % 5 == 0) {
         this.r();
      }
   }

   @Nullable
   @Override
   public class07438 method_5642() {
      class07049 class07049 = this.method_31483();
      return !this.Nt() && class07049 instanceof class07079 class07079 && class07049.method_52534() ? class07079 : null;
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("CanPickUpLoot", this.method_5936());
      var1.N("PersistenceRequired", this.A);
      if (!this.p.equals(class08342.u)) {
         var1.N("drop_chances", class08342.i, this.p);
      }

      this.N(var1, this.x);
      if (this.Nj()) {
         var1.N("home_radius", this.h);
         var1.N("home_pos", class07209.field_25064, this.D);
      }

      var1.N("LeftHanded", this.NG());
      this.C.ifPresent(var1x -> var1.N("DeathLootTable", class05074.N, var1x));
      if (this.S != 0L) {
         var1.N("DeathLootTableSeed", this.S);
      }

      if (this.Nt()) {
         var1.N("NoAI", this.Nt());
      }
   }

   @Override
   public class07082 method_5688(class08036 var1, class07050 var2) {
      if (!this.method_5805()) {
         return class07082.i;
      } else {
         class07082 class07082x = this.N(this, var1, var2);
         if (class07082x.N()) {
            this.method_32875(class01194.b, var1);
            return class07082x;
         } else {
            class07082 class07082x = super.method_5688(var1, var2);
            if (class07082x != class07082.i) {
               return class07082x;
            } else {
               CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
               this.N(var1, var2, callbackinforeturnable);
               if (callbackinforeturnable.isCancelled()) {
                  return (class07082)callbackinforeturnable.getReturnValue();
               } else {
                  class07082x = this.N(var1, var2);
                  if (class07082x.N()) {
                     this.method_32875(class01194.b, var1);
                     return class07082x;
                  } else {
                     return class07082.i;
                  }
               }
            }
         }
      }
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.L(var1.N("CanPickUpLoot", false));
      this.A = var1.N("PersistenceRequired", false);
      this.p = var1.<class08342>N("drop_chances", class08342.i).orElse(class08342.u);
      this.N(var1);
      this.h = var1.N("home_radius", -1);
      if (this.h >= 0) {
         this.D = var1.<class07209>N("home_pos", class07209.field_25064).orElse(class07209.field_10980);
      }

      this.i(var1.N("LeftHanded", false));
      this.C = var1.N("DeathLootTable", class05074.N);
      this.S = var1.N("DeathLootTableSeed", 0L);
      this.u(var1.N("NoAI", false));
   }

   @Override
   public class07070 method_6068() {
      return this.NG() ? class07070.field_6182 : class07070.field_6183;
   }

   @Override
   public boolean method_5873(class07049 var1, boolean var2, boolean var3) {
      boolean flag = super.method_5873(var1, var2, var3);
      if (flag && this.g_()) {
         this.yU();
      }

      this.N(var1, var2, var3, null);
      return flag;
   }

   @Override
   public void method_5711(byte var1) {
      if (var1 == 20) {
         this.h();
      } else {
         super.method_5711(var1);
      }
   }

   @Override
   protected void method_30076() {
      super.method_30076();

      for (class07085 class07085 : class07085.field_54086) {
         class06584 class06584 = this.method_6118(class07085);
         if (!class06584.R()) {
            class06584.i(0);
         }
      }
   }

   public class07079(class07078<? extends class07079> var1, class07299 var2) {
      super(var1, var2);
      this.e = new class07467();
      this.H = new class07467();
      this.o = new class07442(this);
      this.q = new class07458(this);
      this.K = new class07440(this);
      this.c = this.Z_();
      this.V = this.N(var2);
      this.a = new class07626(this);
      if (var2 instanceof class04782) {
         this.l_();
      }
   }

   public class07626 C() {
      return this.a;
   }

   public void D() {
      this.method_56078(this.s());
   }

   public class07458 F() {
      class07049 class07049 = this.method_49694();
      return class07049 instanceof class07079 ? ((class07079)class07049).F() : this.q;
   }

   protected class07085 J() {
      return class07085.field_6169;
   }

   @Nullable
   protected final class07438 S() {
      return this.method_18868().L(class05378.s).orElse(null);
   }

   public void i(boolean var1) {
      byte b0 = this.field_6011.N(N);
      this.field_6011.N(N, var1 ? (byte)(b0 | 2) : (byte)(b0 & -3));
   }

   public void x() {
      this.method_32876(class01194.W);
   }

   @Nullable
   protected class04891 s() {
      return null;
   }

   protected boolean c() {
      return false;
   }

   public void h() {
      if (this.method_73183().method_8608()) {
         this.method_36549();
      } else {
         this.method_73183().method_8421(this, (byte)20);
      }
   }

   public class07623 f() {
      class07049 class07049 = this.method_49694();
      return class07049 instanceof class07079 ? ((class07079)class07049).f() : this.V;
   }

   private void l() {
      if (this.x != null) {
         this.x.i = 0.0;
      }
   }

   public void a() {
   }

   public class07442 p() {
      return this.o;
   }

   @Override
   public boolean g() {
      return !(this instanceof class07542);
   }

   private void v() {
      if (this.method_5805() && this.G()) {
         class07085 class07085 = this.J();
         class06584 class06584 = this.method_6118(class07085);
         if (!class06584.R()) {
            if (class06584.W()) {
               class06581 class06581 = class06584.B();
               class06584.y(class06584.P() + this.field_5974.y(2));
               if (class06584.P() >= class06584.s()) {
                  this.method_20235(class06581, class07085);
                  this.method_5673(class07085, class06584.E);
               }
            }
         } else {
            this.method_5639(8.0F);
         }
      }
   }

   public void u(boolean var1) {
      byte b0 = this.field_6011.N(N);
      this.field_6011.N(N, var1 ? (byte)(b0 | 1) : (byte)(b0 & -2));
   }

   public void u(class06584 var1) {
      this.N(class07085.field_48824, var1);
   }

   protected void r() {
      boolean flag = !(this.method_5642() instanceof class07079);
      boolean flag1 = !(this.method_5854() instanceof class00250);
      this.e.N(class07430.field_18405, flag);
      this.e.N(class07430.field_18407, flag && flag1);
      this.e.N(class07430.field_18406, flag);
   }

   public boolean y(class06584 var1) {
      return false;
   }

   private class07082 y(class08036 var1, class07050 var2) {
      class06584 class06584 = var1.method_5998(var2);
      if (class06584.N(class06570.lN)) {
         class07082 class07082 = class06584.N(var1, this, var2);
         if (class07082.N()) {
            return class07082;
         }
      }

      if (class06584.B() instanceof class06530 class06530) {
         if (this.method_73183() instanceof class04782) {
            Optional<class07079> optional = class06530.N(
               var1, this, (class07078<? extends class07079>)this.method_5864(), (class04782)this.method_73183(), this.method_73189(), class06584
            );
            optional.ifPresent(var2x -> this.N(var1, var2x));
            if (optional.isEmpty()) {
               return class07082.i;
            }
         }

         return class07082.y;
      } else {
         return class07082.i;
      }
   }

   public static boolean y(class07078<? extends class07079> var0, class07284 var1, class06113 var2, class07209 var3, class06069 var4) {
      class07209 class07209 = var3.method_10074();
      return class06113.N(var2) || var1.method_8320(class07209).N(var1, class07209, var0);
   }

   public boolean y(class04782 var1, class06584 var2) {
      return this.L(var2);
   }

   public void y_3(class04782 var1) {
      this.N(var1, var0 -> true);
   }

   public void y(@Nullable class07438 var1) {
      this.X = var1;
   }

   public void y(float var1) {
      super.fields_7212a028292fd3c078969e3ee4c71d9e8_1 = var1;
   }

   protected void y(class01001 var1, class06069 var2, class07052 var3) {
      this.N(var1, class07085.field_6173, var2, 0.25F, var3);
   }

   public void y(boolean var1) {
   }

   public class06695 y_6(class07085 var1) {
      return new class10748(this, var1);
   }

   protected class00734 y(double var1) {
      class07049 class07049 = this.method_5854();
      class00734 class00734xx;
      if (class07049 != null) {
         class00734 class00734x = class07049.method_5829();
         class00734 class00734xx = this.method_5829();
         class00734xx = new class00734(
            Math.min(class00734xx.N, class00734x.N),
            class00734xx.y,
            Math.min(class00734xx.L, class00734x.L),
            Math.max(class00734xx.u, class00734x.u),
            class00734xx.i,
            Math.max(class00734xx.R, class00734x.R)
         );
      } else {
         class00734xx = this.method_5829();
      }

      return class00734xx.L(var1, 0.0, var1);
   }

   private boolean y(class06584 var1, class06584 var2, class07085 var3) {
      if (class07323.N(var2, class02523.I)) {
         return false;
      } else {
         double d0 = this.N(var1, class05298.y, var3);
         double d1 = this.N(var2, class05298.y, var3);
         double d2 = this.N(var1, class05298.L, var3);
         double d3 = this.N(var2, class05298.L, var3);
         if (d0 != d1) {
            return d0 > d1;
         } else {
            return d2 != d3 ? d2 > d3 : this.N_68(var1, var2);
         }
      }
   }

   public class07440 A() {
      return this.K;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Nullable
   public static class06581 N(class07085 var0, int var1) {
      switch (var0) {
         case field_6169:
            if (var1 == 0) {
               return class06570.bi;
            } else if (var1 == 1) {
               return class06570.bZ;
            } else if (var1 == 2) {
               return class06570.bd;
            } else if (var1 == 3) {
               return class06570.bW;
            } else if (var1 == 4) {
               return class06570.bT;
            } else if (var1 == 5) {
               return class06570.bn;
            }
         case field_6174:
            if (var1 == 0) {
               return class06570.bR;
            } else if (var1 == 1) {
               return class06570.bz;
            } else if (var1 == 2) {
               return class06570.bw;
            } else if (var1 == 3) {
               return class06570.bm;
            } else if (var1 == 4) {
               return class06570.bb;
            } else if (var1 == 5) {
               return class06570.bt;
            }
         case field_6172:
            if (var1 == 0) {
               return class06570.bM;
            } else if (var1 == 1) {
               return class06570.bU;
            } else if (var1 == 2) {
               return class06570.bk;
            } else if (var1 == 3) {
               return class06570.bP;
            } else if (var1 == 4) {
               return class06570.bj;
            } else if (var1 == 5) {
               return class06570.bG;
            }
         case field_6166:
            if (var1 == 0) {
               return class06570.bB;
            } else if (var1 == 1) {
               return class06570.bE;
            } else if (var1 == 2) {
               return class06570.bY;
            } else if (var1 == 3) {
               return class06570.bs;
            } else if (var1 == 4) {
               return class06570.bv;
            } else if (var1 == 5) {
               return class06570.bl;
            }
         default:
            return null;
      }
   }

   protected void N(class01001 var1, class06069 var2, class07052 var3) {
      this.y(var1, var2, var3);

      for (class07085 class07085 : class07085.field_54086) {
         if (class07085.N() == class07043.field_6178) {
            this.N(var1, var2, class07085, var3);
         }
      }
   }

   protected class07082 N(class08036 var1, class07050 var2) {
      return class07082.i;
   }

   protected void N(class08036 var1, class07079 var2) {
   }

   private void N(class08036 var1, class07050 var2, CallbackInfoReturnable var3) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_5)) {
         class07082 class07082 = this.y(var1, var2);
         if (class07082.N()) {
            var3.setReturnValue(class07082);
         }
      }
   }

   @Override
   public void N(class07085 var1, float var2) {
      this.p = this.p.N(var1, var2);
   }

   protected void N(class01001 var1, class06069 var2, class07085 var3, class07052 var4) {
      this.N(var1, var3, var2, 0.5F, var4);
   }

   private void N(class01001 var1, class07085 var2, class06069 var3, float var4, class07052 var5) {
      class06584 class06584 = this.method_6118(var2);
      if (!class06584.R() && var3.z() < var4 * var5.u()) {
         class07323.N(class06584, var1.method_30349(), class02251.N, var5, var3);
         this.method_5673(var2, class06584);
      }
   }

   protected class07623 N(class07299 var1) {
      return new class07655(this, var1);
   }

   public void N(Predicate<class07473> var1) {
      this.e.N(var1);
   }

   public float N(class04425 var1) {
      class07079 class07079x;
      if (this.method_49694() instanceof class07079 class07079x && class07079x.c()) {
         class07079x = class07079x;
      } else {
         class07079x = this;
      }

      Float fx = class07079x.f.get(var1);
      return fx == null ? var1.N() : fx;
   }

   private void N(class07049 var1, boolean var2, boolean var3, CallbackInfoReturnable var4) {
      this.lithium$updateNavigationRegistration();
   }

   private class07049 N(class07049 var1, class08234 var2) {
      ((MobConversion)ServerLivingEntityEvents.MOB_CONVERSION.invoker()).onConversion(this, (class07079)var1, var2);
      return var1;
   }

   @Nullable
   public <T extends class07079> T N(class07078<T> var1, class08234 var2, class06113 var3, class08698<T> var4) {
      if (this.method_31481()) {
         return null;
      } else {
         class07079 class07079 = (class07079)var1.N(this.method_73183(), var3);
         if (class07079 == null) {
            return null;
         } else {
            var2.N().N(this, class07079, var2);
            var4.finalizeConversion(class07079);
            class07299 class07299 = this.method_73183();
            if (class07299 instanceof class04782) {
               ((class04782)class07299).method_8649(this.N(class07079, var2));
            }

            if (var2.N().N()) {
               this.method_31472();
            }

            return (T)class07079;
         }
      }
   }

   public void N(class07209 var1, int var2) {
      this.D = var1;
      this.h = var2;
   }

   public boolean N(class06889 var1) {
      return this.h == -1 ? true : this.D.method_19770(var1) < this.h * this.h;
   }

   protected void N(class08036 var1, class07050 var2, class06584 var3) {
      int ix = var3.c();
      class08197 class08197 = var3.method_58694(class02484.k);
      var3.N(1, var1);
      if (class08197 != null) {
         class06584 class06584 = class08197.N(var3, ix, var1.method_56992(), var1::method_64399);
         var1.method_6122(var2, class06584);
      }
   }

   public void N(class04425 var1, float var2) {
      this.f.put(var1, var2);
   }

   private class07082 N(class07079 var1, class08036 var2, class07050 var3) {
      return (class07082)(ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_5) ? class07082.u : this.y(var2, var3));
   }

   @Override
   public void N(@Nullable class02592 var1) {
      this.x = var1;
   }

   @Nullable
   public <T extends class07079> T N(class07078<T> var1, class08234 var2, class08698<T> var3) {
      return this.N(var1, var2, class06113.field_16468, var3);
   }

   public void N(class07085 var1, class06584 var2) {
      this.method_5673(var1, var2);
      this.N(var1);
      this.A = true;
   }

   public void N(class07049 var1, float var2, float var3) {
      double d0 = var1.method_23317() - this.method_23317();
      double d2 = var1.method_23321() - this.method_23321();
      double d1;
      if (var1 instanceof class07438 class07438) {
         d1 = class07438.method_23320() - this.method_23320();
      } else {
         d1 = (var1.method_5829().y + var1.method_5829().i) / 2.0 - this.method_23320();
      }

      double d3 = Math.sqrt(d0 * d0 + d2 * d2);
      float fx = (float)(class04995.u(d2, d0) * 180.0F / (float)Math.PI) - 90.0F;
      float f1 = (float)(-(class04995.u(d1, d3) * 180.0F / (float)Math.PI));
      this.method_36457(this.N(this.method_36455(), f1, var3));
      this.method_36456(this.N(this.method_36454(), fx, var2));
   }

   private float N(float var1, float var2, float var3) {
      float fx = class04995.R(var2 - var1);
      if (fx > var3) {
         fx = var3;
      }

      if (fx < -var3) {
         fx = -var3;
      }

      return var1 + fx;
   }

   public boolean N(class07284 var1, class06113 var2) {
      return true;
   }

   public boolean N(class05487 var1) {
      return !var1.u(this.method_5829()) && var1.method_8606(this);
   }

   public class06584 N_16(class04782 var1, class06584 var2) {
      class07085 class07085 = this.method_32326(var2);
      if (!this.method_63623(var2, class07085)) {
         return class06584.E;
      } else {
         class06584 class06584x = this.method_6118(class07085);
         boolean flag = this.N(var2, class06584x, class07085);
         if (class07085.i() && !flag) {
            class07085 = class07085.field_6173;
            class06584x = this.method_6118(class07085);
            flag = class06584x.R();
         }

         if (flag && this.L(var2)) {
            double d0 = this.p.y(class07085);
            if (!class06584x.R() && Math.max(this.field_5974.z() - 0.1F, 0.0F) < d0) {
               this.method_5775(var1, class06584x);
            }

            class06584 class06584x = class07085.N(var2);
            this.N(class07085, class06584x);
            return class06584x;
         } else {
            return class06584.E;
         }
      }
   }

   public boolean N(double var1) {
      return true;
   }

   protected void N(class04782 var1) {
   }

   public boolean N_68(class06584 var1, class06584 var2) {
      Set<Entry<class03556<class07304>>> set = var2.a_(class02484.P, class02710.N).y();
      Set<Entry<class03556<class07304>>> set1 = var1.a_(class02484.P, class02710.N).y();
      if (set1.size() != set.size()) {
         return set1.size() > set.size();
      } else {
         int ix = var1.P();
         int jx = var2.P();
         return ix != jx ? ix < jx : var1.L(class02484.B) && !var2.L(class02484.B);
      }
   }

   private double N(class06584 var1, class03556<class07468> var2, class07085 var3) {
      double d0 = this.method_6127().y(var2) ? this.method_45326(var2) : 0.0;
      return var1.a_(class02484.b, class02833.N).N(var2, d0, var3);
   }

   protected boolean N(class06584 var1, class06584 var2, class07085 var3) {
      if (var2.R()) {
         return true;
      } else if (var3.i()) {
         return this.y(var1, var2, var3);
      } else {
         return var3 == class07085.field_6173 ? this.L(var1, var2, var3) : false;
      }
   }

   public void N(class07085 var1) {
      this.p = this.p.N(var1);
   }

   protected void N(class04782 var1, class00717 var2) {
      class06584 class06584x = var2.N();
      class06584 class06584x = this.N_16(var1, class06584x.t());
      if (!class06584x.R()) {
         this.method_29499(var2);
         this.method_6103(var2, class06584x.c());
         class06584x.B(class06584x.c());
         if (class06584x.R()) {
            var2.method_31472();
         }
      }
   }

   public void N(class05946<class05074> var1, Map<class07085, Float> var2) {
      if (this.method_73183() instanceof class04782 class04782) {
         this.N(var1, this.L(class04782), var2);
      }
   }

   @Nullable
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      class06069 class06069 = var1.method_8409();
      class07469 class07469 = Objects.requireNonNull(this.method_5996(class05298.P));
      if (!class07469.y(k)) {
         class07469.u(new class07471(k, class06069.N(0.0, 0.11485000000000001), class07463.field_6330));
      }

      this.i(class06069.z() < 0.05F);
      return var4;
   }

   public void N(class02947 var1) {
      this.N(var1.N(), var1.y());
   }

   public Set<class07085> N(class04782 var1, Predicate<class06584> var2) {
      HashSet hashset = new HashSet();

      for (class07085 class07085 : class07085.field_54086) {
         class06584 class06584 = this.method_6118(class07085);
         if (!class06584.R()) {
            if (!var2.test(class06584)) {
               hashset.add(class07085);
            } else if (this.p.L(class07085)) {
               this.method_5673(class07085, class06584.E);
               this.method_5775(var1, class06584);
            }
         }
      }

      return hashset;
   }

   protected void N(class06069 var1, class07052 var2) {
      if (var1.z() < 0.15F * var2.u()) {
         int ix = var1.y(3);

         for (int jx = 1; jx <= 3.0F; jx++) {
            if (var1.z() < 0.1087F) {
               ix++;
            }
         }

         float fx = this.method_73183().y() == class07086.field_5807 ? 0.1F : 0.25F;
         boolean flag = true;

         for (class07085 class07085 : R) {
            class06584 class06584 = this.method_6118(class07085);
            if (!flag && var1.z() < fx) {
               break;
            }

            flag = false;
            if (class06584.R()) {
               class06581 class06581 = N(class07085, ix);
               if (class06581 != null) {
                  this.method_5673(class07085, new class06584(class06581));
               }
            }
         }
      }
   }

   public void N(float var1) {
      super.fields_7212a028292fd3c078969e3ee4c71d9e8_2 = var1;
   }

   private void W() {
      this.I = -this.m_();
   }

   public void R(boolean var1) {
      byte b0 = this.field_6011.N(N);
      this.field_6011.N(N, var1 ? (byte)(b0 | 4) : (byte)(b0 & -5));
   }

   public boolean R(int var1) {
      return false;
   }

   public int NT() {
      return this.h;
   }

   public int Ni() {
      return 40;
   }

   public boolean Nu() {
      return this.method_5765();
   }

   public static class05300 H() {
      return class07438.method_26827().N(class05298.P, 16.0);
   }

   public boolean Nz() {
      return this.L(class07085.field_55946);
   }

   private boolean G() {
      if (!this.method_73183().method_8608() && this.method_73183().method_75728().N(class00608.a, this.method_73189())) {
         float fx = this.method_5718();
         class07209 class07209 = class07209.method_49637(this.method_23317(), this.method_23320(), this.method_23321());
         boolean flag = this.method_5721() || this.field_27857 || this.field_28628;
         if (fx > 0.5F && this.field_5974.z() * 30.0F < (fx - 0.4F) * 2.0F && !flag && this.method_73183().N_17(class07209)) {
            return true;
         }
      }

      return false;
   }

   public boolean Nm() {
      return this.A;
   }

   public class06584 NZ() {
      return this.method_6118(class07085.field_48824);
   }

   public int NR() {
      return 75;
   }

   public int NB() {
      return 10;
   }

   @Override
   public void method_74589(class04782 var1, class06990 var2) {
      var2.N(class00429.R, () -> {
         class00143 class00143 = this.f().Z();
         return class00143 != null && class00143.U() != null ? new class00450(class00143.m(), this.f().T()) : null;
      });
      var2.N(class00429.i, () -> {
         Set<class05764> set = this.e.y();
         ArrayList arraylist = new ArrayList(set.size());
         set.forEach(var1x -> arraylist.add(new class00452(var1x.Z(), var1x.M(), var1x.U().getClass().getSimpleName())));
         return new class00432(arraylist);
      });
      if (!super.fields_12212a028292fd3c078969e3ee4c71d9e8_1.Z()) {
         var2.N(class00429.L, () -> class00434.N(var1, this));
      }
   }

   public int m_() {
      return 80;
   }

   protected class07472 Z_() {
      return new class07472(this);
   }

   protected void l_() {
   }

   public int n_() {
      return 4;
   }

   public float K_() {
      return 1.0F;
   }

   @Nullable
   public class03530<class06581> NL() {
      return null;
   }

   public void NN() {
      this.f().W();
      this.L(0.0F);
      this.y(0.0F);
      this.method_6125(0.0F);
      this.method_18800(0.0, 0.0, 0.0);
      this.l();
   }

   protected void NM() {
      float fx = this.NR();
      float f1 = this.method_5791();
      float f2 = class04995.R(super.fields_4212a028292fd3c078969e3ee4c71d9e8_0 - f1);
      float f3 = class04995.N(class04995.R(super.fields_4212a028292fd3c078969e3ee4c71d9e8_0 - f1), -fx, fx);
      float f4 = f1 + f2 - f3;
      this.method_5847(f4);
   }

   public void Nb() {
      this.h = -1;
   }

   public boolean NG() {
      return (this.field_6011.N(N) & 2) != 0;
   }

   public boolean Nt() {
      return (this.field_6011.N(N) & 1) != 0;
   }

   public class08342 NE() {
      return this.p;
   }

   @Override
   public void Nv() {
      if (this.S_() == null) {
         this.Nb();
      }
   }

   public class07209 Ns() {
      return this.D;
   }

   public boolean NU() {
      return this.L(class07085.field_48824);
   }

   @Nullable
   @Override
   public class02592 S_() {
      return this.x;
   }

   public void NW() {
      this.A = true;
   }

   @Override
   public void Nn() {
      class02607.super.Nn();
      this.e.N(class07430.field_18405);
   }

   protected class00753 Ny() {
      return i;
   }

   public boolean Nj() {
      return this.h != -1;
   }

   public class07623 lithium$getRegisteredNavigation() {
      return this.r;
   }

   public boolean lithium$isRegisteredToWorld() {
      return this.r != null;
   }

   @Override
   public long method_51851() {
      return this.S;
   }

   @Override
   public int method_6110(class04782 var1) {
      if (this.J > 0) {
         int ix = this.J;

         for (class07085 class07085 : class07085.field_54086) {
            if (class07085.R() && !this.method_6118(class07085).R() && this.p.y(class07085) <= 1.0F) {
               ix += 1 + this.field_5974.y(3);
            }
         }

         return ix;
      } else {
         return this.J;
      }
   }

   @Override
   public void method_6031(float var1) {
      this.c.N();
   }

   @Override
   public void method_6007() {
      super.method_6007();
      if (this.method_5864().N(class01217.i)) {
         this.v();
      }

      class04643 class04643 = class08700.N();
      class04643.N("looting");
      if (this.method_73183() instanceof class04782 class04782
         && this.method_5936()
         && this.method_5805()
         && !super.fields_6212a028292fd3c078969e3ee4c71d9e8_1
         && class04782.method_64395().N(class07305.I)) {
         class00753 class00753 = this.Ny();

         for (class00717 class00717 : this.method_73183()
            .N(class00717.class, this.method_5829().L(class00753.method_10263(), class00753.method_10264(), class00753.method_10260()))) {
            if (!class00717.method_31481() && !class00717.N().R() && !class00717.R() && this.y(class04782, class00717.N())) {
               this.N(class04782, class00717);
            }
         }
      }

      class04643.L();
   }

   @Override
   public void method_6125(float var1) {
      super.method_6125(var1);
      this.N(var1);
   }

   @Override
   public boolean method_6121(class04782 var1, class07049 var2) {
      float fx = (float)this.method_45325(class05298.u);
      class06584 class06584 = this.method_59958();
      class07072 class07072 = class06584.N(this, () -> this.method_48923().y((class07438)this));
      fx = class07323.N(var1, class06584, var2, class07072, fx);
      fx += class06584.B().N(var2, fx, class07072);
      class06889 class06889 = var2.method_18798();
      boolean flag = var2.method_64397(var1, class07072, fx);
      if (flag) {
         this.method_75122(var2, this.method_59924(var2, class07072), class06889);
         if (var2 instanceof class07438 class07438) {
            class06584.N(class07438, this);
         }

         class07323.N(var1, var2, class07072);
         this.method_6114(var2);
         this.method_59928();
      }

      this.method_75125();
      return flag;
   }

   @Override
   public final void method_6023() {
      super.fields_6212a028292fd3c078969e3ee4c71d9e8_2 = super.fields_6212a028292fd3c078969e3ee4c71d9e8_2 + 1;
      class04643 class04643 = class08700.N();
      class04643.N("sensing");
      this.a.N();
      class04643.L();
      if ((this.field_6012 + this.method_5628()) % 2 != 0 && this.field_6012 > 1) {
         class04643.N("targetSelector");
         this.H.N(false);
         class04643.L();
         class04643.N("goalSelector");
         this.e.N(false);
         class04643.L();
      } else {
         class04643.N("targetSelector");
         this.H.N();
         class04643.L();
         class04643.N("goalSelector");
         this.e.N();
         class04643.L();
      }

      class04643.N("navigation");
      this.V.N();
      class04643.L();
      class04643.N("mob tick");
      this.N((class04782)this.method_73183());
      class04643.L();
      class04643.N("controls");
      class04643.N("move");
      this.q.N();
      class04643.y("look");
      this.o.N();
      class04643.y("jump");
      this.K.N();
      class04643.L();
      class04643.L();
   }

   @Override
   public void method_16077(class04782 var1, class07072 var2, boolean var3) {
      super.method_16077(var1, var2, var3);
      this.C = Optional.empty();
   }

   @Override
   public void method_6013(class07072 var1) {
      this.W();
      super.method_6013(var1);
   }

   @Override
   public void method_52540(class03556<class07468> var1) {
      super.method_52540(var1);
      if (var1.N(class05298.P) || var1.N(class05298.J)) {
         this.f().i();
      }
   }

   @Override
   public boolean method_63626(class07085 var1) {
      return this.method_5936();
   }

   @Override
   public boolean method_5973(class07078<?> var1) {
      return var1 != class07078.NB;
   }

   @Override
   public void method_6010(class03530<class04651> var1) {
      if (this.f().s()) {
         super.method_6010(var1);
      } else {
         this.method_18799(this.method_18798().y(0.0, 0.3, 0.0));
      }
   }

   @Override
   public void method_6099(class04782 var1, class07072 var2, boolean var3) {
      super.method_6099(var1, var2, var3);

      for (class07085 class07085 : class07085.field_54086) {
         class06584 class06584 = this.method_6118(class07085);
         float fx = this.p.y(class07085);
         if (fx != 0.0F) {
            boolean flag = this.p.L(class07085);
            if (var2.u() instanceof class07438 class07438) {
               class07299 class07299 = this.method_73183();
               if (class07299 instanceof class04782) {
                  fx = class07323.N((class04782)class07299, class07438, var2, fx);
               }
            }

            if (!class06584.R() && !class07323.N(class06584, class02523.g) && (var3 || flag) && this.field_5974.z() < fx) {
               if (!flag && class06584.W()) {
                  class06584.y(class06584.s() - this.field_5974.y(1 + this.field_5974.y(Math.max(class06584.s() - 3, 1))));
               }

               this.method_5775(var1, class06584);
               this.method_5673(class07085, class06584.E);
            }
         }
      }
   }

   @Override
   public boolean method_5936() {
      return this.F;
   }

   public void lithium$updateNavigationRegistration() {
      if (this.lithium$isRegisteredToWorld()) {
         class07623 class07623 = this.f();
         if (this.r != class07623) {
            ((ServerWorldExtended)this.method_73183()).lithium$setNavigationInactive(this);
            this.r = class07623;
            if (class07623.Z() != null) {
               ((ServerWorldExtended)this.method_73183()).lithium$setNavigationActive(this);
            }
         }
      }
   }

   public void lithium$setRegisteredToWorld(class07623 var1) {
      this.r = var1;
   }
}
