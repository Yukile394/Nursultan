package minecraft;

import Nursultan.class10239;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.datafixers.Products.P1;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.fabricmc.fabric.impl.dimension.FailSoftMapCodec;

public record class03764(Map<class05946<class01255>, class01255> dimensions) {
   public static final MapCodec<class03764> N = RecordCodecBuilder.mapCodec(
      var0 -> N(var0, Codec.unboundedMap(class05946.N(class04227.yI), class01255.N).fieldOf("dimensions").forGetter(class03764::u))
         .apply(var0, var0.stable(class03764::new))
   );
   private static final Set<class05946<class01255>> L = ImmutableSet.of(class01255.y, class01255.L, class01255.u);
   private static final int u = L.size();

   public boolean L() {
      return this.N() instanceof class07833;
   }

   private static boolean L(class01255 var0) {
      return var0.N().N(class04057.L) && var0.y() instanceof class04865 class04865 && class04865.N(class05943.M) && class04865.u() instanceof class07663;
   }

   public class03764(Map<class05946<class01255>, class01255> dimensions) {
      if (dimensions.get(class01255.y) == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.dimensions = dimensions;
      }
   }

   public class03764(class00751<class01255> var1) {
      this(var1.z().collect(Collectors.toMap(class03529::B, class03529::N)));
   }

   public Map<class05946<class01255>, class01255> u() {
      return this.dimensions;
   }

   private static boolean y(class05946<class01255> var0, class01255 var1) {
      if (var0 == class01255.y) {
         return N(var1);
      } else if (var0 == class01255.L) {
         return y(var1);
      } else {
         return var0 == class01255.u ? L(var1) : false;
      }
   }

   private static boolean y(class01255 var0) {
      if (var0.N().N(class04057.y) && var0.y() instanceof class04865 class04865 && class04865.N(class05943.R)) {
         class00765 class00765 = class04865.u();
         if (class00765 instanceof class05997 && ((class05997)class00765).N(class03565.N)) {
            return true;
         }
      }

      return false;
   }

   private static class06228 y(class00751<class01255> var0) {
      return var0.M(class01255.y).map(var0x -> {
         class08088 class08088 = var0x.y();
         if (class08088 instanceof class07833) {
            return class06228.field_40375;
         } else {
            return class08088 instanceof class07850 ? class06228.field_40374 : class06228.field_40373;
         }
      }).orElse(class06228.field_40373);
   }

   public ImmutableSet<class05946<class07299>> y() {
      return this.u().keySet().stream().map(class04227::N).collect(ImmutableSet.toImmutableSet());
   }

   private static P1 N(Instance var0, App var1) {
      return var0.group(new FailSoftMapCodec(class05946.N(class04227.yI), class01255.N).fieldOf("dimensions").forGetter(class03764::u));
   }

   public static Lifecycle N(class05946<class01255> var0, class01255 var1) {
      return y(var0, var1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   public class03764 N(class01929 var1, class08088 var2) {
      Map<class05946<class01255>, class01255> map = N(var1.y(class04227.yu), this.dimensions, var2);
      return new class03764(map);
   }

   public Optional<class01255> N(class05946<class01255> var1) {
      return Optional.ofNullable(this.dimensions.get(var1));
   }

   public class08088 N() {
      class01255 class01255 = this.dimensions.get(class01255.y);
      if (class01255 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return class01255.y();
      }
   }

   public static Map<class05946<class01255>, class01255> N(Map<class05946<class01255>, class01255> var0, class03556<class07376> var1, class08088 var2) {
      Builder builder = ImmutableMap.builder();
      builder.putAll(var0);
      builder.put(class01255.y, new class01255(var1, var2));
      return builder.buildKeepingLast();
   }

   public static Map<class05946<class01255>, class01255> N(class01905<class07376> var0, Map<class05946<class01255>, class01255> var1, class08088 var2) {
      class01255 class01255 = (class01255)var1.get(class01255.y);
      class03556<class07376> class03556 = (class03556<class07376>)(class01255 == null ? var0.y(class04057.N) : class01255.N());
      return N(var1, class03556, var2);
   }

   public class03781 N(class00751<class01255> var1) {
      Stream stream = Stream.concat(var1.B().stream(), this.dimensions.keySet().stream()).distinct();
      ArrayList arraylist = new ArrayList();
      N(stream)
         .forEach(
            var3x -> var1.M((class05946<class01255>)var3x)
               .or(() -> Optional.ofNullable(this.dimensions.get(var3x)))
               .ifPresent(var2xx -> arraylist.add(new class10239(var3x, var2xx)))
         );
      Lifecycle lifecycle = arraylist.size() == u ? Lifecycle.stable() : Lifecycle.experimental();
      class00731 class00731 = new class00731<>(class04227.yI, lifecycle);
      arraylist.forEach(var1x -> class00731.N(var1x.y(), var1x.L(), var1x.N()));
      class00751 class00751 = class00731.W();
      class06228 class06228 = y(class00751);
      return new class03781(class00751.W(), class06228);
   }

   public static Stream<class05946<class01255>> N(Stream<class05946<class01255>> var0) {
      return Stream.concat(L.stream(), var0.filter(var0x -> !L.contains(var0x)));
   }

   private static boolean N(class01255 var0) {
      class03556<class07376> class03556 = var0.N();
      if (!class03556.N(class04057.N) && !class03556.N(class04057.u)) {
         return false;
      } else {
         class00765 class00765 = var0.y().u();
         return !(class00765 instanceof class05997) || ((class05997)class00765).N(class03565.y);
      }
   }
}
