package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.caffeinemc.mods.sodium.client.render.immediate.model.ImprovedItemModelBuilder;
import org.joml.Vector3f;
import org.jspecify.annotations.Nullable;

public class class02093 implements class00167 {
   public static final class01894 y = class01894.y("builtin/generated");
   public static final List<String> L = List.of("layer0", "layer1", "layer2", "layer3", "layer4");
   public static final float u = 7.5F;
   public static final float i = 8.5F;
   private static final class08814 M = new class08823().N("particle", "layer0").N();
   private static final class02052 B = new class02052(0.0F, 0.0F, 16.0F, 16.0F);
   private static final class02052 Z = new class02052(16.0F, 0.0F, 0.0F, 16.0F);
   public static final float R = 0.1F;

   public class02093() {
      super();
   }

   private static List y(class01991 var0, String var1, int var2) {
      float f = 16.0F / var0.method_45807();
      float f1 = 16.0F / var0.method_45815();
      ArrayList arraylist = new ArrayList();

      for (class02122 class02122 : N(var0)) {
         float f2 = class02122.y();
         float f3 = class02122.L();
         class02124 class02124 = class02122.N();
         float f4 = f2 + 0.1F;
         float f5 = f2 + 1.0F - 0.1F;
         float f6;
         float f7;
         if (class02124.y()) {
            f6 = f3 + 0.1F;
            f7 = f3 + 1.0F - 0.1F;
         } else {
            f6 = f3 + 1.0F - 0.1F;
            f7 = f3 + 0.1F;
         }

         float f8 = f2;
         float f9 = f3;
         float f10 = f2;
         float f11 = f3;
         switch (class02124) {
            case field_4281:
               f10 = f2 + 1.0F;
               break;
            case field_4277:
               f10 = f2 + 1.0F;
               f9 = f3 + 1.0F;
               f11 = f3 + 1.0F;
               break;
            case field_4278:
               f11 = f3 + 1.0F;
               break;
            case field_4283:
               f8 = f2 + 1.0F;
               f10 = f2 + 1.0F;
               f11 = f3 + 1.0F;
         }

         f8 *= f;
         f10 *= f;
         f9 *= f1;
         f11 *= f1;
         f9 = 16.0F - f9;
         f11 = 16.0F - f11;
         Map map = Map.of(class02124.N(), new class02067(null, var2, var1, new class02052(f4 * f, f6 * f, f5 * f1, f7 * f1), class08511.field_57029));
         switch (class02124) {
            case field_4281:
               arraylist.add(new class02081(new Vector3f(f8, f9, 7.5F), new Vector3f(f10, f9, 8.5F), map));
               break;
            case field_4277:
               arraylist.add(new class02081(new Vector3f(f8, f11, 7.5F), new Vector3f(f10, f11, 8.5F), map));
               break;
            case field_4278:
               arraylist.add(new class02081(new Vector3f(f8, f9, 7.5F), new Vector3f(f8, f11, 8.5F), map));
               break;
            case field_4283:
               arraylist.add(new class02081(new Vector3f(f10, f9, 7.5F), new Vector3f(f10, f11, 8.5F), map));
         }
      }

      return arraylist;
   }

   public static boolean N(class01991 var0, int var1, int var2, int var3, int var4, int var5) {
      return var2 >= 0 && var3 >= 0 && var2 < var4 && var3 < var5 ? var0.method_45810(var1, var2, var3) : true;
   }

   private static void N(class02124 var0, Set<class02122> var1, class01991 var2, int var3, int var4, int var5, int var6, int var7) {
      if (N(var2, var3, var4 - var0.field_4276.P(), var5 - var0.field_4276.s(), var6, var7)) {
         var1.add(new class02122(var0, var4, var5));
      }
   }

   private static List N(class01991 var0, String var1, int var2, Operation var3) {
      return ImprovedItemModelBuilder.bakeSideQuads(var0, var1, var2);
   }

   private static class08496 N(class08838 var0, class02028 var1, class04673 var2, class08512 var3) {
      ArrayList arraylist = new ArrayList();

      for (int ix = 0; ix < L.size(); ix++) {
         String s = L.get(ix);
         class05913 class05913 = var0.N(s);
         if (class05913 == null) {
            break;
         }

         class01991 class01991 = var1.y().N(class05913, var3).method_45851();
         arraylist.addAll(N(ix, s, class01991));
      }

      return class08505.N(arraylist, var0, var1, var2, var3);
   }

   private static List<class02081> N(int var0, String var1, class01991 var2) {
      Map map = Map.of(
         class07211.field_11035,
         new class02067(null, var0, var1, B, class08511.field_57029),
         class07211.field_11043,
         new class02067(null, var0, var1, Z, class08511.field_57029)
      );
      ArrayList arraylist = new ArrayList();
      arraylist.add(new class02081(new Vector3f(0.0F, 0.0F, 7.5F), new Vector3f(16.0F, 16.0F, 8.5F), map));
      arraylist.addAll(N(var2, var1, var0));
      return arraylist;
   }

   private static List<class02081> N(class01991 var0, String var1, int var2) {
      return N(var0, var1, var2, var0x -> {
         WrapOperationRuntime.checkArgumentCount(var0x, 3, "[net.minecraft.class_7764, java.lang.String, int]");
         return y((class01991)var0x[0], (String)var0x[1], (Integer)var0x[2]);
      });
   }

   private static Collection<class02122> N(class01991 var0) {
      int ix = var0.method_45807();
      int j = var0.method_45815();
      HashSet hashset = new HashSet();
      var0.method_45817().forEach(var4 -> {
         for (int ixx = 0; ixx < j; ixx++) {
            for (int jx = 0; jx < ix; jx++) {
               if (!N(var0, var4, jx, ixx, ix, j)) {
                  N(class02124.field_4281, hashset, var0, var4, jx, ixx, ix, j);
                  N(class02124.field_4277, hashset, var0, var4, jx, ixx, ix, j);
                  N(class02124.field_4278, hashset, var0, var4, jx, ixx, ix, j);
                  N(class02124.field_4283, hashset, var0, var4, jx, ixx, ix, j);
               }
            }
         }
      });
      return hashset;
   }

   @Override
   public class08814 comp_3743() {
      return M;
   }

   @Nullable
   @Override
   public class00140 comp_3740() {
      return class00140.field_21858;
   }

   @Override
   public class08534 comp_3739() {
      return class02093::N;
   }
}
