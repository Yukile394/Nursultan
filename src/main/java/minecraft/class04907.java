package minecraft;

import java.util.Objects;
import org.jspecify.annotations.Nullable;

public class class04907<T> extends class06675 {
   public static final class02362<class04247, class04907<?>> P = class02389.N(class04227.Nd).y(class04907::i, class04922::N);
   private final class04938 s;
   private final T T;
   private final class04922<T> b;

   protected class04907(class04922<T> var1, T var2, class04938 var3) {
      super(N(var1, var2));
      this.b = var1;
      this.s = var3;
      this.T = (T)var2;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1 || var1 instanceof class04907 && Objects.equals(this.y(), ((class04907)var1).y());
   }

   @Override
   public String toString() {
      return "Stat{name=" + this.y() + ", formatter=" + this.s + "}";
   }

   @Override
   public int hashCode() {
      return this.y().hashCode();
   }

   public class04922<T> i() {
      return this.b;
   }

   public String N(int var1) {
      return this.s.format(var1);
   }

   private static String N(@Nullable class01894 var0) {
      return var0.toString().replace(':', '.');
   }

   public static <T> String N(class04922<T> var0, T var1) {
      return N(class04206.G.y(var0)) + ":" + N(var0.y().y(var1));
   }

   public T R() {
      return this.T;
   }
}
