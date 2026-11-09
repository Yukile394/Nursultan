package minecraft;

import Nursultan.class10735;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import net.fabricmc.fabric.api.item.v1.EnchantingContext;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.apache.commons.lang3.mutable.MutableFloat;
import org.apache.commons.lang3.mutable.MutableObject;
import org.jspecify.annotations.Nullable;

public class class07323 {
   public static int L(class04782 var0, class06584 var1, class07049 var2) {
      MutableFloat mutablefloat = new MutableFloat(0.0F);
      N(var1, (var4, var5) -> var4.N().y(var0, var5, var1, var2, mutablefloat));
      return Math.max(0, mutablefloat.intValue());
   }

   public static class02477<class02710> L(class06584 var0) {
      return var0.N(class06570.Gq) ? class02484.p : class02484.P;
   }

   @Nullable
   public static <T> Pair<T, Integer> L(class06584 var0, class02477<T> var1) {
      MutableObject mutableobject = new MutableObject();
      N(var0, (var2x, var3) -> {
         if (mutableobject.get() == null || (Integer)((Pair)mutableobject.get()).getSecond() < var3) {
            Object object = var2x.N().Z().method_58694(var1);
            if (object != null) {
               mutableobject.setValue(Pair.of(object, var3));
            }
         }
      });
      return (Pair<T, Integer>)mutableobject.get();
   }

   public static float L(class04782 var0, class06584 var1, class07049 var2, class07072 var3, float var4) {
      MutableFloat mutablefloat = new MutableFloat(var4);
      N(var1, (var5x, var6) -> var5x.N().i(var0, var6, var1, var2, var3, mutablefloat));
      return mutablefloat.floatValue();
   }

   public static int L(class04782 var0, class06584 var1, int var2) {
      MutableFloat mutablefloat = new MutableFloat(var2);
      N(var1, (var3x, var4) -> var3x.N().i(var0, var4, var1, mutablefloat));
      return Math.max(0, mutablefloat.intValue());
   }

   public class07323() {
      super();
   }

   public static float u(class04782 var0, class06584 var1, class07049 var2, class07072 var3, float var4) {
      MutableFloat mutablefloat = new MutableFloat(var4);
      N(var1, (var5x, var6) -> var5x.N().u(var0, var6, var1, var2, var3, mutablefloat));
      return mutablefloat.floatValue();
   }

   public static boolean u(class06584 var0) {
      return !var0.a_(class02484.P, class02710.N).u() || !var0.a_(class02484.p, class02710.N).u();
   }

   public static void y(class04782 var0, class07438 var1) {
      N(var1, (var2, var3, var4) -> var2.N().y(var0, var3, var4, var1));
   }

   public static List<class07317> y(class06069 var0, class06584 var1, int var2, Stream<class03556<class07304>> var3) {
      ArrayList arraylist = Lists.newArrayList();
      class02766 class02766 = var1.method_58694(class02484.J);
      if (class02766 == null) {
         return arraylist;
      } else {
         var2 += 1 + var0.y(class02766.N() / 4 + 1) + var0.y(class02766.N() / 4 + 1);
         float f = (var0.z() + var0.z() - 1.0F) * 0.15F;
         var2 = class04995.N(Math.round(var2 + var2 * f), 1, Integer.MAX_VALUE);
         List<class07317> list = N(var2, var1, var3);
         if (!list.isEmpty()) {
            class04531.N(var0, list, class07317::N).ifPresent(arraylist::add);

            while (var0.y(50) <= var2) {
               if (!arraylist.isEmpty()) {
                  N(list, (class07317)arraylist.getLast());
               }

               if (list.isEmpty()) {
                  break;
               }

               class04531.N(var0, list, class07317::N).ifPresent(arraylist::add);
               var2 /= 2;
            }
         }

         return arraylist;
      }
   }

   public static float y(class04782 var0, class06584 var1, class07049 var2) {
      MutableFloat mutablefloat = new MutableFloat(0.0F);
      N(var1, (var4, var5) -> var4.N().L(var0, var5, var1, var2, mutablefloat));
      return Math.max(0.0F, mutablefloat.floatValue());
   }

