package minecraft;

import Nursultan.class10864;
import Nursultan.class10867;
import Nursultan.class11821;
import Nursultan.class11822;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.math.IntMath;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalFloatRefImpl;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalFloatRef;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Either;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.visuals.settings.VisualSettings;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;
import net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents;
import net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents.AllowResettingTime;
import net.fabricmc.fabric.api.entity.event.v1.EntitySleepEvents.AllowSleeping;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class08036 extends class06600 implements class08978 {
   public static Float staticFields_27fa3311b0e9d3e9b883d09222919bf5a_0;
   public static Float staticFields_27fa3311b0e9d3e9b883d09222919bf5a_1;
   public static Integer staticFields_27fa3311b0e9d3e9b883d09222919bf5a_2;
   public static class02131 staticFields_27fa3311b0e9d3e9b883d09222919bf5a_3 = class03289.N(class08036.class, class02154.u);
   public static class02131 staticFields_27fa3311b0e9d3e9b883d09222919bf5a_4 = class03289.N(class08036.class, class02154.y);
   public static class02131 staticFields_27fa3311b0e9d3e9b883d09222919bf5a_5 = class03289.N(class08036.class, class02154.n);
   public static class02131 staticFields_27fa3311b0e9d3e9b883d09222919bf5a_6 = class03289.N(class08036.class, class02154.n);
   public Integer fields_47fa3311b0e9d3e9b883d09222919bf5a_0;
   public Float fields_47fa3311b0e9d3e9b883d09222919bf5a_1;
   public Integer fields_47fa3311b0e9d3e9b883d09222919bf5a_2;
   public GameProfile fields_47fa3311b0e9d3e9b883d09222919bf5a_3;
   public Boolean fields_47fa3311b0e9d3e9b883d09222919bf5a_4;
   public class06584 fields_47fa3311b0e9d3e9b883d09222919bf5a_5;
   public boolean fields_47fa3311b0e9d3e9b883d09222919bf5a_init;
   public static Integer staticFields_47fa3311b0e9d3e9b883d09222919bf5a_0;
   public static Integer staticFields_47fa3311b0e9d3e9b883d09222919bf5a_1;
   public static Boolean staticFields_47fa3311b0e9d3e9b883d09222919bf5a_2;
   public static Integer staticFields_47fa3311b0e9d3e9b883d09222919bf5a_3;
   public static Float staticFields_47fa3311b0e9d3e9b883d09222919bf5a_4;
   public static class04891 staticFields_47fa3311b0e9d3e9b883d09222919bf5a_5 = class04891.N(class01894.N("viafabricplus-visuals", "oof.hurt"));
   public static Short staticFields_37fa3311b0e9d3e9b883d09222919bf5a_0;
   public static Float staticFields_37fa3311b0e9d3e9b883d09222919bf5a_1;
   public static Integer staticFields_37fa3311b0e9d3e9b883d09222919bf5a_2;
   public static Integer staticFields_37fa3311b0e9d3e9b883d09222919bf5a_3;
   public static Integer staticFields_37fa3311b0e9d3e9b883d09222919bf5a_4;
   public static Integer staticFields_07fa3311b0e9d3e9b883d09222919bf5a_0;
   public static Integer staticFields_07fa3311b0e9d3e9b883d09222919bf5a_1;
   public static Integer staticFields_07fa3311b0e9d3e9b883d09222919bf5a_2;
   public Integer fields_37fa3311b0e9d3e9b883d09222919bf5a_0;
   public Integer fields_37fa3311b0e9d3e9b883d09222919bf5a_1;
   public Float fields_37fa3311b0e9d3e9b883d09222919bf5a_2;
   public boolean fields_37fa3311b0e9d3e9b883d09222919bf5a_init;
   public Integer fields_67fa3311b0e9d3e9b883d09222919bf5a_0;
   public Integer fields_67fa3311b0e9d3e9b883d09222919bf5a_1;
   public Boolean fields_67fa3311b0e9d3e9b883d09222919bf5a_2;
   public boolean fields_67fa3311b0e9d3e9b883d09222919bf5a_init;
   public Boolean fields_27fa3311b0e9d3e9b883d09222919bf5a_0;
   public class08033 fields_27fa3311b0e9d3e9b883d09222919bf5a_1;
   public boolean fields_27fa3311b0e9d3e9b883d09222919bf5a_init;
   public class06556 fields_57fa3311b0e9d3e9b883d09222919bf5a_0;
   public Optional fields_57fa3311b0e9d3e9b883d09222919bf5a_1;
   public class00696 fields_57fa3311b0e9d3e9b883d09222919bf5a_2;
   public Float fields_57fa3311b0e9d3e9b883d09222919bf5a_3;
   public class06889 fields_57fa3311b0e9d3e9b883d09222919bf5a_4;
   public class07049 fields_57fa3311b0e9d3e9b883d09222919bf5a_5;
   public Boolean fields_57fa3311b0e9d3e9b883d09222919bf5a_6;
   public boolean fields_57fa3311b0e9d3e9b883d09222919bf5a_init;
   public static Integer staticFields_17fa3311b0e9d3e9b883d09222919bf5a_0;
   public static Integer staticFields_17fa3311b0e9d3e9b883d09222919bf5a_1;
   public static Integer staticFields_17fa3311b0e9d3e9b883d09222919bf5a_2;
   public class08044 fields_07fa3311b0e9d3e9b883d09222919bf5a_0;
   public class06940 fields_07fa3311b0e9d3e9b883d09222919bf5a_1;
   public class07492 fields_07fa3311b0e9d3e9b883d09222919bf5a_2;
   public Object fields_07fa3311b0e9d3e9b883d09222919bf5a_3;
   public class07512 fields_17fa3311b0e9d3e9b883d09222919bf5a_0;
   public Integer fields_17fa3311b0e9d3e9b883d09222919bf5a_1;
   public Integer fields_17fa3311b0e9d3e9b883d09222919bf5a_2;
   public Integer fields_17fa3311b0e9d3e9b883d09222919bf5a_3;
   public boolean fields_17fa3311b0e9d3e9b883d09222919bf5a_init;

   @Override
   public class00392 method_5476() {
      class05216 class05216 = class00502.N(this.method_5781(), this.method_5477());
      return this.method_7299(class05216);
   }

   @Override
   public boolean method_5675() {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      return !this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.y;
   }

   @Override
   public boolean method_65038() {
      return true;
   }

   @Override
   public boolean method_6034() {
      return !this.method_73183().method_8608() || this.method_7340();
   }

   @Override
   public boolean method_5733() {
      return true;
   }

   @Nullable
   @Override
   public class04803 method_32318(int var1) {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      if (var1 == 499) {
         return new class10867(this);
      } else {
         int i = var1 - 500;
         if (i >= 0 && i < 4) {
            return new class10864(this, i);
         } else if (var1 >= 0 && var1 < this.fields_07fa3311b0e9d3e9b883d09222919bf5a_0.u().size()) {
            return this.fields_07fa3311b0e9d3e9b883d09222919bf5a_0.method_32318(var1);
         } else {
            int j = var1 - 200;
            return j >= 0 && j < this.fields_07fa3311b0e9d3e9b883d09222919bf5a_1.method_5439()
               ? this.fields_07fa3311b0e9d3e9b883d09222919bf5a_1.method_32318(j)
               : super.method_32318(var1);
         }
      }
   }

   @Override
   public boolean method_66248() {
      return this.method_7340();
   }

   @Override
   public class06584 method_59958() {
      return this.method_6123() && super.fields_10212a028292fd3c078969e3ee4c71d9e8_3 != null
         ? super.fields_10212a028292fd3c078969e3ee4c71d9e8_3
         : super.method_59958();
   }

   @Override
   public boolean method_31746() {
      return false;
   }

   @Override
   public class06889 method_30951(float var1) {
      double d0 = 0.22 * (this.method_6068() == class07070.field_6183 ? -1.0 : 1.0);
      float f = class04995.B(var1 * 0.5F, this.method_36455(), this.field_6004) * (float) (Math.PI / 180.0);
      float f1 = class04995.B(var1, super.fields_4212a028292fd3c078969e3ee4c71d9e8_1, super.fields_4212a028292fd3c078969e3ee4c71d9e8_0)
         * (float) (Math.PI / 180.0);
      if (this.method_6128() || this.method_6123()) {
         class06889 class06889 = this.method_5828(var1);
         class06889 class06889x = this.method_18798();
         double d5 = class06889x.z();
         double d3 = class06889.z();
         float f2;
         if (d5 > 0.0 && d3 > 0.0) {
            double d4 = (class06889x.M * class06889.M + class06889x.Z * class06889.Z) / Math.sqrt(d5 * d3);
            f2 = (float)(Math.signum(class06889x.M * class06889.Z - class06889x.Z * class06889.M) * Math.acos(d4));
         } else {
            f2 = 0.0F;
         }

         return this.method_30950(var1).i(new class06889(d0, -0.11, 0.85).L(-f2).N(-f).y(-f1));
      } else if (this.method_20232()) {
         return this.method_30950(var1).i(new class06889(d0, 0.2, -0.15).N(-f).y(-f1));
      } else {
         double d1 = this.method_5829().L() - 1.0;
         double d2 = this.method_18276() ? -0.2 : 0.07;
         return this.method_30950(var1).i(new class06889(d0, d1, d2).y(-f1));
      }
   }

   @Override
   public boolean method_48155() {
      return true;
   }

   @Override
   public boolean method_31747() {
      return true;
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(staticFields_27fa3311b0e9d3e9b883d09222919bf5a_3, 0.0F);
      var1.N(staticFields_27fa3311b0e9d3e9b883d09222919bf5a_4, 0);
      var1.N(staticFields_27fa3311b0e9d3e9b883d09222919bf5a_5, OptionalInt.empty());
      var1.N(staticFields_27fa3311b0e9d3e9b883d09222919bf5a_6, OptionalInt.empty());
   }

   @Override
   public boolean method_7325() {
      return this.method_68876() == class07282.field_9219;
   }

   @Override
   public void method_5773() {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      this.field_5960 = this.method_7325();
      if (this.method_7325() || this.method_5765()) {
         this.method_24830(false);
      }

      if (this.fields_17fa3311b0e9d3e9b883d09222919bf5a_2 > 0) {
         this.fields_17fa3311b0e9d3e9b883d09222919bf5a_2 = this.fields_17fa3311b0e9d3e9b883d09222919bf5a_2 - 1;
      }

      if (this.method_6113()) {
         this.fields_17fa3311b0e9d3e9b883d09222919bf5a_3 = this.fields_17fa3311b0e9d3e9b883d09222919bf5a_3 + 1;
         if (this.fields_17fa3311b0e9d3e9b883d09222919bf5a_3 > 100) {
            this.fields_17fa3311b0e9d3e9b883d09222919bf5a_3 = 100;
         }

         if (!this.method_73183().method_8608() && !this.method_73183().method_75728().N(class00608.Q, this.method_73189()).N(this.method_73183())) {
            this.method_7358(false, true);
         }
      } else if (this.fields_17fa3311b0e9d3e9b883d09222919bf5a_3 > 0) {
         this.fields_17fa3311b0e9d3e9b883d09222919bf5a_3 = this.fields_17fa3311b0e9d3e9b883d09222919bf5a_3 + 1;
         if (this.fields_17fa3311b0e9d3e9b883d09222919bf5a_3 >= 110) {
            this.fields_17fa3311b0e9d3e9b883d09222919bf5a_3 = 0;
         }
      }

      this.method_7295();
      super.method_5773();
      int i = 29999999;
      double d0 = class04995.N(this.method_23317(), -2.9999999E7, 2.9999999E7);
      double d1 = class04995.N(this.method_23321(), -2.9999999E7, 2.9999999E7);
      if (d0 != this.method_23317() || d1 != this.method_23321()) {
         this.method_5814(d0, this.method_23318(), d1);
      }

      super.fields_3212a028292fd3c078969e3ee4c71d9e8_1 = super.fields_3212a028292fd3c078969e3ee4c71d9e8_1 + 1;
      super.fields_3212a028292fd3c078969e3ee4c71d9e8_2 = super.fields_3212a028292fd3c078969e3ee4c71d9e8_2 + 1;
      class06584 class06584 = this.method_6047();
      if (!class06584.N(this.fields_47fa3311b0e9d3e9b883d09222919bf5a_5, class06584)) {
         if (!class06584.y(this.fields_47fa3311b0e9d3e9b883d09222919bf5a_5, class06584)) {
            this.method_7350();
         }

         this.fields_47fa3311b0e9d3e9b883d09222919bf5a_5 = class06584.t();
      }

      if (!this.method_5777(class01231.N) && this.method_64179(class06570.sa)) {
         this.method_7330();
      }

      this.fields_57fa3311b0e9d3e9b883d09222919bf5a_0.N();
      this.method_7318();
      if (this.fields_67fa3311b0e9d3e9b883d09222919bf5a_0 > 0) {
         this.fields_67fa3311b0e9d3e9b883d09222919bf5a_0 = this.fields_67fa3311b0e9d3e9b883d09222919bf5a_0 - 1;
      }
   }

   @Override
   public void method_5650(class07062 var1) {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      super.method_5650(var1);
      this.fields_07fa3311b0e9d3e9b883d09222919bf5a_2.y(this);
      if (this.method_45015()) {
         this.method_14247();
      }
   }

   @Override
   public void method_5790() {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      if (this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.y) {
         this.method_5796(false);
      } else {
         super.method_5790();
      }
   }

   @Override
   public class06889 method_18796(class06889 var1, class07451 var2) {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      float f = this.redirect$dmo000$viafabricplus$modifyStepHeight(this);
      if (!this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.y
         && !(var1.B > 0.0)
         && (var2 == class07451.field_6308 || var2 == class07451.field_6305)
         && this.method_21825()
         && this.method_30263(f)) {
         double d0 = var1.M;
         double d1 = var1.Z;
         double d2 = 0.05;
         double d3 = Math.signum(d0) * 0.05;

         double d4;
         for (d4 = Math.signum(d1) * 0.05; d0 != 0.0 && this.method_59818(d0, 0.0, f); d0 -= d3) {
            if (Math.abs(d0) <= 0.05) {
               d0 = 0.0;
               break;
            }
         }

         while (d1 != 0.0 && this.method_59818(0.0, d1, f)) {
            if (Math.abs(d1) <= 0.05) {
               d1 = 0.0;
               break;
            }

            d1 -= d4;
         }

         while (d0 != 0.0 && d1 != 0.0 && this.method_59818(d0, d1, f)) {
            if (Math.abs(d0) <= 0.05) {
               d0 = 0.0;
            } else {
               d0 -= d3;
            }

            if (Math.abs(d1) <= 0.05) {
               d1 = 0.0;
            } else {
               d1 -= d4;
            }
         }

         return new class06889(d0, var1.B, d1);
      } else {
         return var1;
      }
   }

   @Override
   public class04911 method_5634() {
      return class04911.field_15248;
   }

   @Override
   public void method_20803(int var1) {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      super.method_20803(this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.N ? Math.min(var1, 1) : var1);
   }

   @Override
   public boolean method_64397(class04782 var1, class07072 var2, float var3) {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      if (this.method_5679(var1, var2)) {
         return false;
      } else if (this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.N && !var2.N(class03696.u)) {
         return false;
      } else {
         super.fields_6212a028292fd3c078969e3ee4c71d9e8_2 = 0;
         if (this.method_29504()) {
            return false;
         } else {
            this.method_7262();
            if (var2.M()) {
               if (var1.y() == class07086.field_5801) {
                  var3 = 0.0F;
               }

               if (var1.y() == class07086.field_5805) {
                  var3 = Math.min(var3 / 2.0F + 1.0F, var3);
               }

               if (var1.y() == class07086.field_5807) {
                  var3 = var3 * 3.0F / 2.0F;
               }
            }

            return var3 == 0.0F ? false : super.method_64397(var1, var2, var3);
         }
      }
   }

   @Override
   public int method_5806() {
      return 10;
   }

   @Override
   public boolean method_5681() {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      return !this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.y && !this.method_7325() && super.method_5681();
   }

   @Override
   public float method_23326() {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      return !this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.y && !this.method_6128() ? super.method_23326() : 1.0F;
   }

   @Override
   public int method_5676() {
      return 20;
   }

   @Override
   public boolean method_66249() {
      return !this.method_73183().method_8608() || this.method_7340();
   }

   @Override
   public class07065 method_33570() {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      return this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.y || this.method_24828() && this.method_21751() ? class07065.field_28630 : class07065.field_28633;
   }

   @Override
   public class04891 method_5737() {
      return class04909.lM;
   }

   @Override
   public class04891 method_5625() {
      return class04909.li;
   }

   @Override
   public class04891 method_5672() {
      return class04909.lR;
   }

   @Override
   public boolean method_5747(double var1, float var3, class07072 var4) {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      if (this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.L) {
         return false;
      } else {
         if (var1 >= 2.0) {
            this.method_7339(class01235.v, (int)Math.round(var1 * 100.0));
         }

         double d0;
         if (this.fields_57fa3311b0e9d3e9b883d09222919bf5a_4 != null && this.fields_57fa3311b0e9d3e9b883d09222919bf5a_6) {
            d0 = Math.min(var1, this.fields_57fa3311b0e9d3e9b883d09222919bf5a_4.B - this.method_23318());
            if (d0 <= 0.0) {
               this.method_58396();
            } else {
               this.method_60983();
            }
         } else {
            d0 = var1;
         }

         if (d0 > 0.0 && super.method_5747(d0, var3, var4)) {
            this.method_58396();
            return true;
         } else {
            this.method_67345(var1, var3, var4);
            return false;
         }
      }
   }

   @Override
   public void method_5712(class07209 var1, class00500 var2) {
      if (this.method_5799()) {
         this.method_51295();
         this.method_51296(var2);
      } else {
         class07209 class07209 = this.method_49788(var1);
         if (!var1.equals(class07209)) {
            class00500 class00500 = this.method_73183().method_8320(class07209);
            if (class00500.N(class01210.yY)) {
               this.method_49787(class00500, var2);
            } else {
               super.method_5712(class07209, class00500);
            }
         } else {
            super.method_5712(var1, var2);
         }
      }
   }

   @Override
   public void method_5783(class04891 var1, float var2, float var3) {
      this.method_73183().method_43128(this, this.method_23317(), this.method_23318(), this.method_23321(), var1, this.method_5634(), var2, var3);
   }

   @Override
   public void method_5746() {
      if (!this.method_7325()) {
         super.method_5746();
      }
   }

   @Override
   public void method_5652(class08329 var1) {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      super.method_5652(var1);
      class07717.N(var1);
      this.fields_07fa3311b0e9d3e9b883d09222919bf5a_0.N(var1.N("Inventory", class08332.N));
      var1.N("SelectedItemSlot", this.fields_07fa3311b0e9d3e9b883d09222919bf5a_0.N());
      var1.N("SleepTimer", (short)this.fields_17fa3311b0e9d3e9b883d09222919bf5a_3.intValue());
      var1.N("XpP", this.fields_37fa3311b0e9d3e9b883d09222919bf5a_2.floatValue());
      var1.N("XpLevel", this.fields_37fa3311b0e9d3e9b883d09222919bf5a_0.intValue());
      var1.N("XpTotal", this.fields_37fa3311b0e9d3e9b883d09222919bf5a_1.intValue());
      var1.N("XpSeed", this.fields_47fa3311b0e9d3e9b883d09222919bf5a_0.intValue());
      var1.N("Score", this.method_7272());
      this.fields_17fa3311b0e9d3e9b883d09222919bf5a_0.N(var1);
      var1.N("abilities", class08043.B, this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.L());
      this.fields_07fa3311b0e9d3e9b883d09222919bf5a_1.y(var1.N("EnderItems", class08332.N));
      this.fields_57fa3311b0e9d3e9b883d09222919bf5a_1.ifPresent(var1x -> var1.N("LastDeathLocation", class06289.y, var1x));
      var1.y("current_explosion_impact_pos", class06889.N, this.fields_57fa3311b0e9d3e9b883d09222919bf5a_4);
      var1.N("ignore_fall_damage_from_current_explosion", this.fields_57fa3311b0e9d3e9b883d09222919bf5a_6.booleanValue());
      var1.N("current_impulse_context_reset_grace_time", this.fields_67fa3311b0e9d3e9b883d09222919bf5a_0.intValue());
   }

   @Override
   public boolean method_49108() {
      return !this.method_7325() && super.method_49108();
   }

   public boolean method_21823() {
      return this.method_5715();
   }

   @Override
   public boolean method_56992() {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      return this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.u;
   }

   public boolean method_68878() {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.handler$dij000$viafabricplus$fixCreativeCheck(callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? callbackinforeturnable.getReturnValueZ() : this.method_68876() == class07282.field_9220;
   }

   @Override
   public void method_5749(class08299 var1) {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      super.method_5749(var1);
      this.method_5826(this.fields_47fa3311b0e9d3e9b883d09222919bf5a_3.id());
      this.fields_07fa3311b0e9d3e9b883d09222919bf5a_0.N(var1.L("Inventory", class08332.N));
      this.fields_07fa3311b0e9d3e9b883d09222919bf5a_0.N(var1.N("SelectedItemSlot", 0));
      this.fields_17fa3311b0e9d3e9b883d09222919bf5a_3 = var1.N("SleepTimer", (short)0);
      this.fields_37fa3311b0e9d3e9b883d09222919bf5a_2 = var1.N("XpP", 0.0F);
      this.fields_37fa3311b0e9d3e9b883d09222919bf5a_0 = var1.N("XpLevel", 0);
      this.fields_37fa3311b0e9d3e9b883d09222919bf5a_1 = var1.N("XpTotal", 0);
      this.fields_47fa3311b0e9d3e9b883d09222919bf5a_0 = var1.N("XpSeed", 0);
      if (this.fields_47fa3311b0e9d3e9b883d09222919bf5a_0 == 0) {
         this.fields_47fa3311b0e9d3e9b883d09222919bf5a_0 = this.field_5974.M();
      }

      this.method_7320(var1.N("Score", 0));
      this.fields_17fa3311b0e9d3e9b883d09222919bf5a_0.N(var1);
      var1.<class08043>N("abilities", class08043.B).ifPresent(this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1::N);
      this.method_5996(class05298.l).N(this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.y());
      this.fields_07fa3311b0e9d3e9b883d09222919bf5a_1.y(var1.L("EnderItems", class08332.N));
      this.method_43120(var1.N("LastDeathLocation", class06289.y));
      this.fields_57fa3311b0e9d3e9b883d09222919bf5a_4 = var1.<class06889>N("current_explosion_impact_pos", class06889.N).orElse(null);
      this.fields_57fa3311b0e9d3e9b883d09222919bf5a_6 = var1.N("ignore_fall_damage_from_current_explosion", false);
      this.fields_67fa3311b0e9d3e9b883d09222919bf5a_0 = var1.N("current_impulse_context_reset_grace_time", 0);
   }

   @Override
   public void method_29239() {
      super.method_29239();
      this.field_5951 = 0;
   }

   @Override
   public void method_5842() {
      if (!this.method_73183().method_8608() && this.method_21824() && this.method_5765()) {
         this.method_5848();
         this.method_5660(false);
      } else {
         super.method_5842();
      }
   }

   @Override
   public void method_5711(byte var1) {
      if (var1 == 9) {
         this.method_6040();
      } else if (var1 == 23) {
         this.method_7268(false);
      } else if (var1 == 22) {
         this.method_7268(true);
      } else {
         super.method_5711(var1);
      }
   }

   @Override
   public void method_5879(float var1) {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      super.method_5879(var1);
      this.fields_57fa3311b0e9d3e9b883d09222919bf5a_3 = var1;
   }

   @Override
   public void method_5700(boolean var1, class07209 var2) {
      if (!this.method_31549().y) {
         super.method_5700(var1, var2);
      }
   }

   @Override
   public boolean method_5874(class04782 var1, class07438 var2, class07072 var3) {
      this.method_7259(class01235.M.y(var2.method_5864()));
      return true;
   }

   @Override
   public String method_5820() {
      return this.method_7334().name();
   }

   @Override
   public void method_5764(boolean var1) {
      if (!this.method_31549().y) {
         super.method_5764(var1);
      }
   }

   @Override
   public String method_74861() {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      return this.fields_47fa3311b0e9d3e9b883d09222919bf5a_3.name();
   }

   @Override
   public void method_5844(class00500 var1, class06889 var2) {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      if (!this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.y) {
         super.method_5844(var1, var2);
      }

      this.method_60983();
   }

   @Override
   public class00392 method_5477() {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      return class00392.y(this.fields_47fa3311b0e9d3e9b883d09222919bf5a_3.name());
   }

   public class08036(class07299 var1, GameProfile var2) {
      super(class07078.Ly, var1);
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      this.fields_07fa3311b0e9d3e9b883d09222919bf5a_1 = new class06940();
      this.fields_17fa3311b0e9d3e9b883d09222919bf5a_0 = new class07512();
      this.fields_17fa3311b0e9d3e9b883d09222919bf5a_3 = 0;
      this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1 = new class08033();
      this.fields_37fa3311b0e9d3e9b883d09222919bf5a_0 = 0;
      this.fields_37fa3311b0e9d3e9b883d09222919bf5a_1 = 0;
      this.fields_37fa3311b0e9d3e9b883d09222919bf5a_2 = 0.0F;
      this.fields_47fa3311b0e9d3e9b883d09222919bf5a_0 = 0;
      this.fields_47fa3311b0e9d3e9b883d09222919bf5a_1 = 0.02F;
      this.fields_47fa3311b0e9d3e9b883d09222919bf5a_5 = class06584.E;
      this.fields_57fa3311b0e9d3e9b883d09222919bf5a_0 = this.method_7265();
      this.fields_57fa3311b0e9d3e9b883d09222919bf5a_1 = Optional.empty();
      this.fields_57fa3311b0e9d3e9b883d09222919bf5a_6 = false;
      this.fields_67fa3311b0e9d3e9b883d09222919bf5a_0 = 0;
      this.method_5826(var2.id());
      this.fields_47fa3311b0e9d3e9b883d09222919bf5a_3 = var2;
      this.fields_07fa3311b0e9d3e9b883d09222919bf5a_0 = new class08044(this, super.fields_13212a028292fd3c078969e3ee4c71d9e8_1);
      this.fields_07fa3311b0e9d3e9b883d09222919bf5a_2 = new class07492(this.fields_07fa3311b0e9d3e9b883d09222919bf5a_0, !var1.method_8608(), this);
      this.fields_07fa3311b0e9d3e9b883d09222919bf5a_3 = this.fields_07fa3311b0e9d3e9b883d09222919bf5a_2;
   }

   static {
      staticFields7fa3311b0e9d3e9b883d09222919bf5a();
   }

   private boolean wrapWithCondition$dck000$viafabricplus$preventSwimmingMotionWhenJumping(class08036 var1, class06889 var2) {
      return !ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest) || !var1.method_70673();
   }

   private void redirect$dck000$viafabricplus$removeFlySlipperiness$mixinextras$bridge$259(class08036 var1, class06889 var2, LocalRef var3) {
      this.redirect$dck000$viafabricplus$removeFlySlipperiness(var1, var2, (class06889)var3.get());
   }

   private void handler$dmo000$viafabricplus$changeOffsetsForSneakingCollisionDetection(double var1, double var3, double var5, CallbackInfoReturnable var7) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_4)) {
         double d0;
         if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_3)) {
            d0 = 0.0;
         } else {
            d0 = 1.0E-5F;
         }

         class00734 class00734 = this.method_5829();
         var7.setReturnValue(
            this.method_73183()
               .method_8587(
                  this,
                  new class00734(class00734.N + var1, class00734.y - var5 - d0, class00734.L + var3, class00734.u + var1, class00734.y, class00734.R + var3)
               )
         );
      }
   }

   private void handler$dij000$viafabricplus$preventEatingFoodInCreative(boolean var1, CallbackInfoReturnable var2) {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_14_4) && this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.N) {
         var2.setReturnValue(false);
      }
   }

   private boolean redirect$ddl000$viafabricplus$changeSpeedCalculation(class08036 var1, class03556 var2, LocalFloatRef var3) {
      boolean flag = var1.method_6059(var2);
      if (flag && ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_7_6)) {
         var3.set(var3.get() * (1.0F - (this.method_6112(class07047.u).i() + 1) * 0.2F));
         if (var3.get() < 0.0F) {
            var3.set(0.0F);
         }

         return false;
      } else {
         return flag;
      }
   }

   private class07209 redirect$dck000$viafabricplus$modifyWaterAbovePosition(double var1, double var3, double var5) {
      return ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest)
         ? class07209.method_49637(var1, var3 - 0.9, var5)
         : class07209.method_49637(var1, var3, var5);
   }

   private void redirect$dck000$viafabricplus$removeFlySlipperiness(class08036 var1, class06889 var2, class06889 var3) {
      if (ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest) && var3.z() == 0.0) {
         var1.method_18799(new class06889(0.0, var2.B, 0.0));
      } else {
         var1.method_18799(var2);
      }
   }

   private void handler$dng000$viafabricplus$allowClimbingWhileFlying(CallbackInfoReturnable var1) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_2)) {
         var1.setReturnValue(super.method_6101());
      }
   }

   private void handler$ddl000$viafabricplus$changeSpeedCalculation(class00500 var1, CallbackInfoReturnable var2, LocalFloatRef var3) {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      float f = (float)this.method_45325(class05298.t);
      if (!(f <= 0.0F)) {
         float f1 = this.fields_07fa3311b0e9d3e9b883d09222919bf5a_0.y().N(var1);
         if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.r1_4_4tor1_4_5) && this.method_7305(var1)) {
            var3.set(f1 + f);
         } else if ((f1 > 1.0F || ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.r1_4_6tor1_4_7))
            && !this.method_6047().R()
            && ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_7_6)) {
            if (f1 <= 1.0 && !this.method_7305(var1)) {
               var3.set(f1 + f * 0.08F);
            } else {
               var3.set(f1 + f);
            }
         }
      }
   }

   private boolean redirect$dck000$viafabricplus$preventSwimmingResurface(class08036 var1) {
      if (ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest) && var1.method_5681()) {
         double d0 = this.method_5720().B;
         if (this.method_73183().method_8316(class07209.method_49637(this.method_23317(), this.method_23318() + 0.4, this.method_23321())).W()
            && d0 > 0.0
            && d0 < 0.55) {
            var1.method_18800(var1.method_18798().N(), 0.0, var1.method_18798().L());
            return false;
         } else {
            return true;
         }
      } else {
         return var1.method_5681();
      }
   }

   private void handler$dnc000$viafabricplus$replaceGlidingCondition(CallbackInfoReturnable var1) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_14_4)) {
         if (!this.method_24828() && this.method_18798().B < 0.0 && !this.method_6128()) {
            class06584 class06584 = this.method_6118(class07085.field_6174);
            if (class06584.N(class06570.sT) && method_63624(class06584, class07085.field_6174)) {
               var1.setReturnValue(true);
               return;
            }
         }

         var1.setReturnValue(false);
      }
   }

   private boolean redirect$doi000$viafabricplus$useLastSprintingState(class08036 var1) {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_19_3)
         ? this.fields_67fa3311b0e9d3e9b883d09222919bf5a_2
         : var1.method_5624();
   }

   public void method_7353(class00392 var1, boolean var2) {
   }

   public void method_7358(boolean var1, boolean var2) {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      super.method_18400();
      if (this.method_73183() instanceof class04782 && var2) {
         ((class04782)this.method_73183()).method_8448();
      }

      this.fields_17fa3311b0e9d3e9b883d09222919bf5a_3 = var1 ? 0 : 100;
   }

   public String method_68877() {
      return MoreObjects.toStringHelper(this)
         .add("name", this.method_74861())
         .add("id", this.method_5628())
         .add("pos", this.method_73189())
         .add("mode", this.method_68876())
         .add("permission", this.method_75004())
         .toString();
   }

   private void handler$dck000$viafabricplus$preventJumpingWhenStartedSwimming(class06889 var1, CallbackInfo var2) {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      if (ProtocolTranslator.getTargetVersion().equals(BedrockProtocolVersion.bedrockLatest)) {
         if (this.method_5681()) {
            this.fields_67fa3311b0e9d3e9b883d09222919bf5a_1 = this.fields_67fa3311b0e9d3e9b883d09222919bf5a_1 + 1;
         } else {
            this.fields_67fa3311b0e9d3e9b883d09222919bf5a_1 = 0;
         }

         if (this.fields_67fa3311b0e9d3e9b883d09222919bf5a_1 > 0 && this.fields_67fa3311b0e9d3e9b883d09222919bf5a_1 < 10 && this.method_70673()) {
            this.method_18800(this.method_18798().N(), 0.0, this.method_18798().L());
         }
      }
   }

   private boolean redirect$dni000$viafabricplus$dontModifyHeadRotationWhenBlocking(class08036 var1) {
      return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_20_2) && var1.method_6039();
   }

   private class00734 redirect$dng000$viafabricplus$removeContractionOfCollisionBox(class00734 var1, double var2) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_15_2) ? var1 : var1.B(var2);
   }

   private void m_handler$zeg000$fabric_entity_events_v1$onIsSleepingLongEnough_173(CallbackInfoReturnable var1) {
      if (var1.getReturnValueZ()) {
         var1.setReturnValue(((AllowResettingTime)EntitySleepEvents.ALLOW_RESETTING_TIME.invoker()).allowResettingTime(this));
      }
   }

   public boolean method_7326(class07209 var1) {
      return !this.method_73183().method_8320(var1).z(this.method_73183(), var1);
   }

   public Either<class08035, class06244> method_7269(class07209 var1) {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.m_handler$zeg000$fabric_entity_events_v1$onTrySleep_175(var1, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (Either<class08035, class06244>)callbackinforeturnable.getReturnValue();
      } else {
         this.method_18403(var1);
         this.fields_17fa3311b0e9d3e9b883d09222919bf5a_3 = 0;
         return Either.right(class06244.field_17274);
      }
   }

   public void method_7266(class04907<?> var1) {
   }

   public boolean method_7256(class08036 var1) {
      class00502 class00502x = this.method_5781();
      class00502 class00502x = var1.method_5781();
      if (class00502x == null) {
         return true;
      } else {
         return !class00502x.N(class00502x) ? true : class00502x.Z();
      }
   }

   public void method_43120(Optional<class06289> var1) {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      this.fields_57fa3311b0e9d3e9b883d09222919bf5a_1 = var1;
   }

   public void method_7259(class04907<?> var1) {
      this.method_7342(var1, 1);
   }

   public void method_76575(class08156 var1, class06695 var2) {
   }

   public void method_60984(boolean var1) {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      this.fields_57fa3311b0e9d3e9b883d09222919bf5a_6 = var1;
      if (var1) {
         this.method_76731(40);
      } else {
         this.fields_67fa3311b0e9d3e9b883d09222919bf5a_0 = 0;
      }
   }

   public void method_7291(class07862 var1, class06695 var2) {
   }

   public OptionalInt method_17355(@Nullable class06237 var1) {
      return OptionalInt.empty();
   }

   public void method_7322(float var1) {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      if (!this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.N) {
         if (!this.method_73183().method_8608()) {
            this.fields_17fa3311b0e9d3e9b883d09222919bf5a_0.N(var1);
         }
      }
   }

   public int method_7254(Collection<class03729<?>> var1) {
      return 0;
   }

   public void method_7342(class04907<?> var1, int var2) {
   }

   public void method_7335(List<class05946<class06521<?>>> var1) {
   }

   public int method_7333(Collection<class03729<?>> var1) {
      return 0;
   }

   public void method_51283(class03729<?> var1, List<class06584> var2) {
   }

   public void method_7255(int var1) {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      this.method_7285(var1);
      this.fields_37fa3311b0e9d3e9b883d09222919bf5a_2 = this.fields_37fa3311b0e9d3e9b883d09222919bf5a_2 + (float)var1 / this.method_7349();
      this.fields_37fa3311b0e9d3e9b883d09222919bf5a_1 = class04995.N(this.fields_37fa3311b0e9d3e9b883d09222919bf5a_1 + var1, 0, Integer.MAX_VALUE);

      while (this.fields_37fa3311b0e9d3e9b883d09222919bf5a_2 < 0.0F) {
         float f = this.fields_37fa3311b0e9d3e9b883d09222919bf5a_2 * this.method_7349();
         if (this.fields_37fa3311b0e9d3e9b883d09222919bf5a_0 > 0) {
            this.method_7316(-1);
            this.fields_37fa3311b0e9d3e9b883d09222919bf5a_2 = 1.0F + f / this.method_7349();
         } else {
            this.method_7316(-1);
            this.fields_37fa3311b0e9d3e9b883d09222919bf5a_2 = 0.0F;
         }
      }

      while (this.fields_37fa3311b0e9d3e9b883d09222919bf5a_2 >= 1.0F) {
         this.fields_37fa3311b0e9d3e9b883d09222919bf5a_2 = (this.fields_37fa3311b0e9d3e9b883d09222919bf5a_2 - 1.0F) * this.method_7349();
         this.method_7316(1);
         this.fields_37fa3311b0e9d3e9b883d09222919bf5a_2 = this.fields_37fa3311b0e9d3e9b883d09222919bf5a_2 / this.method_7349();
      }
   }

   public void method_7323(class00402 var1) {
   }

   public void method_7339(class01894 var1, int var2) {
      this.method_7342(class01235.Z.y(var1), var2);
   }

   public void method_71753(class03556<class09037> var1) {
   }

   public void method_17354(int var1, class07316 var2, int var3, int var4, boolean var5, boolean var6) {
   }

   public void method_14247() {
   }

   public void method_7311(class07267 var1, boolean var2) {
   }

   public void method_7355() {
   }

   public void method_7315(class06584 var1, class07050 var2) {
   }

   @Override
   public int method_6110(class04782 var1) {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      return !var1.method_64395().N(class07305.j) && !this.method_7325() ? Math.min(this.fields_37fa3311b0e9d3e9b883d09222919bf5a_0 * 7, 100) : 0;
   }

   @Override
   public void method_16078(class04782 var1) {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      super.method_16078(var1);
      if (!var1.method_64395().N(class07305.j)) {
         this.method_7293();
         this.fields_07fa3311b0e9d3e9b883d09222919bf5a_0.Z();
      }
   }

   @Override
   public class06584 method_18808(class06584 var1) {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      if (!(var1.B() instanceof class06577)) {
         return class06584.E;
      } else {
         Predicate<class06584> predicate = ((class06577)var1.B()).L();
         class06584 class06584x = class06577.N(this, predicate);
         if (!class06584x.R()) {
            return class06584x;
         } else {
            predicate = ((class06577)var1.B()).N();

            for (int i = 0; i < this.fields_07fa3311b0e9d3e9b883d09222919bf5a_0.method_5439(); i++) {
               class06584 class06584x = this.fields_07fa3311b0e9d3e9b883d09222919bf5a_0.method_5438(i);
               if (predicate.test(class06584x)) {
                  return class06584x;
               }
            }

            return this.method_56992() ? new class06584(class06570.sD) : class06584.E;
         }
      }
   }

   @Override
   public void method_36977(class07072 var1, float var2) {
      this.method_57292(var1, var2, new class07085[]{class07085.field_6169});
   }

   @Override
   public float method_49484() {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      if (this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.y && !this.method_5765()) {
         return this.redirect$doi000$viafabricplus$useLastSprintingState(this)
            ? this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.N() * 2.0F
            : this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.N();
      } else {
         float f;
         float f1 = f = this.redirect$doi000$viafabricplus$useLastSprintingState(this) ? 0.025999999F : 0.02F;
         CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true, f);
         this.handler$cff000$nursultan$injectGetOffGroundSpeed(callbackinforeturnable);
         return callbackinforeturnable.isCancelled() ? callbackinforeturnable.getReturnValueF() : f1;
      }
   }

   @Override
   public boolean method_5679(class04782 var1, class07072 var2) {
      if (super.method_5679(var1, var2)) {
         return true;
      } else if (var2.N(class03696.m)) {
         return !var1.method_64395().N(class07305.B);
      } else if (var2.N(class03696.W)) {
         return !var1.method_64395().N(class07305.E);
      } else if (var2.N(class03696.Z)) {
         return !var1.method_64395().N(class07305.W);
      } else {
         return var2.N(class03696.P) ? !var1.method_64395().N(class07305.s) : false;
      }
   }

   @Override
   public class04891 method_6002() {
      return class04909.Gx;
   }

   @Override
   public void method_6090(class04782 var1, class07438 var2) {
      super.method_6090(var1, var2);
      class06584 class06584 = this.method_62821();
      class08576 class08576 = class06584 != null ? class06584.method_58694(class02484.H) : null;
      float f = var2.method_67125();
      if (f > 0.0F && class08576 != null) {
         class08576.N(var1, this, f, class06584);
      }
   }

   @Override
   public ImmutableList<class01312> method_24831() {
      return ImmutableList.of(class01312.field_18076, class01312.field_18081, class01312.field_18079);
   }

   @Override
   public float method_6067() {
      return this.method_5841().<Float>N(staticFields_27fa3311b0e9d3e9b883d09222919bf5a_3);
   }

   @Override
   public boolean method_75123(class07085 var1, class07049 var2, float var3, boolean var4, boolean var5, boolean var6) {
      if (this.method_75195(var2)) {
         return false;
      } else {
         class06584 class06584 = this.method_6118(var1);
         class07072 class07072 = this.method_75204(class06584);
         float f = this.method_59903(var2, var3, class07072) - var3;
         if (!this.method_6115() || this.method_6058().N() != var1) {
            f *= this.method_7261(0.5F);
            var3 *= this.method_76459();
         }

         if (var5 && this.method_75196(var2)) {
            return true;
         } else {
            float f1 = var4 ? var3 + f : 0.0F;
            float f2 = 0.0F;
            if (var2 instanceof class07438 class07438) {
               f2 = class07438.method_6032();
            }

            class06889 class06889 = var2.method_18798();
            boolean flag = var4 && var2.method_64420(class07072, f1);
            if (var5) {
               this.method_75122(var2, 0.4F + this.method_59924(var2, class07072), class06889);
            }

            boolean flag1 = false;
            if (var6 && var2.method_5765()) {
               flag1 = true;
               var2.method_5848();
            }

            if (!flag && !var5 && !flag1) {
               return false;
            } else {
               this.method_75200(var2, false, false, var4, true, f);
               this.method_6114(var2);
               this.method_75199(var2, class06584, class07072, flag);
               this.method_75198(var2, f2);
               this.method_7322(0.1F);
               return true;
            }
         }
      }
   }

   @Override
   public class08599 method_67518() {
      return new class08433(this);
   }

   @Override
   public void method_6007() {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      if (this.fields_17fa3311b0e9d3e9b883d09222919bf5a_1 > 0) {
         this.fields_17fa3311b0e9d3e9b883d09222919bf5a_1 = this.fields_17fa3311b0e9d3e9b883d09222919bf5a_1 - 1;
      }

      this.method_64400();
      this.fields_07fa3311b0e9d3e9b883d09222919bf5a_0.B();
      if (this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.y && !this.method_5765()) {
         this.method_38785();
      }

      super.method_6007();
      this.method_6119();
      super.fields_4212a028292fd3c078969e3ee4c71d9e8_2 = this.method_36454();
      float f = (float)this.method_45325(class05298.l);
      this.handler$doi000$viafabricplus$storeSprintingState(null);
      this.method_6125(f);
      if (this.method_6032() > 0.0F && !this.method_7325()) {
         class00734 class00734;
         if (this.method_5765() && !this.method_5854().method_31481()) {
            class00734 = this.method_5829().y(this.method_5854().method_5829()).L(1.0, 0.0, 1.0);
         } else {
            class00734 = this.method_5829().L(1.0, 0.5, 1.0);
         }

         List<class07049> list = this.method_73183().N_70(this, class00734);
         ArrayList arraylist = Lists.newArrayList();

         for (class07049 class07049 : list) {
            if (class07049.method_5864() == class07078.r) {
               arraylist.add(class07049);
            } else if (!class07049.method_31481()) {
               this.method_7341(class07049);
            }
         }

         if (!arraylist.isEmpty()) {
            this.method_7341(class07536.N_77(arraylist, this.field_5974));
         }
      }

      this.method_74082();
   }

   @Override
   public boolean method_44201(class07085 var1) {
      return var1.N() == class07043.field_6178;
   }

   @Override
   public class07443 method_39760() {
      return new class07443(class04909.lu, class04909.Gf);
   }

   @Override
   public void method_6074(class04782 var1, class07072 var2, float var3) {
      if (!this.method_5679(var1, var2)) {
         var3 = this.method_6132(var2, var3);
         var3 = this.method_6036(var2, var3);
         float f1 = Math.max(var3 - this.method_6067(), 0.0F);
         this.method_6073(this.method_6067() - (var3 - f1));
         float f = var3 - f1;
         if (f > 0.0F && f < 3.4028235E37F) {
            this.method_7339(class01235.c, Math.round(f * 10.0F));
         }

         if (f1 != 0.0F) {
            this.method_7322(var2.N());
            this.method_6066().N(var2, f1);
            this.method_6033(this.method_6032() - f1);
            if (f1 < 3.4028235E37F) {
               this.method_7339(class01235.e, Math.round(f1 * 10.0F));
            }

            this.method_32876(class01194.P);
         }
      }
   }

   @Override
   public void method_6091(class06889 var1) {
      if (this.method_5765()) {
         super.method_6091(var1);
      } else {
         label30:
         if (this.redirect$dck000$viafabricplus$preventSwimmingResurface(this)) {
            double d0 = this.method_5720().B;
            double d1 = d0 < -0.2 ? 0.085 : 0.06;
            if (!(d0 <= 0.0) && !super.fields_6212a028292fd3c078969e3ee4c71d9e8_4) {
               class07299 class07299 = this.method_73183();
               double d6 = this.method_23317();
               double d7 = this.method_23318() + 1.0 - 0.1;
               double d4 = this.method_23321();
               double d3 = d7;
               double d2 = d6;
               if (class07299.method_8316(this.redirect$dck000$viafabricplus$modifyWaterAbovePosition(d2, d3, d4)).W()) {
                  break label30;
               }
            }

            class06889 class06889xx = this.method_18798();
            class06889 class06889x = class06889xx.y(0.0, (d0 - class06889xx.B) * d1, 0.0);
            if (this.wrapWithCondition$dck000$viafabricplus$preventSwimmingMotionWhenJumping(this, class06889x)) {
               this.method_18799(class06889x);
            }
         }

         this.handler$dck000$viafabricplus$preventJumpingWhenStartedSwimming(var1, null);
         if (this.method_31549().y) {
            double d5 = this.method_18798().B;
            super.method_6091(var1);
            class06889 class06889 = this.method_18798().N(class07185.field_11052, d5 * 0.6);
            LocalRefImpl localrefimpl = new LocalRefImpl();
            localrefimpl.init(var1);
            this.redirect$dck000$viafabricplus$removeFlySlipperiness$mixinextras$bridge$259(this, class06889, localrefimpl);
            var1 = (class06889)localrefimpl.dispose();
         } else {
            super.method_6091(var1);
         }
      }
   }

   @Override
   public float method_7292() {
      return (float)this.method_45325(class05298.j);
   }

   @Override
   public float method_53964() {
      return this.redirect$dni000$viafabricplus$dontModifyHeadRotationWhenBlocking(this) ? 15.0F : super.method_53964();
   }

   @Override
   public void method_75122(class07049 var1, float var2, class06889 var3) {
      if (var2 > 0.0F) {
         if (var1 instanceof class07438) {
            ((class07438)var1)
               .method_6005(var2, class04995.m(this.method_36454() * (float) (Math.PI / 180.0)), -class04995.P(this.method_36454() * (float) (Math.PI / 180.0)));
         } else {
            var1.method_5762(
               -class04995.m(this.method_36454() * (float) (Math.PI / 180.0)) * var2, 0.1, class04995.P(this.method_36454() * (float) (Math.PI / 180.0)) * var2
            );
         }

         this.method_18799(this.method_18798().u(0.6, 1.0, 0.6));
         this.method_5728(false);
      }

      if (var1 instanceof class04770 && var1.field_6037) {
         ((class04770)var1).field_13987.method_14364(new class06652(var1));
         var1.field_6037 = false;
         var1.method_18799(var3);
      }
   }

   @Override
   public boolean method_6071() {
      return true;
   }

   @Override
   public void method_75125() {
      if (this.method_76458()) {
         super.method_75125();
      }
   }

   @Override
   public float method_6029() {
      return (float)this.method_45325(class05298.l);
   }

   @Override
   public boolean method_6101() {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.handler$dng000$viafabricplus$allowClimbingWhileFlying(callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return callbackinforeturnable.getReturnValueZ();
      } else {
         return this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.y ? false : super.method_6101();
      }
   }

   @Override
   public void method_6078(class07072 var1) {
      super.method_6078(var1);
      this.method_23311();
      if (!this.method_7325() && this.method_73183() instanceof class04782 class04782) {
         this.method_16080(class04782, var1);
      }

      if (var1 != null) {
         this.method_18800(
            -class04995.P((this.method_48157() + this.method_36454()) * (float) (Math.PI / 180.0)) * 0.1F,
            0.1F,
            -class04995.m((this.method_48157() + this.method_36454()) * (float) (Math.PI / 180.0)) * 0.1F
         );
      } else {
         this.method_18800(0.0, 0.1, 0.0);
      }

      this.method_7281(class01235.a);
      this.method_7266(class01235.Z.y(class01235.W));
      this.method_7266(class01235.Z.y(class01235.m));
      this.method_5646();
      this.method_33572(false);
      this.method_43120(Optional.of(class06289.N(this.method_73183().method_27983(), this.method_24515())));
   }

   @Override
   public class04891 method_6011(class07072 var1) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.m_handler$ecm000$viafabricplus_visuals$replaceSound_174(var1, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class04891)callbackinforeturnable.getReturnValue() : var1.U().u().N();
   }

   @Override
   public void method_18400() {
      this.method_7358(true, true);
   }

   @Override
   public float method_6017() {
      return 1.0F;
   }

   @Override
   public boolean method_63628() {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      return !this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.y && super.method_63628();
   }

   @Override
   public boolean method_33190() {
      return !this.method_31549().N && super.method_33190();
   }

   @Override
   public void method_75124() {
      this.method_75203();
      super.method_75124();
   }

   @Override
   public void method_6105(class07072 var1, float var2) {
      this.method_57292(var1, var2, new class07085[]{class07085.field_6166, class07085.field_6172, class07085.field_6174, class07085.field_6169});
   }

   @Override
   public boolean method_29920() {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      return !this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.y;
   }

   @Override
   public boolean method_6062() {
      return super.method_6062() || this.method_6113();
   }

   @Override
   public float method_48157() {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      return this.fields_57fa3311b0e9d3e9b883d09222919bf5a_3;
   }

   @Override
   public void method_52544(float var1) {
      this.method_5841().N(staticFields_27fa3311b0e9d3e9b883d09222919bf5a_3, var1);
   }

   public class06556 method_7265() {
      return new class06556();
   }

   public void method_7316(int var1) {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      this.fields_37fa3311b0e9d3e9b883d09222919bf5a_0 = IntMath.saturatedAdd(this.fields_37fa3311b0e9d3e9b883d09222919bf5a_0, var1);
      if (this.fields_37fa3311b0e9d3e9b883d09222919bf5a_0 < 0) {
         this.fields_37fa3311b0e9d3e9b883d09222919bf5a_0 = 0;
         this.fields_37fa3311b0e9d3e9b883d09222919bf5a_2 = 0.0F;
         this.fields_37fa3311b0e9d3e9b883d09222919bf5a_1 = 0;
      }

      if (var1 > 0
         && this.fields_37fa3311b0e9d3e9b883d09222919bf5a_0 % 5 == 0
         && this.fields_47fa3311b0e9d3e9b883d09222919bf5a_2.intValue() < this.field_6012 - 100.0F) {
         float f = this.fields_37fa3311b0e9d3e9b883d09222919bf5a_0 > 30 ? 1.0F : this.fields_37fa3311b0e9d3e9b883d09222919bf5a_0.intValue() / 30.0F;
         this.method_73183()
            .method_43128(null, this.method_23317(), this.method_23318(), this.method_23321(), class04909.lL, this.method_5634(), f * 0.75F, 1.0F);
         this.fields_47fa3311b0e9d3e9b883d09222919bf5a_2 = this.field_6012;
      }
   }

   public void method_7286(class06584 var1, int var2) {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      this.fields_37fa3311b0e9d3e9b883d09222919bf5a_0 = this.fields_37fa3311b0e9d3e9b883d09222919bf5a_0 - var2;
      if (this.fields_37fa3311b0e9d3e9b883d09222919bf5a_0 < 0) {
         this.fields_37fa3311b0e9d3e9b883d09222919bf5a_0 = 0;
         this.fields_37fa3311b0e9d3e9b883d09222919bf5a_2 = 0.0F;
         this.fields_37fa3311b0e9d3e9b883d09222919bf5a_1 = 0;
      }

      this.fields_47fa3311b0e9d3e9b883d09222919bf5a_0 = this.field_5974.M();
   }

   public int method_7349() {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      if (this.fields_37fa3311b0e9d3e9b883d09222919bf5a_0 >= 30) {
         return 112 + (this.fields_37fa3311b0e9d3e9b883d09222919bf5a_0 - 30) * 9;
      } else {
         return this.fields_37fa3311b0e9d3e9b883d09222919bf5a_0 >= 15
            ? 37 + (this.fields_37fa3311b0e9d3e9b883d09222919bf5a_0 - 15) * 5
            : 7 + this.fields_37fa3311b0e9d3e9b883d09222919bf5a_0 * 2;
      }
   }

   public void method_7281(class01894 var1) {
      this.method_7259(class01235.Z.y(var1));
   }

   public class08044 method_31548() {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      return this.fields_07fa3311b0e9d3e9b883d09222919bf5a_0;
   }

   public class08033 method_31549() {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      return this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1;
   }

   public boolean method_21824() {
      return this.method_5715();
   }

   public void method_7262() {
   }

   public void method_74082() {
   }

   public void method_64400() {
   }

   public void method_7346() {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      this.fields_07fa3311b0e9d3e9b883d09222919bf5a_3 = this.fields_07fa3311b0e9d3e9b883d09222919bf5a_2;
   }

   private static void staticFields7fa3311b0e9d3e9b883d09222919bf5a() {
      staticFields_07fa3311b0e9d3e9b883d09222919bf5a_0 = 20;
      staticFields_07fa3311b0e9d3e9b883d09222919bf5a_1 = 100;
      staticFields_07fa3311b0e9d3e9b883d09222919bf5a_2 = 10;
      staticFields_17fa3311b0e9d3e9b883d09222919bf5a_0 = 200;
      staticFields_17fa3311b0e9d3e9b883d09222919bf5a_1 = 499;
      staticFields_17fa3311b0e9d3e9b883d09222919bf5a_2 = 500;
      staticFields_27fa3311b0e9d3e9b883d09222919bf5a_0 = 4.5F;
      staticFields_27fa3311b0e9d3e9b883d09222919bf5a_1 = 3.0F;
      staticFields_27fa3311b0e9d3e9b883d09222919bf5a_2 = 40;
      staticFields_27fa3311b0e9d3e9b883d09222919bf5a_3 = null;
      staticFields_27fa3311b0e9d3e9b883d09222919bf5a_4 = null;
      staticFields_27fa3311b0e9d3e9b883d09222919bf5a_5 = null;
      staticFields_27fa3311b0e9d3e9b883d09222919bf5a_6 = null;
      staticFields_37fa3311b0e9d3e9b883d09222919bf5a_0 = (short)0;
      staticFields_37fa3311b0e9d3e9b883d09222919bf5a_1 = 0.0F;
      staticFields_37fa3311b0e9d3e9b883d09222919bf5a_2 = 0;
      staticFields_37fa3311b0e9d3e9b883d09222919bf5a_3 = 0;
      staticFields_37fa3311b0e9d3e9b883d09222919bf5a_4 = 0;
      staticFields_47fa3311b0e9d3e9b883d09222919bf5a_0 = 0;
      staticFields_47fa3311b0e9d3e9b883d09222919bf5a_1 = 0;
      staticFields_47fa3311b0e9d3e9b883d09222919bf5a_2 = false;
      staticFields_47fa3311b0e9d3e9b883d09222919bf5a_3 = 0;
      staticFields_47fa3311b0e9d3e9b883d09222919bf5a_4 = 2.0F;
      staticFields_47fa3311b0e9d3e9b883d09222919bf5a_5 = null;
   }

   private float redirect$djf000$viafabricplus$removeAttackCooldown(float var1, float var2, float var3) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8) ? 1.0F : class04995.N(var1, var2, var3);
   }

   private void m_handler$ecm000$viafabricplus_visuals$replaceSound_174(class07072 var1, CallbackInfoReturnable var2) {
      if (VisualSettings.INSTANCE.replaceHurtSoundWithOOFSound.isEnabled()) {
         var2.setReturnValue(staticFields_47fa3311b0e9d3e9b883d09222919bf5a_5);
      }
   }

   private float redirect$djf000$viafabricplus$removeSwapCooldown(float var1, float var2, float var3) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8) ? 1.0F : class04995.N(var1, var2, var3);
   }

   private float redirect$dmo000$viafabricplus$modifyStepHeight(class08036 var1) {
      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_10) ? 1.0F : var1.method_49476();
   }

   private void handler$doi000$viafabricplus$storeSprintingState(CallbackInfo var1) {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      this.fields_67fa3311b0e9d3e9b883d09222919bf5a_2 = this.method_5624();
   }

   private void handler$cff000$nursultan$injectGetOffGroundSpeed(CallbackInfoReturnable var1) {
      if (this instanceof class11822) {
         class11821<Float> class11821 = ((class11822)this).dataManager().L();
         float f = class11821.N();
         class11821.N(1.0F);
         var1.setReturnValue((Float)var1.getReturnValue() * f);
      }
   }

   private void m_handler$zeg000$fabric_entity_events_v1$onTrySleep_175(class07209 var1, CallbackInfoReturnable var2) {
      class08035 class08035 = ((AllowSleeping)EntitySleepEvents.ALLOW_SLEEPING.invoker()).allowSleep(this, var1);
      if (class08035 != null) {
         var2.setReturnValue(Either.left(class08035));
      }
   }

   private void handler$dij000$viafabricplus$fixCreativeCheck(CallbackInfoReturnable var1) {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
         var1.setReturnValue(this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.u);
      }
   }

   public void method_7320(int var1) {
      this.field_6011.N(staticFields_27fa3311b0e9d3e9b883d09222919bf5a_4, var1);
   }

   @Nullable
   public abstract class07282 method_68876();

   public Optional<class06289> method_43122() {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      return this.fields_57fa3311b0e9d3e9b883d09222919bf5a_1;
   }

   public int method_7272() {
      return this.field_6011.<Integer>N(staticFields_27fa3311b0e9d3e9b883d09222919bf5a_4);
   }

   public class08774 method_72498() {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      return new class08774(this.fields_47fa3311b0e9d3e9b883d09222919bf5a_3);
   }

   public void method_7277(class07049 var1) {
   }

   public class08152 method_75004() {
      return class08152.M;
   }

   public void method_5997(class07049 var1) {
      if (!this.method_75195(var1)) {
         float f = this.method_6123() ? super.fields_10212a028292fd3c078969e3ee4c71d9e8_2 : (float)this.method_45325(class05298.u);
         class06584 class06584 = this.method_59958();
         class07072 class07072 = this.method_75204(class06584);
         float f1 = this.method_7261(0.5F);
         float f2 = f1 * (this.method_59903(var1, f, class07072) - f);
         f *= this.method_76459();
         this.method_75124();
         if (!this.method_75196(var1)) {
            if (f > 0.0F || f2 > 0.0F) {
               boolean flag = f1 > 0.9F;
               boolean flag1;
               if (this.method_5624() && flag) {
                  this.method_76457(class04909.GX);
                  flag1 = true;
               } else {
                  flag1 = false;
               }

               f += class06584.B().N(var1, f, class07072);
               boolean flag2 = flag && this.method_75197(var1);
               if (flag2) {
                  f *= 1.5F;
               }

               float f3 = f + f2;
               boolean flag3 = this.method_75201(flag, flag2, flag1);
               float f4 = 0.0F;
               if (var1 instanceof class07438 class07438) {
                  f4 = class07438.method_6032();
               }

               class06889 class06889 = var1.method_18798();
               if (var1.method_64420(class07072, f3)) {
                  this.method_75122(var1, this.method_59924(var1, class07072) + (flag1 ? 0.5F : 0.0F), class06889);
                  if (flag3) {
                     this.method_7263(var1, f, class07072, f1);
                  }

                  this.method_75200(var1, flag2, flag3, flag, false, f2);
                  this.method_6114(var1);
                  this.method_75199(var1, class06584, class07072, true);
                  this.method_75198(var1, f4);
                  this.method_7322(0.1F);
               } else {
                  this.method_76457(class04909.Ga);
               }
            }

            this.method_75125();
         }
      }
   }

   public void method_7304(class07049 var1) {
   }

   public void method_7350() {
      super.fields_3212a028292fd3c078969e3ee4c71d9e8_1 = 0;
      super.fields_3212a028292fd3c078969e3ee4c71d9e8_2 = 0;
   }

   public static Optional<class07648> method_74135(class07001 var0) {
      return !var0.z() && (class07078)var0.N_15("id", class07078.N).orElse(null) == class07078.Nx
         ? var0.N_15("Variant", class07648.field_56653)
         : Optional.empty();
   }

   @Nullable
   public class00717 method_7328(class06584 var1, boolean var2) {
      return this.method_7329(var1, false, var2);
   }

   public float method_59903(class07049 var1, float var2, class07072 var3) {
      return var2;
   }

   public Optional<class03982> method_42272() {
      return Optional.empty();
   }

   public void method_74133(Optional<class07648> var1) {
      this.field_6011.N(staticFields_27fa3311b0e9d3e9b883d09222919bf5a_5, method_74131(var1));
   }

   public void method_74134(Optional<class07648> var1) {
      this.field_6011.N(staticFields_27fa3311b0e9d3e9b883d09222919bf5a_6, method_74131(var1));
   }

   public boolean method_33793() {
      return false;
   }

   public int method_7278() {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      return this.fields_47fa3311b0e9d3e9b883d09222919bf5a_0;
   }

   private class01312 method_66325() {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      if (this.method_6113()) {
         return class01312.field_18078;
      } else if (this.method_5681()) {
         return class01312.field_18079;
      } else if (this.method_6128()) {
         return class01312.field_18077;
      } else if (this.method_6123()) {
         return class01312.field_18080;
      } else {
         return this.method_5715() && !this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.y ? class01312.field_18081 : class01312.field_18076;
      }
   }

   public void method_7285(int var1) {
      int i = this.method_7272();
      this.field_6011.N(staticFields_27fa3311b0e9d3e9b883d09222919bf5a_4, i + var1);
   }

   public static class05300 method_26956() {
      return class07438.method_26827()
         .N(class05298.u, 1.0)
         .N(class05298.l, 0.1F)
         .N(class05298.R)
         .N(class05298.j)
         .N(class05298.B, 4.5)
         .N(class05298.E, 3.0)
         .N(class05298.M)
         .N(class05298.g)
         .N(class05298.Y)
         .N(class05298.t)
         .N(class05298.I)
         .N(class05298.q, 6.0E7)
         .N(class05298.K, 6.0E7);
   }

   public double method_55754() {
      return this.method_45325(class05298.B);
   }

   public boolean method_7305(class00500 var1) {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      return !var1.J() || this.fields_07fa3311b0e9d3e9b883d09222919bf5a_0.y().y(var1);
   }

   public Optional<class07648> method_74136() {
      return method_74132(this.field_6011.N(staticFields_27fa3311b0e9d3e9b883d09222919bf5a_5));
   }

   private boolean method_75201(boolean var1, boolean var2, boolean var3) {
      if (var1 && !var2 && !var3 && this.method_24828()) {
         double d0 = this.method_60478().z();
         double d1 = this.method_6029() * 2.5;
         if (d0 < class04995.E(d1)) {
            return this.method_5998(class07050.field_5808).N(class01226.LN);
         }
      }

      return false;
   }

   public boolean method_56092(class00734 var1, double var2) {
      double d0 = this.method_55755() + var2;
      return var1.i(this.method_33571()) < d0 * d0;
   }

   public void method_40126(int var1, float var2, class06584 var3) {
      super.fields_10212a028292fd3c078969e3ee4c71d9e8_1 = var1;
      super.fields_10212a028292fd3c078969e3ee4c71d9e8_2 = var2;
      super.fields_10212a028292fd3c078969e3ee4c71d9e8_3 = var3;
      if (!this.method_73183().method_8608()) {
         this.method_7262();
         this.method_6085(4, true);
      }
   }

   public boolean method_52558(class01312 var1) {
      class07299 class07299 = this.method_73183();
      class00734 class00734 = this.method_18377(var1).N(this.method_73189());
      double d0 = 1.0E-7;
      class00734 class00734x = class00734;
      return class07299.method_8587(this, this.redirect$dng000$viafabricplus$removeContractionOfCollisionBox(class00734x, d0));
   }

   @Override
   public double method_72381() {
      return this.method_55754();
   }

   public boolean method_7332(boolean var1) {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.handler$dij000$viafabricplus$preventEatingFoodInCreative(var1, callbackinforeturnable);
      return callbackinforeturnable.isCancelled()
         ? callbackinforeturnable.getReturnValueZ()
         : this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.N || var1 || this.fields_17fa3311b0e9d3e9b883d09222919bf5a_0.L();
   }

   public int method_7297() {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      return this.fields_17fa3311b0e9d3e9b883d09222919bf5a_3;
   }

   public GameProfile method_7334() {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      return this.fields_47fa3311b0e9d3e9b883d09222919bf5a_3;
   }

   public boolean method_7276() {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      boolean flag;
      boolean flag1 = flag = this.method_6113() && this.fields_17fa3311b0e9d3e9b883d09222919bf5a_3 >= 100;
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true, flag);
      this.m_handler$zeg000$fabric_entity_events_v1$onIsSleepingLongEnough_173(callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? callbackinforeturnable.getReturnValueZ() : flag1;
   }

   public void method_7293() {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();

      for (int i = 0; i < this.fields_07fa3311b0e9d3e9b883d09222919bf5a_0.method_5439(); i++) {
         class06584 class06584 = this.fields_07fa3311b0e9d3e9b883d09222919bf5a_0.method_5438(i);
         if (!class06584.R() && class07323.N(class06584, class02523.g)) {
            this.fields_07fa3311b0e9d3e9b883d09222919bf5a_0.method_5441(i);
         }
      }
   }

   public boolean method_61498() {
      return false;
   }

   public boolean method_76729(class00734 var1, double var2) {
      return this.method_76693().N(this, var1, var2);
   }

   public void method_33592(class06584 var1, class06584 var2, class05442 var3) {
   }

   private class07072 method_75204(class06584 var1) {
      return var1.N(this, () -> this.method_48923().N(this));
   }

   public void method_7268(boolean var1) {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      this.fields_47fa3311b0e9d3e9b883d09222919bf5a_4 = var1;
   }

   private class05216 method_7299(class05216 var1) {
      String s = this.method_7334().name();
      return var1.N(var2x -> var2x.N(new class00640("/tell " + s + " ")).N(this.method_5769()).N(s));
   }

   public boolean method_21825() {
      return this.method_5715();
   }

   public void method_7318() {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.handler$dhj000$viafabricplus$onUpdatePose(callbackinfo);
      if (!callbackinfo.isCancelled()) {
         if (this.method_52558(class01312.field_18079)) {
            class01312 class01312x = this.method_66325();
            class01312 class01312x;
            if (this.method_7325() || this.method_5765() || this.method_52558(class01312x)) {
               class01312x = class01312x;
            } else if (this.method_52558(class01312.field_18081)) {
               class01312x = class01312.field_18081;
            } else {
               class01312x = class01312.field_18079;
            }

            this.method_18380(class01312x);
         }
      }
   }

   private boolean method_59818(double var1, double var3, double var5) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.handler$dmo000$viafabricplus$changeOffsetsForSneakingCollisionDetection(var1, var3, var5, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return callbackinforeturnable.getReturnValueZ();
      } else {
         class00734 class00734 = this.method_5829();
         return this.method_73183()
            .method_8587(
               this,
               new class00734(
                  class00734.N + 1.0E-7 + var1,
                  class00734.y - var5 - 1.0E-7,
                  class00734.L + 1.0E-7 + var3,
                  class00734.u - 1.0E-7 + var1,
                  class00734.y,
                  class00734.R - 1.0E-7 + var3
               )
            );
      }
   }

   public boolean method_76458() {
      return this.method_7344().y() || this.method_31549().L;
   }

   public double method_55755() {
      return this.method_45325(class05298.E);
   }

   public float method_7261(float var1) {
      float f3 = (super.fields_3212a028292fd3c078969e3ee4c71d9e8_1.intValue() + var1) / this.method_7279();
      float f2 = 1.0F;
      float f1 = 0.0F;
      float f = f3;
      return this.redirect$djf000$viafabricplus$removeAttackCooldown(f, f1, f2);
   }

   private void method_75198(class07049 var1, float var2) {
      if (var1 instanceof class07438) {
         float f = var2 - ((class07438)var1).method_6032();
         this.method_7339(class01235.q, Math.round(f * 10.0F));
         if (this.method_73183() instanceof class04782 && f > 2.0F) {
            int i = (int)(f * 0.5);
            ((class04782)this.method_73183())
               .method_65096(class07107.B, var1.method_23317(), var1.method_23323(0.5), var1.method_23321(), i, 0.1, 0.0, 0.1, 0.2);
         }
      }
   }

   public boolean method_76730() {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      return this.fields_67fa3311b0e9d3e9b883d09222919bf5a_0 > 0;
   }

   public float method_7351(class00500 var1) {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      float f = this.fields_07fa3311b0e9d3e9b883d09222919bf5a_0.y().N(var1);
      if (f > 1.0F) {
         f += (float)this.method_45325(class05298.t);
      }

      LocalFloatRefImpl localfloatrefimpl = new LocalFloatRefImpl();
      localfloatrefimpl.init(f);
      this.handler$ddl000$viafabricplus$changeSpeedCalculation(var1, null, localfloatrefimpl);
      f = localfloatrefimpl.dispose();
      if (class07063.N(this)) {
         f *= 1.0F + (class07063.y(this) + 1) * 0.2F;
      }

      class03556<class07084> class03556 = class07047.u;
      LocalFloatRefImpl localfloatrefimpl1 = new LocalFloatRefImpl();
      localfloatrefimpl1.init(f);
      boolean flag = this.redirect$ddl000$viafabricplus$changeSpeedCalculation(this, class03556, localfloatrefimpl1);
      f = localfloatrefimpl1.dispose();
      if (flag) {
         float f1 = switch (this.method_6112(class07047.u).i()) {
            case 0 -> 0.3F;
            case 1 -> 0.09F;
            case 2 -> 0.0027F;
            default -> 8.1E-4F;
         };
         f *= f1;
      }

      f *= (float)this.method_45325(class05298.M);
      if (this.method_5777(class01231.N)) {
         f *= (float)this.method_5996(class05298.g).M();
      }

      if (!this.method_24828()) {
         f /= 5.0F;
      }

      return f;
   }

   public void method_7257(class07480 var1) {
   }

   private void method_7341(class07049 var1) {
      var1.method_5694(this);
   }

   private void method_76457(class04891 var1) {
      this.method_73183().method_43128(null, this.method_23317(), this.method_23318(), this.method_23321(), var1, this.method_5634(), 1.0F, 1.0F);
   }

   public boolean method_7302() {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      return this.fields_47fa3311b0e9d3e9b883d09222919bf5a_4;
   }

   public void method_66695(class08594 var1) {
   }

   public boolean method_64271() {
      return true;
   }

   public class07512 method_7344() {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      return this.fields_17fa3311b0e9d3e9b883d09222919bf5a_0;
   }

   private void method_7263(class07049 var1, float var2, class07072 var3, float var4) {
      this.method_76457(class04909.GF);
      if (this.method_73183() instanceof class04782 class04782) {
         float f = 1.0F + (float)this.method_45325(class05298.I) * var2;

         for (class07438 class07438 : this.method_73183().N(class07438.class, var1.method_5829().L(1.0, 0.25, 1.0))) {
            if (class07438 != this
               && class07438 != var1
               && !this.method_5722(class07438)
               && !(class07438 instanceof class00681 class00681 && class00681.i())
               && this.method_5858(class07438) < 9.0) {
               float f1 = this.method_59903(class07438, f, var3) * var4;
               if (class07438.method_64397(class04782, var3, f1)) {
                  class07438.method_6005(
                     0.4F, class04995.m(this.method_36454() * (float) (Math.PI / 180.0)), -class04995.P(this.method_36454() * (float) (Math.PI / 180.0))
                  );
                  class07323.N(class04782, (class07049)class07438, var3);
               }
            }
         }

         double d0 = -class04995.m(this.method_36454() * (float) (Math.PI / 180.0));
         double d1 = class04995.P(this.method_36454() * (float) (Math.PI / 180.0));
         class04782.method_65096(class07107.Nm, this.method_23317() + d0, this.method_23323(0.5), this.method_23321() + d1, 0, d0, 0.0, d1, 0.0);
      }
   }

   private boolean method_75195(class07049 var1) {
      return !var1.method_5732() ? true : var1.method_5698(this);
   }

   private boolean method_30263(float var1) {
      return this.method_24828() || this.field_6017 < var1 && !this.method_59818(0.0, 0.0, var1 - this.field_6017);
   }

   private void method_75200(class07049 var1, boolean var2, boolean var3, boolean var4, boolean var5, float var6) {
      if (var2) {
         this.method_76457(class04909.Gc);
         this.method_7277(var1);
      }

      if (!var2 && !var3 && !var5) {
         this.method_76457(var4 ? class04909.Gp : class04909.GA);
      }

      if (var6 > 0.0F) {
         this.method_7304(var1);
      }
   }

   public float method_7279() {
      return (float)(1.0 / this.method_45325(class05298.R) * 20.0);
   }

   public void method_75203() {
      super.fields_3212a028292fd3c078969e3ee4c71d9e8_1 = 0;
   }

   public void method_7303(class07253 var1) {
   }

   public boolean method_23668() {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.handler$dnc000$viafabricplus$replaceGlidingCondition(callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return callbackinforeturnable.getReturnValueZ();
      } else if (!this.method_6128() && this.method_63628() && !this.method_5799()) {
         this.method_23669();
         return true;
      } else {
         return false;
      }
   }

   public boolean method_7338() {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      return this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.u && this.method_75004().hasPermission(class08162.y);
   }

   private static Optional<class07648> method_74132(OptionalInt var0) {
      return var0.isPresent() ? Optional.of(class07648.N(var0.getAsInt())) : Optional.empty();
   }

   private float method_76459() {
      float f = this.method_7261(0.5F);
      return 0.2F + f * f * 0.8F;
   }

   public static OptionalInt method_74131(Optional<class07648> var0) {
      return var0.<OptionalInt>map(var0x -> OptionalInt.of(var0x.N())).orElse(OptionalInt.empty());
   }

   public Optional<class07648> method_74137() {
      return method_74132(this.field_6011.N(staticFields_27fa3311b0e9d3e9b883d09222919bf5a_6));
   }

   public class06556 method_7357() {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      return this.fields_57fa3311b0e9d3e9b883d09222919bf5a_0;
   }

   public boolean method_7343(class07209 var1, class07211 var2, class06584 var3) {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      if (this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.i) {
         return true;
      } else {
         class07209 class07209 = var1.method_10093(var2.b());
         class06646 class06646 = new class06646(this.method_73183(), class07209, false);
         return var3.N(class06646);
      }
   }

   private void method_7330() {
      this.method_6092(new class07055(class07047.W, 200, 0, false, false, true));
   }

   public void method_60983() {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      if (this.fields_67fa3311b0e9d3e9b883d09222919bf5a_0 == 0) {
         this.method_58396();
      }
   }

   public boolean method_45015() {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      return (class07482)this.fields_07fa3311b0e9d3e9b883d09222919bf5a_3 != this.fields_07fa3311b0e9d3e9b883d09222919bf5a_2;
   }

   private void method_75199(class07049 var1, class06584 var2, class07072 var3, boolean var4) {
      Object object = var1;
      if (var1 instanceof class00695) {
         object = ((class00695)var1).N;
      }

      boolean flag = false;
      if (this.method_73183() instanceof class04782 class04782) {
         if (object instanceof class07438 class07438) {
            flag = var2.N(class07438, this);
         }

         if (var4) {
            class07323.N(class04782, var1, var3, var2);
         }
      }

      if (!this.method_73183().method_8608() && !var2.R() && object instanceof class07438) {
         if (flag) {
            var2.y((class07438)object, this);
         }

         if (var2.R()) {
            if (var2 == this.method_6047()) {
               this.method_6122(class07050.field_5808, class06584.E);
            } else {
               this.method_6122(class07050.field_5810, class06584.E);
            }
         }
      }
   }

   public class06940 method_7274() {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      return this.fields_07fa3311b0e9d3e9b883d09222919bf5a_1;
   }

   public boolean method_56093(class07209 var1, double var2) {
      double d0 = this.method_55754() + var2;
      return new class00734(var1).i(this.method_33571()) < d0 * d0;
   }

   public void method_76731(int var1) {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      this.fields_67fa3311b0e9d3e9b883d09222919bf5a_0 = Math.max(this.fields_67fa3311b0e9d3e9b883d09222919bf5a_0, var1);
   }

   @Override
   public boolean method_72380(class01114 var1, class07209 var2) {
      return var1.N(this);
   }

   public void method_61499(class06584 var1) {
   }

   public boolean method_7294() {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      return this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.i;
   }

   public void method_23669() {
      this.method_5729(7, true);
   }

   public boolean method_61165() {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      return this.fields_57fa3311b0e9d3e9b883d09222919bf5a_6;
   }

   public boolean method_75202(class06584 var1, int var2) {
      float f = var1.a_(class02484.Z, 0.0F);
      float f1 = (super.fields_3212a028292fd3c078969e3ee4c71d9e8_1 + var2) / this.method_7279();
      return f > 0.0F && f1 < f;
   }

   public float method_75194(float var1) {
      float f3 = (super.fields_3212a028292fd3c078969e3ee4c71d9e8_2.intValue() + var1) / this.method_7279();
      float f2 = 1.0F;
      float f1 = 0.0F;
      float f = f3;
      return this.redirect$djf000$viafabricplus$removeSwapCooldown(f, f1, f2);
   }

   public boolean method_7270(class06584 var1) {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      return this.fields_07fa3311b0e9d3e9b883d09222919bf5a_0.M(var1);
   }

   public void method_16354(class04858 var1) {
   }

   public boolean method_7295() {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      this.fields_27fa3311b0e9d3e9b883d09222919bf5a_0 = this.method_5777(class01231.N);
      return this.fields_27fa3311b0e9d3e9b883d09222919bf5a_0;
   }

   public class07082 method_7287(class07049 var1, class07050 var2) {
      if (this.method_7325()) {
         if (var1 instanceof class06237) {
            this.method_17355((class06237)var1);
         }

         return class07082.i;
      } else {
         class06584 class06584x = this.method_5998(var2);
         class06584 class06584x = class06584x.t();
         class07082 class07082x = var1.method_5688(this, var2);
         if (class07082x.N()) {
            if (this.method_56992() && class06584x == this.method_5998(var2) && class06584x.c() < class06584x.c()) {
               class06584x.i(class06584x.c());
            }

            return class07082x;
         } else {
            if (!class06584x.R() && var1 instanceof class07438) {
               if (this.method_56992()) {
                  class06584x = class06584x;
               }

               class07082 class07082x = class06584x.N(this, (class07438)var1, var2);
               if (class07082x.N()) {
                  this.method_73183().method_32888(class01194.b, var1.method_73189(), class01164.N(this));
                  if (class06584x.R() && !this.method_56992()) {
                     this.method_6122(var2, class06584.E);
                  }

                  return class07082x;
               }
            }

            return class07082.i;
         }
      }
   }

   public void method_66696(class08610 var1) {
   }

   public void method_58396() {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      this.fields_67fa3311b0e9d3e9b883d09222919bf5a_0 = 0;
      this.fields_57fa3311b0e9d3e9b883d09222919bf5a_5 = null;
      this.fields_57fa3311b0e9d3e9b883d09222919bf5a_4 = null;
      this.fields_57fa3311b0e9d3e9b883d09222919bf5a_6 = false;
   }

   public boolean method_7340() {
      return false;
   }

   public boolean method_56094(class07049 var1, double var2) {
      return var1.method_31481() ? false : this.method_56092(var1.method_5829(), var2);
   }

   private boolean method_64179(class06581 var1) {
      for (class07085 class07085 : class07085.field_54086) {
         class06584 class06584 = this.method_6118(class07085);
         class08725 class08725 = class06584.method_58694(class02484.o);
         if (class06584.N(var1) && class08725 != null && class08725.y() == class07085) {
            return true;
         }
      }

      return false;
   }

   private boolean method_75197(class07049 var1) {
      return this.field_6017 > 0.0
         && !this.method_24828()
         && !this.method_6101()
         && !this.method_5799()
         && !this.method_74025()
         && !this.method_5765()
         && var1 instanceof class07438
         && !this.method_5624();
   }

   private boolean method_75196(class07049 var1) {
      if (var1.method_5864().N(class01217.q) && var1 instanceof class08005 && ((class08005)var1).N(class04252.L, this, class08372.N(this), true)) {
         this.method_73183().method_54762(null, this.method_23317(), this.method_23318(), this.method_23321(), class04909.Ga, this.method_5634());
         return true;
      } else {
         return false;
      }
   }

   public boolean method_21701(class07299 var1, class07209 var2, class07282 var3) {
      if (!var3.i()) {
         return false;
      } else if (var3 == class07282.field_9219) {
         return true;
      } else if (this.method_7294()) {
         return false;
      } else {
         class06584 class06584 = this.method_6047();
         return class06584.R() || !class06584.y(new class06646(var1, var2, false));
      }
   }

   public boolean method_66324() {
      this.fields7fa3311b0e9d3e9b883d09222919bf5a();
      return this.fields_27fa3311b0e9d3e9b883d09222919bf5a_1.u;
   }

   public boolean method_74025() {
      return this.method_6059(class07047.P);
   }

   public boolean method_7317() {
      return this.method_6032() > 0.0F && this.method_6032() < this.method_6063();
   }

   public boolean method_31550() {
      return this.method_6115() && this.method_6030().N(class06570.vy);
   }

   private void handler$dhj000$viafabricplus$onUpdatePose(CallbackInfo var1) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_13_2)) {
         class01312 class01312;
         if (this.method_6128()) {
            class01312 = class01312.field_18077;
         } else if (this.method_6113()) {
            class01312 = class01312.field_18078;
         } else if (this.method_5681()) {
            class01312 = class01312.field_18079;
         } else if (this.method_6123()) {
            class01312 = class01312.field_18080;
         } else if (this.method_5715()) {
            class01312 = class01312.field_18081;
         } else {
            class01312 = class01312.field_18076;
         }

         this.method_18380(class01312);
         var1.cancel();
      }
   }

   private void fields7fa3311b0e9d3e9b883d09222919bf5a() {
      if (!this.fields_17fa3311b0e9d3e9b883d09222919bf5a_init) {
         this.fields_17fa3311b0e9d3e9b883d09222919bf5a_init = true;
         this.fields_17fa3311b0e9d3e9b883d09222919bf5a_1 = 0;
         this.fields_17fa3311b0e9d3e9b883d09222919bf5a_2 = 0;
         this.fields_17fa3311b0e9d3e9b883d09222919bf5a_3 = 0;
      }

      if (!this.fields_27fa3311b0e9d3e9b883d09222919bf5a_init) {
         this.fields_27fa3311b0e9d3e9b883d09222919bf5a_init = true;
         this.fields_27fa3311b0e9d3e9b883d09222919bf5a_0 = false;
      }

      if (!this.fields_37fa3311b0e9d3e9b883d09222919bf5a_init) {
         this.fields_37fa3311b0e9d3e9b883d09222919bf5a_init = true;
         this.fields_37fa3311b0e9d3e9b883d09222919bf5a_0 = 0;
         this.fields_37fa3311b0e9d3e9b883d09222919bf5a_1 = 0;
         this.fields_37fa3311b0e9d3e9b883d09222919bf5a_2 = 0.0F;
      }

      if (!this.fields_47fa3311b0e9d3e9b883d09222919bf5a_init) {
         this.fields_47fa3311b0e9d3e9b883d09222919bf5a_init = true;
         this.fields_47fa3311b0e9d3e9b883d09222919bf5a_0 = 0;
         this.fields_47fa3311b0e9d3e9b883d09222919bf5a_1 = 0.02F;
         this.fields_47fa3311b0e9d3e9b883d09222919bf5a_2 = 0;
         this.fields_47fa3311b0e9d3e9b883d09222919bf5a_4 = false;
      }

      if (!this.fields_57fa3311b0e9d3e9b883d09222919bf5a_init) {
         this.fields_57fa3311b0e9d3e9b883d09222919bf5a_init = true;
         this.fields_57fa3311b0e9d3e9b883d09222919bf5a_3 = 0.0F;
         this.fields_57fa3311b0e9d3e9b883d09222919bf5a_6 = false;
      }

      if (!this.fields_67fa3311b0e9d3e9b883d09222919bf5a_init) {
         this.fields_67fa3311b0e9d3e9b883d09222919bf5a_init = true;
         this.fields_67fa3311b0e9d3e9b883d09222919bf5a_0 = 0;
         this.fields_67fa3311b0e9d3e9b883d09222919bf5a_1 = 0;
         this.fields_67fa3311b0e9d3e9b883d09222919bf5a_2 = false;
      }
   }
}
