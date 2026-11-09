package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Optional;

public class class01408 {
   private final Builder<class01428> N = ImmutableList.builder();

   private class01408() {
      super();
   }

   public Optional<class01400> y() {
      return Optional.of(new class01400(this.N.build()));
   }

   public class01408 N(class08092<Integer> var1, int var2) {
      return this.N(var1, Integer.toString(var2));
   }

   public <T extends Comparable<T> & class05033> class01408 N(class08092<T> var1, T var2) {
      return this.N(var1, ((class05033)var2).method_15434());
   }

   public class01408 N(class08092<Boolean> var1, boolean var2) {
      return this.N(var1, Boolean.toString(var2));
   }

   public static class01408 N() {
      return new class01408();
   }

   public class01408 N(class08092<?> var1, String var2) {
      this.N.add(new class01428(var1.R(), new class01416(var2)));
      return this;
   }
}
