package minecraft;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import net.caffeinemc.mods.lithium.common.util.DirectionConstants;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class00513 extends class06760 {
   public static final MapCodec<class00513> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(Codec.BOOL.fieldOf("sticky").forGetter(var0x -> var0x.Z), t()).apply(var0, class00513::new)
   );
   public static final class06667 L = class06665.z;
   public static final int u = 0;
   public static final int i = 1;
   public static final int R = 2;
   public static final int M = 4;
   private static final Map<class07211, class00494> B = class00389.u(class00891.L(16.0, 4.0, 16.0));
   private final boolean Z;

   public class00513(boolean var1, class01362 var2) {
      super(var2);
      this.P(this.Q.y().y(y, class07211.field_11043).y(L, false));
      this.Z = var1;
   }

   @Override
   public class00494 z(class00500 var1) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.r1_1)) {
         return var1.L(L) ? B.get(var1.L(y)) : class00389.y();
      } else {
         return super.z(var1);
      }
   }

   private class07211[] y() {
      return DirectionConstants.ALL;
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return false;
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y, L);
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      return var1.y(y, var2.N(var1.L(y)));
   }

   @Override
   protected class00500 N(class00500 var1, class07111 var2) {
      return var1.N(var2.N(var1.L(y)));
   }

   @Override
   public MapCodec<class00513> N() {
      return N;
   }

   private void N(class00500 var1, class07290 var2, class07209 var3, class06092 var4, CallbackInfoReturnable var5) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.r1_1)) {
         var5.setReturnValue(class00389.y());
      }
   }

   private void N(class07299 var1, class07209 var2, class00500 var3) {
      class07211 class07211 = var3.L(y);
      boolean flag = this.N(var1, var2, class07211);
      if (flag && !var3.L(L)) {
         if (new class00484(var1, var2, class07211, true).N()) {
            var1.method_8427(var2, this, 0, class07211.L());
         }
      } else if (!flag && var3.L(L)) {
         class07209 class07209 = var2.method_10079(class07211, 2);
         class00500 class00500 = var1.method_8320(class07209);
         byte b0 = 1;
         if (class00500.N(class00869.LN)
            && class00500.L(y) == class07211
            && var1.method_8321(class07209) instanceof class00510 class00510
            && class00510.N()
            && (class00510.N(0.0F) < 0.5F || var1.N() == class00510.z() || ((class04782)var1).method_14177())) {
            b0 = 2;
         }

         var1.method_8427(var2, this, b0, class07211.L());
      }
   }

   @Override
   public class00500 N(class06942 var1) {
      return this.W().y(y, var1.L().b()).y(L, false);
   }

   @Override
   protected void N_23(class00500 var1, class07299 var2, class07209 var3, class00500 var4, boolean var5) {
      if (!var4.N(var1.i())) {
         if (!var2.method_8608() && var2.method_8321(var3) == null) {
            this.N(var2, var3, var1);
         }
      }
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class00891 var4, @Nullable class02733 var5, boolean var6) {
      if (!var2.method_8608()) {
         this.N(var2, var3, var1);
      }
   }

   @Override
   public void N(class07299 var1, class07209 var2, class00500 var3, @Nullable class07438 var4, class06584 var5) {
      if (!var1.method_8608()) {
         this.N(var1, var2, var3);
      }
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var3, var4, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (class00494)callbackinforeturnable.getReturnValue();
      } else {
         return var1.L(L) ? B.get(var1.L(y)) : class00389.y();
      }
   }

   private boolean N(class07299 var1, class07209 var2, class07211 var3, boolean var4) {
      class07209 class07209xxxxx = var2.method_10093(var3);
      if (!var4 && var1.method_8320(class07209xxxxx).N(class00869.yK)) {
         var1.method_8652(class07209xxxxx, class00869.N.W(), 276);
      }

      class00484 class00484 = new class00484(var1, var2, var3, var4);
      if (!class00484.N()) {
         return false;
      } else {
         HashMap hashmap = Maps.newHashMap();
         List<class07209> list = class00484.L();
         ArrayList arraylist = Lists.newArrayList();

         for (class07209 class07209x : list) {
            class00500 class00500xxxxx = var1.method_8320(class07209x);
            arraylist.add(class00500xxxxx);
            hashmap.put(class07209x, class00500xxxxx);
         }

         List<class07209> list1 = class00484.u();
         class00500[] aclass00500 = new class00500[list.size() + list1.size()];
         class07211 class07211 = var4 ? var3 : var3.b();
         int ix = 0;

         for (int j = list1.size() - 1; j >= 0; j--) {
            class07209 class07209x = list1.get(j);
            class00500 class00500xxxx = var1.method_8320(class07209x);
            class00394 class00394 = class00500xxxx.k() ? var1.method_8321(class07209x) : null;
            N(class00500xxxx, var1, class07209x, class00394);
            if (!class00500xxxx.N(class01210.Nh) && var1.method_8608()) {
               var1.N(2001, class07209x, W(class00500xxxx));
            }

            var1.method_8652(class07209x, class00869.N.W(), 18);
            var1.N(class01194.R, class07209x, class01164.N(class00500xxxx));
            aclass00500[ix++] = class00500xxxx;
         }

         for (int k = list.size() - 1; k >= 0; k--) {
            class07209 class07209x = list.get(k);
            class00500 class00500xxxxxxxx = var1.method_8320(class07209x);
            class07209x = class07209x.method_10093(class07211);
            hashmap.remove(class07209x);
            class00500 class00500x = class00869.LN.W().y(y, var3);
            var1.method_8652(class07209x, class00500x, 324);
            var1.method_8438(class00511.N(class07209x, class00500x, (class00500)arraylist.get(k), var3, var4, false));
            aclass00500[ix++] = class00500xxxxxxxx;
         }

         if (var4) {
            class08083 class08083 = this.Z ? class08083.field_12634 : class08083.field_12637;
            class00500 class00500 = class00869.yK.W().y(class00483.y, var3).y(class00483.L, class08083);
            class00500 class00500x = class00869.LN.W().y(class00511.y, var3).y(class00511.L, this.Z ? class08083.field_12634 : class08083.field_12637);
            hashmap.remove(class07209xxxxx);
            var1.method_8652(class07209xxxxx, class00500x, 324);
            var1.method_8438(class00511.N(class07209xxxxx, class00500x, class00500, var3, true, true));
         }

         class00500 class00500xx = class00869.N.W();

         for (class07209 class07209x : hashmap.keySet()) {
            var1.method_8652(class07209x, class00500xx, 82);
         }

         for (Entry entry : hashmap.entrySet()) {
            class07209 class07209x = (class07209)entry.getKey();
            class00500 class00500x = (class00500)entry.getValue();
            class00500x.y(var1, class07209x, 2);
            class00500xx.N(var1, class07209x, 2);
            class00500xx.y(var1, class07209x, 2);
         }

         class02733 class02733 = class02752.N(var1, class00484.y(), null);
         ix = 0;

         for (int l = list1.size() - 1; l >= 0; l--) {
            class00500 class00500x = aclass00500[ix++];
            class07209 class07209x = list1.get(l);
            if (var1 instanceof class04782 class04782) {
               class00500x.N(class04782, class07209x, false);
            }

            class00500x.y(var1, class07209x, 2);
            var1.method_8452(class07209x, class00500x.i(), class02733);
         }

         for (int i1 = list.size() - 1; i1 >= 0; i1--) {
            var1.method_8452(list.get(i1), aclass00500[ix++].i(), class02733);
         }

         if (var4) {
            var1.method_8452(class07209xxxxx, class00869.yK, class02733);
         }

         return true;
      }
   }

   public static boolean N(class00500 var0, class07299 var1, class07209 var2, class07211 var3, boolean var4, class07211 var5) {
      if (var2.method_10264() < var1.method_31607() || var2.method_10264() > var1.method_31600() || !var1.method_8621().N(var2)) {
         return false;
      } else if (var0.P()) {
         return true;
      } else if (var0.N(class00869.LV) || var0.N(class00869.TU) || var0.N(class00869.TE) || var0.N(class00869.nc)) {
         return false;
      } else if (var3 == class07211.field_11033 && var2.method_10264() == var1.method_31607()) {
         return false;
      } else if (var3 == class07211.field_11036 && var2.method_10264() == var1.method_31600()) {
         return false;
      } else {
         if (!var0.N(class00869.yq) && !var0.N(class00869.yd)) {
            if (var0.i(var1, var2) == -1.0F) {
               return false;
            }

            switch (var0.n()) {
               case field_15972:
                  return false;
               case field_15971:
                  return var4;
               case field_15970:
                  return var3 == var5;
            }
         } else if (var0.L(L)) {
            return false;
         }

         return !var0.k();
      }
   }

   @Override
   protected boolean N(class00500 var1, class07299 var2, class07209 var3, int var4, int var5) {
      class07211 class07211 = var1.L(y);
      class00500 class00500xx = var1.y(L, true);
      if (!var2.method_8608()) {
         boolean flag = this.N(var2, var3, class07211);
         if (flag && (var4 == 1 || var4 == 2)) {
            var2.method_8652(var3, class00500xx, 2);
            return false;
         }

         if (!flag && var4 == 0) {
            return false;
         }
      }

      if (var4 == 0) {
         if (!this.N(var2, var3, class07211, true)) {
            return false;
         }

         var2.method_8652(var3, class00500xx, 67);
         var2.method_8396(null, var3, class04909.GH, class04911.field_15245, 0.5F, var2.field_9229.z() * 0.25F + 0.6F);
         var2.N(class01194.N, var3, class01164.N(class00500xx));
      } else if (var4 == 1 || var4 == 2) {
         class00394 class00394 = var2.method_8321(var3.method_10093(class07211));
         if (class00394 instanceof class00510) {
            ((class00510)class00394).B();
         }

         class00500 class00500x = class00869.LN.W().y(class00511.y, class07211).y(class00511.L, this.Z ? class08083.field_12634 : class08083.field_12637);
         var2.method_8652(var3, class00500x, 276);
         var2.method_8438(class00511.N(var3, class00500x, this.W().y(y, class07211.N(var5 & 7)), class07211, false, true));
         var2.method_8408(var3, class00500x.i());
         class00500x.N(var2, var3, 2);
         if (this.Z) {
            class07209 class07209 = var3.method_10069(class07211.P() * 2, class07211.s() * 2, class07211.T() * 2);
            class00500 class00500xx = var2.method_8320(class07209);
            boolean flag1 = false;
            if (class00500xx.N(class00869.LN)
               && var2.method_8321(class07209) instanceof class00510 class00510
               && class00510.L() == class07211
               && class00510.N()) {
               class00510.B();
               flag1 = true;
            }

            if (!flag1) {
               if (var4 != 1
                  || class00500xx.P()
                  || !N(class00500xx, var2, class07209, class07211.b(), false, class07211)
                  || class00500xx.n() != class04641.field_15974 && !class00500xx.N(class00869.yq) && !class00500xx.N(class00869.yd)) {
                  var2.method_8650(var3.method_10093(class07211), false);
               } else {
                  this.N(var2, var3, class07211, false);
               }
            }
         } else {
            var2.method_8650(var3.method_10093(class07211), false);
         }

         var2.method_8396(null, var3, class04909.Ge, class04911.field_15245, 0.5F, var2.field_9229.z() * 0.15F + 0.6F);
         var2.N(class01194.i, var3, class01164.N(class00500x));
      }

      return true;
   }

   private boolean N(class03589 var1, class07209 var2, class07211 var3) {
      for (class07211 class07211x : this.y()) {
         if (class07211x != var3 && var1.L(var2.method_10093(class07211x), class07211x)) {
            return true;
         }
      }

      if (var1.L(var2, class07211.field_11033)) {
         return true;
      } else {
         class07209 class07209 = var2.method_10084();

         for (class07211 class07211x : this.y()) {
            if (class07211x != class07211.field_11033 && var1.L(class07209.method_10093(class07211x), class07211x)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   protected boolean a_(class00500 var1) {
      return var1.L(L);
   }
}