   public static <T> Optional<T> y(class06584 var0, class02477<List<T>> var1) {
      Pair pair = L(var0, var1);
      if (pair != null) {
         List list = (List)pair.getFirst();
         int i = (Integer)pair.getSecond();
         return Optional.of((T)list.get(Math.min(i, list.size()) - 1));
      } else {
         return Optional.empty();
      }
   }

   public static int y(class04782 var0, class06584 var1, int var2) {
      MutableFloat mutablefloat = new MutableFloat(var2);
      N(var1, (var3x, var4) -> var3x.N().u(var0, var4, var1, mutablefloat));
      return mutablefloat.intValue();
   }

   public static float y(class04782 var0, class06584 var1, class07049 var2, class07072 var3, float var4) {
      MutableFloat mutablefloat = new MutableFloat(var4);
      N(var1, (var5x, var6) -> var5x.N().L(var0, var6, var1, var2, var3, mutablefloat));
      return mutablefloat.floatValue();
   }

   public static class02710 y(class06584 var0) {
      return var0.a_(L(var0), class02710.N);
   }

   public static float y(class04782 var0, class07438 var1, class07072 var2) {
      MutableFloat mutablefloat = new MutableFloat(0.0F);
      N(var1, (var4, var5, var6) -> var4.N().N(var0, var5, var6.N(), var1, var2, mutablefloat));
      return mutablefloat.floatValue();
   }

   private static boolean N(class07304 var0, class06584 var1, class06584 var2, boolean var3, class03556 var4) {
      return var1.canBeEnchantedWith(var4, EnchantingContext.PRIMARY);
   }

   public static void N(class04782 var0, class07049 var1, class07072 var2, @Nullable class06584 var3, @Nullable Consumer<class06581> var4) {
      if (var1 instanceof class07438 class07438x) {
         N(class07438x, (var3x, var4x, var5x) -> var3x.N().N(var0, var4x, var5x, class02558.field_51685, var1, var2));
      }

      if (var3 != null) {
         if (var2.u() instanceof class07438 class07438) {
            N(var3, class07085.field_6173, class07438, (var3x, var4x, var5x) -> var3x.N().N(var0, var4x, var5x, class02558.field_51683, var1, var2));
         } else if (var4 != null) {
            class02525 class02525 = new class02525(var3, null, null, var4);
            N(var3, (var4x, var5x) -> var4x.N().N(var0, var5x, class02525, class02558.field_51683, var1, var2));
         }
      }
   }

   public static void N(class04782 var0, class07049 var1, class07072 var2, @Nullable class06584 var3) {
      N(var0, var1, var2, var3, null);
   }

   public static void N(class04782 var0, class07049 var1) {
      if (var1 instanceof class07438 class07438) {
         N(var1.method_59958(), class07085.field_6173, class07438, (var2x, var3, var4) -> var2x.N().N(var0, var3, var4, var1));
      }
   }

   public static void N(class04782 var0, class07049 var1, class07072 var2) {
      if (var2.u() instanceof class07438 class07438) {
         N(var0, var1, var2, class07438.method_59958());
      } else {
         N(var0, var1, var2, null);
      }
   }

   public static float N(class04782 var0, class06584 var1, class07049 var2, class07072 var3, float var4) {
      MutableFloat mutablefloat = new MutableFloat(var4);
      N(var1, (var5x, var6) -> var5x.N().y(var0, var6, var1, var2, var3, mutablefloat));
      return mutablefloat.floatValue();
   }

   public static boolean N(class04782 var0, class07438 var1, class07072 var2) {
      MutableBoolean mutableboolean = new MutableBoolean();
      N(var1, (var4, var5, var6) -> mutableboolean.setValue(mutableboolean.isTrue() || var4.N().N(var0, var5, var1, var2)));
      return mutableboolean.isTrue();
   }

   public static int N(class04782 var0, class06584 var1, class07049 var2, int var3) {
      MutableFloat mutablefloat = new MutableFloat(var3);
      N(var1, (var4x, var5) -> var4x.N().i(var0, var5, var1, var2, mutablefloat));
      return Math.max(0, mutablefloat.intValue());
   }

