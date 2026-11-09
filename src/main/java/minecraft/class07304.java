package minecraft;

import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import org.apache.commons.lang3.mutable.MutableFloat;

public record class07304(class00392 description, class07286 definition, class03543<class07304> exclusiveSet, class02695 effects) {
   public static final int N = 255;
   public static final Codec<class07304> y = RecordCodecBuilder.create(
      var0 -> var0.group(
            class03748.N.fieldOf("description").forGetter(class07304::R),
            class07286.L.forGetter(class07304::M),
            class03541.N(class04227.yR).optionalFieldOf("exclusive_set", class03543.N()).forGetter(class07304::B),
            class02523.y.optionalFieldOf("effects", class02695.N).forGetter(class07304::Z)
         )
         .apply(var0, class07304::new)
   );
   public static final Codec<class03556<class07304>> L = class03539.N(class04227.yR);
   public static final class02362<class04247, class03556<class07304>> u = class02389.y(class04227.yR);

   public int L() {
      return this.definition.M();
   }

   public void L(class04782 var1, int var2, class06584 var3, class07049 var4, MutableFloat var5) {
      this.N(class02523.G, var1, var2, var3, var4, var5);
   }

   public void L(class04782 var1, int var2, class06584 var3, MutableFloat var4) {
      this.N(class02523.b, var1, var2, var3, var4);
   }

   public boolean L(class06584 var1) {
      return this.definition.N().N(var1.Z());
   }

   public int L(int var1) {
      return this.definition.R().N(var1);
   }

   public void L(class04782 var1, int var2, class06584 var3, class07049 var4, class07072 var5, MutableFloat var6) {
      this.N(class02523.R, var1, var2, var3, var4, var5, var6);
   }

   public void L(class04782 var1, int var2, class02525 var3, class07049 var4) {
      N(this.N(class02523.j), N(var1, var2, var4, var4.method_73189()), var4x -> var4x.N(var1, var2, var3, var4, var4.method_73189()));
   }

   public class07286 M() {
      return this.definition;
   }

   public class07304(class00392 description, class07286 definition, class03543<class07304> exclusiveSet, class02695 effects) {
      this.description = description;
      this.definition = definition;
      this.exclusiveSet = exclusiveSet;
      this.effects = effects;
   }

   @Override
   public String toString() {
      return "Enchantment " + this.description.getString();
   }

   public class03543<class07304> B() {
      return this.exclusiveSet;
   }

   public class02695 Z() {
      return this.effects;
   }

   public void i(class04782 var1, int var2, class06584 var3, class07049 var4, class07072 var5, MutableFloat var6) {
      this.N(class02523.B, var1, var2, var3, var4, var5, var6);
   }

   public void i(class04782 var1, int var2, class06584 var3, MutableFloat var4) {
      this.N(class02523.k, var1, var2, var3, var4);
   }

   public int i() {
      return this.definition.u();
   }

   public void i(class04782 var1, int var2, class06584 var3, class07049 var4, MutableFloat var5) {
      this.N(class02523.n, var1, var2, var3, var4, var5);
   }

   public void u(class04782 var1, int var2, class06584 var3, MutableFloat var4) {
      this.N(class02523.d, var1, var2, var3, var4);
   }

   public void u(class04782 var1, int var2, class06584 var3, class07049 var4, MutableFloat var5) {
      this.N(class02523.l, var1, var2, var3, var4, var5);
   }

   public void u(class04782 var1, int var2, class06584 var3, class07049 var4, class07072 var5, MutableFloat var6) {
      this.N(class02523.M, var1, var2, var3, var4, var5, var6);
   }

   public int u() {
      return 1;
   }

   public void y(class06069 var1, int var2, MutableFloat var3) {
      this.N(class02523.Y, var1, var2, var3);
   }

   public int y(int var1) {
      return this.definition.i().N(var1);
   }

   public void y(class04782 var1, int var2, class02525 var3, class07049 var4) {
      N(this.N(class02523.s), N(var1, var2, var4, var4.method_73189()), var4x -> var4x.N(var1, var2, var3, var4, var4.method_73189()));
   }

   public static class05908 y(class04782 var0, int var1, class07049 var2, class07072 var3) {
      class04162 class04162 = new class04160(var0)
         .N(class06551.N, var2)
         .N(class06551.W, var1)
         .N(class06551.B, var2.method_73189())
         .N(class06551.i, var3)
         .y(class06551.R, var3.u())
         .y(class06551.M, var3.L())
         .N(class06925.G);
      return new class05927(class04162).N(Optional.empty());
   }

   public void y(class04782 var1, int var2, class06584 var3, class07049 var4, class07072 var5, MutableFloat var6) {
      this.N(class02523.i, var1, var2, var3, var4, var5, var6);
   }

   public boolean y(class06584 var1) {
      return var1.N(this.definition.N());
   }

   public void y(class04782 var1, int var2, class06584 var3, MutableFloat var4) {
      this.N(class02523.T, var1, var2, var3, var4);
   }

