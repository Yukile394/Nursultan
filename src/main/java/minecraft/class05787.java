package minecraft;

import com.google.common.collect.Maps;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.protocoltranslator.impl.ViaFabricPlusMappingDataLoader;
import com.viaversion.viafabricplus.protocoltranslator.impl.ViaFabricPlusMappingDataLoader.Material;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import it.unimi.dsi.fastutil.bytes.Byte2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.bytes.Byte2ByteOpenHashMap;
import it.unimi.dsi.fastutil.bytes.Byte2ByteMap.Entry;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.EnumMap;
import java.util.Map;
import net.caffeinemc.mods.lithium.common.util.DirectionConstants;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class05787 extends class04651 {
   public static final class06667 N = class06665.E;
   public static final class08071 y = class06665.Np;
   private static final int i = 200;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<class05826>> R = ThreadLocal.withInitial(() -> {
      class05817 class05817 = new class05817(200);
      class05817.defaultReturnValue((byte)127);
      return class05817;
   });
   private final Map<class04688, class00494> M = Maps.newIdentityHashMap();

   protected abstract int L(class05487 var1);

   private boolean M(class04688 var1) {
      return var1.W() || var1.N().N(this);
   }

   public class05787() {
      super();
   }

   private boolean B(class04688 var1) {
      return var1.N().N(this) && var1.u();
   }

   protected static int i(class04688 var0) {
      return var0.u() ? 0 : 8 - Math.min(var0.R(), 8) + (var0.L(N) ? 8 : 0);
   }

   public abstract class04651 i();

   private static boolean u(class04688 var0, class07290 var1, class07209 var2) {
      return var0.N().N(var1.method_8316(var2.method_10084()).N());
   }

   public abstract class04651 u();

   @Override
   public abstract int u(class04688 var1);

   protected abstract int y(class05487 var1);

   protected Map<class07211, class04688> y(class04782 var1, class07209 var2, class00500 var3) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var3, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (Map<class07211, class04688>)callbackinforeturnable.getReturnValue();
      } else {
         int ix = 1000;
         EnumMap enummap = Maps.newEnumMap(class07211.class);
         class04653 class04653 = null;

         for (class07211 class07211 : class07221.field_11062) {
            class07209 class07209 = var2.method_10093(class07211);
            class00500 class00500 = var1.method_8320(class07209);
            class04688 class04688x = class00500.Y();
            if (this.N(var1, var2, var3, class07211, class07209, class00500, class04688x)) {
               class04688 class04688x = this.N(var1, class07209, class00500);
               if (y(var1, class07209, class00500, class04688x.N())) {
                  if (class04653 == null) {
                     class04653 = new class04653(this, var1, var2);
                  }

                  int j;
                  if (class04653.y(class07209)) {
                     j = 0;
                  } else {
                     j = this.N(var1, class07209, 1, class07211.b(), class00500, class04653);
                  }

                  if (j < ix) {
                     enummap.clear();
                  }

                  if (j <= ix) {
                     if (class04688x.N(var1, class07209, class04688x.N(), class07211)) {
                        enummap.put(class07211, class04688x);
                     }

                     ix = j;
                  }
               }
            }
         }

         return enummap;
      }
   }

   @Override
   public class00494 y(class04688 var1, class07290 var2, class07209 var3) {
      return var1.R() == 9 && u(var1, var2, var3)
         ? class00389.y()
         : this.M.computeIfAbsent(var1, var2x -> class00389.N(0.0, 0.0, 0.0, 1.0, var2x.N(var2, var3), 1.0));
   }

   private static boolean y(class07290 var0, class07209 var1, class00500 var2, class04651 var3) {
      class00891 class00891 = var2.i();
      return class00891 instanceof class07132 ? ((class07132)class00891).N(null, var0, var1, var2, var3) : true;
   }

   @Override
   public void y(class04782 var1, class07209 var2, class00500 var3, class04688 var4) {
      if (!var4.u()) {
         class04688 class04688 = this.N(var1, var2, var1.method_8320(var2));
         int ix = this.N(var1, var2, var4, class04688);
         if (class04688.W()) {
            var4 = class04688;
            var3 = class00869.N.W();
            var1.method_8652(var2, var3, 3);
         } else if (class04688 != var4) {
            var4 = class04688;
            var3 = class04688.B();
            var1.method_8652(var2, var3, 3);
            var1.N(var2, class04688.N(), ix);
         }
      }

      this.N(var1, var2, var3, var4);
   }

   @Override
   public float N(class04688 var1) {
      return var1.R() / 9.0F;
   }

   private void N(class04782 var1, class07209 var2, class00500 var3, class00500[] var4, Map var5) {
      Byte2ByteOpenHashMap byte2byteopenhashmap = new Byte2ByteOpenHashMap();
      Byte2ByteOpenHashMap byte2byteopenhashmap1 = new Byte2ByteOpenHashMap();
      Byte2BooleanOpenHashMap byte2booleanopenhashmap = new Byte2BooleanOpenHashMap();
      byte b0 = 0;
      int ix = this.y(var1) + 1;

      for (int j = 0; j < DirectionConstants.HORIZONTAL.length; j++) {
         class07211 class07211x = DirectionConstants.HORIZONTAL[j];
         class07209 var13 = var2.method_10093(class07211x);
         byte b1 = N(var2, var13, ix);
         class00500 class00500 = this.N(var1, var13, var4, b1);
         if (this.N(var1, var2, var3, class07211x, var13, class00500, class00500.Y())) {
            class04688 class04688 = this.N(var1, var13, class00500);
            if (y(var1, var13, class00500, class04688.N())) {
               if (class00500.Y().N(var1, var13, class04688.N(), class07211x)) {
                  var5.put(class07211x, class04688);
               }

               if (this.N(var1, class04688.N(), var2, var3, class07211x, var13, class00500, class00500.Y())) {
                  byte2byteopenhashmap.put(b1, (byte)(17 << j));
                  if (this.N(var1, byte2booleanopenhashmap, b1, var13, class00500)) {
                     b0 |= (byte)(1 << j);
                  }
               }
            }
         }
      }

      for (int j2 = 0; j2 < this.y(var1) && b0 == 0; j2++) {
         class04651 class04651 = this.u();
         ObjectIterator<Entry> objectiterator = byte2byteopenhashmap.byte2ByteEntrySet().fastIterator();

         while (objectiterator.hasNext()) {
            Entry entry = (Entry)objectiterator.next();
            byte b6 = entry.getByteKey();
            byte b7 = entry.getByteValue();
            int k = 2 * ix + 1;
            int l = b6 / k;
            int i1 = b6 % k;
            int j1 = i1 % 2;
            int k1 = (l * 2 + i1 + j1 - ix * 2) / 2;
            int l1 = k1 - i1 + ix;
            class07209 class07209 = var2.method_10069(k1, 0, l1);
            class00500 class00500xx = var4[b6];

            for (int i2 = 0; i2 < DirectionConstants.HORIZONTAL.length; i2++) {
               class07211 class07211 = DirectionConstants.HORIZONTAL[i2];
               byte b2 = DirectionConstants.HORIZONTAL_OPPOSITE_INDICES[i2];
               if ((b7 >> 4 & 1 << b2) == 0) {
                  class07209 class07209x = class07209.method_10093(class07211);
                  byte b3 = N(var2, class07209x, ix);
                  if (!byte2byteopenhashmap.containsKey(b3)) {
                     byte b4 = byte2byteopenhashmap1.getOrDefault(b3, (byte)0);
                     byte b5 = (byte)(b4 | (byte)(16 << i2));
                     b5 = (byte)(b5 | (byte)(b7 & 15));
                     if ((b5 & 15) == (b4 & 15)) {
                        byte2byteopenhashmap1.put(b3, b5);
                     } else {
                        class00500 class00500x = this.N(var1, class07209x, var4, b3);
                        if (this.N(var1, class04651, class07209, class00500xx, class07211, class07209x, class00500x, class00500x.Y())) {
                           byte2byteopenhashmap1.put(b3, b5);
                           if (this.N(var1, byte2booleanopenhashmap, b3, class07209x, class00500x)) {
                              b0 |= (byte)(b7 & 15);
                           }
                        }
                     }
                  }
               }
            }
         }

         Byte2ByteOpenHashMap byte2byteopenhashmap2 = byte2byteopenhashmap;
         byte2byteopenhashmap = byte2byteopenhashmap1;
         byte2byteopenhashmap1 = byte2byteopenhashmap2;
         byte2byteopenhashmap2.clear();
      }

      if (b0 != 0) {
         this.N(b0, var5);
      }
   }

   private boolean N(class07299 var1, class00500 var2, class07209 var3) {
      return N(var1, var3, var2, this.i());
   }

   private void N(byte var1, Map var2) {
      for (int ix = 0; ix < DirectionConstants.HORIZONTAL.length; ix++) {
         if ((var1 & 1 << ix) == 0) {
            var2.remove(DirectionConstants.HORIZONTAL[ix]);
         }
      }
   }

   private class00500 N(class07299 var1, class07209 var2, class00500[] var3, byte var4) {
      int ix = Byte.toUnsignedInt(var4);
      class00500 class00500 = var3[ix];
      if (class00500 == null) {
         class00500 = var1.method_8320(var2);
         var3[ix] = class00500;
      }

      return class00500;
   }

   private boolean N(class05487 var1, Byte2BooleanOpenHashMap var2, byte var3, class07209 var4, class00500 var5) {
      if (var2.containsKey(var3)) {
         return var2.get(var3);
      } else {
         class07209 class07209 = var4.method_10074();
         class00500 class00500 = var1.method_8320(class07209);
         boolean flag = this.N(var1, var4, var5, class07209, class00500);
         var2.put(var3, flag);
         return flag;
      }
   }

   private boolean N(class00500 var1, class07290 var2, class07209 var3, class07211 var4) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_11_1)) {
         Material material = (Material)ViaFabricPlusMappingDataLoader.MATERIALS.get(ViaFabricPlusMappingDataLoader.getBlockMaterial(var1.i()));
         return material.solid();
      } else {
         if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_13_2)) {
            class00891 class00891 = var1.i();
            if (class00891 instanceof class07027
               || class00891 instanceof class07131
               || class00891 instanceof class00624
               || class00891 == class00869.MO
               || class00891 == class00869.MZ
               || class00891 == class00869.ND
               || class00891 == class00869.io
               || class00891 == class00869.iT
               || class00891 == class00869.zN
               || class00891 instanceof class07734
               || class00891 == class00869.yq
               || class00891 == class00869.yd
               || class00891 == class00869.yK
               || class00891 instanceof class07746) {
               return false;
            }
         }

         return var1.L(var2, var3, var4);
      }
   }

   private static boolean N(class00500 var0, class03530 var1, LocalRef var2) {
      return N(var0, var1, (class00891)var2.get());
   }

   private static boolean N(class00500 var0, class03530 var1, class00891 var2) {
      return var1 == class01210.NH ? var2 instanceof class07036 : var0.N(var1);
   }

   private static int N(int var0) {
      return (var0 + 1) * (2 * var0 + 1);
   }

   private static byte N(class07209 var0, class07209 var1, int var2) {
      int ix = var1.method_10263() - var0.method_10263();
      int j = var1.method_10260() - var0.method_10260();
      int k = (ix + j + var2) / 2;
      int l = ix - j + var2;
      int i1 = 2 * var2 + 1;
      return (byte)(k * i1 + l);
   }

   public void N(class04782 var1, class07209 var2, class00500 var3, CallbackInfoReturnable var4) {
      EnumMap enummap = Maps.newEnumMap(class07211.class);
      int ix = this.y(var1) + 1;
      int j = N(ix);
      if (j <= 256) {
         class00500[] aclass00500 = new class00500[j];
         class07211 class07211x = null;
         class07209 class07209x = null;
         class00500 class00500x = null;
         int k = DirectionConstants.HORIZONTAL.length;

         for (int l = 0; l < k; l++) {
            class07211 class07211x = DirectionConstants.HORIZONTAL[l];
            class07209 class07209x = var2.method_10093(class07211x);
            byte b0 = N(var2, class07209x, ix);
            class00500 class00500x = var1.method_8320(class07209x);
            aclass00500[b0] = class00500x;
            if (this.N(var1, class00500x, class07209x)) {
               if (class07211x != null) {
                  this.N(var1, var2, var3, aclass00500, enummap);
                  var4.setReturnValue(enummap);
                  return;
               }

               class07211x = class07211x;
               class07209x = class07209x;
               class00500x = class00500x;
            }
         }

         if (class07211x != null) {
            class04688 class04688x = class00500x.Y();
            if (this.N(var1, var2, var3, class07211x, class07209x, class00500x, class04688x)) {
               class04688 class04688x = this.N(var1, class07209x, class00500x);
               if (y(var1, class07209x, class00500x, class04688x.N()) && class04688x.N(var1, class07209x, class04688x.N(), class07211x)) {
                  enummap.put(class07211x, class04688x);
               }
            }
         }

         var4.setReturnValue(enummap);
      }
   }

   private boolean N(class07290 var1, class04651 var2, class07209 var3, class00500 var4, class07211 var5, class07209 var6, class00500 var7, class04688 var8) {
      return y(var1, var6, var7, var2) && this.N(var1, var3, var4, var5, var6, var7, var8);
   }

   public boolean N(class07290 var1, class07209 var2, class00500 var3, class07209 var4, class00500 var5) {
      return (var5.Y().N().N(this) || N(var1, var4, var5, this.u())) && N(class07211.field_11033, var1, var2, var3, var4, var5);
   }

   private static boolean N(class07211 var0, class07290 var1, class07209 var2, class00500 var3, class07209 var4, class00500 var5) {
      if (!class07529.Nj && (!class07529.Nl || var4.method_10260() >= 0)) {
         class00494 class00494x = var5.M(var1, var4);
         if (class00494x == class00389.y()) {
            return false;
         } else {
            class00494 class00494x = var3.M(var1, var2);
            if (class00494x == class00389.y()) {
               return false;
            } else if (class00494x == class00389.N() && class00494x == class00389.N()) {
               return true;
            } else {
               Object2ByteLinkedOpenHashMap<class05826> object2bytelinkedopenhashmap;
               if (!var3.i().m() && !var5.i().m()) {
                  object2bytelinkedopenhashmap = R.get();
               } else {
                  object2bytelinkedopenhashmap = null;
               }

               class05826 class05826;
               if (object2bytelinkedopenhashmap != null) {
                  class05826 = new class05826(var3, var5, var0);
                  byte b0 = object2bytelinkedopenhashmap.getAndMoveToFirst(class05826);
                  if (b0 != 127) {
                     return b0 != 0;
                  }
               } else {
                  class05826 = null;
               }

               boolean flag = !class00389.y(class00494x, class00494x, var0);
               if (object2bytelinkedopenhashmap != null) {
                  if (object2bytelinkedopenhashmap.size() == 200) {
                     object2bytelinkedopenhashmap.removeLastByte();
                  }

                  object2bytelinkedopenhashmap.putAndMoveToFirst(class05826, (byte)(flag ? 1 : 0));
               }

               return flag;
            }
         }
      } else {
         return false;
      }
   }

   public class04688 N(int var1, boolean var2) {
      return this.u().M().y(y, var1).y(N, var2);
   }

   public class04688 N(boolean var1) {
      return this.i().M().y(N, var1);
   }

   protected abstract boolean N(class04782 var1);

   protected void N(class07284 var1, class07209 var2, class00500 var3, class07211 var4, class04688 var5) {
      class00891 class00891 = var3.i();
      if (class00891 instanceof class07132) {
         ((class07132)class00891).N(var1, var2, var3, var5);
      } else {
         if (!var3.P()) {
            this.N(var1, var2, var3);
         }

         var1.method_8652(var2, var5.B(), 3);
      }
   }

   @Override
   public class06889 N(class07290 var1, class07209 var2, class04688 var3) {
      double d0 = 0.0;
      double d1 = 0.0;
      class07218 class07218 = new class07218();

      for (class07211 var10 : class07221.field_11062) {
         class07218.N(var2, var10);
         class04688 class04688x = var1.method_8316(class07218);
         if (this.M(class04688x)) {
            float f = class04688x.i();
            float f1 = 0.0F;
            if (f == 0.0F) {
               if (!var1.method_8320(class07218).M()) {
                  class07209 class07209 = class07218.method_10074();
                  class04688 class04688x = var1.method_8316(class07209);
                  if (this.M(class04688x)) {
                     f = class04688x.i();
                     if (f > 0.0F) {
                        f1 = var3.i() - (f - 0.8888889F);
                     }
                  }
               }
            } else if (f > 0.0F) {
               f1 = var3.i() - f;
            }

            if (f1 != 0.0F) {
               d0 += var10.P() * f1;
               d1 += var10.T() * f1;
            }
         }
      }

      class06889 class06889 = new class06889(d0, 0.0, d1);
      if (var3.L(N)) {
         for (class07211 class07211x : class07221.field_11062) {
            class07218.N(var2, class07211x);
            if (this.N(var1, class07218, class07211x) || this.N(var1, class07218.method_10084(), class07211x)) {
               class06889 = class06889.u().y(0.0, -6.0, 0.0);
               break;
            }
         }
      }

      return class06889.u();
   }

   protected boolean N(class07290 var1, class07209 var2, class07211 var3) {
      class00500 class00500 = var1.method_8320(var2);
      if (var1.method_8316(var2).N().N(this)) {
         return false;
      } else if (var3 == class07211.field_11036) {
         return true;
      } else {
         return class00500.i() instanceof class07133 ? false : this.N(class00500, var1, var2, var3);
      }
   }

   protected void N(class04782 var1, class07209 var2, class00500 var3, class04688 var4) {
      if (!var4.W()) {
         class07209 class07209 = var2.method_10074();
         class00500 class00500 = var1.method_8320(class07209);
         class04688 class04688x = class00500.Y();
         if (this.N(var1, var2, var3, class07211.field_11033, class07209, class00500, class04688x)) {
            class04688 class04688x = this.N(var1, class07209, class00500);
            class04651 class04651 = class04688x.N();
            if (class04688x.N(var1, class07209, class04651, class07211.field_11033) && y(var1, class07209, class00500, class04651)) {
               this.N(var1, class07209, class00500, class07211.field_11033, class04688x);
               if (this.N(var1, var2) >= 3) {
                  this.N(var1, var2, var4, var3);
               }

               return;
            }
         }

         if (var4.u() || !this.N(var1, var2, var3, class07209, class00500)) {
            this.N(var1, var2, var4, var3);
         }
      }
   }

   private void N(class04782 var1, class07209 var2, class04688 var3, class00500 var4) {
      int ix = var3.R() - this.L(var1);
      if (var3.L(N)) {
         ix = 7;
      }

      if (ix > 0) {
         for (java.util.Map.Entry entry : this.y(var1, var2, var4).entrySet()) {
            class07211 class07211 = (class07211)entry.getKey();
            class04688 class04688 = (class04688)entry.getValue();
            class07209 class07209 = var2.method_10093(class07211);
            this.N(var1, class07209, var1.method_8320(class07209), class07211, class04688);
         }
      }
   }

   protected class04688 N(class04782 var1, class07209 var2, class00500 var3) {
      int ix = 0;
      int j = 0;
      class07218 class07218xx = new class07218();

      for (class07211 class07211 : class07221.field_11062) {
         class07218 class07218x = class07218xx.N(var2, class07211);
         class00500 class00500xx = var1.method_8320(class07218x);
         class04688 class04688xx = class00500xx.Y();
         if (class04688xx.N().N(this) && N(class07211, var1, var2, var3, class07218x, class00500xx)) {
            if (class04688xx.u()) {
               j++;
            }

            ix = Math.max(ix, class04688xx.R());
         }
      }

      if (j >= 2 && this.N(var1)) {
         class00500 class00500x = var1.method_8320(class07218xx.N(var2, class07211.field_11033));
         class04688 class04688x = class00500x.Y();
         if (class00500x.B() || this.B(class04688x)) {
            return this.N(false);
         }
      }

      class07218 class07218x = class07218xx.N(var2, class07211.field_11036);
      class00500 class00500 = var1.method_8320(class07218x);
      class04688 class04688 = class00500.Y();
      if (!class04688.W() && class04688.N().N(this) && N(class07211.field_11036, var1, var2, var3, class07218x, class00500)) {
         return this.N(8, true);
      } else {
         int k = ix - this.L(var1);
         return k <= 0 ? class04684.N.M() : this.N(k, false);
      }
   }

   private static boolean N(class00500 var0) {
      class00891 class00891 = var0.i();
      if (class00891 instanceof class07132) {
         return true;
      } else if (var0.M()) {
         return false;
      } else {
         if (!(class00891 instanceof class07196)) {
            class03530 class03530 = class01210.NH;
            LocalRefImpl localrefimpl = new LocalRefImpl();
            localrefimpl.init(class00891);
            boolean flag = N(var0, class03530, localrefimpl);
            class00891 = (class00891)localrefimpl.dispose();
            if (!flag
               && !var0.N(class00869.uW)
               && !var0.N(class00869.it)
               && !var0.N(class00869.PN)
               && !var0.N(class00869.iq)
               && !var0.N(class00869.MW)
               && !var0.N(class00869.EY)
               && !var0.N(class00869.EK)) {
               return true;
            }
         }

         return false;
      }
   }

   private static boolean N(class07290 var0, class07209 var1, class00500 var2, class04651 var3) {
      return N(var2) && y(var0, var1, var2, var3);
   }

   @Override
   protected void N(class00517<class04651, class04688> var1) {
      var1.N(N);
   }

   protected int N(class07299 var1, class07209 var2, class04688 var3, class04688 var4) {
      return this.N(var1);
   }

   @Override
   public float N(class04688 var1, class07290 var2, class07209 var3) {
      return u(var1, var2, var3) ? 1.0F : var1.i();
   }

   protected abstract void N(class07284 var1, class07209 var2, class00500 var3);

   protected int N(class05487 var1, class07209 var2, int var3, class07211 var4, class00500 var5, class04653 var6) {
      int ix = 1000;

      for (class07211 class07211 : class07221.field_11062) {
         if (class07211 != var4) {
            class07209 class07209 = var2.method_10093(class07211);
            class00500 class00500 = var6.N(class07209);
            class04688 class04688 = class00500.Y();
            if (this.N(var1, this.u(), var2, var5, class07211, class07209, class00500, class04688)) {
               if (var6.y(class07209)) {
                  return var3;
               }

               if (var3 < this.y(var1)) {
                  int j = this.N(var1, class07209, var3 + 1, class07211.b(), class00500, var6);
                  if (j < ix) {
                     ix = j;
                  }
               }
            }
         }
      }

      return ix;
   }

   private boolean N(class07290 var1, class07209 var2, class00500 var3, class07211 var4, class07209 var5, class00500 var6, class04688 var7) {
      return !this.B(var7) && N(var6) && N(var4, var1, var2, var3, var5, var6);
   }

   private int N(class05487 var1, class07209 var2) {
      int ix = 0;

      for (class07211 class07211 : class07221.field_11062) {
         class07209 class07209 = var2.method_10093(class07211);
         class04688 class04688 = var1.method_8316(class07209);
         if (this.B(class04688)) {
            ix++;
         }
      }

      return ix;
   }
}
