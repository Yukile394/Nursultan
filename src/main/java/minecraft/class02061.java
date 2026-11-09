package minecraft;

import Nursultan.class09560;
import com.mojang.serialization.Lifecycle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.lang3.mutable.MutableObject;

public class class02061 {
   public final List<class02076<?>> N = new ArrayList<>();

   public class02061() {
      super();
   }

   private class02036 y(class01042 var1) {
      class02036 class02036 = class02036.N(var1, this.N.stream().map(class02076::N));
      this.N.forEach(var1x -> var1x.N(class02036));
      return class02036;
   }

   private class01929 N(class01042 var1, class01929 var2, class01794 var3, Map<class05946<? extends class00751<?>>, class02066<?>> var4, class01929 var5) {
      class02038 class02038 = new class02038();
      MutableObject mutableobject = new MutableObject();
      List list = var4.keySet()
         .stream()
         .map(var6x -> this.N(class02038, var3, (class05946<? extends class00751<? extends Object>>)var6x, var5, var2, mutableobject))
         .collect(Collectors.toUnmodifiableList());
      class01929 class01929 = N(class02038, var1, list.stream());
      mutableobject.setValue(class01929);
      return class01929;
   }

   public class01929 N(class01042 var1) {
      class02036 class02036 = this.y(var1);
      Stream stream = this.N.stream().map(var1x -> var1x.y(class02036).N(class02036.i()));
      class01929 class01929 = N(class02036.i(), var1, stream);
      class02036.L();
      class02036.y();
      class02036.u();
      return class01929;
   }

   private static class01929 N(class02038 var0, class01042 var1, Stream<class01921<?>> var2) {
      HashMap hashmap = new HashMap();
      var1.method_40311().forEach(var1x -> hashmap.put(var1x.N(), class04132.N(var1x.y())));
      var2.forEach(var2x -> hashmap.put(var2x.i(), class04132.N(var0, var2x)));
      return new class02074(hashmap);
   }

   public <T> class02061 N(class05946<? extends class00751<T>> var1, class02039<T> var2) {
      return this.N(var1, Lifecycle.stable(), var2);
   }

   public <T> class02061 N(class05946<? extends class00751<T>> var1, Lifecycle var2, class02039<T> var3) {
      this.N.add(new class02076(var1, var2, var3));
      return this;
   }

   static <T> class01921<T> N(class05946<? extends class00751<? extends T>> var0, Lifecycle var1, class02042<T> var2, Map<class05946<T>, class03529<T>> var3) {
      return new class02059<>(var2, var0, var1, var3);
   }

   static <T> class02055<T> N(class01921<T> var0) {
      return new class09560<>(var0, var0);
   }

   public class04144 N(class01042 var1, class01929 var2, class01794 var3) {
      class02036 class02036 = this.y(var1);
      HashMap hashmap = new HashMap();
      this.N.stream().map(var1x -> var1x.y(class02036)).forEach(var1x -> hashmap.put(var1x.N(), var1x));
      Set set = var1.y().collect(Collectors.toUnmodifiableSet());
      var2.y()
         .filter(var1x -> !set.contains(var1x))
         .forEach(var1x -> hashmap.putIfAbsent(var1x, new class02066<>((class05946<? extends class00751<?>>)var1x, Lifecycle.stable(), Map.of())));
      Stream stream = hashmap.values().stream().map(var1x -> var1x.N(class02036.i()));
      class01929 class01929x = N(class02036.i(), var1, stream);
      class02036.y();
      class02036.u();
      class01929 class01929x = this.N(var1, var2, var3, hashmap, class01929x);
      return new class04144(class01929x, class01929x);
   }

   private <T> class01921<T> N(
      class02042<T> var1, class01794 var2, class05946<? extends class00751<? extends T>> var3, class01929 var4, class01929 var5, MutableObject<class01929> var6
   ) {
      class01801 class01801 = var2.N(var3);
      if (class01801 == null) {
         throw new NullPointerException("No cloner for " + var3.N());
      } else {
         HashMap hashmap = new HashMap();
         class01921 class01921x = var4.y(var3);
         class01921x.z().forEach(var5x -> {
            class05946 class05946 = var5x.B();
            class04112 class04112 = new class04112(var1, class05946);
            class04112.N = () -> (T)class01801.N(var5x.N(), var4, (class01929)var6.get());
            hashmap.put(class05946, class04112);
         });
         class01921 class01921x = var5.y(var3);
         class01921x.z().forEach(var5x -> {
            class05946 class05946 = var5x.B();
            hashmap.computeIfAbsent(class05946, var6x -> {
               class04112 class04112 = new class04112(var1, class05946);
               class04112.N = () -> (T)class01801.N(var5x.N(), var5, (class01929)var6.get());
               return class04112;
            });
         });
         Lifecycle lifecycle = class01921x.R().add(class01921x.R());
         return N(var3, lifecycle, var1, hashmap);
      }
   }
}