   public int y() {
      return this.definition.L();
   }

   public void y(class04782 var1, int var2, class06584 var3, class07049 var4, MutableFloat var5) {
      this.N(class02523.t, var1, var2, var3, var4, var5);
   }

   public static class05908 N(class04782 var0, int var1, class07049 var2, boolean var3) {
      class04162 class04162 = new class04160(var0)
         .N(class06551.N, var2)
         .N(class06551.W, var1)
         .N(class06551.B, var2.method_73189())
         .N(class06551.m, var3)
         .N(class06925.d);
      return new class05927(class04162).N(Optional.empty());
   }

   public void N(class04782 var1, int var2, class02525 var3, class07438 var4) {
      class07085 class07085 = var3.y();
      if (class07085 != null) {
         Map map = var4.method_59926(class07085);
         if (!this.N(class07085)) {
            Set set = (Set)map.remove(this);
            if (set != null) {
               set.forEach(var3x -> var3x.N(var3, var4, var4.method_73189(), var2));
            }
         } else {
            Object object = (Set)map.get(this);

            for (class02944 class02944 : this.N(class02523.P)) {
               class02548 class02548 = (class02548)class02944.N();
               boolean flag = object != null && object.contains(class02548);
               if (class02944.N(N(var1, var2, var4, flag))) {
                  if (!flag) {
                     if (object == null) {
                        object = new ObjectArraySet();
                        map.put(this, object);
                     }

                     object.add(class02548);
                  }

                  class02548.N(var1, var2, var3, var4, var4.method_73189(), !flag);
               } else if (object != null && object.remove(class02548)) {
                  class02548.N(var3, var4, var4.method_73189(), var2);
               }
            }

            if (object != null && object.isEmpty()) {
               map.remove(this);
            }
         }
      }
   }

   public void N(int var1, class02525 var2, class07438 var3) {
      class07085 class07085 = var2.y();
      if (class07085 != null) {
         Set set = var3.method_59926(class07085).remove(this);
         if (set != null) {
            Iterator iterator = set.iterator();

            while (iterator.hasNext()) {
               ((class02548)iterator.next()).N(var2, var3, var3.method_73189(), var1);
            }
         }
      }
   }

   public static <T> void N(List<class02944<T>> var0, class05908 var1, Consumer<T> var2) {
      for (class02944 class02944 : var0) {
         if (class02944.N(var1)) {
            var2.accept(class02944.N());
         }
      }
   }

   public static class07301 N(class07286 var0) {
      return new class07301(var0);
   }

   public static class05908 N(class04782 var0, int var1, class07049 var2, class06889 var3, class00500 var4) {
      class04162 class04162 = new class04160(var0).N(class06551.N, var2).N(class06551.W, var1).N(class06551.B, var3).N(class06551.Z, var4).N(class06925.k);
      return new class05927(class04162).N(Optional.empty());
   }

   public static class05908 N(class04782 var0, int var1, class07049 var2, class06889 var3) {
      class04162 class04162 = new class04160(var0).N(class06551.N, var2).N(class06551.W, var1).N(class06551.B, var3).N(class06925.w);
      return new class05927(class04162).N(Optional.empty());
   }

