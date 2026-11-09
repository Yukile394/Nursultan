package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.injection.access.item.attack_damage.IDisplayDefault;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public final class class02846 implements class02831, IDisplayDefault {
   static final class02846 L = new class02846();
   static final MapCodec<class02846> u = MapCodec.unit(L);
   static final class02362<class04247, class02846> i = class02362.N(L);
   private class02710 R;

   @Override
   public class02836 L() {
      return class02836.field_59739;
   }

   public class02846() {
      super();
   }

   @Override
   public final boolean equals(Object var1) {
      return this == var1 ? true : var1 instanceof class02846;
   }

   @Override
   public final String toString() {
      return "class02846[]";
   }

   @Override
   public final int hashCode() {
      return 0;
   }

   private double N(class08036 var1, class03556 var2) {
      double d0 = 0.0;
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20_5)) {
         for (class03556<class07304> class03556 : this.R.N()) {
            if (class03556.N(class07314.m)) {
               int ix = this.R.N(class03556);
               if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8)) {
                  d0 = ix * 1.25F;
               } else {
                  d0 = 1.0F + Math.max(0, ix - 1) * 0.5F;
               }
               break;
            }
         }
      }

      return ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_8) ? d0 : var1.method_45326(var2) + d0;
   }

   @Override
   public void N(Consumer<class00392> var1, @Nullable class08036 var2, class03556<class07468> var3, class07471 var4) {
      double d0 = var4.y();
      boolean flag = false;
      if (var2 != null) {
         if (var4.N(class06581.M)) {
            class03556<class07468> class03556 = class05298.u;
            d0 += this.N(var2, class03556);
            flag = true;
         } else if (var4.N(class06581.B)) {
            d0 += var2.method_45326(class05298.R);
            flag = true;
         }
      }

      double d1;
      if (var4.L() == class07463.field_6330 || var4.L() == class07463.field_6331) {
         d1 = d0 * 100.0;
      } else if (var3.N(class05298.b)) {
         d1 = d0 * 10.0;
      } else {
         d1 = d0;
      }

      if (flag) {
         var1.accept(
            class05220.N()
               .y(class00392.N("attribute.modifier.equals." + var4.L().N(), class02833.u.format(d1), class00392.L(((class07468)var3.N()).L())))
               .N(class06541.field_1077)
         );
      } else if (d0 > 0.0) {
         var1.accept(
            class00392.N("attribute.modifier.plus." + var4.L().N(), class02833.u.format(d1), class00392.L(((class07468)var3.N()).L()))
               .N(((class07468)var3.N()).y(true))
         );
      } else if (d0 < 0.0) {
         var1.accept(
            class00392.N("attribute.modifier.take." + var4.L().N(), class02833.u.format(-d1), class00392.L(((class07468)var3.N()).L()))
               .N(((class07468)var3.N()).y(false))
         );
      }
   }

   public void viaFabricPlus$setItemEnchantments(class02710 var1) {
      this.R = var1;
   }
}
