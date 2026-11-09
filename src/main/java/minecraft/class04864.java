package minecraft;

import com.google.common.collect.Sets;
import com.viaversion.viafabricplus.features.font.BuiltinEmptyGlyph1_12_2;
import com.viaversion.viafabricplus.features.font.RenderableGlyphDiff;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.settings.impl.DebugSettings;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class04864 implements AutoCloseable {
   private static final float i = 32.0F;
   private static final class07948 R = new class04857();
   final class04690 N;
   final class00912 y = new class04855(this);
   private List<class06251> M = List.of();
   private List<class06262> B = List.of();
   private final Int2ObjectMap<IntList> Z = new Int2ObjectOpenHashMap();
   public final class03475<class04871> L = new class03475<>(class04871[]::new, class04871[][]::new);
   private final IntFunction<class04871> z = this::y;
   class07948 u = R;
   private final Supplier<class07948> U = () -> this.u;
   private final class04871 E = new class04871(this.U, this.U);
   @Nullable
   private class07913 W;
   private final class08985 m = new class04849(this, false);
   private final class08985 P = new class04849(this, true);
   private class07948 s;
   private class04871 T;
   private boolean b;

   private void L(int var1, CallbackInfoReturnable var2) {
      this.b = false;
   }

   public class04864(class04690 var1) {
      super();
      this.N = var1;
   }

   @Override
   public void close() {
      this.N.close();
   }

   private void y(int var1, CallbackInfoReturnable var2) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
         class04871 class04871 = (class04871)var2.getReturnValue();
         var2.setReturnValue(class04871 == this.E ? this.T : class04871);
      }
   }

   private void y() {
      this.N.N();
      this.L.N();
      this.Z.clear();
      class01923 class01923 = class01923.field_37899;
      class04690 class04690 = this.N;
      this.N(null);
      this.u = Objects.requireNonNull(class01923.N(class04690));
      this.W = class01923.field_37898.N(this.N);
   }

   private class04871 y(int var1) {
      class04850 class04850 = null;
      Iterator iterator = this.B.iterator();

      while (iterator.hasNext()) {
         class00947 class00947 = ((class06262)iterator.next()).N(var1);
         if (class00947 != null) {
            if (class04850 == null) {
               class04850 = new class04850(this, class00947);
            }

            if (!N(class00947.N())) {
               if (class04850.N == class00947) {
                  class04871 class04871xxxxxxx;
                  class04871 class04871x = class04871xxxxxxx = new class04871(class04850, class04850);
                  CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true, class04871xxxxxxx);
                  this.y(var1, callbackinforeturnable);
                  if (callbackinforeturnable.isCancelled()) {
                     return (class04871)callbackinforeturnable.getReturnValue();
                  }

                  return class04871x;
               }

               class04871 class04871xxxxxx;
               class04871 class04871x = class04871xxxxxx = new class04871(class04850, new class04850(this, class00947));
               CallbackInfoReturnable callbackinforeturnable1 = new CallbackInfoReturnable("", true, class04871xxxxxx);
               this.y(var1, callbackinforeturnable1);
               if (callbackinforeturnable1.isCancelled()) {
                  return (class04871)callbackinforeturnable1.getReturnValue();
               }

               return class04871x;
            }
         }
      }

      if (class04850 != null) {
         class04871 class04871xxxxx;
         class04871 class04871x = class04871xxxxx = new class04871(class04850, this.U);
         CallbackInfoReturnable callbackinforeturnable2 = new CallbackInfoReturnable("", true, class04871xxxxx);
         this.y(var1, callbackinforeturnable2);
         return callbackinforeturnable2.isCancelled() ? (class04871)callbackinforeturnable2.getReturnValue() : class04871x;
      } else {
         class04871 class04871xxxx;
         class04871 class04871x = class04871xxxx = this.E;
         CallbackInfoReturnable callbackinforeturnable3 = new CallbackInfoReturnable("", true, class04871xxxx);
         this.y(var1, callbackinforeturnable3);
         return callbackinforeturnable3.isCancelled() ? (class04871)callbackinforeturnable3.getReturnValue() : class04871x;
      }
   }

   private List<class06262> y(List<class06251> var1, Set<class02306> var2) {
      IntOpenHashSet intopenhashset = new IntOpenHashSet();
      ArrayList arraylist = new ArrayList();

      for (class06251 class06251 : var1) {
         if (class06251.y().N(var2)) {
            arraylist.add(class06251.N());
            intopenhashset.addAll(class06251.N().N());
         }
      }

      HashSet hashset = Sets.newHashSet();
      intopenhashset.forEach(var3x -> {
         for (class06262 class06262 : arraylist) {
            class00947 class00947 = class06262.N(var3x);
            if (class00947 != null) {
               hashset.add(class06262);
               if (class00947.N() != class01923.field_37899) {
                  ((IntList)this.Z.computeIfAbsent(class04995.u(class00947.N().N(false)), var0 -> new IntArrayList())).add(var3x);
               }
               break;
            }
         }
      });
      return arraylist.stream().filter(hashset::contains).toList();
   }

   private void N(int var1, CallbackInfoReturnable var2) {
      if (this.R(var1)) {
         if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
            var2.setReturnValue(this.T);
         } else {
            var2.setReturnValue(this.E);
         }
      }
   }

   private void N(class06069 var1, int var2, CallbackInfoReturnable var3) {
      this.b = true;
   }

   public void N(List<class06251> var1, Set<class02306> var2) {
      this.M = var1;
      this.N(var2);
   }

   private static boolean N(class05247 var0) {
      float f = var0.N(false);
      if (!(f < 0.0F) && !(f > 32.0F)) {
         float f1 = var0.N(true);
         return f1 < 0.0F || f1 > 32.0F;
      } else {
         return true;
      }
   }

   public class07913 N() {
      return Objects.requireNonNull(this.W);
   }

   public class08985 N(boolean var1) {
      return var1 ? this.P : this.m;
   }

   public void N(Set<class02306> var1) {
      this.B = List.of();
      this.y();
      this.B = this.y(this.M, var1);
   }

   private void N(CallbackInfo var1) {
      this.s = BuiltinEmptyGlyph1_12_2.INSTANCE.bake(this.N);
      this.T = new class04871(() -> this.s, () -> this.s);
   }

   class04871 N(int var1) {
      class04871 class04871x;
      class04871 class04871x = class04871x = this.L.N(var1, this.z);
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true, class04871x);
      this.N(var1, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (class04871)callbackinforeturnable.getReturnValue();
      } else {
         this.L(var1, null);
         return class04871x;
      }
   }

   public class07948 N(class06069 var1, int var2) {
      this.N(var1, var2, null);
      IntList intlist = (IntList)this.Z.get(var2);
      return intlist != null && !intlist.isEmpty() ? this.N(intlist.getInt(var1.y(intlist.size()))).y().get() : this.u;
   }

   private boolean R(int var1) {
      return !this.b && ((Boolean)DebugSettings.INSTANCE.filterNonExistingGlyphs.getValue())
         ? (this.N.N.equals((class01894)class06202.j_3) || this.N.N.equals((class01894)class06202.j_4)) && !RenderableGlyphDiff.isGlyphRenderable(var1)
         : false;
   }
}
