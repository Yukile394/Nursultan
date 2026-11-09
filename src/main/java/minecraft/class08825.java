package minecraft;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;

public class class08825 {
   public class08825() {
      super();
   }

   public static class08895 y(class08895 var0, class08895 var1) {
      DateTimeFormatter datetimeformatter = DateTimeFormatter.ofPattern("MM-dd", Locale.ROOT);
      List list = class06842.y.stream().map(datetimeformatter::format).toList();
      return N(class08351.N("MM-dd", "", Optional.empty()), var1, List.of(N(list, var0)));
   }

   public static <T> class08895 N(class00372<T> var0, List<class08940<T>> var1) {
      return new class08932(new class08938(var0, var1), Optional.empty());
   }

   @SafeVarargs
   public static <T> class08895 N(class00372<T> var0, class08940<T>... var1) {
      return N(var0, List.of(var1));
   }

   public static <T> class08895 N(class00372<T> var0, class08895 var1, List<class08940<T>> var2) {
      return new class08932(new class08938(var0, var2), Optional.of(var1));
   }

   @SafeVarargs
   public static <T> class08895 N(class00372<T> var0, class08895 var1, class08940<T>... var2) {
      return N(var0, var1, List.of(var2));
   }

   public static <T> class08940<T> N(List<T> var0, class08895 var1) {
      return new class08940<>(var0, var1);
   }

   public static <T> class08940<T> N(T var0, class08895 var1) {
      return new class08940<>(List.of((T)var0), var1);
   }

   public static <T extends Comparable<T>> class08895 N(class08092<T> var0, class08895 var1, Map<T, class08895> var2) {
      List list = var2.entrySet().stream().sorted(Entry.comparingByKey()).map(var1x -> {
         String s = var0.y((T)var1x.getKey());
         return new class08940<>(List.of(s), (class08895)var1x.getValue());
      }).toList();
      return N(new class00363(var0.R()), var1, list);
   }

   public static class08895 N(class08895 var0, class08895 var1) {
      return N(new class08378(), var1, N(class07299.field_25179, var0));
   }

   public static class08909 N(class02477<?> var0) {
      return new class08902(var0, false);
   }

   public static class08909 N() {
      return new class08914();
   }

   public static class08912 N(class08895 var0, float var1) {
      return new class08912(var1, var0);
   }

   public static class08895 N(class01894 var0, class00335 var1) {
      return new class08922(var0, var1);
   }

   public static class08895 N(class08895... var0) {
      return new class08904(List.of(var0));
   }

   public static class08843 N(int var0) {
      return new class08834(var0);
   }

   public static class08895 N(class01894 var0, class08843... var1) {
      return new class08845(var0, List.of(var1));
   }

   public static class08895 N(class01894 var0) {
      return new class08845(var0, List.of());
   }

   public static class08895 N(class08909 var0, class08895 var1, class08895 var2) {
      return new class08927(var0, var1, var2);
   }

   public static class08895 N(class06572 var0, float var1, List<class08912> var2) {
      return new class08920(var0, var1, var2, Optional.empty());
   }

   public static class08895 N(class06572 var0, List<class08912> var1) {
      return new class08920(var0, 1.0F, var1, Optional.empty());
   }

   public static class08895 N(class06572 var0, class08895 var1, List<class08912> var2) {
      return new class08920(var0, 1.0F, var2, Optional.of(var1));
   }

   public static class08895 N(class06572 var0, float var1, class08895 var2, class08912... var3) {
      return new class08920(var0, var1, List.of(var3), Optional.of(var2));
   }

   public static class08895 N(class06572 var0, class08895 var1, class08912... var2) {
      return new class08920(var0, 1.0F, List.of(var2), Optional.of(var1));
   }
}