   public static int N(class03556<class07304> var0, class07438 var1) {
      Collection<class06584> collection = ((class07304)var0.N()).N(var1).values();
      int i = 0;

      for (class06584 class06584 : collection) {
         int j = N(var0, class06584);
         if (j > i) {
            i = j;
         }
      }

      return i;
   }

   public static void N(class06584 var0, class07438 var1, class07085 var2) {
      N(var0, var2, var1, (var1x, var2x, var3) -> var1x.N().N(var2x, var3, var1));
   }

   public static void N(class07438 var0) {
      N(var0, (var1, var2, var3) -> var1.N().N(var2, var3, var0));
   }

   public static void N(class04782 var0, class06584 var1, class07438 var2, class07085 var3) {
      N(var1, var3, var2, (var2x, var3x, var4) -> var2x.N().N(var0, var3x, var4, var2));
   }

   public static void N(class04782 var0, class07438 var1) {
      N(var1, (var2, var3, var4) -> var2.N().N(var0, var3, var4, var1));
   }

   public static int N(class04782 var0, class06584 var1, class06584 var2, int var3) {
      MutableFloat mutablefloat = new MutableFloat(var3);
      N(var1, (var3x, var4x) -> var3x.N().y(var0, var4x, var2, mutablefloat));
      return mutablefloat.intValue();
   }

   public static int N(class04782 var0, class06584 var1, int var2) {
      MutableFloat mutablefloat = new MutableFloat(var2);
      N(var1, (var3x, var4) -> var3x.N().N(var0, var4, var1, mutablefloat));
      return mutablefloat.intValue();
   }

   public static void N(class06584 var0, class02710 var1) {
      var0.N(L(var0), var1);
   }

   public static boolean N(class06584 var0) {
      return var0.L(L(var0));
   }

   public static class02710 N(class06584 var0, Consumer<class02715> var1) {
      class02477<class02710> class02477 = L(var0);
      class02710 class02710x = var0.method_58694(class02477);
      if (class02710x == null) {
         return class02710.N;
      } else {
         class02715 class02715 = new class02715(class02710x);
         var1.accept(class02715);
         class02710 class02710x = class02715.y();
         var0.N(class02477, class02710x);
         return class02710x;
      }
   }

   public static int N(class03556<class07304> var0, class06584 var1) {
      return var1.a_(class02484.P, class02710.N).N(var0);
   }

   public static void N(class07438 var0, class07306 var1) {
      for (class07085 class07085 : class07085.field_54086) {
         N(var0.method_6118(class07085), class07085, var0, var1);
      }
   }

   public static void N(class06584 var0, class07085 var1, class07438 var2, class07306 var3) {
      if (!var0.R()) {
         class02710 class02710 = var0.method_58694(class02484.P);
         if (class02710 != null && !class02710.u()) {
            class02525 class02525 = new class02525(var0, var1, var2);

            for (Entry entry : class02710.y()) {
               class03556<class07304> class03556 = (class03556<class07304>)entry.getKey();
               if (class03556.N().N(var1)) {
                  var3.accept(class03556, entry.getIntValue(), class02525);
               }
            }
         }
      }
   }

   public static void N(class06584 var0, class10735 var1) {
      for (Entry entry : var0.a_(class02484.P, class02710.N).y()) {
         var1.accept((class03556<class07304>)entry.getKey(), entry.getIntValue());
      }
   }

   public static class06584 N(class07317 var0) {
      class06584 class06584 = new class06584(class06570.Gq);
      class06584.N(var0.y(), var0.L());
      return class06584;
   }

   public static int N(class04782 var0, @Nullable class07049 var1, class07049 var2, int var3) {
      if (var1 instanceof class07438 class07438) {
         MutableFloat mutablefloat = new MutableFloat(var3);
         N(class07438, (var3x, var4x, var5x) -> var3x.N().N(var0, var4x, var5x.N(), var2, mutablefloat));
         return mutablefloat.intValue();
      } else {
         return var3;
      }
   }

   public static void N(List<class07317> var0, class07317 var1) {
      var0.removeIf(var1x -> !class07304.N(var1.y(), var1x.y()));
   }

