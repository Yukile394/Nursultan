package minecraft;

import Nursultan.class10767;
import Nursultan.class10772;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.LongSupplier;
import org.jspecify.annotations.Nullable;

public class class00616 implements class00611 {
   private final Map<class00607<?>, class00600<?>> y = new Reference2ObjectOpenHashMap();

   boolean L(class00607<?> var1) {
      class00600 class00600 = this.u(var1);
      return class00600 != null && class00600.y;
   }

   class00616(Map<class00607<?>, List<class07603<?>>> var1) {
      super();
      var1.forEach((var1x, var2) -> this.y.put((class00607<?>)var1x, this.N(var1x, (List<? extends class07603<?>>)var2)));
   }

   @Nullable
   private <Value> class00600<Value> u(class00607<Value> var1) {
      return (class00600<Value>)this.y.get(var1);
   }

   public void y() {
      this.y.values().forEach(class00600::N);
   }

   <Value> Value y(class00607<Value> var1) {
      class00600 class00600 = this.u(var1);
      return (Value)(class00600 != null ? class00600.N : var1.y());
   }

   private <Value> class00600<Value> N(class00607<Value> var1, List<? extends class07603<?>> var2) {
      ArrayList arraylist = new ArrayList(var2);
      Object object = var1.y();

      while (!arraylist.isEmpty()) {
         if (!(arraylist.getFirst() instanceof class10772 class10772)) {
            break;
         }

         object = class10772.applyConstant(object);
         arraylist.removeFirst();
      }

      boolean flag = arraylist.stream().anyMatch(var0 -> var0 instanceof class10767);
      return new class00600<>(var1, (Value)object, List.copyOf(arraylist), flag);
   }

   @Override
   public <Value> Value N(class00607<Value> var1) {
      if (class07529.ND && var1.i()) {
         throw new IllegalStateException("Position must always be provided for positional attribute " + var1);
      } else {
         class00600 class00600 = this.u(var1);
         return (Value)(class00600 == null ? var1.y() : class00600.y());
      }
   }

   private static <Value> void N(class00594 var0, class00607<Value> var1, class05517 var2) {
      var0.N(var1, (var2x, var3, var4) -> var4 != null && var1.R() ? var4.N(var1, var2x) : var2.N(var3.M, var3.B, var3.Z).N().R().N(var1, var2x));
   }

   private static void N(class00594 var0, class01905<class00780> var1, class05517 var2) {
      var1.z().flatMap(var0x -> ((class00780)var0x.N()).R().y().stream()).distinct().forEach(var2x -> N(var0, (class00607<?>)var2x, var2));
   }

   private static void N(class00594 var0, class07376 var1) {
      var0.N(var1.s());
   }

   static void N(class00594 var0, class07299 var1) {
      class01042 class01042 = var1.method_30349();
      class05517 class05517 = var1.method_22385();
      LongSupplier longsupplier = var1::method_8532;
      N(var0, var1.method_8597());
      N(var0, class01042.L(class04227.NA), class05517);
      var1.method_8597().T().forEach(var2x -> var0.N((class03556<class07587>)var2x, longsupplier));
      if (var1.method_63020()) {
         class07594.N(var0, class07609.N(var1));
      }
   }

   @Override
   public <Value> Value N(class00607<Value> var1, class06889 var2, @Nullable class00602 var3) {
      class00600 class00600 = this.u(var1);
      return (Value)(class00600 == null ? var1.y() : class00600.N(var2, var3));
   }

   public static class00594 N() {
      return new class00594();
   }
}
