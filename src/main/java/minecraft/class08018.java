package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.EnumSet;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public class class08018 extends class08004 implements class05645 {
   private static final class02131<Boolean> N = class03289.N(class08018.class, class02154.U);
   private static final class02131<class05666> y = class03289.N(class08018.class, class02154.v);
   private static final int M = 3600;
   private static final int B = 6000;
   private static final int Z = 14;
   private static final int W = 4;
   private static final int T = -1;
   private static final int b = 0;
   private static final Set<class06113> X = EnumSet.of(
      class06113.field_52444, class06113.field_52445, class06113.field_16468, class06113.field_16465, class06113.field_16469, class06113.field_47245
   );
   private int a;
   @Nullable
   private UUID p;
   @Nullable
   private class05774 F;
   @Nullable
   private class07316 A;
   private int f = 0;

   @Override
   protected void method_66649(class02666 var1) {
      this.method_66650(var1, class02484.NQ);
      super.method_66649(var1);
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(N, false);
      var1.N(y, this.O());
   }

   @Override
   public void method_5773() {
      if (!this.method_73183().method_8608() && this.method_5805() && this.v()) {
         int i = this.I();
         this.a -= i;
         if (this.a <= 0) {
            this.u((class04782)this.method_73183());
         }
      }

      super.method_5773();
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("VillagerData", class05666.L, this.t());
      var1.y("Offers", class07316.N, this.A);
      var1.y("Gossips", class05774.N, this.F);
      var1.N("ConversionTime", this.v() ? this.a : -1);
      var1.y("ConversionPlayer", class01487.N, this.p);
      var1.N("Xp", this.f);
   }

   @Nullable
   @Override
   public <T> T method_58694(class02477<? extends T> var1) {
      return var1 == class02484.NQ ? method_66651(var1, this.t().N()) : super.method_58694(var1);
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.field_6011.N(y, var1.<class05666>N("VillagerData", class05666.L).orElseGet(this::O));
      this.A = var1.<class07316>N("Offers", class07316.N).orElse(null);
      this.F = var1.<class05774>N("Gossips", class05774.N).orElse(null);
      int i = var1.N("ConversionTime", -1);
      if (i != -1) {
         UUID uuid = var1.<UUID>N("ConversionPlayer", class01487.N).orElse(null);
         this.N(uuid, i);
      } else {
         this.method_5841().N(N, false);
         this.a = -1;
      }

      this.f = var1.N("Xp", 0);
   }

   @Override
   public void method_5711(byte var1) {
      if (var1 == 16) {
         if (!this.method_5701()) {
            this.method_73183()
               .method_8486(
                  this.method_23317(),
                  this.method_23320(),
                  this.method_23321(),
                  class04909.oP,
                  this.method_5634(),
                  1.0F + this.field_5974.z(),
                  this.field_5974.z() * 0.7F + 0.3F,
                  false
               );
         }
      } else {
         super.method_5711(var1);
      }
   }

   public class08018(class07078<? extends class08018> var1, class07299 var2) {
      super(var1, var2);
   }

   private int I() {
      int i = 1;
      if (this.field_5974.z() < 0.01F) {
         int j = 0;
         class07218 class07218 = new class07218();

         for (int k = (int)this.method_23317() - 4; k < (int)this.method_23317() + 4 && j < 14; k++) {
            for (int l = (int)this.method_23318() - 4; l < (int)this.method_23318() + 4 && j < 14; l++) {
               for (int i1 = (int)this.method_23321() - 4; i1 < (int)this.method_23321() + 4 && j < 14; i1++) {
                  class00500 class00500 = this.method_73183().method_8320(class07218.N(k, l, i1));
                  if (class00500.N(class00869.RQ) || class00500.i() instanceof class07789) {
                     if (this.field_5974.z() < 0.3F) {
                        i++;
                     }

                     j++;
                  }
               }
            }
         }
      }

      return i;
   }

   @Override
   public class04891 s() {
      return class04909.oW;
   }

   @Override
   protected boolean m() {
      return false;
   }

   private class07041 o() {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21) ? class07082.N : class07082.y;
   }

   @Override
   public class05666 t() {
      return this.field_6011.N(y);
   }

   public boolean v() {
      return this.method_5841().N(N);
   }

   private void u(class04782 var1) {
      this.N(class07078.ye, class08234.N(this, false, false), var2 -> {
         for (class07085 class07085 : this.N(var1, var0 -> !class07323.N(var0, class02523.I))) {
            class04803 class04803 = var2.method_32318(class07085.y() + 300);
            if (class04803 != null) {
               class04803.N(this.method_6118(class07085));
            }
         }

         var2.N(this.t());
         if (this.F != null) {
            var2.N(this.F);
         }

         if (this.A != null) {
            var2.y(this.A.N());
         }

         var2.y(this.f);
         var2.N(var1, var1.method_8404(var2.method_24515()), class06113.field_16468, null);
         var2.L(var1);
         if (this.p != null) {
            class08036 class08036 = var1.N(this.p);
            if (class08036 instanceof class04770) {
               class06912.j.N((class04770)class08036, this, var2);
               var1.method_19496(class05354.N, class08036, var2);
            }
         }

         var2.method_6092(new class07055(class07047.Z, 200, 0));
         if (!this.method_5701()) {
            var1.method_8444(null, 1027, this.method_24515(), 0);
         }
      });
   }

   public void y(int var1) {
      this.f = var1;
   }

   @Override
   public void N(class05666 var1) {
      if (!this.t().y().equals(var1.y())) {
         this.A = null;
      }

      this.field_6011.N(y, var1);
   }

   private void N(@Nullable UUID var1, int var2) {
      this.p = var1;
      this.a = var2;
      this.method_5841().N(N, true);
      this.method_6016(class07047.b);
      this.method_6092(new class07055(class07047.i, var2, Math.min(this.method_73183().y().N() - 1, 0)));
      this.method_73183().method_8421(this, (byte)16);
   }

   @Nullable
   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      if (!X.contains(var3)) {
         this.N(this.t().N(var1.method_30349(), class05660.N(var1.i(this.method_24515()))));
      }

      return super.N(var1, var2, var3, var4);
   }

   @Override
   public class07082 N(class08036 var1, class07050 var2) {
      class06584 class06584 = var1.method_5998(var2);
      if (class06584.N(class06570.bV)) {
         if (this.method_6059(class07047.b)) {
            class06584.N(1, var1);
            if (!this.method_73183().method_8608()) {
               this.N(var1.method_5667(), this.field_5974.y(2401) + 3600);
            }

            return this.o();
         } else {
            return class07082.L;
         }
      } else {
         return super.N(var1, var2);
      }
   }

   @Override
   public boolean N(double var1) {
      return !this.v() && this.f == 0;
   }

   @Override
   public void N(int var1) {
      this.a = var1;
   }

   public void N(class07316 var1) {
      this.A = var1;
   }

   public void N(class05774 var1) {
      this.F = var1;
   }

   private class05666 O() {
      Optional<class03529<class05672>> optional = class04206.d.N(this.field_5974);
      class05666 class05666 = class08041.G();
      if (optional.isPresent()) {
         class05666 = class05666.y(optional.get());
      }

      return class05666;
   }

   public int G() {
      return this.f;
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

   @Override
   public class04891 method_6002() {
      return class04909.os;
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      return class04909.oT;
   }

   @Override
   public float method_6017() {
      return this.method_6109() ? (this.field_5974.z() - this.field_5974.z()) * 0.2F + 2.0F : (this.field_5974.z() - this.field_5974.z()) * 0.2F + 1.0F;
   }

   @Override
   public class04891 X_() {
      return class04909.ob;
   }
}