   public static class06584 N(class06069 var0, class06584 var1, int var2, Stream<class03556<class07304>> var3) {
      List<class07317> list = y(var0, var1, var2, var3);
      if (var1.N(class06570.jY)) {
         var1 = new class06584(class06570.Gq);
      }

      for (class07317 class07317 : list) {
         var1.N(class07317.y(), class07317.L());
      }

      return var1;
   }

   public static class06584 N(class06069 var0, class06584 var1, int var2, class01042 var3, Optional<? extends class03543<class07304>> var4) {
      return N(
         var0,
         var1,
         var2,
         var4.<Stream<class03556<class07304>>>map(class03543::N).orElseGet(() -> var3.L(class04227.yR).z().map(var0xx -> (class03556<class07304>)var0xx))
      );
   }

   public static int N(class06069 var0, int var1, int var2, class06584 var3) {
      if (var3.method_58694(class02484.J) == null) {
         return 0;
      } else {
         if (var2 > 15) {
            var2 = 15;
         }

         int i = var0.y(8) + 1 + (var2 >> 1) + var0.y(var2 + 1);
         if (var1 == 0) {
            return Math.max(i / 3, 1);
         } else {
            return var1 == 1 ? i * 2 / 3 + 1 : Math.max(i, var2 * 2);
         }
      }
   }

   public static Optional<class02525> N(class02477<?> var0, class07438 var1, Predicate<class06584> var2) {
      ArrayList arraylist = new ArrayList();

      for (class07085 class07085 : class07085.field_54086) {
         class06584 class06584 = var1.method_6118(class07085);
         if (var2.test(class06584)) {
            Iterator<Entry<class03556<class07304>>> iterator = class06584.a_(class02484.P, class02710.N).y().iterator();

            while (iterator.hasNext()) {
               class03556<class07304> class03556 = (class03556<class07304>)iterator.next().getKey();
               if (class03556.N().Z().N(var0) && class03556.N().N(class07085)) {
                  arraylist.add(new class02525(class06584, class07085, var1));
               }
            }
         }
      }

      return class07536.y_9(arraylist, var1.method_59922());
   }

   public static boolean N(class06584 var0, class02477<?> var1) {
      MutableBoolean mutableboolean = new MutableBoolean(false);
      N(var0, (var2x, var3) -> {
         if (var2x.N().Z().N(var1)) {
            mutableboolean.setTrue();
         }
      });
      return mutableboolean.booleanValue();
   }

   public static void N(class06584 var0, class01042 var1, class05946<class02530> var2, class07052 var3, class06069 var4) {
      class02530 class02530 = var1.L(class04227.yi).L(var2);
      if (class02530 != null) {
         N(var0, var4x -> class02530.N(var0, var4x, var4, var3));
      }
   }

   public static List<class07317> N(int var0, class06584 var1, Stream<class03556<class07304>> var2) {
      ArrayList arraylist = Lists.newArrayList();
      boolean flag = var1.N(class06570.jY);
      var2.filter(var2x -> N((class07304)var2x.N(), var1, var1, flag, var2x) || flag).forEach(var2x -> {
         class07304 class07304 = (class07304)var2x.N();

         for (int i = class07304.i(); i >= class07304.u(); i--) {
            if (var0 >= class07304.y(i) && var0 <= class07304.L(i)) {
               arraylist.add(new class07317((class03556<class07304>)var2x, i));
               break;
            }
         }
      });
      return arraylist;
   }

   public static boolean N(Collection<class03556<class07304>> var0, class03556<class07304> var1) {
      Iterator iterator = var0.iterator();

      while (iterator.hasNext()) {
         if (!class07304.N((class03556<class07304>)iterator.next(), var1)) {
            return false;
         }
      }

      return true;
   }

   public static void N(class06584 var0, class02834 var1, BiConsumer<class03556<class07468>, class07471> var2) {
      N(var0, (var2x, var3) -> var2x.N().N(class02523.W).forEach(var4 -> {
         if (((class07304)var2x.N()).M().B().contains(var1)) {
            var2.accept(var4.L(), var4.N(var3, var1));
         }
      }));
   }

