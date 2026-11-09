package minecraft;

import java.util.Optional;

public class class08577 {
   public static final String N = "variant";

   public class08577() {
      super();
   }

   public static <T> class03556<T> y(class01042 var0, class05946<? extends class00751<T>> var1) {
      return var0.<T>L(var1).N().orElseThrow();
   }

   public static <T extends class08578<class08579, ?>> Optional<class03529<T>> N(class08579 var0, class05946<class00751<T>> var1) {
      class01001 class01001 = var0.y();
      return class08578.N(class01001.method_30349().<T>L(var1).z(), class03556::N, class01001.method_8409(), var0);
   }

   public static <T> Optional<class03556<T>> N(class08299 var0, class05946<? extends class00751<T>> var1) {
      return var0.<class01894>N("variant", class01894.N).map(var1x -> class05946.N(var1, var1x)).flatMap(var0.N()::u);
   }

   public static <T> void N(class08329 var0, class03556<T> var1) {
      var1.i().ifPresent(var1x -> var0.N("variant", class01894.N, var1x.N()));
   }

   public static <T> class03556<T> N(class01042 var0, class05946<T> var1) {
      class00751 class00751 = var0.L(var1.L());
      return class00751.N(var1).or(class00751::N).orElseThrow();
   }
}
