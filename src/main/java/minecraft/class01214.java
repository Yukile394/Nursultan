package minecraft;

import Nursultan.class09443;
import Nursultan.class09448;
import Nursultan.class09449;
import com.google.gson.JsonElement;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.JsonOps;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class01214<T> {
   private static final Logger y = LogUtils.getLogger();
   public final class01229<T> N;
   private final String L;

   public class01214(class01229<T> var1, String var2) {
      super();
      this.N = var1;
      this.L = var2;
   }

   public static <T> void N(class01089 var0, class07099<T> var1) {
      class05946 class05946 = var1.i();
      class01214 class01214 = new class01214(class01229.N(var1), class04227.u(class05946));
      class01214.N(class01214.N(var0)).forEach((var2x, var3x) -> var1.N(class03530.N(class05946, var2x), (List<class03556<T>>)var3x));
   }

   public static List<class00720<?>> N(class01089 var0, class01042 var1) {
      return var1.method_40311().map(var1x -> N(var0, var1x.y())).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
   }

   public static <T> void N(class03516 var0, class07099<T> var1) {
      var0.N(var1).y().forEach(var1::N);
   }

   public Map<class01894, List<T>> N(Map<class01894, List<class09443>> var1) {
      HashMap hashmap = new HashMap();
      class09448 class09448 = new class09448(this, hashmap);
      class03495 class03495 = new class03495();
      var1.forEach((var1x, var2x) -> class03495.N(var1x, new class09449((List<class09443>)var2x)));
      class03495.N(
         (var3x, var4x) -> this.N(class09448, var4x.N())
            .ifLeft(
               var1xx -> y.error(
                  "Couldn't load tag {} as it is missing following references: {}",
                  var3x,
                  var1xx.stream().map(Objects::toString).collect(Collectors.joining(", "))
               )
            )
            .ifRight(var2xx -> hashmap.put(var3x, var2xx))
      );
      return hashmap;
   }

   private Either<List<class09443>, List<T>> N(class01208<T> var1, List<class09443> var2) {
      LinkedHashSet linkedhashset = new LinkedHashSet();
      ArrayList arraylist = new ArrayList();

      for (class09443 class09443 : var2) {
         if (!class09443.N().method_26790(var1, linkedhashset::add)) {
            arraylist.add(class09443);
         }
      }

      return arraylist.isEmpty() ? Either.right(List.copyOf(linkedhashset)) : Either.left(arraylist);
   }

   public Map<class01894, List<class09443>> N(class01089 var1) {
      HashMap hashmap = new HashMap();
      class03069 class03069 = class03069.N(this.L);

      for (Entry entry : class03069.y(var1).entrySet()) {
         class01894 class01894x = (class01894)entry.getKey();
         class01894 class01894x = class03069.y(class01894x);

         for (class01079 class01079 : (List)entry.getValue()) {
            try (BufferedReader bufferedreader = class01079.method_43039()) {
               JsonElement jsonelement = class08326.N(bufferedreader);
               List list = hashmap.computeIfAbsent(class01894x, var0 -> new ArrayList());
               class03932 class03932 = (class03932)class03932.N.parse(new Dynamic(JsonOps.INSTANCE, jsonelement)).getOrThrow();
               if (class03932.y()) {
                  list.clear();
               }

               String s = class01079.method_14480();
               class03932.N().forEach(var2x -> list.add(new class09443(var2x, s)));
            } catch (Exception exception) {
               y.error("Couldn't read tag list {} from {} in data pack {}", new Object[]{class01894x, class01894x, class01079.method_14480(), exception});
            }
         }
      }

      return hashmap;
   }

   @Nullable
   private static class00720<?> N(List<class00720<?>> var0, class05946<? extends class00751<?>> var1) {
      for (class00720 class00720 : var0) {
         if (class00720.N() == var1) {
            return class00720;
         }
      }

      return null;
   }

   public static List<class01921<?>> N(class01022 var0, List<class00720<?>> var1) {
      ArrayList arraylist = new ArrayList();
      var0.method_40311().forEach(var2x -> {
         class00720<?> class00720 = N(var1, var2x.N());
         arraylist.add(class00720 != null ? class00720.L() : var2x.y());
      });
      return arraylist;
   }

   private static <T> Optional<class00720<T>> N(class01089 var0, class00751<T> var1) {
      class05946 class05946 = var1.i();
      class01214 class01214 = new class01214(class01229.N(var1), class04227.u(class05946));
      class01196 class01196 = new class01196(class05946, N(var1.i(), class01214.N(class01214.N(var0))));
      return class01196.y().isEmpty() ? Optional.empty() : Optional.of(var1.N(class01196));
   }

   private static <T> Map<class03530<T>, List<class03556<T>>> N(class05946<? extends class00751<T>> var0, Map<class01894, List<class03556<T>>> var1) {
      return var1.entrySet().stream().collect(Collectors.toUnmodifiableMap(var1x -> class03530.N(var0, (class01894)var1x.getKey()), Entry::getValue));
   }
}