   public static float N(class04782 var0, class07438 var1, class07072 var2, float var3) {
      MutableFloat mutablefloat = new MutableFloat(var3);
      class06069 class06069 = var1.method_59922();
      N(var1, (var5x, var6x, var7) -> {
         class05908 class05908 = class07304.y(var0, var6x, var1, var2);
         var5x.N().N(class02523.m).forEach(var4xx -> {
            if (var4xx.N() == class02558.field_51685 && var4xx.y() == class02558.field_51685 && var4xx.N(class05908)) {
               mutablefloat.setValue(var4xx.L().N(var6x, class06069, mutablefloat.floatValue()));
            }
         });
      });
      class07049 class07049 = var2.u();
      if (class07049 instanceof class07438) {
         N((class07438)class07049, (var5x, var6x, var7) -> {
            class05908 class05908 = class07304.y(var0, var6x, var1, var2);
            var5x.N().N(class02523.m).forEach(var4xx -> {
               if (var4xx.N() == class02558.field_51683 && var4xx.y() == class02558.field_51685 && var4xx.N(class05908)) {
                  mutablefloat.setValue(var4xx.L().N(var6x, class06069, mutablefloat.floatValue()));
               }
            });
         });
      }

      return mutablefloat.floatValue();
   }

   public static void N(
      class04782 var0,
      class06584 var1,
      @Nullable class07438 var2,
      class07049 var3,
      @Nullable class07085 var4,
      class06889 var5,
      class00500 var6,
      Consumer<class06581> var7
   ) {
      class02525 class02525 = new class02525(var1, var4, var2, var7);
      N(var1, (var5x, var6x) -> var5x.N().N(var0, var6x, class02525, var3, var5, var6));
   }

   public static void N(class04782 var0, class06584 var1, class08005 var2, Consumer<class06581> var3) {
      class07438 class07438x = var2.z() instanceof class07438 class07438x ? class07438x : null;
      class02525 class02525 = new class02525(var1, null, class07438x, var3);
      N(var1, (var3x, var4x) -> var3x.N().L(var0, var4x, class02525, var2));
   }

   public static int N(class04782 var0, class06584 var1, class06584 var2) {
      MutableFloat mutablefloat = new MutableFloat(0.0F);
      N(var1, (var3x, var4) -> var3x.N().L(var0, var4, var2, mutablefloat));
      return Math.max(0, mutablefloat.intValue());
   }

   public static float N(class04782 var0, class06584 var1, class07049 var2, float var3) {
      MutableFloat mutablefloat = new MutableFloat(var3);
      N(var1, (var4x, var5) -> var4x.N().R(var0, var5, var1, var2, mutablefloat));
      return Math.max(0.0F, mutablefloat.floatValue());
   }

   public static boolean N(class06584 var0, class03530<class07304> var1) {
      Iterator<Entry<class03556<class07304>>> iterator = var0.a_(class02484.P, class02710.N).y().iterator();

      while (iterator.hasNext()) {
         if (((class03556)iterator.next().getKey()).N(var1)) {
            return true;
         }
      }

      return false;
   }

   public static float N(class06584 var0, class07438 var1) {
      MutableFloat mutablefloat = new MutableFloat(0.0F);
      N(var0, (var2x, var3) -> var2x.N().N(var1.method_59922(), var3, mutablefloat));
      return mutablefloat.floatValue();
   }

   public static float N(class06584 var0, class07438 var1, float var2) {
      MutableFloat mutablefloat = new MutableFloat(var2);
      N(var0, (var2x, var3x) -> var2x.N().y(var1.method_59922(), var3x, mutablefloat));
      return Math.max(0.0F, mutablefloat.floatValue());
   }

   public static int N(class04782 var0, class06584 var1, class07049 var2) {
      MutableFloat mutablefloat = new MutableFloat(0.0F);
      N(var1, (var4, var5) -> var4.N().u(var0, var5, var1, var2, mutablefloat));
      return Math.max(0, mutablefloat.intValue());
   }

   public static void N(class06584 var0, class07085 var1, BiConsumer<class03556<class07468>, class07471> var2) {
      N(var0, (var2x, var3) -> var2x.N().N(class02523.W).forEach(var4 -> {
         if (((class07304)var2x.N()).N(var1)) {
            var2.accept(var4.L(), var4.N(var3, var1));
         }
      }));
   }
}
