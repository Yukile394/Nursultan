package minecraft;

import java.util.List;

public record class00279<T extends class06521<?>>(List<class00252<T>> entries) {
   public boolean L() {
      return this.entries.isEmpty();
   }

   public class00279(List<class00252<T>> entries) {
      this.entries = entries;
   }

   public List<class00252<T>> i() {
      return this.entries;
   }

   public int u() {
      return this.entries.size();
   }

   public static <T extends class06521<?>> class02362<class04247, class00279<T>> y() {
      return class02362.N(class00252.<T>N().N_33(class02389.N()), class00279::i, class00279::new);
   }

   public class00279<T> y(class06584 var1) {
      return new class00279<>(this.entries.stream().filter(var1x -> var1x.y().method_8093(var1)).toList());
   }

   public static <T extends class06521<?>> class00279<T> N() {
      return new class00279<>(List.of());
   }

   public boolean N(class06584 var1) {
      return this.entries.stream().anyMatch(var1x -> var1x.y().method_8093(var1));
   }
}
