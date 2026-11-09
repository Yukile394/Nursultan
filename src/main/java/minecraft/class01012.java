package minecraft;

import java.util.Map.Entry;

public record class01012<T>(class05946<? extends class00751<T>> key, class00751<T> value) {

   public class01012<T> L() {
      return new class01012<>(this.key, this.value.W());
   }

   public class01012(class05946<? extends class00751<T>> key, class00751<T> value) {
      this.key = key;
      this.value = value;
   }

   public class00751<T> y() {
      return this.value;
   }

   public class05946<? extends class00751<T>> N() {
      return this.key;
   }

   private static <T> class01012<T> N(class05946<? extends class00751<?>> var0, class00751<?> var1) {
      return new class01012<>(var0, var1);
   }

   public static <T, R extends class00751<? extends T>> class01012<T> N(Entry<? extends class05946<? extends class00751<?>>, R> var0) {
      return N((class05946<? extends class00751<?>>)var0.getKey(), (class00751<?>)var0.getValue());
   }
}