   public static class07300 N(int var0) {
      return new class07300(var0, 0);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static void N(class02550<class02560> var0, class04782 var1, int var2, class02525 var3, class07049 var4, class07072 var5) {
      if (var0.N(y(var1, var2, var4, var5))) {
         class07049 class07049 = switch (var0.y()) {
            case field_51683 -> var5.u();
            case field_51684 -> var5.L();
            case field_51685 -> var4;
         };
         if (class07049 != null) {
            ((class02560)var0.L()).N(var1, var2, var3, class07049, class07049.method_73189());
         }
      }
   }

   public static class07300 N(int var0, int var1) {
      return new class07300(var0, var1);
   }

   public void N(class04782 var1, int var2, class06584 var3, MutableFloat var4) {
      this.N(class02523.E, var1, var2, var3, var4);
   }

   public boolean N(class07085 var1) {
      return this.definition.B().stream().anyMatch(var1x -> var1x.y(var1));
   }

   public void N(class04782 var1, int var2, class06584 var3, class07049 var4, MutableFloat var5) {
      this.N(class02523.w, var1, var2, var3, var4, var5);
   }

   public void N(class06069 var1, int var2, MutableFloat var3) {
      this.N(class02523.J, var1, var2, var3);
   }

   public class03543<class06581> N() {
      return this.definition.N();
   }

   public Map<class07085, class06584> N(class07438 var1) {
      EnumMap enummap = Maps.newEnumMap(class07085.class);

      for (class07085 class07085 : class07085.field_54086) {
         if (this.N(class07085)) {
            class06584 class06584 = var1.method_6118(class07085);
            if (!class06584.R()) {
               enummap.put(class07085, class06584);
            }
         }
      }

      return enummap;
   }

   public static boolean N(class03556<class07304> var0, class03556<class07304> var1) {
      return !var0.equals(var1) && !((class07304)var0.N()).exclusiveSet.N(var1) && !((class07304)var1.N()).exclusiveSet.N(var0);
   }

   public static class00392 N(class03556<class07304> var0, int var1) {
      class05216 class05216 = ((class07304)var0.N()).description.L();
      if (var0.N(class02625.P)) {
         class05216 = class00390.N(class05216, class00405.N.N(class06541.field_1061));
      } else {
         class05216 = class00390.N(class05216, class00405.N.N(class06541.field_1080));
      }

      if (var1 != 1 || ((class07304)var0.N()).i() != 1) {
         class05216.y(class05220.l).y(class00392.L("enchantment.level." + var1));
      }

      return class05216;
   }

   public boolean N(class06584 var1) {
      return this.y(var1) && (this.definition.y().isEmpty() || var1.N(this.definition.y().get()));
   }

   public <T> List<T> N(class02477<List<T>> var1) {
      return this.effects.a_(var1, List.of());
   }

   public boolean N(class04782 var1, int var2, class07049 var3, class07072 var4) {
      class05908 class05908 = y(var1, var2, var3, var4);
      Iterator iterator = this.N(class02523.u).iterator();

      while (iterator.hasNext()) {
         if (((class02944)iterator.next()).N(class05908)) {
            return true;
         }
      }

      return false;
   }

   public void N(class04782 var1, int var2, class06584 var3, class07049 var4, class07072 var5, MutableFloat var6) {
      class05908 class05908 = y(var1, var2, var4, var5);

      for (class02944 class02944 : this.N(class02523.L)) {
         if (class02944.N(class05908)) {
            var6.setValue(((class02536)class02944.N()).N(var2, var4.method_59922(), var6.floatValue()));
         }
      }
   }

   public static class07286 N(
      class03543<class06581> var0, class03543<class06581> var1, int var2, int var3, class07300 var4, class07300 var5, int var6, class02834... var7
   ) {
      return new class07286(var0, Optional.of(var1), var2, var3, var4, var5, var6, List.of(var7));
   }

   public void N(class04782 var1, int var2, class02525 var3, class07049 var4, class06889 var5, class00500 var6) {
      N(this.N(class02523.U), N(var1, var2, var4, var5, var6), var5x -> var5x.N(var1, var2, var3, var4, var5));
   }

   public final void N(class02477<List<class02944<class02536>>> var1, class04782 var2, int var3, class06584 var4, MutableFloat var5) {
      N(this.N(var1), N(var2, var3, var4), var3x -> var5.setValue(var3x.N(var3, var2.method_8409(), var5.floatValue())));
   }

   public final void N(class02477<List<class02944<class02536>>> var1, class04782 var2, int var3, class06584 var4, class07049 var5, MutableFloat var6) {
      N(this.N(var1), N(var2, var3, var5, var5.method_73189()), var3x -> var6.setValue(var3x.N(var3, var5.method_59922(), var6.floatValue())));
   }

   public final void N(
      class02477<List<class02944<class02536>>> var1, class04782 var2, int var3, class06584 var4, class07049 var5, class07072 var6, MutableFloat var7
   ) {
      N(this.N(var1), y(var2, var3, var5, var6), var3x -> var7.setValue(var3x.N(var3, var5.method_59922(), var7.floatValue())));
   }

   public static class05908 N(class04782 var0, int var1, class06584 var2) {
      class04162 class04162 = new class04160(var0).N(class06551.U, var2).N(class06551.W, var1).N(class06925.l);
      return new class05927(class04162).N(Optional.empty());
   }

   public static class07286 N(class03543<class06581> var0, int var1, int var2, class07300 var3, class07300 var4, int var5, class02834... var6) {
      return new class07286(var0, Optional.empty(), var1, var2, var3, var4, var5, List.of(var6));
   }

   public void N(class04782 var1, int var2, class02525 var3, class02558 var4, class07049 var5, class07072 var6) {
      for (class02550 class02550 : this.N(class02523.Z)) {
         if (var4 == class02550.N()) {
            N(class02550, var1, var2, var3, var5, var6);
         }
      }
   }

   public void N(class04782 var1, int var2, class02525 var3, class07049 var4) {
      N(this.N(class02523.z), N(var1, var2, var4, var4.method_73189()), var4x -> var4x.N(var1, var2, var3, var4, var4.method_73189()));
   }

   public void N(class02477<class02536> var1, class06069 var2, int var3, MutableFloat var4) {
      class02536 class02536 = this.effects.method_58694(var1);
      if (class02536 != null) {
         var4.setValue(class02536.N(var3, var2, var4.floatValue()));
      }
   }

   public void R(class04782 var1, int var2, class06584 var3, class07049 var4, MutableFloat var5) {
      this.N(class02523.v, var1, var2, var3, var4, var5);
   }

   public class00392 R() {
      return this.description;
   }
}
